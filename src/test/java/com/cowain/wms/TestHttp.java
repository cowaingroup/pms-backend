package com.cowain.pms;

import com.cowain.pms.common.http.ApacheHttpClient;
import com.cowain.pms.modules.wms.entity.enterentity.WmsPublishTaskEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestHttp {

    public static void main(String [] args) throws Exception{
        ApacheHttpClient httpClient = ApacheHttpClient.getDefaultInstance();
        Map<String,Object> param = new HashMap<>();
        param.put("wmsDocNo","ZFCK191125000005");
        param.put("type",3);
        param.put("erpDocNo",null);
        param.put("globalId","1198802220267601920");
        param.put("taskNo","RMB191125000005");
        String response = httpClient.post("http://192.168.10.201:8001/WCS/HTTPPOST",param);
        //String reponse = httpClient.post("url",param);
        System.out.println("response:"+response);


    }

}
