package com.godtrue.play.algorithms.Array;

/**
 * @description：数字反转
 * @author：qianyingjie1
 * @create：2019-12-11
 */
public class ReversedNum_v2 {
    public static final int [] reversedNum(int [] arr){
        if(arr==null || arr.length==0){
            throw new IllegalArgumentException("传入的数组非法！！！");
        }

        /**
         * 临时变量
         */
        int temp;

        /**
         * 通过临时变量+收尾交换，来实现数组元素的反转
         */
        for(int i=0;i<arr.length;i++){
            /**
             * 当数组只需要遍历一半元素就行了
             */
            if(i==arr.length/2){
                break;
            }
            /**
             * 元素交换
             */
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {

        //int [] arr = {1,2,3,4,5,6,7,8,9};

        int [] arr = {1,2,3,4,5,6,7,8};

        int [] newArr = reversedNum(arr);

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
            if(i!=newArr.length-1){
                System.out.print(" , ");
            }
        }
    }
}

/*

int [] arr = {1,2,3,4,5,6,7,8};

8 , 7 , 6 , 5 , 4 , 3 , 2 , 1

 */

/*

int [] arr = {1,2,3,4,5,6,7,8,9};

9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1

 */