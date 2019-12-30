package com.godtrue.play.algorithms.Tree.BinaryTree.OrderBinaryTree;

import com.godtrue.play.algorithms.Tree.BinaryTree.BinaryTreeNode;

/**
 * @description：
 *
 *              中序遍历二叉树
 *              左子树
 *              根节点
 *              右子树
 *
 *
 *
 * @author：qianyingjie1
 * @create：2019-12-19
 */
public class InorderBinaryTree {
    private static final void inorderBinaryTree(BinaryTreeNode rootNode){

        /**
         * 递归终止条件
         */
        if(rootNode == null){
            return;
        }

        /**
         * 递归的过程
         */
        inorderBinaryTree(rootNode.getLeft());
        System.out.print(rootNode.getValue() + "  ");
        inorderBinaryTree(rootNode.getRight());
    }

    public static void main(String[] args) {
        BinaryTreeNode rootNode = BinaryTreeNode.createBinaryTree();
        inorderBinaryTree(rootNode);
    }
}
