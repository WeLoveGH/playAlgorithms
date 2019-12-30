package com.godtrue.play.algorithms.FeelSpeed;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-07
 */
public class FeelSpeedOnRightMove {

    private static final long MAX_LOOP = 32;

    public static void main(String[] args) {
        byMultiply2();
        byRightMove();
    }

    public static void byMultiply2(){
        long startTime = System.currentTimeMillis();

        int count = 2;

        for(int i=1;i<MAX_LOOP;i++){
            count = count * 2;
            System.out.println(i + " : " + count);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("exe byMultiply2 count is :"+ count +" , cost time is :" + (endTime-startTime));
    }

    public static void byRightMove(){
        long startTime = System.currentTimeMillis();

        int count = 2;

        for(int i=1;i<MAX_LOOP;i++){
            count = count<<1;
            System.out.println(i + " " + count);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("exe byRightMove count is :"+ count +" , cost time is :" + (endTime-startTime));
    }
}


/*

通过日志分析，我们可以看到：
1：2的31次方会导致内存溢出，由正到负
2：2的31次方会导致数据完全溢出，再乘就是0
3：左移一位，确实比使用乘2的方式速度更快

1 : 4
2 : 8
3 : 16
4 : 32
5 : 64
6 : 128
7 : 256
8 : 512
9 : 1024
10 : 2048
11 : 4096
12 : 8192
13 : 16384
14 : 32768
15 : 65536
16 : 131072
17 : 262144
18 : 524288
19 : 1048576
20 : 2097152
21 : 4194304
22 : 8388608
23 : 16777216
24 : 33554432
25 : 67108864
26 : 134217728
27 : 268435456
28 : 536870912
29 : 1073741824
30 : -2147483648
31 : 0
exe byMultiply2 count is :0 , cost time is :2


1 4
2 8
3 16
4 32
5 64
6 128
7 256
8 512
9 1024
10 2048
11 4096
12 8192
13 16384
14 32768
15 65536
16 131072
17 262144
18 524288
19 1048576
20 2097152
21 4194304
22 8388608
23 16777216
24 33554432
25 67108864
26 134217728
27 268435456
28 536870912
29 1073741824
30 -2147483648
31 0
exe byRightMove count is :0 , cost time is :1

 */