package com.godtrue.play.algorithms.Order.BubbleOrder;

/**
 * @description：
 *
 *               冒泡排序法，降序
 *
 * @author：qianyingjie1
 * @create：2019-12-15
 */
public class BubbleOrderDesc_v2 {
    public static final int [] order(int [] nums){
        if(nums==null || nums.length==0){
            throw new IllegalArgumentException();
        }

        int temp ;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j > i; j--) {
                /**
                 * 降序，大的往前移动
                 */
                if(nums[j] > nums[j-1]){
                    temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
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
