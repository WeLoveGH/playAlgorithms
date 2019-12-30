package com.godtrue.play.algorithms.LinkedList.GetNodeByNode;

import com.godtrue.play.algorithms.LinkedList.CreateLinkedList.CreateLinkedList_v3;
import com.godtrue.play.algorithms.LinkedList.Node;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-23
 */
public class GetNodeByNode {

    private static final int MAX_LOOP = 15;

    private static final Node getNodeByNode(Node headNode,Node node){

        if(headNode == null){
            return null;
        }

        if(node == null){
            return null;
        }

        Node curNode = headNode;
        while (curNode != null){
            if(curNode.equals(node)){
                return curNode;
            }
            curNode = curNode.getNext();
        }
        return null;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        Node headNode = CreateLinkedList_v3.createLinkedList(a);
        Node.printLinkedList(headNode);



        Node node = getNodeByNode(headNode,headNode);
        System.out.println("get node by " + headNode + " is "+(node==null?null:node.getValue()));



        node = getNodeByNode(headNode,headNode.getNext());
        System.out.println("get node by " + headNode.getNext() + " is "+(node==null?null:node.getValue()));



        node = getNodeByNode(headNode,headNode.getNext());
        System.out.println("get node by " + headNode.getNext() + " is "+(node==null?null:node.getValue()));



        node = getNodeByNode(headNode,null);
        System.out.println("get node by " + null + " is "+(node==null?null:node.getValue()));



        node = getNodeByNode(null,headNode.getNext());
        System.out.println("get node by " + headNode.getNext() + " is "+(node==null?null:node.getValue()));



        node = getNodeByNode(headNode,headNode.getNext().getNext());
        System.out.println("get node by " + headNode.getNext().getNext() + " is "+(node==null?null:node.getValue()));
    }
}
