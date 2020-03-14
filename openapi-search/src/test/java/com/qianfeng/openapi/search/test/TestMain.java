package com.qianfeng.openapi.search.test;

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


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qianfeng.openapi.search.SearchStartApp;
import com.qianfeng.openapi.search.api.SearchServiceApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jackiechan on 19-12-4/下午2:37
 *
 * @Author jackiechan
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SearchStartApp.class )
@WebAppConfiguration
public class TestMain {
    @Autowired
    private SearchServiceApi searchServiceApi;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testCreateIndex() throws Exception {
        searchServiceApi.createIndex();
    }

    @Test
    public void testinsert() throws Exception {
        MQLogBean mqLogBean = new MQLogBean();
        mqLogBean.setApiName("测试apiname");
        mqLogBean.setAppkey("测试appkey");
        mqLogBean.setReceiveTime(1111111);
        mqLogBean.setRemoteIp("1.2.3.4");
        mqLogBean.setRepTime(222222);
        mqLogBean.setTotalRepTime(1231);
        mqLogBean.setServerIp("2.3.4.5");
        mqLogBean.setRequestContent("asdasdas=dasdasd&dasdas=dasd&afasdfas=fadsfasd");
        searchServiceApi.add(objectMapper.writeValueAsString(mqLogBean));
    }

    @Test
    public void testSearch() throws JsonProcessingException {
//        MQLogBean mqLogBean = new MQLogBean();
//       // mqLogBean.setApiName("测试apiname");
//        mqLogBean.setAppkey("douyin");
//        mqLogBean.setRequestContent("qianfeng");
        Map<String, String> map = new HashMap<>();
       // map.put("appKey", "douyin");
       // map.put("requestContent", "method");
        map.put("receiveTime","1575443028817");
        map.put("repTime", "1575443028820");
        //repTime=1575443028820
        List<Map> search = searchServiceApi.search(objectMapper.writeValueAsString(map));
        System.err.println(search);
    }
}
