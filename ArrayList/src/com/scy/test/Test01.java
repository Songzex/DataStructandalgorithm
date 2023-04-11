package com.scy.test;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,1);
        System.out.println(list.toString());
        list.remove(0);
        if(list.size()==0) {
            System.out.println(
                    "ok"
            );
        }

    }

}
