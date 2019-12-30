package com.godtrue.play.algorithms.BinarySearch;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-10
 */
public class BinarySearchV2_v2 {

    private static final int MAX_LOOP = 15;

    public static final boolean binarySearch(int [] arr,int left,int right,int target){
        /**
         * 使用双向指针的方式实现二分查找，不用递归调用，思路和递归调用异曲同工
         *
         * 注意：必须 <=
         */
        while (left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                return true;
            }
            /**
             * 关键点，需要根据升降序来控制指针的变化
             */
            if(arr[mid]>target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /**
         * 单调降序测试用例
         */
        //int [] arr = {9,8,7,6,5,4,3,2,1};

        /**
         * 单调降序且存在重复元素
         */
        int [] arr = {9,8,6,6,6,4,3,2,1};
        for(int i = -3; i< BinarySearchV2_v2.MAX_LOOP; i++){
            boolean isExistInArr = binarySearch(arr,0,arr.length-1,i);
            System.out.println("i = "+ i+ ", isExistInArr = " + isExistInArr);
        }
    }
}

/*

i = -3, isExistInArr = false
i = -2, isExistInArr = false
i = -1, isExistInArr = false
i = 0, isExistInArr = false

i = 1, isExistInArr = true
i = 2, isExistInArr = true
i = 3, isExistInArr = true
i = 4, isExistInArr = true

i = 5, isExistInArr = false

i = 6, isExistInArr = true

i = 7, isExistInArr = false

i = 8, isExistInArr = true
i = 9, isExistInArr = true

i = 10, isExistInArr = false
i = 11, isExistInArr = false
i = 12, isExistInArr = false
i = 13, isExistInArr = false
i = 14, isExistInArr = false

 */

/*

int [] arr = {9,8,7,6,5,4,3,2,1};

i = -3, isExistInArr = false
i = -2, isExistInArr = false
i = -1, isExistInArr = false
i = 0, isExistInArr = false

i = 1, isExistInArr = true
i = 2, isExistInArr = true
i = 3, isExistInArr = true
i = 4, isExistInArr = true
i = 5, isExistInArr = true
i = 6, isExistInArr = true
i = 7, isExistInArr = true
i = 8, isExistInArr = true
i = 9, isExistInArr = true

i = 10, isExistInArr = false
i = 11, isExistInArr = false
i = 12, isExistInArr = false
i = 13, isExistInArr = false
i = 14, isExistInArr = false

 */