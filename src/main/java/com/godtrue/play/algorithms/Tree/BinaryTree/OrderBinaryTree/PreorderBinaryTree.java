package com.godtrue.play.algorithms.Tree.BinaryTree.OrderBinaryTree;

import com.godtrue.play.algorithms.Tree.BinaryTree.BinaryTreeNode;

/**
 * @description：
 *
 *              前序遍历二叉树
 *              根节点
 *              左子树
 *              右子树
 *
 * @author：qianyingjie1
 * @create：2019-12-19
 */
public class PreorderBinaryTree {
    private static final void preorderBinaryTree(BinaryTreeNode rootNode){

        /**
         * 递归终止条件
         */
        if(rootNode == null){
            return;
        }

        /**
         * 递归过程
         */
        System.out.print(rootNode.getValue() + "  ");
        preorderBinaryTree(rootNode.getLeft());
        preorderBinaryTree(rootNode.getRight());
    }

    public static void main(String[] args) {
        BinaryTreeNode rootNode = BinaryTreeNode.createBinaryTree();
        preorderBinaryTree(rootNode);
    }
}
