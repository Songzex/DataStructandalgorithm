package com.scy.pojo.queue;
/**此类抽象的是循环队列     Queue   未测试
 * {
 *    初始化
 *    销毁
 *    清空
 *    是否为空  Q.font=Q.rear  队满的条件:(Q.rear+1)%maxsize==Q.font
 *    获取队列长度 getSize()
 *    获取头部元素
 *    插入元素
 *    删除元素
 *    遍历元素
 * }
 * **/
public class Queue<T> {
   private T[] element;//为什么要设置成 private
   private int font;//头指真
   private int rear;//尾指针
   private int MaxSize;//最大的容量

   public Queue(int maxSize) {
      this.font = this.rear = 0;//初始状态下空队列
      MaxSize = maxSize;//申请的最大的空间
      this.element = (T[]) new Object[MaxSize];//强转型
   }

   public int getSize() {
      return (this.rear - this.font + MaxSize) % MaxSize;//返还元素个数及列表的长度
   }

   public String EnQueue(T a) {
      if ((this.rear - this.font + MaxSize) % MaxSize == MaxSize) {
         return "队伍已经满了";
      } else {
         this.element[this.rear] = a;
         this.rear = ((this.rear + 1) % MaxSize);
         return "ok";
      }
   }

   public String DeQueue() {
      if (this.rear == this.font) {
         return "队伍为空";
      } else {
         T font = this.element[this.font];
         this.font = ((this.font + 1) % MaxSize);//头指针加1
         return "ok";
      }
   }

   public T GetHead() {
      if (this.font != this.rear) {//在非空 的队列中
         return this.element[this.font];
      }
      return null;
   }
   public String QueueTraverse() {
      String s = "";
      for (int i=1;i<this.rear;i++) {
         s += this.element[i] + "、";

      }

      return s.substring(0,s.length() - 1);//去掉空格
   }

}