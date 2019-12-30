package com.godtrue.play.algorithms.String.BigAndSmall;

import java.util.HashSet;
import java.util.Set;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-12-09
 */
public class BigAndSmall {

    public static final synchronized Set<String> getString(String str){

        if(str==null || str.trim().length()==0){
            throw new IllegalArgumentException("字符串非法！！！");
        }

        str = str.trim();

        char [] chars = str.toCharArray();

        Set set = new HashSet();

        for(int i=0;i<chars.length;i++){
            char c = chars[i];
            if(Character.isLetter(c)){

                set.add(str);

                chars[i] = Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);

                String temp = new String(chars);

                set.add(temp);

                String string = new String(chars,i,chars.length-i);

                getString(string);
            }
        }

        return set;
    }

    public static void main(String[] args) {
        System.out.println(getString("1a2B3c"));
    }

}
