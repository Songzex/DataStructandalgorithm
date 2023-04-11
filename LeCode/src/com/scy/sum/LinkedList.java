package com.scy.sum;

class  ListNode{
    /***
     * 创建节点类*/
    public  int val;// 链表的节点值
    public  ListNode next;//下一个节点的前驱节点
    public ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) { this.val = val; this.next = next;
}

public class LinkedList <T> {
    /**
     * 创建链表类
     **/
    public ListNode dummy;//虚拟头节点 使结点都有一个头节点

    public LinkedList() {
        dummy = new ListNode(-1);
    }
/**四类基本操作增删改查**/
    /**
     * 添加数据
     */
    public void add(int location, int val) {
        ListNode pre = dummy;/**pre引用 代表的是虚拟头节点 开始是第一位置然后 循环找到指定位置**/
        for (int i = 0; i < location; ++i) {
            /**
             * 通过循环找到指定位置 的前一个， 然后利用前一个的属性。确定目标位置
             *
             * **/
            pre = pre.next;//
        }
        ListNode node = new ListNode(val);
        node.next = pre.next;
        pre.next = node;
        /**
         *  原来：        A(pre)B(pre.next) 把node 插入中间
         *  现在：        A(pre) node B(pre.next)
         *   操作： A的next也就是B 对象  现在被node的next 指向
         *        然后 A 的next 也就是pre.next 引用指向node
         * **/

    }

    /**
     * 遍历链表
     */

    public void print() {
        ListNode head = dummy.next;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}}