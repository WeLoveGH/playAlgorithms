package com.godtrue.play.algorithms.Tree.BinaryTree.CreateBinaryTree;

import com.godtrue.play.algorithms.Tree.BinaryTree.BinaryTreeNode;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-22
 */
public class CreateBinaryTree_v2 {
    public static final void createBinaryTree(BinaryTreeNode node,int data){
            if(data<node.getValue()){
                if(node.getLeft()==null){
                    node.setLeft(new BinaryTreeNode(data));
                }else {
                    createBinaryTree(node.getLeft(), data);
                }
            }else {
                if (node.getRight() == null) {
                    node.setRight(new BinaryTreeNode(data));
                } else {
                    createBinaryTree(node.getRight(), data);
                }
            }
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        BinaryTreeNode root = new BinaryTreeNode(0);
        for (int i = 0; i < a.length; i++) {
            createBinaryTree(root,a[i]);
        }
        System.out.println(root);
    }
}



