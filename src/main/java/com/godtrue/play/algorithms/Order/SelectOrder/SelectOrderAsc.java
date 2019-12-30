package com.godtrue.play.algorithms.Order.SelectOrder;

/**
 * @description：
 *
 *               选择排序法，升序
 *
 * @author：qianyingjie1
 * @create：2019-12-11
 */
public class SelectOrderAsc {
    public static final int[] order(int [] nums){
        if(nums==null || nums.length==0){
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < nums.length; i++) {

            /**
             * 设置默认的最大值的下标
             */
            int max = nums.length-1;

            /**
             * 定位最大值的下标
             */
            for (int j = i; j < nums.length; j++) {
                if(nums[max] < nums[j]){
                    max = j;
                }
            }

            /**
             * 暂存一下最大值
             */
            int temp = nums[max];

            /**
             * 将最大值之前的所有元素都往后（右）移动一个位置
             */
            for (int j = max; j > 0; j--) {
                nums[j] = nums[j-1];
            }

            /**
             * 将最大值放入第一个位置
             */
            nums[0] = temp;
        }

        return nums;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9};
        printArray(a);
        printArray(order(a));

        int [] b = {9,8,7,6,5,4,3,2,1};
        printArray(b);
        printArray(order(b));

        int [] c = {1,9,2,8,3,7,4,6,5};
        printArray(c);
        printArray(order(c));
    }

    private static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(" , ");
            }
        }
        System.out.println("\n");
    }
}
