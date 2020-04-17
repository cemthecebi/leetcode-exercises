package com.company;

import java.util.Stack;

//938. Range Sum of BST
public class RangeSumOfBST {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static int rangeSumBST(TreeNode root, int L, int R) {
        Stack<TreeNode> treeNodeStack = new Stack<>();
        treeNodeStack.push(root);
        int sum = 0;

        while (!treeNodeStack.empty() && treeNodeStack.peek() != null) {

            TreeNode node = treeNodeStack.pop();
            int value = node.val;
            if (value >= L && value <= R) {
                sum += value;
            }
            if (node.left != null) {
                treeNodeStack.push(node.left);
            }
            if (node.right != null) {
                treeNodeStack.push(node.right);
            }
        }
        return sum;
    }


}
