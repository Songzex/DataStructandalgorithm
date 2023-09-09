package com.scy.bst;
/**抽象节点类的类**/
class  ListNode{
    public  int val;// 链表的节点值
    public  ListNode next;//下一个节点的前驱节点
    public ListNode(int val) {
        this.val = val;
    }
}
//接口形式实现链表的基本操作
public class LinkList {
    public ListNode dummy;//虚拟头节点 使结点都有一个头节点
    public LinkList() {
         dummy = new ListNode(-1);
    }

    public  int get(int location){
        ListNode pre = dummy.next;/**pre引用 代表的是节点 开始是第一位置然后 循环从真正的头节点开始循环查找找到指定位置**/
        for (int i = 0; i < location; ++i) {
            pre=pre.next;//

        }
             return pre.val;
         }
         public  boolean continus(int val){
             ListNode pre= dummy.next;
             while (pre!=null){
                 if(pre.val==val){
                     return  true;
                 }
               pre=pre.next;
             }

             return false;

    }
         public void add(int location, int val) {
             ListNode pre = dummy;/**pre引用 代表的是虚拟头节点 开始是第一位置然后 循环找到指定位置**/
             for (int i = 0; i < location; ++i) {
                 /**
                  * 通过循环找到指定位置 的前一个， 然后利用前一个的属性。确定目标位置
                  *
                  * **/
                 pre=pre.next;//
             }
             ListNode node = new ListNode(val);
             node.next= pre.next;
             pre.next=node;
             /**
              *  原来：        A(pre)B(pre.next) 把node 插入中间
              *  现在：        A(pre) node B(pre.next)
              *  操作： A的next也就是B 对象  现在被node的next 指向
              *        然后 A 的next 也就是pre.next 引用指向node
              * **/

         }
          public  void remove(int location){
              ListNode pre = dummy.next;
              /**
               **/
              for (int i=0; i<location;++i){
                   pre=pre.next;
              }
            pre.next=pre.next.next;/**
                    把后一个的引用指向要删除节点的后一个也就是pre.next.next  这个节点指向 pre.next    要删除的嫩个对象没有了引用就会被垃圾回收机制回收。
               **/
          }
          public  void  print(){
            ListNode head = dummy.next;
            while (head!=null){
                System.out.println(head.val);
                 head = head.next;
            }


    }
            public  void clear() {


            }

}
