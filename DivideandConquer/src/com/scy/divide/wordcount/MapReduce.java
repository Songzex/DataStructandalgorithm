package com.scy.divide.wordcount;

import com.scy.Forkjoin.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.RecursiveTask;
/**
 * 依据 fork/join 框架来实现一个统计单词的数量
 *   处理的数据是一个模拟string aa[]
 * **/
public class MapReduce extends RecursiveTask<Map<String,Long>> {
    private  static  final  Long serialVersionUID=1L;
    private int start,end;
    private String[] aa;

    public MapReduce(int start, int end, String[] aa) {
        this.start = start;
        this.end = end;
        this.aa = aa;
    }

    @Override
    protected Map<String, Long> compute() {
        if(start-end==-1) {
            return count(aa[start]);
        }else {

            int mid=start+end/2;
            MapReduce m1 = new MapReduce(start,mid,aa);
            m1.fork();
            MapReduce m2 = new MapReduce(mid,end,aa);
            return merges(m2.compute(),m1.join());
        }

    }

    private Map<String, Long> merges
            (Map<String, Long> r1, Map<String, Long> r2) {
        HashMap<String, Long> hashMap = new HashMap<>();
        hashMap.putAll(r1);//
            r2.forEach((k,v)->{
                Long aLong = hashMap.get(k);
                if(aLong !=null) {
                    hashMap.put(k,aLong+v);
                }else {
                    hashMap.put(k,v);
                }


            });


        return hashMap;
    }

    private Map<String, Long> count(String s) {
        HashMap<String, Long> map = new HashMap<>();
        String[] split = s.split("\\s+");
        for (String w: split) {
            Long aLong = map.get(w);
            if (aLong!=null) {
                map.put(w,aLong+1);
            }else {
                map.put(w,1L);
            }
        }
           return map;

    }


}
