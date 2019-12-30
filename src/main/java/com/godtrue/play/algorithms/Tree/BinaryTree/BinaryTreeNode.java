package com.godtrue.play.algorithms.Tree.BinaryTree;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-19
 */
public class BinaryTreeNode {
    /**
     * 节点值
     */
    int value;

    /**
     * 左子树
     */
    BinaryTreeNode left;

    /**
     * 右子树
     */
    BinaryTreeNode right;

    public BinaryTreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public static final BinaryTreeNode createBinaryTree(){
        BinaryTreeNode rootNode = new BinaryTreeNode(1);
        BinaryTreeNode leftNode = new BinaryTreeNode(2);
        BinaryTreeNode rightNode = new BinaryTreeNode(3);

        rootNode.setLeft(leftNode);
        rootNode.setRight(rightNode);

        return rootNode;
    }

    public static final BinaryTreeNode createBinaryTree(int [] arr){
        if(arr==null || arr.length==0){
            return null;
        }

        if(arr.length>3){

        }

        BinaryTreeNode rootNode = new BinaryTreeNode(arr[0]);
        BinaryTreeNode left = new BinaryTreeNode(arr[1]);
        BinaryTreeNode right = new BinaryTreeNode(arr[2]);
        rootNode.setLeft(left);
        rootNode.setRight(right);

        BinaryTreeNode curNode = rootNode;

        for (int i = 1; i < arr.length-1;) {
            left.setLeft(new BinaryTreeNode(arr[i++]));
            left.setRight(new BinaryTreeNode(arr[i++]));
            left = left.getLeft();

            right.setLeft(new BinaryTreeNode(arr[i++]));
            right.setRight(new BinaryTreeNode(arr[i++]));
            right = right.getRight();

        }

        return rootNode;
    }
}
