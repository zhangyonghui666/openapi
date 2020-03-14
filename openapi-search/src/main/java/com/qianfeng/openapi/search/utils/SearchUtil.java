package com.qianfeng.openapi.search.utils;

//
//                            _ooOoo_  
//                           o8888888o  
//                           88" . "88  
//                           (| -_- |)  
//                            O\ = /O  
//                        ____/`---'\____  
//                      .   ' \\| |// `.  
//                       / \\||| : |||// \  
//                     / _||||| -:- |||||- \  
//                       | | \\\ - /// | |  
//                     | \_| ''\---/'' | |  
//                      \ .-\__ `-` ___/-. /  
//                   ___`. .' /--.--\ `. . __  
//                ."" '< `.___\_<|>_/___.' >'"".  
//               | | : `- \`.;`\ _ /`;.`/ - ` : | |  
//                 \ \ `-. \_ __\ /__ _/ .-` / /  
//         ======`-.____`-.___\_____/___.-`____.-'======  
//                            `=---='  
//  
//         .............................................  
//                  佛祖镇楼                  BUG辟易  
//          佛曰:  
//                  写字楼里写字间，写字间里程序员；  
//                  程序人员写程序，又拿程序换酒钱。  
//                  酒醒只在网上坐，酒醉还来网下眠；  
//                  酒醉酒醒日复日，网上网下年复年。  
//                  但愿老死电脑间，不愿鞠躬老板前；  
//                  奔驰宝马贵者趣，公交自行程序员。  
//                  别人笑我忒疯癫，我笑自己命太贱；  
//  


import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.json.JsonXContent;
import org.elasticsearch.index.query.*;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.io.IOException;
import java.util.Map;

/**
 * Created by jackiechan on 19-12-4/上午11:44
 *
 * @Author jackiechan
 */
public class SearchUtil {

    public static void buildMapping(String typeName, CreateIndexRequest request) throws IOException {
        XContentBuilder xContentBuilder = JsonXContent.contentBuilder().startObject()
                .startObject("properties")//
                .startObject("appkey")//
                .field("type", "keyword")//
                .field("index", "true")// storage true

                //select * from xx where
                //select a,b ,c form xx where
                .endObject()//
                .startObject("remoteIp")//
                .field("type", "ip")//
                .endObject()//
                .startObject("serverIp")//
                .field("type", "ip")//
                .endObject()//
                .startObject("apiName")//
                .field("type", "keyword")//
                .field("index", "true")// storage true
                .endObject()//
                .startObject("totalRepTime")
                .field("type", "long")
                .field("index", "true")//
                .endObject()//
                .startObject("receiveTime")
                .field("type", "long")
                .field("index", "true")//
                .endObject()//
                .startObject("repTime")
                .field("type", "long")
                .field("index", "true")//
                .endObject()//
                .startObject("requestContent")//
                .field("type", "text")//
                .field("index", "true")// storage true
                .endObject()//
                .endObject()//
                .endObject();

        request.mapping(typeName, xContentBuilder);

    }

    public static void buildSearchSource(SearchSourceBuilder searchSourceBuilder, Map map) {
        //我们的参数越多是不是代表条件就越多,所有的条件是与关系
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
        String appkey = (String) map.get("appkey");
        String apiName = (String) map.get("apiName");
        String remoteIp = (String) map.get("remoteIp");
        String serverIp = (String) map.get("serverIp");
        String totalRepTime = (String) map.get("totalRepTime");
        String receiveTime = (String) map.get("receiveTime");
        String requestContent = (String) map.get("requestContent");
        String repTime = (String) map.get("repTime");

        TermQueryBuilder appkeyTermQueryBuilder = null;
        TermQueryBuilder apiNameTermQueryBuilder = null;
        TermQueryBuilder remoteIpTermQueryBuilder = null;
        TermQueryBuilder serverIpTermQueryBuilder = null;
        RangeQueryBuilder timeRange = null;//查询开始和结束时间范围的
        RangeQueryBuilder TotaltimeRange = null; //查询总时间小于或者大于某个值的
        MatchQueryBuilder requestContentMatch = null;

        if (appkey != null) {
            appkeyTermQueryBuilder = new TermQueryBuilder("appkey", appkey);
            boolQueryBuilder.must(appkeyTermQueryBuilder);//添加查询条件
        }
        if (apiName != null) {
            apiNameTermQueryBuilder = new TermQueryBuilder("apiName", apiName);
            boolQueryBuilder.must(apiNameTermQueryBuilder);//添加查询条件
        }
        if (remoteIp != null) {
            remoteIpTermQueryBuilder = new TermQueryBuilder("remoteIp", remoteIp);
            boolQueryBuilder.must(remoteIpTermQueryBuilder);//添加查询条件
        }
        if (serverIp != null) {
            serverIpTermQueryBuilder = new TermQueryBuilder("serverIp", serverIp);
            boolQueryBuilder.must(serverIpTermQueryBuilder);//添加查询条件
        }
        if (receiveTime != null && repTime == null) {
            timeRange = QueryBuilders.rangeQuery("receiveTime").gte(receiveTime);
            boolQueryBuilder.must(timeRange);
        } else if (receiveTime != null && repTime != null) {
            timeRange = QueryBuilders.rangeQuery("receiveTime").gte(receiveTime).lte(repTime);
            boolQueryBuilder.must(timeRange);
        } else if (receiveTime == null && repTime != null) {
            timeRange = QueryBuilders.rangeQuery("receiveTime").lte(repTime);
            boolQueryBuilder.must(timeRange);
        }
        if (totalRepTime != null) {
            TotaltimeRange = QueryBuilders.rangeQuery("totalRepTime").gte(totalRepTime);
            boolQueryBuilder.must(TotaltimeRange);
        }
        if (requestContent != null) {
            requestContentMatch = QueryBuilders.matchQuery("requestContent", requestContent);
            boolQueryBuilder.must(requestContentMatch);
        }


        searchSourceBuilder.query(boolQueryBuilder);

    }
}
