package com.godtrue.play.algorithms.Stack;

import java.util.Stack;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-24
 */
public class ReverseData {
    private static final void printReverseData(int [] arr){
        if(arr == null || arr.length == 0){
            System.out.println("null");
        }

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " -> ");
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " -> ");
        }
        System.out.println("null");

        printReverseData(a);
    }
}
