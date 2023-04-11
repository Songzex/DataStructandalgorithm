package com.scy.test;

import com.scy.pojo.LinkList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        LinkList linkList = new LinkList();
        linkList.add(0,1);
        linkList.add(1,3);
        linkList.add(2,4);
        int i = linkList.get(1);
        System.out.println(i);
        linkList.print();

    }
}