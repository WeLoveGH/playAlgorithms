package com.godtrue.play.algorithms.Prime;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-09
 */
public class PrimeV4 {

    private static final int MAX_LOOP = 100;

    public static final boolean isPrime(int num){

        if(num <= 1){
            throw new IllegalArgumentException("传入的参数非法！！！");
        }

        /**
         *
         * 就按照素数的定义来判断，看看在 [2,Math.sqrt(n)] 中是否还有其他可以整除的数，这样能减少一半多一点的数据判断
         *
         * i*i 是平方的变种
         */

        for(int i=2;i*i<=num;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 2; i < PrimeV4.MAX_LOOP; i++) {

            boolean isPrime = isPrime(i);
            if(isPrime){
                System.out.println("i = " + i + " , isPrime(" + i + ") = " + isPrime);
            }
        }
    }
}

/*

i = 2 , isPrime(2) = true
i = 3 , isPrime(3) = true
i = 5 , isPrime(5) = true
i = 7 , isPrime(7) = true
i = 11 , isPrime(11) = true
i = 13 , isPrime(13) = true
i = 17 , isPrime(17) = true
i = 19 , isPrime(19) = true
i = 23 , isPrime(23) = true
i = 29 , isPrime(29) = true
i = 31 , isPrime(31) = true
i = 37 , isPrime(37) = true
i = 41 , isPrime(41) = true
i = 43 , isPrime(43) = true
i = 47 , isPrime(47) = true
i = 53 , isPrime(53) = true
i = 59 , isPrime(59) = true
i = 61 , isPrime(61) = true
i = 67 , isPrime(67) = true
i = 71 , isPrime(71) = true
i = 73 , isPrime(73) = true
i = 79 , isPrime(79) = true
i = 83 , isPrime(83) = true
i = 89 , isPrime(89) = true

 */