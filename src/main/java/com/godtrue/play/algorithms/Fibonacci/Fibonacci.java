package com.godtrue.play.algorithms.Fibonacci;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-09
 */
public class Fibonacci {

    private static final int MAX_LOOP = 100;

    /**
     *
     * 手撕算法，从最简单有趣的开始
     *
     * 只要逻辑思维清晰，编程就是一件简单的事情，因为编程只是通过计算机语言，将对应的逻辑表达出来而已，难点在于逻辑思维，也就是找寻事物的规律
     *
     * 斐波那契数列的规律，比较容易
     *
     * f(1)=1
     * f(2)=1
     * f(n)=f(n-1)+f(n-2) 当 n >1 时
     *
     * 比如：1,1,2,3,5,8,13。。。
     *
     */

    public static final int fibonacci(int n){

        if(n<=0){
            throw new IllegalArgumentException("传入斐波那契数列函数的参数非法！！！");
        }

        if(n==1 || n==2){
            return 1;
        }

        /**
         * 递归的写法
         */
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        for(int i =1;i<Fibonacci.MAX_LOOP;i++){
            System.out.println("i = " + i + ", fibonacci(" + i + ") = " + fibonacci(i));
        }
    }
}

/*

通过日历观察发现如下几个现象：
1：当 n>37，会出现明显的卡顿现象
2：当 n=47，会出现数据溢出的现象，正变负
3：当 n>37，后面的计算会越来越慢
4：当 n>47，基本等于卡死了

5：此程序非常的简单，不过只要哪里错一下，那么整个程序就全都错误了，编写程序逻辑思维一定要非常清晰，不能有半点差错

i = 1, fibonacci(1) = 1
i = 2, fibonacci(2) = 1
i = 3, fibonacci(3) = 2
i = 4, fibonacci(4) = 3
i = 5, fibonacci(5) = 5
i = 6, fibonacci(6) = 8
i = 7, fibonacci(7) = 13
i = 8, fibonacci(8) = 21
i = 9, fibonacci(9) = 34
i = 10, fibonacci(10) = 55
i = 11, fibonacci(11) = 89
i = 12, fibonacci(12) = 144
i = 13, fibonacci(13) = 233
i = 14, fibonacci(14) = 377
i = 15, fibonacci(15) = 610
i = 16, fibonacci(16) = 987
i = 17, fibonacci(17) = 1597
i = 18, fibonacci(18) = 2584
i = 19, fibonacci(19) = 4181
i = 20, fibonacci(20) = 6765
i = 21, fibonacci(21) = 10946
i = 22, fibonacci(22) = 17711
i = 23, fibonacci(23) = 28657
i = 24, fibonacci(24) = 46368
i = 25, fibonacci(25) = 75025
i = 26, fibonacci(26) = 121393
i = 27, fibonacci(27) = 196418
i = 28, fibonacci(28) = 317811
i = 29, fibonacci(29) = 514229
i = 30, fibonacci(30) = 832040
i = 31, fibonacci(31) = 1346269
i = 32, fibonacci(32) = 2178309
i = 33, fibonacci(33) = 3524578
i = 34, fibonacci(34) = 5702887
i = 35, fibonacci(35) = 9227465
i = 36, fibonacci(36) = 14930352
i = 37, fibonacci(37) = 24157817
i = 38, fibonacci(38) = 39088169
i = 39, fibonacci(39) = 63245986
i = 40, fibonacci(40) = 102334155
i = 41, fibonacci(41) = 165580141
i = 42, fibonacci(42) = 267914296
i = 43, fibonacci(43) = 433494437
i = 44, fibonacci(44) = 701408733
i = 45, fibonacci(45) = 1134903170
i = 46, fibonacci(46) = 1836311903
i = 47, fibonacci(47) = -1323752223
i = 48, fibonacci(48) = 5125596803

 */