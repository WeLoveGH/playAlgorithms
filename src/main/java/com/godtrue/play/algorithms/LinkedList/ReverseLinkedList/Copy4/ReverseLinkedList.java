package com.godtrue.play.algorithms.LinkedList.ReverseLinkedList.Copy4;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-25
 */
public class ReverseLinkedList {
    static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private static final Node reverseLinkedList(Node headNode){
        if(headNode == null) {
            return null;
        }

        Node preNode = null;
        Node curNode = headNode;

        while (curNode != null){
            Node next = curNode.next;

            curNode.next = preNode;

            preNode = curNode;
            curNode = next;
        }
        return preNode;
    }

    private static final Node createLinkedList(int [] arr){
        if(arr == null || arr.length == 0){
            return null;
        }

        Node headNode = new Node(arr[0]);
        Node curNode = headNode;

        for (int i = 1; i < arr.length; i++){
            curNode.next = new Node(arr[i]);
            curNode = curNode.next;
        }

        return headNode;
    }

    private static final void printLinkedList(Node headNode){
        Node curNode = headNode;
        while (curNode != null){
            System.out.print(curNode.value + " -> ");
            curNode = curNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        Node headNode = createLinkedList(a);
        printLinkedList(headNode);
        printLinkedList(reverseLinkedList(headNode));
    }
}
