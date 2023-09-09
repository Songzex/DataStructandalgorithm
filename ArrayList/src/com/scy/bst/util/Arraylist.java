package com.scy.bst.util;
/**顺序表**/
public class Arraylist<T> {
    /** 线性表的顺序存储 底层用到的是一个动态数组  开辟一快连续的空间
     *  面向设计
     *  含有的所有属性
     *  1.任意类型的元素  2.默认的数值设置 3.空间的大小   4. 定义任意的数组的类型指针
     *  含有的方法
     *   初始化   构造方法  Arraylist啊
     *   添加数据  add
     *   取数据  get
     *   判断是否为空 empty
     *   删除数据  remove
     *   清空顺序表 clear
     *   打印顺序表 toString
     * **/
   private  int size;  //元素个数 数组的长度
   private  T [] element; //
   private   static   final  int  DEFAULT_SIZE=10;  //

   private   static   final  int   ELEMENT_NOT_FOUND =-1; //

    public Arraylist(int length) {
        if (length > 10) {
            element = (T[]) new Object[length];//开辟空间

        }else {
            element = (T[]) new Object[DEFAULT_SIZE];
        }
        size=0;//默认给长度是0
    }

    public Arraylist() {
        this(DEFAULT_SIZE);
        size=0;//默认给长度是0

    }

    /**
     * 往数组空间指定位置存数据 考虑的情况
     * 是否还有空间 如果有空间就直接往里边存储
     * 如果没有就自动扩充空间添加元素
     *
     * **/
    public  void add( int index,T value){
        if(element[index]!=null){
            element[index]=value;
        }else {
            element[index]=value;
             size++;
        }

    }
    public  void add(T value){
            element[size++]=value;

    }
    /**获取顺序表的长度***/
   public  int  getSize(){
        return size;
   }

/**遍历数组**/
public  void foreach(){
        for ( int i=0; i<size; i++){
            System.out.println("下标是"+i+"个元素值"+element[i]);
        }
}

public  void removes(int index) {
         if(index>=size||index<0) {
              System.out.println("小标有问题");
         }
         for(int i=index+1;i<=size-1;i++) {
             element[i-1]=element[i];
         }

    element[size--]=null;


}









}

