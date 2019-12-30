package com.godtrue.play.algorithms.Order.SelectOrder;

/**
 * @description：
 *
 *               选择排序法，降序
 *
 * @author：qianyingjie1
 * @create：2019-12-11
 */
public class SelectOrderDesc {
    public static final int[] order(int [] nums){
        if(nums==null || nums.length==0){
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < nums.length; i++) {

            /**
             * 设置最小值的默认为下标
             */
            int min = nums.length-1;

            /**
             * 定位最小值的下标
             */
            for (int j = i; j < nums.length; j++) {
                if(nums[min] > nums[j]){
                    min = j;
                }
            }

            /**
             * 暂存最小值
             */
            int temp = nums[min];

            /**
             * 将最小值之前的所有元素都往后（右）移动一个位置
             */
            for (int j = min; j > 0; j--) {
                nums[j] = nums[j-1];
            }

            /**
             * 将最小值，放入第一个位置
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
