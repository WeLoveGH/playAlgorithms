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
public class DeleteNodeByNode_v5 {

    private static final Node deleteNodeByNode(Node headNode,Node toBeDeletedNode){

        /**
         * 单链表为空，则直接返回null
         */
        if(headNode == null){
            return null;
        }

        /**
         * 待删除的节点为null，则直接返回单链表的头结点
         */
        if(toBeDeletedNode == null){
            return headNode;
        }


        Node curNode = toBeDeletedNode;
        Node postNode = curNode.getNext();

        /**
         * 如果是非尾节点，则删除当前节点的思路如下：
         * 1：修改当前节点的值，把当前节点的下一个节点的值赋给当前节点
         * 2：修改当前节点的指针，把当前节点的下一个节点修改为当前节点的下下一个节点
         */
        if(postNode != null){
            curNode.setValue(postNode.getValue());
            curNode.setNext(postNode.getNext());
        }else{
            Node preNode = headNode;
            curNode = preNode.getNext();
            /**
             * 此单链表就一个节点
             */
            if(curNode == null){
                /**
                 * 且是待删除的节点，则返回null
                 */
                if(preNode.equals(toBeDeletedNode)) {
                    return null;
                }else{
                    /**
                     * 不是待删除的节点，则直接返回链表的头结点
                     */
                    return preNode;
                }
            }

            /**
             * 此单链表含有大于1个元素，且待删除的节点在链表的尾部
             *
             * 注意：删除单链表尾部节点，需要至少三个节点的信息
             * 指向null的节点，判断出到了链表的尾部
             * 当前节点，指向待删除的节点
             * 当前节点的前置节点，用于删除当前节点
             */
            postNode = curNode.getNext();

            while(postNode != null){
                preNode = curNode;
                curNode = postNode;
                postNode = postNode.getNext();
            }

            if(curNode.equals(toBeDeletedNode)){
                preNode.setNext(null);
            }
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
        System.out.println("待删除的节点：" + toBeDeletedNode + " 节点值为： "+ toBeDeletedNode.getValue());
        Node.printLinkedList(deleteNodeByNode(cHeadNode,toBeDeletedNode));


        Node.printLinkedList(cHeadNode);
        System.out.println("待删除的节点：" + toBeDeletedNode + " 节点值为： "+ toBeDeletedNode.getValue());
        Node.printLinkedList(deleteNodeByNode(cHeadNode,toBeDeletedNode));



        Node.printLinkedList(cHeadNode);
        System.out.println("待删除的节点：" + toBeDeletedNode + " 节点值为： "+ toBeDeletedNode.getValue());
        Node.printLinkedList(deleteNodeByNode(cHeadNode,toBeDeletedNode));



        Node.printLinkedList(cHeadNode);
        System.out.println("待删除的节点：" + toBeDeletedNode + " 节点值为： "+ toBeDeletedNode.getValue());
        Node.printLinkedList(deleteNodeByNode(cHeadNode,toBeDeletedNode));


        Node.printLinkedList(cHeadNode);
        System.out.println("删除节点值 = " + null + " 的节点");
        Node.printLinkedList(deleteNodeByNode(cHeadNode,null));


        Node.printLinkedList(cHeadNode);
        toBeDeletedNode = new Node(666);
        System.out.println("待删除的节点：" + toBeDeletedNode + " 节点值为： "+ toBeDeletedNode.getValue());
        Node.printLinkedList(deleteNodeByNode(cHeadNode,toBeDeletedNode));


        Node.printLinkedList(null);
        System.out.println("删除节点值 = " + null + " 的节点");
        Node.printLinkedList(deleteNodeByNode(null,null));


        int [] d = {1};
        Node dHeadNode = CreateLinkedList_v3.createLinkedList(d);
        Node.printLinkedList(dHeadNode);
        System.out.println("待删除的节点：" + dHeadNode + " 节点值为： "+ dHeadNode.getValue());
        Node.printLinkedList(deleteNodeByNode(dHeadNode,dHeadNode));


        int [] e = {1,2};
        Node eHeadNode = CreateLinkedList_v3.createLinkedList(e);
        Node.printLinkedList(eHeadNode);
        toBeDeletedNode = eHeadNode.getNext();
        System.out.println("待删除的节点：" + toBeDeletedNode + " 节点值为： "+ toBeDeletedNode.getValue());
        Node.printLinkedList(deleteNodeByNode(eHeadNode,toBeDeletedNode));


        int [] f = {1};
        Node fHeadNode = CreateLinkedList_v3.createLinkedList(f);
        Node.printLinkedList(fHeadNode);
        toBeDeletedNode = new Node(1);
        System.out.println("待删除的节点：" + toBeDeletedNode + " 节点值为： "+ toBeDeletedNode.getValue());
        Node.printLinkedList(deleteNodeByNode(fHeadNode,toBeDeletedNode));
    }

}
