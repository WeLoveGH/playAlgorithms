package com.godtrue.play.algorithms.Map.Iterate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @description：
 *
 *              map的遍历方式
 *
 *
 * @author：qianyingjie1
 * @create：2019-12-25
 */
public class Iterate {

    /**
     * 构建测试的map，map的value不变，key一直变化
     * @param num
     * @return
     */
    public static final Map<Integer, String> getMap(int num) {
        Map<Integer,String> map = new HashMap<Integer, String>();

        for (int i = 0; i < num; i++) {
            map.put(i,"hello , i am " + num);
        }

        return map;
    }

    /**
     * 遍历方式一：
     *          遍历key的值，然后通过get方法获取value
     * @param map
     */
    public static final void iterate(Map<Integer,String> map){
        if(map == null || map.isEmpty()){
            return;
        }

        for (Integer k : map.keySet()){
            System.out.print(k + " : " + map.get(k) + " ");
        }

        System.out.println("\n");
    }

    /**
     * 遍历方式二：
     *           遍历value的值
     * @param map
     */
    public static final void iterate2(Map<Integer,String> map){
        if(map == null || map.isEmpty()){
            return;
        }

        for (String v : map.values()){
            System.out.print("v : " + v + " ");
        }

        System.out.println("\n");
    }

    /**
     * 遍历方式三：
     *          可以同时获取key和value
     * @param map
     */
    public static final void iterate3(Map<Integer,String> map){
        if(map == null || map.isEmpty()){
            return;
        }

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.print(entry.getKey() + " : " + entry.getValue() + " ");
        }

        System.out.println("\n");
    }

    /**
     * 遍历方式四：
     *          遍历key的值，然后通过get方法获取value
     *          使用迭代器
     * @param map
     */
    public static final void iterate4(Map<Integer,String> map){
        if(map == null || map.isEmpty()){
            return;
        }

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            Integer k = iterator.next();
            System.out.print(k + " : " + map.get(k) + " ");
        }

        System.out.println("\n");
    }

    /**
     * 遍历方式五：
     *           遍历value的值
     *           使用迭代器
     * @param map
     */
    public static final void iterate5(Map<Integer,String> map){
        if(map == null || map.isEmpty()){
            return;
        }

        Iterator<String> iterator = map.values().iterator();
        while (iterator.hasNext()){
            String v = iterator.next();
            System.out.print("v : " + v + " ");
        }

        System.out.println("\n");
    }

    /**
     * 遍历方式六：
     *          可以同时获取key和value
     *          使用迭代器
     * @param map
     */
    public static final void iterate6(Map<Integer,String> map){
        if(map == null || map.isEmpty()){
            return;
        }

        Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry =iterator.next();
            System.out.print(entry.getKey() + "： " + entry.getValue() + " ");
        }

        System.out.println("\n");
    }

    public static void main(String[] args) {
        iterate(getMap(1));
        iterate2(getMap(2));
        iterate3(getMap(3));
        iterate4(getMap(4));
        iterate5(getMap(5));
        iterate6(getMap(6));
    }
}
