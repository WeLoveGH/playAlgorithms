package com.godtrue.play.algorithms.Array;

/**
 * @description：获取最大值，不能遍历，数组有序，可能的情况有三种
 *               单调递增：1,2,3,4,5,6,7,8,9
 *               单调递减：9,8,7,6,5,4,3,2,1
 *               先减后增：1,2,9,8,7,6,5,4,3
 *                        1,2,3,4,5,6,9,8,7
 *
 * @author：qianyingjie1
 * @create：2019-12-11
 */
public class GetMaxByBinarySearch {
    public static final int getMin(int [] arr){

        if(arr==null || arr.length==0){
            throw new IllegalArgumentException("传入的数组非法！！！");
        }

        /**
         * 对应的最大值在索引 [left,right] 中寻找
         */
        int left = 0;
        int right = arr.length-1;

        /**
         * 注意： <= 或 < 都行
         */
        while (left <= right){
            int mid = left + (right-left)/2;

            /**
             * 最大值在中间的位置
             */
            if(mid>0 && mid<arr.length-1 && arr[mid-1]<=arr[mid] && arr[mid]>=arr[mid+1]){
                return arr[mid];
            }

            /**
             * 控制查找的方向，注意：防止数组索引越界
             */
            if(mid<arr.length-1 && arr[mid]<arr[mid+1]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

        /**
         * 如果最大值不在中间，则是在头部或尾部，所以，比较交一下，哪个大返回哪个
         */

        return arr[0]>arr[arr.length-1] ? arr[0] : arr[arr.length-1];
    }

    public static void main(String[] args) {

        int [] a = {1,2,3,4,5,6,7,8,9};
        int [] b = {9,8,7,6,5,4,3,2,1};
        int [] c = {1,2,9,8,7,6,5,4,3};
        int [] d = {1,2,3,4,5,6,9,8,7};

        System.out.println(getMin(a));
        System.out.println(getMin(b));
        System.out.println(getMin(c));
        System.out.println(getMin(d));
    }
}

/*

int [] a = {1,2,3,4,5,6,7,8,9};
int [] b = {9,8,7,6,5,4,3,2,1};
int [] c = {1,2,9,8,7,6,5,4,3};
int [] d = {1,2,3,4,5,6,9,8,7};

9
9
9
9

 */