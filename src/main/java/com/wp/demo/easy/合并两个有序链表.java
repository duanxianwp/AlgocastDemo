package com.wp.demo.easy;

/**
 * @author wp
 * @date 2019/7/16
 */
public class 合并两个有序链表 {

    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        node.next = new ListNode(3);
        ListNode node1 = new ListNode(2);
        node1.next = new ListNode(4);
        ListNode res = mergeTwoSortedLists(node,node1);
        System.out.println(res);
    }

    // Time: O(m+n), Space: O(1)
    private static ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {

        ListNode node = new ListNode(0), cur = node;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;

            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;

        }
        if (l1 != null) {
            cur.next = l1;
        }

        if (l2 != null) {
            cur.next = l2;
        }
        return node.next;
    }


    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
