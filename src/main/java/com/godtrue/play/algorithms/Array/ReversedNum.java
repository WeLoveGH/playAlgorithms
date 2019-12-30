package com.godtrue.play.algorithms.Array;

/**
 * @description：数字反转
 * @author：qianyingjie1
 * @create：2019-12-11
 */
public class ReversedNum {
    public static final int [] reversedNum(int [] arr){
        if(arr==null || arr.length==0){
            throw new IllegalArgumentException("传入的数组非法！！！");
        }

        int [] newArr = new int[arr.length];
        int j=0;

        for(int i=arr.length-1;i>=0;i--){
            newArr[j++] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};

        int [] newArr = reversedNum(arr);

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
            if(i!=newArr.length-1){
                System.out.print(" , ");
            }
        }
    }
}
