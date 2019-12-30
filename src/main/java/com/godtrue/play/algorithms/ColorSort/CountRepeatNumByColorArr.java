package com.godtrue.play.algorithms.ColorSort;

/**
 * @description：
 *
 *             利用颜色分组法，统计数组中重复数据的个数
 *             注意：这种方法只针对范围比较小的数字有奇效，比如：数组中只含有1/2/3三个数字
 *
 * @author：qianyingjie1
 * @create：2019-12-25
 */
public class CountRepeatNumByColorArr {
    private static final int [] countRepeatNum(int [] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        /**
         * 这里已经事先确定数组中只有1/2/3，三个数字
         * 可以扩展到N多个数字
         */
        int [] colorArr = new int [3];

        /**
         * 利用下标和原数组中值，占坑位，用于记录重复的值
         */
        for (int i = 0; i < arr.length; i++) {
            /**
             * 此处非常的巧妙
             * 利用重复数组中的数字，来占颜色数组中的坑位，然后累加他的个数
             */
            colorArr[arr[i]-1]++;
        }

        return colorArr;
    }

    private static final void printArr(int [] arr){
        int size = arr==null ? 0 : arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] a = {1,2,2,3,3,3};
        printArr(a);
        int [] b = countRepeatNum(a);
        System.out.println("数组中的1/2/3的个数分别是：");
        printArr(b);

        int [] c = {1,1,1,1,1,2,2,2,2,2,2,3,3,3,3,3,3,3};
        printArr(c);
        int [] d = countRepeatNum(c);
        System.out.println("数组中的1/2/3的个数分别是：");
        printArr(d);

        int [] e = {1,2,2,3,3,3,3,3,3,2,2,1,1,2,3,3,2,1};
        printArr(e);
        int [] f = countRepeatNum(e);
        System.out.println("数组中的1/2/3的个数分别是：");
        printArr(f);
    }
}
