/**
 * 
 */
package com.sitech.util;

import java.util.HashMap;
import java.util.Map;


/** 
 * Create on 2015Äê10ÔÂ21ÈÕ 
 * @author: fengjj
 * @Title: TestMain 
 * @Description£º 
 * @version 1.0 
 * update_data:      update_author:      update_note: 
 */
public class TestMain {
    public static void main(String[] arg){
        test1();
    }
    public static void test1() {
        String root = "http://localhost:8080/new_app/rs/service/";
        String url = "hDMActSvc_createSmpLotteryInfo";
        Map bean = new HashMap();
        bean.put("USER_ID", "2332211");
        bean.put("PHONE_NO", "13555552222");
        bean.put("MEANS_ID", "2222222222");
        bean.put("ACT_ID", "333333333333");
        System.out.println("++++++++++++++++++++++bean"+bean.toString());
        String result = HttpUtil.invoke(root+url, bean.toString());
        System.out.println("++++++++++++++++++++++result:"+result+":");

    }
}
