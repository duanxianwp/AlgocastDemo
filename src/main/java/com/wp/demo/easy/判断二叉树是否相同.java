package com.wp.demo.easy;

import java.util.Stack;

/**
 * @author wp
 * @date 2019/7/4
 */
public class 判断二叉树是否相同 {

    public static void main(String[] args) {

    }

    //T:O(n) S:O(n)
    private boolean isSameTreeRecursive(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        return s.val == t.val && isSameTreeIterative(s.left, t.left) && isSameTreeIterative(s.right, t.right);
    }


    //T:O(n) S:O(n)
    private boolean isSameTreeIterative(TreeNode p, TreeNode q) {

        Stack<TreeNode> stack = new Stack<>();
        stack.push(p);
        stack.push(q);

        while (!stack.isEmpty()) {

            TreeNode s = stack.pop(), t = stack.pop();
            if (s == null && t == null) {
                continue;
            }
            if (s == null || t == null) {
                return false;
            }

            if (s.val != t.val) {
                return false;
            }
            stack.push(s.left);
            stack.push(t.left);
            stack.push(s.right);
            stack.push(t.right);
        }
        return true;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
