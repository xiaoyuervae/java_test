package com.test.MirrorBinTree;

import java.util.Stack;

/**
 * Created by xiaoyuervae on 16/9/20.
 */

 class TreeNode {
     int val = 0;
         TreeNode left = null;
         TreeNode right = null;

     public TreeNode(int val) {
         this.val = val;

     }

 }

public class MirrorBinTree {
    /**
     * 递归版方法
     * @param root

    public void Mirror(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left ;
            root.left = root.right ;
            root.right = temp ;

            Mirror(root.left);
            Mirror(root.right);
        }
    }
     */
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stackNode = null;
        stackNode.push(root) ;
        while (!stackNode.isEmpty()) {
            TreeNode tree = stackNode.pop() ;
            if(tree.left!=null || tree.right!=null){
                TreeNode ptemp=tree.left;
                tree.left=tree.right;
                tree.right=ptemp;
            }
            if(tree.left != null) {
                stackNode.push(tree.left);
            }
            if(tree.right != null) {
                stackNode.push(tree.right);
            }
        }
    }
}
