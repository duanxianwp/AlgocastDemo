package com.wp.demo.easy;

/**
 * @author wp
 * @date 2019/7/18
 */
public class 链表的相交节点 {

    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        ListNode listNode = new ListNode(4);
        node.next.next = listNode;
        ListNode node1 = new ListNode(3);
        node1.next = listNode;
        listNode.next = new ListNode(5);
        System.out.println(getIntersectionNodeWithLen(node, node1).val);
        System.out.println(getIntersectionNodeWithoutLen(node, node1).val);

    }

    // Time: O(m+n), Space: O(1)
    private static ListNode getIntersectionNodeWithoutLen(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }
        ListNode p = headA, q = headB;
        while (p != q) {
            p = p == null ? headB : p.next;
            q = q == null ? headA : q.next;
        }
        return p;
    }

    // Time: O(m+n), Space: O(1)
    private static ListNode getIntersectionNodeWithLen(ListNode headA, ListNode headB) {

        int aLen = 0, bLen = 0;
        for (ListNode node = headA; node != null; node = node.next, aLen++) {
        }
        for (ListNode node = headB; node != null; node = node.next, bLen++) {
        }

        ListNode nodeA = headA, nodeB = headB;
        if (aLen > bLen) {
            for (int i = 0; i < Math.abs(aLen - bLen); i++) {
                nodeA = nodeA.next;
            }
        } else {
            for (int i = 0; i < Math.abs(aLen - bLen); i++) {
                nodeA = nodeA.next;
            }
        }
//        for (; nodeA != null && nodeB != null; nodeA = nodeA.next, nodeB = nodeB.next) {
//            if (nodeA == nodeB) {
//                return nodeA;
//            }
//        }
//        return null;
        while (nodeA != nodeB) {
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return nodeA;
    }


    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
