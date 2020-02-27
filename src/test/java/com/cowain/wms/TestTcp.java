package com.cowain.pms;



import com.alibaba.fastjson.JSON;
import com.mysql.cj.xdevapi.JsonArray;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class TestTcp {
    public static void main(String[] args) throws IOException {
        // 1.创建服务器端的ServerSocket
        ServerSocket ss = new ServerSocket(8081);
        // 2.监听客户端的连接,返回与客户端匹配的Socket
        Socket s = ss.accept(); // 这是一个阻塞方法，等待用户的Socket连接
        // 3.读取或者写入数据

        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];

        int len = is.read(bys);
        String data = new String(bys, 0, len);
        String res=new String(bys,"gb2312");
        System.out.println("数据:"+res);
        System.out.println(s);
        OutputStream out=s.getOutputStream();
        List<String> list=new ArrayList<String>();
        list.add("11");
        list.add("22");
        list.add("33");
        String str = JSON.toJSONString(list);
        out.write(str.getBytes("gb2312"));
        System.out.println("succ");
    }

}
