package com.godtrue.play.algorithms.Tree.BinaryTree.CreateBinaryTree;

import com.godtrue.play.algorithms.Tree.BinaryTree.BinaryTreeNode;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-22
 */
public class CreateBinaryTree {
    public static final BinaryTreeNode createBinaryTree(int [] arr,int index){
        /**
         * 声明二叉树的节点，注意，先设置为null
         */
        BinaryTreeNode treeNode = null;
        /**
         * 如果索引值还小于数组的长度，则真正的创建二叉树的节点
         */
        if(index <arr.length){
            /**
             * 创建二叉树的节点，对应的节点值为传递过来的索引对应的数值
             */
            treeNode = new BinaryTreeNode(arr[index]);

            /**
             * 这里是关键
             *
             * 左节点对应的数组位置为2*index+1
             * 有节点对应的数组位置为2*index+2
             *
             */
            treeNode.setLeft(createBinaryTree(arr,2*index+1));
            treeNode.setRight(createBinaryTree(arr,2*index+2));
        }
        return treeNode;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        int index = 0;
        BinaryTreeNode treeNode = createBinaryTree(a,index);
        System.out.println(treeNode);
    }
}
/*

                        1
                    2       3
                   4 5     6 7
                  8 9
 */



