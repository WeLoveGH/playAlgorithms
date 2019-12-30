package com.godtrue.play.algorithms.ColorSort;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @description：
 *
 *              统计数组中重复数字的通用方法，利用map来统计，这种方式更具通用性
 *
 * @author：qianyingjie1
 * @create：2019-12-25
 */
public class CountRepeatNumByMap {

    private static final int ONE = 1;

    private static final Map<Integer, Integer> countRepeatNum(int[] arr) {

        if (arr == null || arr.length == 0) {
            return null;
        }

        /**
         * 代码比较简单，通过字典来统计数组中重复数字的个数
         * 1：遍历数组
         * 2：如果还没放入map，则放入map，且计数为1
         * 3：如果已经放入map，则取出对应的值，且计数加1
         *
         */
        Map<Integer, Integer> repeatNumMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (repeatNumMap.containsKey(arr[i])) {
                repeatNumMap.put(arr[i], repeatNumMap.get(arr[i]) + CountRepeatNumByMap.ONE);
            } else {
                repeatNumMap.put(arr[i], CountRepeatNumByMap.ONE);
            }
        }

        return repeatNumMap;
    }

    private static final void printArr(int[] arr) {
        int size = arr == null ? 0 : arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static final void printMap(Map<Integer,Integer> map){
        if(map == null || map.isEmpty()){
            System.out.println();
        }

        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,Integer> entry = iterator.next();
            System.out.println("数组中 "+ entry.getKey() + " 的个数是 " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 3};
        printArr(a);
        Map<Integer, Integer> b = countRepeatNum(a);
        printMap(b);

        int[] c = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3};
        printArr(c);
        Map<Integer, Integer> d = countRepeatNum(c);
        printMap(d);

        int[] e = {1, 2, 2, 3, 3, 3, 3, 3, 3, 2, 2, 1, 1, 2, 3, 3, 2, 1};
        printArr(e);
        Map<Integer, Integer> f = countRepeatNum(e);
        printMap(f);

        int[] h = {1,2,2,3,3,3,999,999,999,666,666,666,100,1000,100,55,55};
        printArr(h);
        Map<Integer, Integer> i = countRepeatNum(h);
        printMap(i);
    }
}
