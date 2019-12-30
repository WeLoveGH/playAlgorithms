package com.godtrue.play.algorithms.LinkedList.CreateLinkedList;

import com.godtrue.play.algorithms.LinkedList.Node;

/**
 * @description：创建链表
 * @author：qianyingjie1
 * @create：2019-12-18
 */
public class CreateLinkedList_v2 {

    private static final Node createLinkedList(int [] arr){
        if (arr==null || arr.length==0){
            return null;
        }

        Node headNode = new Node(arr[0]);

        /**
         * 这里最关键，我第一次绕了好久，都没弄出来，一定要搞清楚节点之间的联系指针或引用
         *
         * 最好定义一个临时节点，表示当前节点，并在在计算的过程中保持的含义不变
         * 不要单单使用头结点这个变量，防止理解上有误差
         *
         */
        Node curNode = headNode;
        int index = 1;
        while (index < arr.length){
            curNode.setNext(new Node(arr[index++]));
            curNode = curNode.getNext();
        }

        return headNode;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        Node.printLinkedList(createLinkedList(a));

        int [] b = {9,8,7,6,5,4,3,2,1};
        Node.printLinkedList(createLinkedList(b));
    }
}