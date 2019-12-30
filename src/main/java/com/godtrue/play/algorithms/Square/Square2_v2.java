package com.godtrue.play.algorithms.Square;

/**
 * @description：求 2 的 n 次方
 * @author：qianyingjie1
 * @create：2019-12-13
 */
public class Square2_v2 {

    private static final int MAX_LOOP = 32;

    public static final int square(int num){
        if(num<0){
            throw new IllegalArgumentException("传入的数字非法！！！");
        }

        if(num==0){
            return 1;
        }

        return 2 << --num;
    }

    public static void main(String[] args) {
        for (int i = 0; i < Square2_v2.MAX_LOOP; i++) {
            System.out.println("2 的 " + i + " 次方 = " + square(i));
        }
    }
}

/*

2 的 0 次方 = 1
2 的 1 次方 = 2
2 的 2 次方 = 4
2 的 3 次方 = 8
2 的 4 次方 = 16
2 的 5 次方 = 32
2 的 6 次方 = 64
2 的 7 次方 = 128
2 的 8 次方 = 256
2 的 9 次方 = 512
2 的 10 次方 = 1024
2 的 11 次方 = 2048
2 的 12 次方 = 4096
2 的 13 次方 = 8192
2 的 14 次方 = 16384
2 的 15 次方 = 32768
2 的 16 次方 = 65536
2 的 17 次方 = 131072
2 的 18 次方 = 262144
2 的 19 次方 = 524288
2 的 20 次方 = 1048576
2 的 21 次方 = 2097152
2 的 22 次方 = 4194304
2 的 23 次方 = 8388608
2 的 24 次方 = 16777216
2 的 25 次方 = 33554432
2 的 26 次方 = 67108864
2 的 27 次方 = 134217728
2 的 28 次方 = 268435456
2 的 29 次方 = 536870912
2 的 30 次方 = 1073741824
2 的 31 次方 = -2147483648

 */