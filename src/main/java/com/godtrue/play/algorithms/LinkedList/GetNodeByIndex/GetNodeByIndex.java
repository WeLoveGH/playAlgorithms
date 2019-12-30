package com.godtrue.play.algorithms.LinkedList.GetNodeByIndex;

import com.godtrue.play.algorithms.LinkedList.CreateLinkedList.CreateLinkedList_v3;
import com.godtrue.play.algorithms.LinkedList.Node;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-23
 */
public class GetNodeByIndex {

    private static final int MAX_LOOP = 15;

    private static final Node getNodeByIndex(Node headNdoe,int index){
        if(headNdoe == null || index<1){
            return null;
        }

        Node curNode = headNdoe;
        int count=1;
        while (curNode != null){
            if(index == count){
                return curNode;
            }
            curNode = curNode.getNext();
            count++;
        }
        return null;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        Node headNode = CreateLinkedList_v3.createLinkedList(a);
        Node.printLinkedList(headNode);
        for (int i = -3; i < GetNodeByIndex.MAX_LOOP; i++) {
            Node node = getNodeByIndex(headNode,i);
            System.out.println("get node by " + i + " is "+(node==null?null:node.getValue()));
        }
    }
}
