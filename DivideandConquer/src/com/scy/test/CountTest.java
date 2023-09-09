package com.scy.test;

import com.scy.divide.wordcount.MapReduce;

import java.util.Map;
import java.util.concurrent.ForkJoinPool;

public class CountTest {
    public static void main(String[] args) {
        String[] aa={"apple aa","huawei fork","xiaomi aa"};
        ForkJoinPool pool = new ForkJoinPool(2);
        MapReduce libs = new MapReduce(0, aa.length, aa);
        Map<String, Long> stringLongMap = pool.invoke(libs);
        stringLongMap.forEach((k,v)->{
            System.out.println(k+":"+v);

        });


    }




}
