package com.qianfeng.openapi.search.api.impl;

//


import com.fasterxml.jackson.databind.ObjectMapper;
import com.qianfeng.openapi.search.api.SearchServiceApi;
import com.qianfeng.openapi.search.utils.SearchUtil;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.get.GetIndexRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.text.Text;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * todo: es的增删改查（针对日志的）
 */
@Service
public class SearchServiceImpl implements SearchServiceApi {
    Logger logger = LoggerFactory.getLogger(SearchServiceImpl.class);

    // ObjectMapper提供用于读取和写入JSON的功能;
    @Autowired
    private ObjectMapper objectMapper;


    private String indexName = "1907_log_index";

    private String typeName = "1907_log_type";

    /**
     *  es的Java模板对象——RestHighLevelClient
     */
    @Autowired
    private RestHighLevelClient restHighLevelClient;

    /**
     * todo : 创建索引、type类型；
     * @throws Exception
     */
    @Override
    public void createIndex() throws Exception {
        if (!isExist(indexName)) {
            //如果索引不存在就创建
            CreateIndexRequest createIndexRequest = new CreateIndexRequest(indexName, Settings.builder()
                 // number_of_replicas：备份数              // number_of_shards: 分片数
                    .put("number_of_replicas", 1).put("number_of_shards", 5)
                    .build());

            //在创建库（index）的时候把表(type)一起创建出来
            SearchUtil.buildMapping(typeName, createIndexRequest);

            // indices: index的复数；
            restHighLevelClient.indices().create(createIndexRequest, RequestOptions.DEFAULT);
            logger.error("创建index:{}成功" + indexName);
        } else {
            logger.error("index:{}已经存在" + indexName);
        }
    }

    /**
     * todo: 判断索引是否存在；
     */
    @Override
    public boolean isExist(String index) throws Exception {
        GetIndexRequest getIndexRequest = new GetIndexRequest();

        getIndexRequest.indices(indexName);
        return restHighLevelClient.indices().exists(getIndexRequest, RequestOptions.DEFAULT);
    }


    /**
     * todo: es，添加数据
     */
    @Override
    public void add(String json) throws Exception {
        IndexRequest indexRequest = new IndexRequest(indexName, typeName);
        indexRequest.source(json, XContentType.JSON);

        restHighLevelClient.index(indexRequest, RequestOptions.DEFAULT);
        logger.error("es收到数据插入到索引中:{}", json);
    }


    /**todo: 从es中查数据；（涉及到 分页、高亮显示、查询 三块内容）
     * 可能会传递一个参数, 两个参数,三个参数,四个参数
     * //服务端在实现功能的基础来定义规则:我们说了算,客户端说的不算
     * 我们定义你要查询必须传递什么格式的数据比如说json 或者是key value类型的键值对,但是这两个只能选择一个
     * 此处我们要求必须传递json,而且json的key必须是我们es中mapping的name
     * @param params
     * @return
     */
    @Override
    public List<Map> search(String params) {

        List<Map> result = new ArrayList<>();

        try {
//         将 JSON格式的参数数据 反序列化：（成map格式的数据）
            Map map = objectMapper.readValue(params, Map.class);

            //我们不知道到底传递了多少个参数    SearchSourceBuilder：搜索源构造器
            SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
            SearchUtil.buildSearchSource(searchSourceBuilder,map);

//  todo: 分页    =====================================
            //是不是有分页,我们规定 如果要分页查询 就必须传递 start和end两个参数
            Object start = map.get("start");//开始位置?是个页数还是条数? 我们规定是一个页数
            Object size = map.get("size");//需要的条数

            if (start == null) {//默认的起点
                start = 1;
            }
            if (size == null) {//默认的条数
                size = 10;
            }

            searchSourceBuilder.from((Integer.parseInt(start.toString())-1)*Integer.parseInt(size.toString()));
            searchSourceBuilder.size(Integer.parseInt(size.toString()));

//   todo: 高亮显示：=======================================
            //是不是有高亮?,如果要高亮,必须传递高亮的前缀和后缀
            //我们高亮的数据是查询到的requestcontent,如果用户没有查询数据,只是选择了范围,实际上是不需要高亮的
            String requestContent = (String) map.get("requestContent");

            // 如果查询出来的数据，存在需要高亮显示的一部分数据：
            if (requestContent != null) {

                //只有传递了查询关键字的时候才会开启高亮
              //我们规定 你如果需要高亮,那么必须传递前缀和后缀过来,前缀和后缀的key 分别是highlightpretag  highlightposttag
                String highlightpretag = (String) map.get("highlightpretag");
                String highlightposttag = (String) map.get("highlightposttag");

                //用户可能会不传递,因为我们控制不了用户,实际上注意,有些东西就不是用户可以控制的
                // 如果前缀为空：
                if (highlightpretag == null||"".equalsIgnoreCase(highlightpretag.trim())) {

                   //则赋予默认的前缀值：
                    highlightpretag = "<span color='green'>";
                }

                // 如果后缀为空：
                if (highlightposttag == null||"".equalsIgnoreCase(highlightposttag.trim())) {

                   //则赋予默认的后缀值：
                    highlightposttag = "</span>";
                }

                // 初始化 字段高亮显示的 构建器：HighlightBuilder
                HighlightBuilder highlightBuilder = new HighlightBuilder();

                // 指明 需要高亮的 文本区域：
                highlightBuilder.field("requestContent");

                // 指明 高亮的 前缀的key、后缀的key：
                highlightBuilder.preTags(highlightpretag);
                highlightBuilder.postTags(highlightposttag);

                //添加高亮的查询条件
                searchSourceBuilder.highlighter(highlightBuilder);
            }

//   todo: 查询数据：=======================================
            // 实现搜索数据的构建器：SearchRequest，如果参数中未指定（索引），则会将对所有的索引进行查询数据；
            SearchRequest searchRequest = new SearchRequest(indexName);

            // 将 搜索源 加载到 搜索数据的构建器中；
            searchRequest.source(searchSourceBuilder);

            // 开始搜索，并得到响应：response
            SearchResponse response = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);

            //获取命中的数据封装对象
            SearchHits hits = response.getHits();

            //获取命中的数据（集合），即，（查询出来的数据）
            SearchHit[] hitsHits = hits.getHits();

            // 遍历查询出来的数据：
            for (SearchHit hitsHit : hitsHits) {

                //将当前数据转成JSON格式 / 获取当前数据的json格式内容：
                String sourceAsString = hitsHit.getSourceAsString();

                //查询到的是默认的内容,也就是不包含高亮数据的原始内容：
                Map data = objectMapper.readValue(sourceAsString, Map.class);

                //当前数据很有可能会有高亮内容,判断一下,如果有就把高亮数据 替换掉 原始的（应该高亮的）内容
                //获取 盛放高亮数据的 map容器：
                Map<String, HighlightField> highlightFields = hitsHit.getHighlightFields();
                //获取map容器中，需要高亮的字段：
                HighlightField highlightField = highlightFields.get("requestContent");
                // 如果字段的内容不为空：
                if (highlightField != null) {
                    //说明当前数据中，有需要高亮的数据，并获取其文本形式的内容：
                    Text[] fragments = highlightField.getFragments();
                    if (fragments != null) {
                        String hl = fragments[0].toString();//拿到真正的高亮内容

                        //替换掉原始内容
                        data.put("requestContent", hl);
                    }
                }
                // 将查询出来的数据，添加到之前构造好的ArrayList容器中：
                result.add(data);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


        return result;
    }
}
