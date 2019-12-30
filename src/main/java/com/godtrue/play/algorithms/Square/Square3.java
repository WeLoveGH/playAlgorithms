package com.godtrue.play.algorithms.Square;

/**
 * @description：求 3 的 n 次方
 * @author：qianyingjie1
 * @create：2019-12-13
 */
public class Square3 {

    private static final int MAX_LOOP = 32;

    public static final int square(int num){
        if(num<0){
            throw new IllegalArgumentException("传入的数字非法！！！");
        }

        if(num==0){
            return 1;
        }
        return square(num-1) + square(num-1) + square(num-1);
    }

    public static void main(String[] args) {
        for (int i = 0; i < Square3.MAX_LOOP; i++) {
            System.out.println("3 的 " + i + " 次方 = " + square(i));
        }
    }
}

/*

通过日志观察，我们可以看到

1：递归的层次过多会非常的耗时，当求3的19次方的时候，程序就明显的运行不了啦
2：3的20次方就出现了数据溢出现象

3 的 0 次方 = 1
3 的 1 次方 = 3
3 的 2 次方 = 9
3 的 3 次方 = 27
3 的 4 次方 = 81
3 的 5 次方 = 243
3 的 6 次方 = 729
3 的 7 次方 = 2187
3 的 8 次方 = 6561
3 的 9 次方 = 19683
3 的 10 次方 = 59049
3 的 11 次方 = 177147
3 的 12 次方 = 531441
3 的 13 次方 = 1594323
3 的 14 次方 = 4782969
3 的 15 次方 = 14348907
3 的 16 次方 = 43046721
3 的 17 次方 = 129140163
3 的 18 次方 = 387420489
3 的 19 次方 = 1162261467
3 的 20 次方 = -808182895
3 的 21 次方 = 187041861


 */