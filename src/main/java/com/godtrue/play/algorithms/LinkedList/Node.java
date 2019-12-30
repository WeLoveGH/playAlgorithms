package com.godtrue.play.algorithms.LinkedList;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-18
 */
public class Node {

    /**
     * 节点值
     */
    int value;

    /**
     * 下一个节点
     */
    Node next;

    /**
     * 打印单链表的信息
     * @param head
     */
    public static final void printLinkedList(Node head){
        /**
         * 为了更加的清晰的理解思路，我们定义一个临时节点，指向当前的节点
         *
         * 1：如果当前节点不为空，则证明还有节点，继续打印
         * 2：打印当前节点的值
         * 3：调整当前节点的指向，当前节点指向当前节点的下一个节点，保持当前节点这个变量含义的不变性，使其一直指向当前节点
         *
         */
        Node curNode = head;
        while(curNode!=null){
            System.out.print(curNode.getValue());
            curNode = curNode.getNext();
            if(curNode!=null){
                System.out.print(" -> ");
            }
        }
        System.out.println(" -> null\n");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Node{");
        sb.append("value=").append(value);
        sb.append(", next=").append(next);
        sb.append('}');
        return sb.toString();
    }
}
