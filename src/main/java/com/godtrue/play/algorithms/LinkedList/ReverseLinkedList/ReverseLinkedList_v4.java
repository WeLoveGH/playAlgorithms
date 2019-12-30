package com.godtrue.play.algorithms.LinkedList.ReverseLinkedList;

import com.godtrue.play.algorithms.LinkedList.CreateLinkedList.CreateLinkedList_v3;
import com.godtrue.play.algorithms.LinkedList.Node;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-18
 */
public class ReverseLinkedList_v4 {
    private static final Node reverseLinkedList(Node headNode){
        if(headNode == null){
            return null;
        }

        Node preNode = null;
        Node curNode = headNode;
        int index = 1;
        while(curNode != null){
            /**
             * 这个是神来之笔，将链表截断，拿到后半部分
             */
            Node nextNode = curNode.getNext();

            System.out.println("第 " + index + "次，进行链表的反转，nextNod is :");
            Node.printLinkedList(nextNode);

            /**
             * 将前置节点组成一个单链表
             */
            curNode.setNext(preNode);

            /**
             * 保持前置节点和当前节点两个变量含义不变
             */

            /**
             * 前置节点指向前一个单链表
             */
            preNode = curNode;

            System.out.println("第 " + index + "次，进行链表的反转，preNode is :");
            Node.printLinkedList(preNode);

            /**
             * 当前节点指向后一个单链表
             */
            curNode = nextNode;

            index++;
        }
        return preNode;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        Node headNode = CreateLinkedList_v3.createLinkedList(a);
        Node.printLinkedList(headNode);
        Node.printLinkedList(reverseLinkedList(headNode));
    }
}

/*

第 1次，进行链表的反转，nextNod is :
2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> null

第 1次，进行链表的反转，preNode is :
1 -> null

第 2次，进行链表的反转，nextNod is :
3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> null

第 2次，进行链表的反转，preNode is :
2 -> 1 -> null

第 3次，进行链表的反转，nextNod is :
4 -> 5 -> 6 -> 7 -> 8 -> 9 -> null

第 3次，进行链表的反转，preNode is :
3 -> 2 -> 1 -> null

第 4次，进行链表的反转，nextNod is :
5 -> 6 -> 7 -> 8 -> 9 -> null

第 4次，进行链表的反转，preNode is :
4 -> 3 -> 2 -> 1 -> null

第 5次，进行链表的反转，nextNod is :
6 -> 7 -> 8 -> 9 -> null

第 5次，进行链表的反转，preNode is :
5 -> 4 -> 3 -> 2 -> 1 -> null

第 6次，进行链表的反转，nextNod is :
7 -> 8 -> 9 -> null

第 6次，进行链表的反转，preNode is :
6 -> 5 -> 4 -> 3 -> 2 -> 1 -> null

第 7次，进行链表的反转，nextNod is :
8 -> 9 -> null

第 7次，进行链表的反转，preNode is :
7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> null

第 8次，进行链表的反转，nextNod is :
9 -> null

第 8次，进行链表的反转，preNode is :
8 -> 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> null

第 9次，进行链表的反转，nextNod is :
 -> null

第 9次，进行链表的反转，preNode is :
9 -> 8 -> 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> null

 */
