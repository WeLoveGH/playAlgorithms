package com.godtrue.play.algorithms.Tree.BinaryTree.OrderBinaryTree;

import com.godtrue.play.algorithms.Tree.BinaryTree.BinaryTreeNode;

/**
 * @description：
 *
 *              后序遍历二叉树
 *              左子树
 *              右子树
 *              根节点
 *
 *
 *
 * @author：qianyingjie1
 * @create：2019-12-19
 */
public class PostorderBinaryTree {
    private static final void postorderBinaryTree(BinaryTreeNode rootNode){

        /**
         * 递归的终止条件
         */
        if(rootNode == null){
            return;
        }

        /**
         * 递归的过程
         */
        postorderBinaryTree(rootNode.getLeft());
        postorderBinaryTree(rootNode.getRight());
        System.out.print(rootNode.getValue() + "  ");
    }

    public static void main(String[] args) {
        BinaryTreeNode rootNode = BinaryTreeNode.createBinaryTree();
        postorderBinaryTree(rootNode);
    }
}
