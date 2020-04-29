package com.company;

public class MergeTwoBinaryTrees {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public static void main(String[] args) throws Exception {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(2);

        TreeNode treeNode4 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(1);
        TreeNode treeNode6 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(3);
        TreeNode treeNode8 = new TreeNode(7);

        treeNode.left = treeNode1;
        treeNode1.left = treeNode2;
        treeNode.right = treeNode3;

        treeNode4.left = treeNode5;
        treeNode5.right = treeNode6;
        treeNode4.right = treeNode7;
        treeNode7.right = treeNode8;

        TreeNode treeNode9 = mergeTrees(treeNode, treeNode4);
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null){
            return null;
        }
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }

        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}
