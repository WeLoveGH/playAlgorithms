package com.godtrue.play.algorithms.BinarySearch;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-10
 */
public class BinarySearch {

    private static final int MAX_LOOP = 15;

    public static final boolean binarySearch(int [] arr,int left,int right,int target){
        /**
         * 如果左侧索引位置，大于 右侧索引位置，则表示二分查找结束了
         */
        if(left>right){
            return false;
        }

        /**
         * 计算中间索引的位置
         */
        int mid = (left+right)/2;

        /**
         * 如果中间索引位置的数据就是我们要找的，则此次查找结束，否则继续，根据升序或降序，进行递归调用查找
         */
        if(arr[mid]==target){
            return true;
        }

        /**
         * 这里控制着，寻找的方向，需要根据排序的方式来定
         * 升序：中间节点大于目标节点，则往小的地方找，往左侧继续查找，否则往大的地方查找，也就是往右侧查找
         */
        if(arr[mid]>target){
            return binarySearch(arr,left,mid-1,target);
        }else{
            return binarySearch(arr,mid+1,right,target);
        }
    }

    public static void main(String[] args) {
        /**
         * 单调升序测试用例
         */
        //int [] arr = {1,2,3,4,5,6,7,8,9};

        /**
         * 单调升序且存在重复元素
         */
        int [] arr = {1,2,3,5,5,5,7,8,9};

        for(int i=-3;i<BinarySearch.MAX_LOOP;i++){
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

i = 4, isExistInArr = false

i = 5, isExistInArr = true

i = 6, isExistInArr = false

i = 7, isExistInArr = true
i = 8, isExistInArr = true
i = 9, isExistInArr = true

i = 10, isExistInArr = false
i = 11, isExistInArr = false
i = 12, isExistInArr = false
i = 13, isExistInArr = false
i = 14, isExistInArr = false

 */

/*

int [] arr = {1,2,3,4,5,6,7,8,9};

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