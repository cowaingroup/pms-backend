package com.cowain.pms;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestGuava {
    public static void main(String [] args) {
        String delimiter = ",";
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add(null);
        list.add("3");
        list.add("5");

        String lastStr = Joiner .on(delimiter)
                .skipNulls()
                .join(list);
        System.out.println(lastStr);

        // lastStr =  lastStr + ",3,%9898,";
        lastStr =  lastStr + ",3,f9898,";

       // Map<String, String> join = Splitter.on("&").withKeyValueSeparator("=").split("id=123&name=green");

        List<String> strList =
                Splitter.on(delimiter).splitToList(lastStr);
        System.out.print(strList);
    }

}
