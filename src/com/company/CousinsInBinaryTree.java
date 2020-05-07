package com.company;

public class CousinsInBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int depth = -1, parent = -1; // mark the first target hit during search

    public boolean isCousins(TreeNode root, int x, int y) {
        return dfs(root, x, y, -2, 0);
    }

    boolean dfs(TreeNode node, int x, int y, int p, int d) {
        if (node == null) return true;

        if (node.val == x || node.val == y) {
            if (depth != -1 && parent != -1) { // if the other target already hit previously
                if (depth == d && parent != p) return true;
                else return false;
            } else {
                depth = d;
                parent = p;
            }
        }
        return dfs(node.left, x, y, node.val, d + 1) && dfs(node.right, x, y, node.val, d + 1);
    }
}
