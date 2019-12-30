package com.godtrue.play.algorithms.LinkedList.CreateLinkedList;

import com.godtrue.play.algorithms.LinkedList.Node;

/**
 * @description：创建链表
 * @author：qianyingjie1
 * @create：2019-12-18
 */
public class CreateLinkedList_v3 {

    /**
     * 根据数组，创建单向链表
     * 不要小瞧这段代码，我的脑回路比较直，想了半天都没有想明白
     *
     * 链表相关的操作，最重要的是指针，前序指针、后序指针、临时指针、头指针、尾指针、当前指针，
     * 完全弄明白这些指针的含义，并且保持他们的不变性，就能很好的解决链表相关的问题
     *
     * 其实任何事物都是一样的，数组中的索引、链表中的指针、人体结构中的关节、火车间的挂钩，他们是将事物联系起来的关键
     * 控制好这些关键点，就能控制好整个事物的组合
     *
     * @param arr
     * @return
     */
    public static final Node createLinkedList(int [] arr){
        /**
         * 数组为空，组成不了链表，这里直接抛出一个异常
         */
        if (arr == null || arr.length==0) {
            throw new IllegalArgumentException();
        }

        /**
         * 定义头结点，因为已经加了判断，数组中一定会存在元素，所以，直接取第一个，不会出现数组索引越界的问题
         */
        Node head = new Node(arr[0]);

        /**
         * 这里是关键点呀！
         * 我就是这里没有完全控制好，连创建链表的方法都没实现了
         *
         * 1：定义当前结点，且直向头结点
         * 2：创建新的结点，并且交由当前结点的下一个结点指向
         * 3：改变当前结点的指向，当前结点指向当前结点的下一个结点
         * 4：继续循环遍历，知道数组中的所有元素都加入到链表之中
         *
         */
        Node curNode = head;
        for (int i = 1; i < arr.length; i++) {
            curNode.setNext(new Node(arr[i]));
            curNode = curNode.getNext();
        }

        /**
         * 返回头结点，这个也比较重要，脑回路不够，也可能会能错
         */
        return head;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        Node.printLinkedList(createLinkedList(a));

        int [] b = {9,8,7,6,5,4,3,2,1};
        Node.printLinkedList(createLinkedList(b));
    }
}