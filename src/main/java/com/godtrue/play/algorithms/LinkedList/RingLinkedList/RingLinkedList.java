package com.godtrue.play.algorithms.LinkedList.RingLinkedList;

import com.godtrue.play.algorithms.LinkedList.CreateLinkedList.CreateLinkedList_v3;
import com.godtrue.play.algorithms.LinkedList.Node;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-19
 */
public class RingLinkedList {
    /**
     * 构建一个简单有环链表
     * headNode->1->2->1
     * @return
     */
    private static final Node creatRingList(){
        Node headNode = new Node(1);
        headNode.setNext(new Node(2));
        headNode.getNext().setNext(headNode);
        return headNode;
    }

    private static final Node createRingLinkedList(int [] arr){

        /**
         * 数组为空，构建不了单向链表，直接返回 null
         */
        if(arr==null || arr.length==0){
            return null;
        }

        /**
         * 将数组元素转换为链表
         * 1：创建头结点
         * 2：创建临时节点，第一次指向头结点，循环的过程中保持此变量的含义不变
         * 3：为当前节点添加下一个节点
         * 4：将当前的节点位置后移一位
         */
        Node headNode = new Node(arr[0]);
        Node curNode = headNode;
        int index = 1;
        while(index < arr.length){
            curNode.setNext(new Node(arr[index++]));
            curNode = curNode.getNext();
        }

        /**
         * 构建环，链表尾部指向链表头部
         *
         * 通过分析发现，单链表的环，只能在最后一个节点上做文章，因为它的每个节点只能有一个指向下一个节点的指针
         * 最后一个节点的下一个节点，只要指向单链表中的任意节点就能构成链表环
         * 1：指向头结点
         * 2：指向除头尾的任意节点
         * 3：指向自身
         *
         * 三种指向都能构成环，仅仅是环的大小不一样，指向的元素越靠前环越大，否则环越小
         *
         */
        curNode.setNext(headNode);

        return headNode;
    }

    /**
     * 判断单链表是否有环
     * @param headNode
     * @return
     */
    private static final boolean isRingLinkedList(Node headNode){

        /**
         * 空单链表，一定是没啥环的啦，直接返回
         */
        if(headNode == null){
            return false;
        }

        /**
         * 通过快慢指针，来判断单链表是否存在环
         * 1：慢指针每次走一步
         * 2：快指针每次走两步
         * 3：遍历单链表，如果有环，则慢指针一定可以赶上快指针，否则快指针会先走到单链表的尾部
         * 4：如果快指针走到了链表尾部，表示链表无环
         */
        Node curNode = headNode;
        Node slowPoint = curNode;
        Node quickPoint = slowPoint.getNext();
        while(quickPoint != null){
            if(slowPoint.equals(quickPoint)){
                return true;
            }
            slowPoint = slowPoint.getNext();
            quickPoint = slowPoint.getNext().getNext();
        }

        return false;
    }

    public static void main(String[] args) {

        int [] a = {1,2,3,4,5,6,7,8,9};
        Node aHeadNode = CreateLinkedList_v3.createLinkedList(a);
        Node.printLinkedList(aHeadNode);
        System.out.println("the linked list has ring : " + isRingLinkedList(aHeadNode));

        Node bHeadNode = createRingLinkedList(a);
        /**
         * 太耗CPU了，不要轻易完，电脑真会卡死，之前说电脑卡不理解，你试试就能理解了
         */
        //Node.printLinkedList(bHeadNode);
        System.out.println("the linked list has ring : " + isRingLinkedList(bHeadNode));

        /**
         * 对于有环单链表是打印不完的，会非常耗CPU，不要轻易这么玩
         *
         * 如果已知单链表的大概长度，比如：有十万个节点，通过遍历耗时也能判断他是否有环，不过这不是一种好的方式，应用有限
         *
         */
        //Node.printLinkedList(creatRingList());

        System.out.println("the linked list has ring : " + isRingLinkedList(creatRingList()));
    }
}
