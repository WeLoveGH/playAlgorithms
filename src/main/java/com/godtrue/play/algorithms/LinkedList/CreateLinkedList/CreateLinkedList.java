package com.godtrue.play.algorithms.LinkedList.CreateLinkedList;

import com.godtrue.play.algorithms.LinkedList.Node;

/**
 * @description：创建链表
 * @author：qianyingjie1
 * @create：2019-12-18
 */
public class CreateLinkedList {

    private static final Node createLinkedList(int [] arr){
        if (arr==null || arr.length==0){
            return null;
        }

        Node headNode = new Node(arr[0]);

        /**
         * 这里最关键，我第一次绕了好久，都没弄出来，一定要搞清楚节点之间的联系指针或引用
         */
        Node curNode = headNode;
        for (int i = 1; i < arr.length; i++) {
            curNode.setNext(new Node(arr[i]));
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