package com.scy.sum;

public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(3);

        ListNode listNode2 = new ListNode(4,listNode1);
        ListNode l1 = new ListNode(2,listNode2);
        TwoSunTest test = new TwoSunTest();
        ListNode listNode = new ListNode(4);
        ListNode listNode5 = new ListNode(6,listNode);
        ListNode l2 = new ListNode(5,listNode5);
        ListNode head = test.addTwoNumbers(l1, l2);
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    System.out.println(8/10);
    }
}