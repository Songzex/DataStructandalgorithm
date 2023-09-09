package com.scy.Forkjoin;

import java.util.concurrent.RecursiveTask;

/**
 * 此类用FORK/JOIN框架 来实现一个斐波那契数列
 * @AbstactClass  ForkJoinTask
 * @implentclass RecursiveAction   RecursiveTask<T>  T泛型 处理多种的数据
 * **/
public class Fibonacci extends RecursiveTask<Integer> {
    private  static  final  long serialVersionUID=1l;
    final  int n ;

    public Fibonacci(int n) {
        this.n = n;
    }


    @Override
    protected Integer compute() {
        if(n<=1) {
            return n;
        }
        Fibonacci m1 = new Fibonacci(n - 1);
        m1.fork();
        Fibonacci m2 = new Fibonacci(n - 2);
        return m2.compute() + m1.join();
    }

    public int getN() {
        return n;
    }
}
