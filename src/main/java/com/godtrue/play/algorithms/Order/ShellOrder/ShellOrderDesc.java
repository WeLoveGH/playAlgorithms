package com.godtrue.play.algorithms.Order.ShellOrder;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-21
 */
public class ShellOrderDesc {
    private static final int [] order(int [] arr){

        /**
         * 数组为空，没必要排序了
         */
        if(arr==null || arr.length==0){
            return arr;
        }

        /**
         * 数组长度
         */
        int arrLength = arr.length;
        /**
         * 临时变量，用于数据交换
         */
        int temp;
        /**
         * 元素分组步长，同步长的为一组
         */
        int step = arrLength/2;

        /**
         * 步长大于0，说明还有数组没有全部归为一组
         *
         * 步长越大分的组数越多，步长为0时，说明所有数据都在同一个组内
         *
         */
        while (step>0){
            /**
             * 组内数据排序
             */
            for (int i = step; i < arrLength; i++) {
                /**
                 * 把组内最右边的数据放入临时变量
                 */
                temp = arr[i];

                /**
                 * 获取组内靠左位置的索引
                 */
                int preIndex = i - step;

                /**
                 * 进行组内的数据比对，因为是降序，所以，把小的数据往右移动
                 *
                 * 这里看着比较怪是因为同一组的数据位置不一定相邻的缘故
                 */
                while (preIndex>=0 && arr[preIndex]<temp){
                    arr[preIndex+step] = arr[preIndex];
                    preIndex -= step;
                }

                arr[preIndex+step] = temp;
            }
            step = step/2;
        }

        return arr;
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
