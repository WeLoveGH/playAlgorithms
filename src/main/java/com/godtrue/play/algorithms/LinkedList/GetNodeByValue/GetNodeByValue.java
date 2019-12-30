package com.godtrue.play.algorithms.LinkedList.GetNodeByValue;

import com.godtrue.play.algorithms.LinkedList.CreateLinkedList.CreateLinkedList_v3;
import com.godtrue.play.algorithms.LinkedList.Node;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-23
 */
public class GetNodeByValue {

    private static final int MAX_LOOP = 15;

    private static final Node getNodeByValue(Node headNode,int value){
        if(headNode == null){
            return null;
        }

        Node curNode = headNode;
        while (curNode != null){
            if(value == curNode.getValue()){
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
        for (int i = -3; i < GetNodeByValue.MAX_LOOP; i++) {
            Node node = getNodeByValue(headNode,i);
            System.out.println("get node by " + i + " is "+(node==null?null:node.getValue()));
        }
    }
}
