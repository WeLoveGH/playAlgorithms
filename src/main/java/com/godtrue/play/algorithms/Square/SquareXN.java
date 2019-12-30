package com.godtrue.play.algorithms.Square;

/**
 * @description：求 x 的 n 次方
 * @author：qianyingjie1
 * @create：2019-12-13
 */
public class SquareXN {

    private static final int MAX_LOOP = 32;

    public static final double square(double x ,int n){

        if(n<0){
            throw new IllegalArgumentException("传入的数字非法！！！");
        }

        if(n==0){
            return 1.0;
        }

        double temp = square(x,n/2);

        return temp%2!=0 ? x*temp*temp : temp*temp;
    }

    public static void main(String[] args) {
        for (int i = 0; i < SquareXN.MAX_LOOP; i++) {
            System.out.println("i = " + i + " , square = " + square(2,i));
        }
    }
}
