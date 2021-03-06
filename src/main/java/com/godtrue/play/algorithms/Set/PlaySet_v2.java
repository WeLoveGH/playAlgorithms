package com.godtrue.play.algorithms.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * @description：
 *
 *             给定两个两个数组 nums ,求两个数组的公共元素
 *             如果 nums1=[1,2,2,1] , nums2 = [2,2]
 *             结果为 [2]
 *             结果中每个元素只能出现一次
 *             出现的顺序可以是任意的
 *
 * @author：qianyingjie1
 * @create：2019-12-14
 */
public class PlaySet_v2 {

    public static final Integer [] getSameNums(Integer [] nums1,Integer [] nums2){
        if(nums1==null || nums1.length==0 || nums2==null || nums2.length==0){
            throw new IllegalArgumentException(" the argument illegal !!!");
        }

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        Set<Integer> resultSet = new HashSet<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])){
                resultSet.add(nums2[i]);
            }
        }

        Integer [] result = new Integer[resultSet.size()];
        return resultSet.toArray(result);
    }

    public static void main(String[] args) {

        Integer [] nums1 = {1,2,2,3,4,5,6,7,8,8,9};
        Integer [] nums2 = {2,3,6,6,9,9};

        Integer [] theSameNums = getSameNums(nums1,nums2);

        for (int i = 0; i < theSameNums.length; i++) {
            System.out.print(theSameNums[i]);
            if(i!=theSameNums.length-1){
                System.out.print(" , ");
            }
        }
    }
}
