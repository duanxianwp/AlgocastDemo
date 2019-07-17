package com.wp.demo.easy;

import java.util.Stack;

/**
 * @author wp
 * @date 2019/7/2
 */
public class 判断二叉树是否对称 {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
//        isSymmetricTreeRecursive()
    }

    private static boolean isSymmetricTreeRecursive(TreeNode root) {

        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    // Time: O(n), Space: O(n)
    private static boolean isSymmetric(TreeNode s, TreeNode t) {
        if (s != null && t != null) {
            return s.val == t.val && isSymmetric(s.left, t.right) && isSymmetric(s.right, t.left);
        }
        return s == null && t == null;
    }

    private static boolean isSymmetricTreeIterative(TreeNode root) {
        if (root == null) {
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

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
            stack.push(t.right);
            stack.push(s.right);
            stack.push(t.left);
        }
        return true;
    }
}
