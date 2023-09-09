package com.scy.test;

import com.scy.bst.stack.ArrayStack;

public class Main {
    public static void main(String[] args) {
     /*   System.out.println("Hello world!");
        StackImpl stack = new StackImpl();
        stack.push(0);
        boolean b = stack.isEmpty();
    }*/
        ArrayStack<Integer> stack = new ArrayStack<Integer>(10);
        boolean isempty = stack.isempty();
        System.out.println(isempty);
        stack.push(10);
        boolean isemptys = stack.isempty();
        System.out.println(isemptys);
        Integer top = stack.GetStackTop();
        System.out.println(top);
        stack.push(10);
        stack.push(19);
        stack.push(18);
        stack.push(17);
        String s = stack.stackTraverse();
        System.out.println(s);
    }
}