package com.godtrue.play.algorithms.LinkedList.ReverseLinkedList;

import com.godtrue.play.algorithms.LinkedList.CreateLinkedList.CreateLinkedList_v3;
import com.godtrue.play.algorithms.LinkedList.Node;

/**
 * @description：反转单量表
 * @author：qianyingjie1
 * @create：2019-12-16
 */
public class ReversedLinkedList_v3 {

    private static final Node reversedLinkedList(Node headNode){

        if(headNode == null){
            return null;
        }

        /**
         * 定义临时前置节点，默认值为null，为了方便第一个节点下个节点为null
         */
        Node preNode = null;

        /**
         * 定义临时当前节点，刚开始当前节点指向头节点
         */
        Node curNode = headNode;

        /**
         * 当前节点非空就能继续反转
         *
         * 通过DEBUG发现，链表的反转，实际上是将链表截断，然后将节点一个一个放入前一个单链表中
         * 关键：是每次都从前放置
         *
         * 假设单链表是：headNode->1->2->3->4->5->6->7->8->9->null
         *
         * 第一次反转：preNode->null
         *           curNode->1->2->3->4->5->6->7->8->9->null
         *
         * 第二次反转：preNode->1->null
         *           curNode->2->3->4->5->6->7->8->9->null
         *
         * 第三次反转：preNode->2->1->null
         *           curNode->3->4->5->6->7->8->9->null
         *
         * 第四次反转：preNode->3->2->1->null
         *           curNode->4->5->6->7->8->9->null
         *
         * 第五次反转：preNode->4->3->2->1->null
         *           curNode->5->6->7->8->9->null
         *
         * 第六次反转：preNode->5->4->3->2->1->null
         *           curNode->6->7->8->9->null
         *
         * 第七次反转：preNode->6->5->4->3->2->1->null
         *           curNode->7->8->9->null
         *
         * 第八次反转：preNode->7->6->5->4->3->2->1->null
         *           curNode->8->9->null
         *
         * 第九次反转：preNode->8->7->6->5->4->3->2->1->null
         *           curNode->9->null
         *
         * 第十次反转：preNode->9->8->7->6->5->4->3->2->1->null
         *           curNode->null
         *
         *
         */
        while(curNode != null){
            /**
             * 获取当前节点的下一个节点
             */
            Node next = curNode.getNext();

            /**
             * 调整当前节点的下一个节点，让当前节点指向前一个节点
             */
            curNode.setNext(preNode);
            /**
             * 调整前置节点的位置，前置节点指向当前节点
             */
            preNode = curNode;
            /**
             * 调整当前节点的位置，当前节点指向下一个节点
             */
            curNode = next;
        }

        return preNode;
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