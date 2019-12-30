package com.godtrue.play.algorithms.LinkedList.DeleteNodeByNode;

import com.godtrue.play.algorithms.LinkedList.CreateLinkedList.CreateLinkedList_v3;
import com.godtrue.play.algorithms.LinkedList.Node;

/**
 * @description：
 *
 *             只给出了待删除的节点，让删除对应的节点，不包括尾节点
 *
 * @author：qianyingjie1
 * @create：2019-12-23
 */
public class DeleteNodeByNode_v4 {

    private static final void deleteNodeByNode(Node toBeDeletedNode){

        /**
         * 待删除的节点为null，或者是尾节点，不用删除，直接返回链表
         */
        if(toBeDeletedNode == null || toBeDeletedNode.getNext() == null){
            return ;
        }

        /**
         * 注意：这种方式删除不了单链表的尾节点
         * 删除当前节点的思路是：
         * 1：修改当前节点的值，把当前节点的下一个节点的值赋给当前节点
         * 2：修改当前节点的指针，把当前节点的下一个节点修改为当前节点的下下一个节点
         */
        Node curNode = toBeDeletedNode;
        Node postNode = curNode.getNext();

        curNode.setValue(postNode.getValue());
        curNode.setNext(postNode.getNext());
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        Node aHeadNode = CreateLinkedList_v3.createLinkedList(a);
        Node.printLinkedList(aHeadNode);
        System.out.println("待删除的节点：" + aHeadNode + " 节点值为： "+ aHeadNode.getValue());
        deleteNodeByNode(aHeadNode);
        Node.printLinkedList(aHeadNode);



        int [] b = {6,6,6,6,6,6,6};
        Node bHeadNode = CreateLinkedList_v3.createLinkedList(b);
        Node.printLinkedList(bHeadNode);
        System.out.println("待删除的节点：" + bHeadNode + " 节点值为： "+ bHeadNode.getValue());
        deleteNodeByNode(bHeadNode);
        Node.printLinkedList(bHeadNode);


        int [] c = {1,2,3,4,5,6,7,7,7,8,9};
        Node cHeadNode = CreateLinkedList_v3.createLinkedList(c);
        Node.printLinkedList(cHeadNode);
        Node toBeDeletedNode = cHeadNode.getNext().getNext().getNext().getNext().getNext().getNext();
        System.out.println("待删除的节点：" + toBeDeletedNode + " 节点值为： "+ toBeDeletedNode.getValue());
        deleteNodeByNode(toBeDeletedNode);
        Node.printLinkedList(cHeadNode);



        Node.printLinkedList(cHeadNode);
        System.out.println("待删除的节点：" + toBeDeletedNode + " 节点值为： "+ toBeDeletedNode.getValue());
        deleteNodeByNode(toBeDeletedNode);
        Node.printLinkedList(cHeadNode);


        Node.printLinkedList(cHeadNode);
        System.out.println("待删除的节点：" + toBeDeletedNode + " 节点值为： "+ toBeDeletedNode.getValue());
        deleteNodeByNode(toBeDeletedNode);
        Node.printLinkedList(cHeadNode);



        Node.printLinkedList(cHeadNode);
        System.out.println("待删除的节点：" + toBeDeletedNode + " 节点值为： "+ toBeDeletedNode.getValue());
        deleteNodeByNode(toBeDeletedNode);
        Node.printLinkedList(cHeadNode);



        Node.printLinkedList(cHeadNode);
        System.out.println("待删除的节点：" + toBeDeletedNode + " 节点值为： "+ toBeDeletedNode.getValue());
        deleteNodeByNode(toBeDeletedNode);
        Node.printLinkedList(cHeadNode);


        Node.printLinkedList(cHeadNode);
        System.out.println("删除节点值 = " + null + " 的节点");
        deleteNodeByNode(null);
        Node.printLinkedList(cHeadNode);
    }

}
