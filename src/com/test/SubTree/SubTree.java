package com.test.SubTree;

/**
 * Created by xiaoyuervae on 16/9/20.
 * 判断B是不是A的子结构
 * 1.判断A中有没有结点是B的根节点,假设为R
 * 2.判断以R为根节点的结构是不是和B的结构是一样的
 */


class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
         this.val = val;
    }

 }

public class SubTree {
    public boolean hasSubTree(TreeNode root1 , TreeNode root2) {
        // 只要两个对象是同一个就返回true
        if (root1 == root2) {
            return true;
        }
        // 如果B树是空的,肯定为A树的子结构
        if (root2 == null) {
            return true ;
        }
        // 如果A树为空,约定空树不是任何任意一个树的子结构
        if (root1 == null) {
            return false ;
        }
        boolean flag = false ;
        if (root1.val == root2.val) {
            flag = matchTree(root1 , root2) ;
        }
        // 如果匹配就直接返回结果
        if (flag) {
            return true;
        }
        // 如果不匹配就找树A的左子结点和右子结点进行判断
        return hasSubTree(root1.left, root2) || hasSubTree(root1.right, root2);
    }

    private boolean matchTree(TreeNode root1, TreeNode root2) {
        // 只要两个对象是同一个就返回true
        if (root1 == root2) {
            return true;
        }
        // 只要树B的根结点点为空就返回true
        if (root2 == null) {
            return true;
        }
        // 树B的根结点不为空，如果树A的根结点为空就返回false
        if (root1 == null) {
            return false;
        }

        // 如果两个结点的值相等，则分别判断其左子结点和右子结点
        if (root1.val == root2.val) {
            return matchTree(root1.left, root2.left) && matchTree(root1.right, root2.right);
        }
        // 结点值不相等返回false
        return false;
    }
}
