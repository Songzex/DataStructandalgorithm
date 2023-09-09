package com.scy.Forkjoin;

import com.scy.Forkjoin.Fibonacci;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ForkJoinPool pool = new ForkJoinPool(4);
        Fibonacci fib = new Fibonacci(20);
        Integer result = pool.invoke(fib);
        System.out.println("第"+fib.getN()+" "+"个斐波数列数值是： "+result);
/**
 * 这个例子涉及到了操作系统里边的内容 进程和线程
 * **/
    }
}