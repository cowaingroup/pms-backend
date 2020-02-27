package com.cowain.pms;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TestGuavaCache {
        private static LoadingCache<Integer, People> cache = CacheBuilder
                .newBuilder()
                // 缓存容量
                .maximumSize(10)
                // 缓存超时时间
                .expireAfterWrite(5, TimeUnit.SECONDS)
                .build(new CacheLoader<Integer, People>() {
                    // 缓存加载数据方式
                    public People load(Integer id) throws Exception {
                        System.out.println("cache load " + id);
                        return new People(id,"people_"+id);
                    }
                });



        public static void main(String[] args) throws Exception {
            System.out.println(cache.get(1));
            System.out.println(cache.get(2));
            // 由于缓存容量为2，因此会将key=1的数据从缓存移除，将key=3的数据插入缓存
            System.out.println(cache.get(3));
            System.out.println();

            List<Integer> keys = new LinkedList<Integer>();
            keys.add(1);
            keys.add(2);
            keys.add(3);
            // 查询所有缓存中的数据
            Map<Integer, People> map = cache.getAllPresent(keys);
            for(Integer key : map.keySet()){
                System.out.println(map.get(key));
            }
            System.out.println();

            TimeUnit.SECONDS.sleep(10);
            // 由于超时，缓存中的数据已被移除
            System.out.println(cache.getIfPresent(2));
            System.out.println(cache.getIfPresent(3));
            System.out.println();

            // 更新缓存的中数据
            cache.refresh(1);
        }
}
