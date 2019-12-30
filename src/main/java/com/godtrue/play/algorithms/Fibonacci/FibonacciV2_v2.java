package com.godtrue.play.algorithms.Fibonacci;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-09
 */
public class FibonacciV2_v2 {

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
     *
     * 运行斐波那契数列的递归实现算法，发现两个问题：
     *
     * @see Fibonacci
     *
     * 1：速度太慢，运行的过程中都能感受到运行速度非常的慢
     * 2：n=47 时数字就出现了溢出现象，正变负
     * 3：后面的运行速度越来越慢，等到 n=50 的时候几乎可以认为已经卡死
     *
     * 4：通过 for 循环的方式，可以极大的提高速度，
     *    当然，写法上会多使用三个临时变量，多占用一些空间资源，不过通过多花一点点空间就能极大的提高运行的速度是非常值得的
     *
     */

    public static final int fibonacci(int n){

        if(n<=0){
            throw new IllegalArgumentException("传入斐波那契数列函数的参数非法！！！");
        }

        /**
         * 循环的写法，理解上稍微绕一些，不过代码更加的精简了
         */

        int f1=1;
        int f2=1;
        int temp;

        for(int i=3;i<=n;i++){
            temp=f1;
            f1=f2;
            f2+=temp;
        }

        return f2;
    }

    public static void main(String[] args) {
        for(int i = 1; i< FibonacciV2_v2.MAX_LOOP; i++){
            System.out.println("i = " + i + ", fibonacci(" + i + ") = " + fibonacci(i));
        }
    }
}

/*

通过日志打印可以看到：
1：这种 for 循环的方式性能还是挺好的，至少瞬间就能出计算出结果
2：当 n>47 时，会发生数据内存溢出的情况，正变负
3：后面出现正负结果的原因是，内存溢出的数和计算的数相加导致的

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

i = 48, fibonacci(48) = 512559680
i = 49, fibonacci(49) = -811192543
i = 50, fibonacci(50) = -298632863
i = 51, fibonacci(51) = -1109825406
i = 52, fibonacci(52) = -1408458269
i = 53, fibonacci(53) = 1776683621
i = 54, fibonacci(54) = 368225352
i = 55, fibonacci(55) = 2144908973
i = 56, fibonacci(56) = -1781832971
i = 57, fibonacci(57) = 363076002
i = 58, fibonacci(58) = -1418756969
i = 59, fibonacci(59) = -1055680967
i = 60, fibonacci(60) = 1820529360
i = 61, fibonacci(61) = 764848393
i = 62, fibonacci(62) = -1709589543
i = 63, fibonacci(63) = -944741150
i = 64, fibonacci(64) = 1640636603
i = 65, fibonacci(65) = 695895453
i = 66, fibonacci(66) = -1958435240
i = 67, fibonacci(67) = -1262539787
i = 68, fibonacci(68) = 1073992269
i = 69, fibonacci(69) = -188547518
i = 70, fibonacci(70) = 885444751
i = 71, fibonacci(71) = 696897233
i = 72, fibonacci(72) = 1582341984
i = 73, fibonacci(73) = -2015728079
i = 74, fibonacci(74) = -433386095
i = 75, fibonacci(75) = 1845853122
i = 76, fibonacci(76) = 1412467027
i = 77, fibonacci(77) = -1036647147
i = 78, fibonacci(78) = 375819880
i = 79, fibonacci(79) = -660827267
i = 80, fibonacci(80) = -285007387
i = 81, fibonacci(81) = -945834654
i = 82, fibonacci(82) = -1230842041
i = 83, fibonacci(83) = 2118290601
i = 84, fibonacci(84) = 887448560
i = 85, fibonacci(85) = -1289228135
i = 86, fibonacci(86) = -401779575
i = 87, fibonacci(87) = -1691007710
i = 88, fibonacci(88) = -2092787285
i = 89, fibonacci(89) = 511172301
i = 90, fibonacci(90) = -1581614984
i = 91, fibonacci(91) = -1070442683
i = 92, fibonacci(92) = 1642909629
i = 93, fibonacci(93) = 572466946
i = 94, fibonacci(94) = -2079590721
i = 95, fibonacci(95) = -1507123775
i = 96, fibonacci(96) = 708252800
i = 97, fibonacci(97) = -798870975
i = 98, fibonacci(98) = -90618175
i = 99, fibonacci(99) = -889489150

 */
