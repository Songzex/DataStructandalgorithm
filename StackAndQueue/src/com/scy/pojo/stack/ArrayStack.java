package com.scy.pojo.stack;

public class ArrayStack<T> {

    private int font;  //头指针
    private int base;  //尾指针
    private int maxsize; //栈的最大元素数量
    private T[] element; //顺序栈基于数组

    public ArrayStack(int maxsize) {
        this.font = this.base;//初始化这个这个栈的时候我们把头指正和尾指针相等
        this.maxsize = maxsize;
        this.element = (T[]) new Object[maxsize];//开辟一块连续的内存空间 大小是100 也就是默认是这么大
    }


    /**
     * 顺序栈的出栈方法
     **/
    public T pop() {
        if (this.base == this.font) {
            System.out.println("栈为空");
        }
        T t = element[--font];
        return t;
    }

    /**
     * 顺序栈的入栈方法
     *
     * @return
     **/
    public String push(T T) {
        if (this.font - this.base == this.maxsize) {
            return "栈满";
        }
        element[this.font++] = T;
        return "ok";
    }

    /**
     * 顺序栈的取栈顶栈方法
     **/
    public T GetStackTop() {
        int i = 0;
        if (this.font != this.base) {
            i = this.font - 1;
            return element[i];

        }


        return element[i];
    }

    /**
     * 顺序栈判断栈为空的方法
     **/
    public boolean isempty() {
        if (this.font == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 返回顺序栈中的元素个数
     **/

    public int recounts() {
        int i = this.font - this.base;
        return i;
    }

    /**
     * 遍历栈
     **/
    public String stackTraverse() {
        String s = "";
        for (int i=1;i<this.font;i++) {
            s += this.element[i] + "、";

         }

      return s.substring(0,s.length() - 1);//去掉空格
    }
}