package com.godtrue.play.algorithms.Order.ShellOrder;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-21
 */
public class ShellOrderAsc {
    private static final int [] order(int [] arr){
        if (arr==null || arr.length==0){
            return arr;
        }

        /**
         * 数组长度
         */
        int arrLength = arr.length;
        /**
         * 临时变量用于交换数据
         */
        int temp;
        /**
         * 比对数据间的步长，通过步长归为一组
         */
        int step = arrLength/2;

        /**
         * 步长大于0，说明还有数在别的组，要所有数据都归到一组才行
         */
        while (step>0){

            /**
             * 根据步长进行同组数据间的比对，通过间的数据有序化
             */
            for (int i = step; i < arrLength; i++) {
                /**
                 * 同组内的最后一个数据放入临时变量
                 */
                temp = arr[i];
                /**
                 * 同组内的第一个数据的索引位置
                 */
                int preIndex = i - step;
                /**
                 * 前面的索引位置有效，且前面的数据大于后面的数据，则进行交换
                 */
                while (preIndex>=0 && arr[preIndex]>temp){
                    /**
                     * 这里按升序排列，所以，大的数据往后移动
                     */
                    arr[preIndex+step] = arr[preIndex];
                    /**
                     * 前置索引往前移动
                     */
                    preIndex -= step;
                }
                /**
                 *
                 */
                arr[preIndex+step] = temp;
            }

            /**
             * 合并分组，最终使所有数据在同一个组内
             */
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
