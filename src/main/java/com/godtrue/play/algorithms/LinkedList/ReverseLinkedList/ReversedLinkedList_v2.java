package com.godtrue.play.algorithms.LinkedList.ReverseLinkedList;

import com.godtrue.play.algorithms.LinkedList.CreateLinkedList.CreateLinkedList_v3;
import com.godtrue.play.algorithms.LinkedList.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @description：反转单量表
 * @author：qianyingjie1
 * @create：2019-12-16
 */
public class ReversedLinkedList_v2 {

    private static final Node reversedLinkedList(Node head){

        if(head==null){
            return null;
        }

        /**
         * 单链表逆序的思路：
         *
         * 1：利用一个辅助数据结构，这里使用动态数组（其他线上的比如：数组、队列都行）
         * 2：遍历一次链表，把链表的数据放入辅助数组中
         * 3：遍历一次辅助数据结构，创建一个新的链表，把对应的数据逆序放入链表
         *
         * 4：很明显，这是一种好性能和空间的方式，不是最优解
         *
         */
        List<Integer> list = new ArrayList<Integer>();

        Node curNode = head;
        while (curNode != null){
            list.add(curNode.getValue());
            curNode = curNode.getNext();
        }

        head = new Node(list.get(list.size()-1));

        curNode = head;
        int index = list.size()-1;
        while (index > 0){
            curNode.setNext(new Node(list.get(--index)));
            curNode = curNode.getNext();
        }

        return head;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        Node.printLinkedList(CreateLinkedList_v3.createLinkedList(a));

        Node.printLinkedList(reversedLinkedList(CreateLinkedList_v3.createLinkedList(a)));

        int [] b = {9,8,7,6,5,4,3,2,1};
        Node.printLinkedList(CreateLinkedList_v3.createLinkedList(b));
        Node.printLinkedList(reversedLinkedList(CreateLinkedList_v3.createLinkedList(b)));

        int [] c = {1,2,3,4,5,9,8,7,6};
        Node.printLinkedList(CreateLinkedList_v3.createLinkedList(c));
        Node.printLinkedList(reversedLinkedList(CreateLinkedList_v3.createLinkedList(c)));

        int [] d = {9,8,7,6,5,1,2,3,4};
        Node.printLinkedList(CreateLinkedList_v3.createLinkedList(d));
        Node.printLinkedList(reversedLinkedList(CreateLinkedList_v3.createLinkedList(d)));
    }

}