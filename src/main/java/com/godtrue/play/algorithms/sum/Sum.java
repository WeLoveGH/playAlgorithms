package com.godtrue.play.algorithms.sum;

/**
 * @description： 求和
 *                num = 0 sum = 0
 *                num = 1 sum = 0 + 1
 *                num = 2 sum = 0 + 1 + 2
 *                num = 3 sum = 0 + 1 + 2 + 3
 *                一次类推
 *
 * @author：qianyingjie1
 * @create：2019-12-13
 */
public class Sum {

    private static final int MAX_LOOP = 100;

    public static final int sum(int num){
        if(num<0){
            throw new IllegalArgumentException("传入的数字非法！！！");
        }

        if(num==0){
            return 0;
        }
        return num + sum(num-1);
    }

    public static void main(String[] args) {
        for (int i = 0; i < Sum.MAX_LOOP; i++) {
            System.out.println("i = " + i + " , sum = " + sum(i));
        }
    }
}
