package com.godtrue.play.algorithms.FeelSpeed;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-07
 */
public class FeelSpeedOnRightMoveV2 {

    private static final Object o = new Object();

    public static void main(String[] args) throws InterruptedException{
        for(int i=10000;i<10*10*10*10*10*10*10*10000;){
            byMultiply2(i);
            byRightMove(i);
            Thread.sleep(5000);
            System.out.println("\n");
            i*=10;
        }
    }

    public static void byMultiply2(int maxLoop){
        long startTime = System.currentTimeMillis();

        int count = 2;

        int i;

        for(i=1;i<maxLoop;i++){
            count = count * 2;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("exe byMultiply2 loop count is :"+ i +" , cost time is :" + (endTime-startTime));
    }

    public static void byRightMove(int maxLoop){
        long startTime = System.currentTimeMillis();

        int count = 2;

        int i;

        for(i=1;i<maxLoop;i++){
            count = count<<1;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("exe byRightMove loop count is :"+ i +" , cost time is :" + (endTime-startTime));
    }
}

/*

运行多次，每次结果都不一样，不过最终的结论是没差的，移位运算确实比乘法运算快一些
另外的感受就是，代码一定要敲一敲跑一跑才能有更大的感受和收益


exe byMultiply2 loop count is :10000 , cost time is :0
exe byRightMove loop count is :10000 , cost time is :1


exe byMultiply2 loop count is :100000 , cost time is :1
exe byRightMove loop count is :100000 , cost time is :2


exe byMultiply2 loop count is :1000000 , cost time is :2
exe byRightMove loop count is :1000000 , cost time is :0


exe byMultiply2 loop count is :10000000 , cost time is :9
exe byRightMove loop count is :10000000 , cost time is :0


exe byMultiply2 loop count is :100000000 , cost time is :14
exe byRightMove loop count is :100000000 , cost time is :0


exe byMultiply2 loop count is :1000000000 , cost time is :0
exe byRightMove loop count is :1000000000 , cost time is :0

 */