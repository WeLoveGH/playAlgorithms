package com.godtrue.play.algorithms.LinkedList.ReverseLinkedList.Copy;

/**
 * @description：
 *
 *             单链表的操作其实很简单，不过思想记住了，代码还是写不出来，怎么破？
 *             1：回想自己是否每一个细节都能想象的到，没有了，逻辑思维上的盲点
 *             2：多练习，每天敲一次，我不信还敲出来
 *
 *             下面就是我的简单练习
 *             1：链表的创建
 *             2：链表的打印
 *             3：链表的反转
 *
 *             多练习自然有信心，毕竟能解决一类问题的方法还是非常值得研究的
 * @author：qianyingjie1
 * @create：2019-12-24
 */
public class ReverseLinkedList {
    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private static final Node reverseLinkedList(Node headNode){
        if(headNode == null){
            return null;
        }

        Node preNode = null;
        Node curNode = headNode;

        int index=1;
        while (curNode != null){
            /**
             * 拿到链表的后半部分（正序）
             */
            Node next = curNode.next;

            /**
             * 拼接链表的前半部分（逆序）
             * 1：当前节点的下一个节点是逆序后的前半部分
             * 2：保持变量含义的不变性，perNode：指向逆序后的链表，curNode：指向当前链表的节点
             */
            curNode.next = preNode;
            preNode = curNode;
            curNode = next;

            System.out.println("\n\n\n第 " + index + " 次进行链表反转前后，单链表的变化如下所示：");
            System.out.print("curNode - > ");
            printLinkedList(curNode);
            System.out.print("preNode -> ");
            printLinkedList(preNode);

            index++;
        }

        return preNode;
    }

    private static final Node createLinkedList(int [] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        Node headNode= new Node(arr[0]);
        Node curNode = headNode;
        for (int i = 1; i < arr.length; i++) {
            curNode.next = new Node(arr[i]);
            curNode = curNode.next;
        }

        return headNode;
    }

    private static final void printLinkedList(Node headNode){
        if(headNode == null){
            System.out.println("null");
            return;
        }
        Node curNode = headNode;
        while (curNode != null){
            System.out.print(curNode.value +" -> ");
            curNode = curNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};

        Node headNode = createLinkedList(a);

        printLinkedList(headNode);

        reverseLinkedList(headNode);
    }

}
