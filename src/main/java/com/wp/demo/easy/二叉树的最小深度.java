package com.wp.demo.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wp
 * @date 2019/7/15
 */
public class 二叉树的最小深度 {

    public static void main(String[] args) {

        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(4);
        node.left.left = new TreeNode(3);
        node.right = new TreeNode(2);
//        node.right.right = new TreeNode(3);

        System.out.println(minDepthIterative(node));
    }

    // Time: O(n), Space: (n)
    private static int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    // Time: O(n), Space: O(n)
    private static int minDepthIterative(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) {
                    return depth;
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.left != null) {
                    queue.add(node.right);
                }
            }
            depth++;
        }
        return -1;
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
