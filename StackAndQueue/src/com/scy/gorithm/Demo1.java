package com.scy.gorithm;

import java.util.Stack;

/**
 * 给予一个只包含字符‘l.’1.u，“1‘，’l‘和’l‘的字符串，确定输入字符串是否有效。
 * 你在真实的Inteview上遇到过这个问题吗？
 * 问题： 括号必须按照正确的顺序关闭，“()”和“()[]{}”都是有效的，但“(]”和“([)}”则不是。
 * **/
public class Demo1 {
    public  boolean  test1(String s){
        Stack<Character> stack = new Stack<Character>();
         for (char i : s.toCharArray()){
             if (i=='['||i=='('||i=='{') {
                 stack.push(i);
             }else{
                 if(i==']'){
                     if (stack.isEmpty()||stack.peek()!='['){
                         return  false;
                     }
                 if(i==')'){
                     if (stack.isEmpty()||stack.peek()!='('){
                         return  false;
                     }
                    }
                 if(i=='}'){
                     if(stack.isEmpty()||stack.peek()!= '{')
                         return  false;
                 }
                 }
                 stack.pop();
             }
         }

        return stack.isEmpty();
    }



}
