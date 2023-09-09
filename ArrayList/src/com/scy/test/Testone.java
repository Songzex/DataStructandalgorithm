package com.scy.test;

import com.scy.bst.util.Arraylist;

public class Testone {
    public static void main(String[] args) {
        Arraylist<Integer> arraylist = new Arraylist<Integer>();
        arraylist.add(0, 1);
        arraylist.add(2, 9);
        arraylist.add(1, 8);
        arraylist.add(12);
        arraylist.add(10);
       int  size1 = arraylist.getSize();
        System.out.println("当前顺序表长度是" + size1);
        arraylist.foreach();
        arraylist.removes(2);
        int  size = arraylist.getSize();
        System.out.println("当前顺序表长度是" + size);
        arraylist.foreach();


    }
}
