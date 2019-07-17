package com.wp.demo.easy;

import java.util.Stack;

/**
 * @author wp
 * @date 2019/7/15
 */
public class 判断单链表是否为回文链表 {


    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
//        listNode.next.next = new ListNode(1);
        System.out.println(isPalindromeReverseList(listNode));

    }


    // Time: O(n), Space: O(n)
    private static boolean isPalindromeUsingStack(ListNode head) {

        Stack<Integer> stack = new Stack<>();
        /**
         * version_1
         */
//        ListNode node = head;
//        int pushVal = 0;
//        while (node != null) {
//            stack.push(node.val);
//            pushVal = pushVal * 10 + node.val;
//            node = node.next;
//        }
//        int popVal = 0;
//        while (!stack.isEmpty()) {
//            popVal = popVal * 10 + stack.pop();
//        }
//        return pushVal == popVal;

        /**
         * version_2
         */
        for (ListNode node = head; node != null; node = node.next) {
            stack.push(node.val);
        }
        for (ListNode node = head; node != null; node = node.next) {
            if (node.val != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Time: O(n), Space: O(1)
    private static boolean isPalindromeReverseList(ListNode head) {

        int len = 0;
        for (ListNode node = head; node != null; node = node.next, len++) {
        }

        ListNode cur = head, pre = null;
        for (int i = 0; i < len / 2; i++) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        if (len % 2 == 1) {
            cur = cur.next;
        }

        for (ListNode node = cur; node != null && cur != null; node = node.next, cur = cur.next) {
            if (cur.val!=node.val){
                return false;
            }
        }
        return true;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
