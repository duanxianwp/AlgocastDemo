package com.wp.demo.easy;

/**
 * @author wp
 * @date 2019/7/6
 */
public class 反转单链表 {

    public static void main(String[] args) {

        ListNode node = new  ListNode(1);
        node.next = new ListNode(2);
        node = reverseList(node);
        System.out.println(node);
    }

    //T:O(n) S:O(1)
    private static ListNode reverseList(ListNode head) {

        ListNode cur = head, pre = null;

        while (cur != null) {

            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
