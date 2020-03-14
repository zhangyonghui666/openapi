package com.qianfeng.openapi.search.api;

//
//

import java.util.List;
import java.util.Map;

/**
 *  todo: es的增删改查：（针对日志数据）
 *   补充：
 *       es集群——es节点——es分片——es索引index——es类型type——es文档doc——es列field
 *       1》
     *      一个es节点——相当于——一个mysql进程；
     *      index索引——相当于——mysql里面的库;
     *      type类型——相当于——mysql里面的表；
     *      doc文档——相当于——mysql里面的一行数据；
     *      field列——相当于——mysql里面的一个字段；
 *       2》
 *          field列里边存放的才是真正数据；
 *
 */
public interface SearchServiceApi {

    /**
     * todo: 创建index(库)
     * @throws Exception
     */
    void createIndex() throws Exception;


    /**
     * todo : 判断index(库)是否存在
     * @param index
     * @return
     * @throws Exception
     */
    boolean isExist(String index) throws Exception;


    /**
     * todo: 添加数据, 数据是什么格式? json,我们规定
     * @throws Exception
     */
    void add(String json) throws Exception;


    /**
     * todo: 根据条件查询, 可能会有很多条,所以是list, 然后内部包含的是表中应该返回的列和值,所以是个map
     * @param params
     * @return
     */
    List<Map> search(String params);


}
