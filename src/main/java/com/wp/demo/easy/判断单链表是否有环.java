package com.wp.demo.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wp
 * @date 2019/7/18
 */
public class 判断单链表是否有环 {

    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        System.out.println(hasCycleWithHashSet(node));
        System.out.println(hasCycleWithTwoPointer(node));
        node.next.next.next = node.next;
        System.out.println(hasCycleWithHashSet(node));
        System.out.println(hasCycleWithTwoPointer(node));

    }

    // Time: O(n), Space: O(n)
    private static boolean hasCycleWithHashSet(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        for (ListNode node = head; node != null; node = node.next) {
            if (set.contains(node)) {
                return true;
            }
            set.add(node);
        }
        return false;
    }

    // Time: O(n), Space: O(1)
    private static boolean hasCycleWithTwoPointer(ListNode head) {
        ListNode p = head, q = head;

        while (p != null && p.next != null) {
            p = p.next.next;
            q = q.next;
            if (p == q) {
                return true;
            }
        }
        return false;

    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
