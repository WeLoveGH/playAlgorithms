package com.godtrue.play.algorithms.BinarySearch.varietas;

/**
 * @description：双向指针实现
 *               如果目标数字在数组中，则返回其在数组中的下标，否则返回-1
 *
 *               这种写法才是真正没有bug的二分查找算法
 *
 *              变种2：
 *              查找最后一个相等的元素，也就是说等于查找key值的元素有好多个，返回这些元素最右边的元素下标。
 *
 * @author：qianyingjie1
 * @create：2019-12-10
 */
public class BinarySearch_v4 {

    private static final int MAX_LOOP = 15;

    public static final int binarySearch(int []arr,int target){

        if (arr==null || arr.length==0){
            throw new IllegalArgumentException("用于二分查找的数组入参非法！！！");
        }

        /**
         * 编写算法的时候，变量的定义十分的关键，我们需要指明变量的含义，并且在以后的计算过程中需要保持算法的含义不变
         *
         * 下面的定义，表示 target 在数组的下标 [left,right]中寻找，所以，在循环查找的过程中我们要始终保持这种含义
         */
        int left = 0;
        int right =arr.length-1;

        /**
         * 注意：必须是 <=
         */
        while (left <= right){

            /**
             * 计算中间位置索引
             *
             * mid = (left+right)/2 这种方式存在一个隐含的Bug，当left和right足够大时，会发生内存溢出的现象
             * 应该调整为：
             * mint = left+(right-left)/2
             */
            int mid = left+(right-left)/2;

            /**
             * 假设是升序
             *
             * 中间位置大于目标值，则在左半部分继续查找，否则继续在右半部分查找
             *
             * 通过改变左右指针的索引位置来决定
             *
             * 注意： >
             */
            if(arr[mid]>target){
                /**
                 * 保持left和right变量的含义，target在[left,mid-1]中寻找
                 */
                right = mid-1;
            }else{
                /**
                 * 保持left和right变量的含义，target在[mid=1,right]中寻找
                 */
                left = mid+1;
            }

            /**
             * 注意：right>=0
             */
            if(right>=0 && arr[right]==target){
                return right;
            }
        }

        /**
         * 如果最终没定位到，则返回 -1
         */
        return -1;
    }

    public static void main(String[] args) {
        /**
         * 单调升序且存在重复元素
         */
        int [] arr = {1,2,5,5,5,5,5,8,9};

        for(int i = -3; i< BinarySearch_v4.MAX_LOOP; i++){
            int indexOfTargetInArr = binarySearch(arr,i);
            System.out.println("i = "+ i+ ", indexOfTargetInArr = " + indexOfTargetInArr);
        }
    }
}

/*

int [] arr = {1,2,5,5,5,5,5,8,9};

i = -3, indexOfTargetInArr = -1
i = -2, indexOfTargetInArr = -1
i = -1, indexOfTargetInArr = -1
i = 0, indexOfTargetInArr = -1

i = 1, indexOfTargetInArr = 0
i = 2, indexOfTargetInArr = 1

i = 3, indexOfTargetInArr = -1
i = 4, indexOfTargetInArr = -1

i = 5, indexOfTargetInArr = 6

i = 6, indexOfTargetInArr = -1
i = 7, indexOfTargetInArr = -1

i = 8, indexOfTargetInArr = 7
i = 9, indexOfTargetInArr = 8

i = 10, indexOfTargetInArr = -1
i = 11, indexOfTargetInArr = -1
i = 12, indexOfTargetInArr = -1
i = 13, indexOfTargetInArr = -1
i = 14, indexOfTargetInArr = -1

 */