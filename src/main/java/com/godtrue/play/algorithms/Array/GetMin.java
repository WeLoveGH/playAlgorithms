package com.godtrue.play.algorithms.Array;

/**
 * @description：获取数组的最小值
 * @author：qianyingjie1
 * @create：2019-12-11
 */
public class GetMin {
    public static final int getMin(int arr[]){
        if(arr==null || arr.length==0){
            throw new IllegalArgumentException("传入的数组非法！！！");
        }

        int min = arr[0];
        int i = 0;

        while (i<arr.length){
            min = min>arr[i] ? arr[i] : min;
            i++;
        }

        return min;
    }

    public static void main(String[] args) {
        int [] arr = {1000,2,9,11,222,456,89,10};
        System.out.println(getMin(arr));
    }
}
