package com.cowain.pms;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("E10");
        set.add("E20");
        set.add(null);

//        System.out.println(set.contains("E10"));

            Cache<String,String> cache = CacheBuilder.newBuilder()
                    .maximumSize(2)
                    .build();
            cache.put("key1","value1");
            cache.put("key2","value2");
            cache.put("key3","value3");
            System.out.println("第一个值：" + cache.getIfPresent("key1"));
            System.out.println("第二个值：" + cache.getIfPresent("key2"));
            System.out.println("第三个值：" + cache.getIfPresent("key3"));

    }
}
