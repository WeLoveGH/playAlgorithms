package com.godtrue.play.algorithms.Array;

/**
 * @description：将数组中的0移到数组的尾部，且不改变原有数组的次序
 * @author：qianyingjie1
 * @create：2019-12-11
 */
public class MoveZero {
    public static final int[] moveZero(int [] arr){
        if(arr==null || arr.length==0){
            throw new IllegalArgumentException("传入的数组非法！！！");
        }

        int [] newArr = new int [arr.length];

        int j = 0;

        /**
         * 一层循环，非0放入新数组，保持位置不变，其他的数字默认为0，则ok
         */
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int [] arr = {0,1,0,2,0,3,0,4,5,6,7,0,8,9};
        int [] newArr = moveZero(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
            if(i!=newArr.length-1){
                System.out.print(" , ");
            }
        }
    }
}
