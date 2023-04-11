package com.scy.pojo.stack;


class ListNode {
    public  int val;// 链表的节点值
    public  ListNode next;//下一个节点的前驱节点
    public ListNode(int val) {
        this.val = val;
    }


}

public class StackImpl {
    public ListNode dummy;//虚拟头节点 使结点都有一个头节点
          public StackImpl() {
            dummy = new ListNode(-1);

         }
  /**
   * 实现四个基本操作
   * push();添加
   * pop(); 删除
   * peek(); 出元素
   * isEmpty(); 判断为空
   * **/
          public  void  push(int val) {
              ListNode node = new ListNode(val);
              ListNode pre=dummy;
                 node.next=pre.next;
                 pre.next=node;
          }

          public  int pop() {
              int val = dummy.next.val;
            dummy.next= dummy.next.next;
            return  val;
          }

          public  int peek() {
            int val = dummy.next.val;
            return  val;
        }
          public boolean  isEmpty() {
              return dummy.next == null;
        }

}
