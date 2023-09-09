package com.scy.linklist;
/**
 * 单链表
 * **/
public class SingLinkedList<T> {
    private int size;//链表里边的数据个数
    private  Node<T> fist;//头结点
    private  Node<T> last;//尾结点
//无参构造
    public SingLinkedList() {

    }
//内部类
   private static class  Node <T>{
        T element;
        Node next;

       public Node(T element, Node next) {
           this.element = element;
           this.next = next;
       }
   }
//统计单链表
   public int size(){
        return size;
   }
//判断链表里边的是否为空
    public  boolean isEmpty() {
        return size==0;
    }
//是否包含某一个具体数据o
    public  boolean contains(Object o) {
        if(o==null) {
            for (Node<T> x=fist;x!=null;x=x.next){
                if (x.element==null){
                    return true;
                }
            }
        }else {
            for (Node<T>x=fist;x!=null;x=x.next) {
               if (x.element.equals(o)) {
                   return true;
               }
            }
        }
        return false;//两种都不包含呢就flase；
    }


}

