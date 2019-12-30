package com.godtrue.play.algorithms.NewCognize;

import java.util.Date;

/**
 * @description：针对final让我有了新认知
 * @author：qianyingjie1
 * @create：2019-12-16
 */
public class AboutFinal {
    private final int a;
    private final Integer b;
    private final String c;
    private final Date d;

    /**
     * 被 final 关键字休息的变量，就是常量，它具有两个特性
     * 1：只能被初始化一次
     * 2：如果有多个构造方法，每一个构造方法中必须都对对应的变量进行了赋值操作
     * 3：如果静态属性赋值了，再在构造函数中进行赋值就会报
     *    cannot assign a value to final variable "xxx"
     *
     *
     *
     * @param a
     * @param b
     * @param c
     * @param d
     */
    public AboutFinal(int a, Integer b, String c, Date d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    /**
     * 注意：需要对其他的属性字段进行初始化
     * @param a
     */
    public AboutFinal(int a) {
        this.a = a;

        /**
         * 注意：如果在此构造函数中，不对其他的属性进行初始化，对应的属性就报
         * Variable 'xxx' might not have been initialized
         *
         */
        this.b = 1;
        this.c = "c";
        this.d = new Date();
    }
}
