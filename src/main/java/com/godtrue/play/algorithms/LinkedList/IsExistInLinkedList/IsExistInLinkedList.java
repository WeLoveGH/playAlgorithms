package com.godtrue.play.algorithms.LinkedList.IsExistInLinkedList;

import com.godtrue.play.algorithms.LinkedList.CreateLinkedList.CreateLinkedList_v3;
import com.godtrue.play.algorithms.LinkedList.Node;

/**
 * @description：
 *
 *              判断一个值是否在链表中，需要通过一次单链表的遍历
 *
 * @author：qianyingjie1
 * @create：2019-12-23
 */
public class IsExistInLinkedList {

    private static final int MAX_LOOP = 15;

    private static final boolean isExistInLinkedList(Node headNode,int value){
        /**
         * 链表为空，那一定不在了，直接返回
         */
        if(headNode == null){
            return false;
        }

        /**
         * 定义一个临时节点，保持他的含义不变，指向当前节点
         */
        Node curNode = headNode;
        /**
         * 当前节点非空，继续遍历，表示还没有到达链表的尾部
         */
        while(curNode != null){
            /**
             * 当前节点的值为，寻找的值，那就是找到了
             */
            if(value == curNode.getValue()){
                return true;
            }
            /**
             * 移动当前节点的指针，指向当前节点的下一个节点
             */
            curNode = curNode.getNext();
        }
        return false;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        Node headNode = CreateLinkedList_v3.createLinkedList(a);
        Node.printLinkedList(headNode);
        for (int i = -3; i < IsExistInLinkedList.MAX_LOOP; i++) {
            System.out.println(i + " is exist in linked list " + isExistInLinkedList(headNode,i));
        }
    }
}
