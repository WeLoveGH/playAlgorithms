package com.godtrue.play.algorithms.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description：
 *
 *              给定两个数组，求两个数组的交集
 *              如果nums1=[1,2,2,1],nums2=[2,2]
 *              结果为[2,2]
 *              出现的顺序可以是任意的
 *
 * @author：qianyingjie1
 * @create：2019-12-14
 */
public class PlayMap {
    public static final Integer [] getIntersection(Integer [] nums1,Integer [] nums2){
        if(nums1==null || nums1.length==0 || nums2==null || nums2.length==0){
            throw new IllegalArgumentException(" the argument illegal !!!");
        }

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.length; i++) {
            if(map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i])+1);
            }else{
                map.put(nums1[i],1);
            }
        }

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            if(map.get(nums2[i])!=null && map.get(nums2[i])>0){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }

        Integer [] result = new Integer[list.size()];
        return list.toArray(result);
    }

    public static void main(String[] args) {

        Integer [] nums1 = {1,2,2,1};
        Integer [] nums2 = {2,2,1,1,3};

        Integer [] theSameNums = getIntersection(nums1,nums2);

        for (int i = 0; i < theSameNums.length; i++) {
            System.out.print(theSameNums[i]);
            if(i!=theSameNums.length-1){
                System.out.print(" , ");
            }
        }
    }
}
