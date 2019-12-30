package com.godtrue.play.algorithms.sum;

/**
 * @description：
 *
 *              给定一个有序数组，以及一个sum值，从数组中找出两个数，使他们的和等于sum
 *
 * @author：qianyingjie1
 * @create：2019-12-14
 */
public class OrderSum {

    public static final int MAX_LOOP = 15;

    public static final boolean orderSum(int [] arr,int sum){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==sum){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < OrderSum.MAX_LOOP; i++) {
            System.out.println("i = "+ i +" 是否为数组中两数之和 "+orderSum(arr,i));
        }

    }
}
