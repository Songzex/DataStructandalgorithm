package com.scy.bst.queue;
/**
 * 此类是队列的链式结构抽象
 * {
 *     初始化
 *     入队
 *     出队
 *     取队头的元素
 *
 * }
 *
 *
 * **/

class  ListNode{
    public int val;// 链表的节点值
    public  ListNode next;//下一个节点的前驱节点
    public ListNode(int val) {
        this.val = val;
    }

}
public class ListQueue {
    private  ListNode   font ;
    private  ListNode rear ;
    private  ListNode dummy;//头结点

    public ListQueue() {
          this.dummy=new ListNode(-1);//new 一个虚拟的头结点 方便操作
          this.font=this.rear=this.dummy;//两个头指针同时指向虚拟头结点
          this.dummy.next=null;//头结点
    }
    public void  EnQueue( int a) {
        ListNode node = new ListNode(a);
        node.next=null;
       this.rear.next=node;
       this.rear=node;
    }
    public void  DeQueue() {
      if(this.font==this.rear) {
          System.out.println("链队伍是空");
      }else {
          ListNode node = this.dummy.next;
          if (this.rear==node) {
              this.font=this.rear=this.dummy;
          }
          int val = this.dummy.next.val;
          this.dummy.next = this.dummy.next.next;

      }
    }
  public ListNode  GetHead(){
      ListNode head = null;
      if(this.font==this.rear){
          head = this.dummy.next;
      }
      return head;
  }

}

