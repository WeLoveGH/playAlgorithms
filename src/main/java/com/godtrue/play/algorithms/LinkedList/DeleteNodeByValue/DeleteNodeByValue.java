package com.godtrue.play.algorithms.LinkedList.DeleteNodeByValue;

import com.godtrue.play.algorithms.LinkedList.CreateLinkedList.CreateLinkedList_v3;
import com.godtrue.play.algorithms.LinkedList.Node;

/**
 * @description：
 *
 *              通过给定的值，删除链表的节点
 *
 * @author：qianyingjie1
 * @create：2019-12-23
 */
public class DeleteNodeByValue {
    private static final Node deleteNodeByValue(Node headNode,int value){
        /**
         * 空链表，已经没有什么可以删除的啦，直接返回
         */
        if(headNode == null){
            return null;
        }

        /**
         * 如果头结点，就是要删除的节点，则改变头结点的指向
         */
        while(headNode != null && value == headNode.getValue()){
            headNode = headNode.getNext();
        }

        /**
         * 再次判断链表是否为空，有可能整个链表数据全部相同，并且已经删除完毕
         */
        if(headNode == null){
            return null;
        }

        /**
         * 利用当前节点和当前节点的前置节点来删除元素
         * 此时：当前节点的前置节点一定不是待删除的元素了
         */
        Node preNode = headNode;
        Node curNode = preNode.getNext();
        /**
         * 当前节点非空，则继续
         */
        while (curNode != null){
            /**
             * 如果当前节点为待删除的节点，则利用当前节点的前置节点来删除元素
             * 直接跳过当前节点
             */
            if (value == curNode.getValue()){
                preNode.setNext(curNode.getNext());
                curNode = preNode.getNext();
                continue;
            }
            /**
             * 同步移动当前节点和当前节点的前置节点的位置
             */
            preNode = curNode;
            curNode = preNode.getNext();
        }

        return headNode;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        Node aHeadNode = CreateLinkedList_v3.createLinkedList(a);
        Node.printLinkedList(aHeadNode);
        System.out.println("删除节点值 = " + 5 + " 的节点");
        Node.printLinkedList(deleteNodeByValue(aHeadNode,5));



        int [] b = {6,6,6,6,6,6,6};
        Node bHeadNode = CreateLinkedList_v3.createLinkedList(b);
        Node.printLinkedList(bHeadNode);
        System.out.println("删除节点值 = " + 6 + " 的节点");
        Node.printLinkedList(deleteNodeByValue(bHeadNode,6));



        int [] c = {1,2,3,4,5,6,7,7,7,8,9};
        Node cHeadNode = CreateLinkedList_v3.createLinkedList(c);
        Node.printLinkedList(cHeadNode);
        System.out.println("删除节点值 = " + 7 + " 的节点");
        Node.printLinkedList(deleteNodeByValue(cHeadNode,7));



        Node.printLinkedList(cHeadNode);
        System.out.println("删除节点值 = " + 8 + " 的节点");
        Node.printLinkedList(deleteNodeByValue(cHeadNode,8));



        Node.printLinkedList(cHeadNode);
        System.out.println("删除节点值 = " + 9 + " 的节点");
        Node.printLinkedList(deleteNodeByValue(cHeadNode,9));



        Node.printLinkedList(cHeadNode);
        System.out.println("删除节点值 = " + 10 + " 的节点");
        Node.printLinkedList(deleteNodeByValue(cHeadNode,10));
    }
}
