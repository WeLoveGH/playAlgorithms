package com.godtrue.play.algorithms.LinkedList.DeleteNodeByNode;

import com.godtrue.play.algorithms.LinkedList.CreateLinkedList.CreateLinkedList_v3;
import com.godtrue.play.algorithms.LinkedList.Node;

/**
 * @description：
 *
 *              根据指定的节点，删除了单链表中的节点
 *              注意：这里待删除的节点是通过节点间的引用来判断的
 *
 * @author：qianyingjie1
 * @create：2019-12-23
 */
public class DeleteNodeByNode_v2 {

    private static final Node deleteNodeByNode(Node headNode,Node toBeDeletedNode){
        /**
         * 链表为空，没法删除，直接返回null
         */
        if(headNode == null){
            return null;
        }

        /**
         * 待删除的节点为null，不用删除，直接返回链表
         */
        if(toBeDeletedNode == null){
            return headNode;
        }

        /**
         * 如果待删除节点为头结点，则调整头结点的指针指向
         */
        while (headNode.equals(toBeDeletedNode)){
            return headNode.getNext();
        }

        /**
         * 再次判断链表是否为空，上次的删除操作可能将单链表中的所有节点都给删除掉了
         */
        if(headNode == null){
            return null;
        }

        /**
         * 利用当前节点和当前节点的前置节点来删除当前节点
         * 通过当前节点的前置节点直接指向当前节点的下一个节点来删除当前节点
         * 注意：由于前面的控制，当前节点的前置节点一定不是待删除的节点
         */
        Node preNode = headNode;
        Node curNode = headNode.getNext();
        while(curNode != null){
            if(curNode.equals(toBeDeletedNode)){
                preNode.setNext(curNode.getNext());
                curNode = preNode.getNext();
                /**
                 * 这个 continue 很重要，针对待删除的节点是尾节点时的处理
                 */
                continue;
            }
            /**
             * 通过一定当前节点和当前节点的前置节点
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
        System.out.println("待删除的节点：" + aHeadNode + " 节点值为： "+ aHeadNode.getValue());
        Node.printLinkedList(deleteNodeByNode(aHeadNode,aHeadNode));



        int [] b = {6,6,6,6,6,6,6};
        Node bHeadNode = CreateLinkedList_v3.createLinkedList(b);
        Node.printLinkedList(bHeadNode);
        System.out.println("待删除的节点：" + bHeadNode + " 节点值为： "+ bHeadNode.getValue());
        Node.printLinkedList(deleteNodeByNode(bHeadNode,bHeadNode));



        int [] c = {1,2,3,4,5,6,7,7,7,8,9};
        Node cHeadNode = CreateLinkedList_v3.createLinkedList(c);
        Node.printLinkedList(cHeadNode);
        Node toBeDeletedNode = cHeadNode.getNext().getNext().getNext().getNext().getNext().getNext();
        System.out.println("待删除的节点：" + toBeDeletedNode + " 节点值为： "+ toBeDeletedNode.getValue());
        Node.printLinkedList(deleteNodeByNode(cHeadNode,toBeDeletedNode));



        Node.printLinkedList(cHeadNode);
        toBeDeletedNode = toBeDeletedNode.getNext();
        System.out.println("待删除的节点：" + toBeDeletedNode + " 节点值为： "+ toBeDeletedNode.getValue());
        Node.printLinkedList(deleteNodeByNode(cHeadNode,toBeDeletedNode));



        Node.printLinkedList(cHeadNode);
        toBeDeletedNode = toBeDeletedNode.getNext();
        System.out.println("待删除的节点：" + toBeDeletedNode + " 节点值为： "+ toBeDeletedNode.getValue());
        Node.printLinkedList(deleteNodeByNode(cHeadNode,toBeDeletedNode));



        Node.printLinkedList(cHeadNode);
        toBeDeletedNode = toBeDeletedNode.getNext();
        System.out.println("待删除的节点：" + toBeDeletedNode + " 节点值为： "+ toBeDeletedNode.getValue());
        Node.printLinkedList(deleteNodeByNode(cHeadNode,toBeDeletedNode));



        Node.printLinkedList(cHeadNode);
        toBeDeletedNode = toBeDeletedNode.getNext();
        System.out.println("待删除的节点：" + toBeDeletedNode + " 节点值为： "+ toBeDeletedNode.getValue());
        Node.printLinkedList(deleteNodeByNode(cHeadNode,toBeDeletedNode));



        Node.printLinkedList(cHeadNode);
        System.out.println("删除节点值 = " + null + " 的节点");
        Node.printLinkedList(deleteNodeByNode(cHeadNode,null));



        Node.printLinkedList(null);
        System.out.println("删除节点值 = " + null + " 的节点");
        Node.printLinkedList(deleteNodeByNode(null,null));



        Node.printLinkedList(null);
        toBeDeletedNode = new Node(1);
        System.out.println("待删除的节点：" + toBeDeletedNode + " 节点值为： "+ toBeDeletedNode.getValue());
        Node.printLinkedList(deleteNodeByNode(null,toBeDeletedNode));
    }

}
