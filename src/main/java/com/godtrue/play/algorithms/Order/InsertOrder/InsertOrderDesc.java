package com.godtrue.play.algorithms.Order.InsertOrder;

/**
 * @description：
 *
 *               插入排序法，降序
 *
 * @author：qianyingjie1
 * @create：2019-12-11
 */
public class InsertOrderDesc {
    public static final int[] order(int [] nums){
        if(nums==null || nums.length==0){
            throw new IllegalArgumentException();
        }

        Integer [] ordered = new Integer [nums.length];

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j <= i; j++) {

                /**
                 * 到达已排序数组的尾部，直接插入
                 */
                if(ordered[j]==null){
                    ordered[j] = nums[i];
                    break;
                }

                /**
                 * 定位到第一个比待插入数据还大的元素，则将此元素插入
                 */
                if(nums[i]>ordered[j]){
                    /**
                     * 将待插入位置后的所有元素后移一个位置
                     */
                    for (int k = i; k > j; k--) {
                        ordered[k] = ordered[k-1];
                    }
                    /**
                     * 插入对应的元素
                     */
                    ordered[j] = nums[i];
                    break;
                }
            }

        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = ordered[i].intValue();
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
