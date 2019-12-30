package com.godtrue.play.algorithms.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @description：
 *
 *              判断符号是否匹配，符号是可定义的，只要是两个不雷同的就行
 *              最常见的是()/[]/{}/<>/bd/pq/01
 *
 * @author：qianyingjie1
 * @create：2019-12-24
 */
public class SymbolMatch {

    private static final boolean isOk(String str){
        /**
         * 字符串为null或空，则符号不匹配
         */
        if(str == null || str.trim().length() == 0){
            return false;
        }

        /**
         * 定义左符号映射，这种方式，非常灵活，只要两个字符不完全一样就可以定义为是匹配的
         */
        Map<Character,Character> leftMap = new HashMap<Character, Character>();
        leftMap.put('(',')');
        leftMap.put('[',']');
        leftMap.put('{','}');
        leftMap.put('<','>');
        leftMap.put('b','d');
        leftMap.put('p','q');
        leftMap.put('0','1');

        /**
         * 定义右符号映射，注意：需要结合左符号映射来一块定义
         */
        Map<Character,Character> rightMap = new HashMap<Character, Character>();
        rightMap.put(')','(');
        rightMap.put(']','[');
        rightMap.put('}','{');
        rightMap.put('>','<');
        rightMap.put('d','b');
        rightMap.put('q','p');
        rightMap.put('1','0');

        /**
         * 声明临时栈，符号匹配主要就是利用栈的特性来实现的——先进后出
         */
        Stack<Character> stack = new Stack<Character>();

        /**
         * 将字符串转换为字符数组
         */
        char [] chars = str.trim().toCharArray();

        /**
         * 遍历字符数组，判断字符串是否匹配
         */
        for (int i = 0; i < chars.length; i++) {
            /**
             * 获取字符数组
             */
            char temp = chars[i];

            /**
             * 左符号，则入栈
             */
            if(leftMap.containsKey(temp)){
                stack.push(temp);
            }else if(rightMap.containsKey(temp) && !stack.isEmpty()){
                /**
                 * 右符号，且栈非空，则进行符号匹配
                 * 1：栈顶元素出栈
                 * 2：栈顶元素为空 或 符号不匹配，则返回false（此处，判断是否匹配的核心在于通过两个字符匹配规则的映射字典）
                 */
                Character character = stack.pop();
                if(character == null || character.charValue() != rightMap.get(temp).charValue()){
                    return false;
                }
            }else{
                return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "(";
        System.out.println("符号：" + a + "  是否匹配： " + isOk(a));

        String b = ")";
        System.out.println("符号：" + b + "  是否匹配： " + isOk(b));

        String c = "()";
        System.out.println("符号：" + c + "  是否匹配： " + isOk(c));

        String d = "()[]{}{[()]}";
        System.out.println("符号：" + d + "  是否匹配： " + isOk(d));

        String e = "[]";
        System.out.println("符号：" + e + "  是否匹配： " + isOk(e));

        String f = "{}";
        System.out.println("符号：" + f + "  是否匹配： " + isOk(f));

        String g = "{[({[([{[]}])]})]}";
        System.out.println("符号：" + g + "  是否匹配： " + isOk(g));

        String h = "{[({[([{[)]}])]})]}";
        System.out.println("符号：" + h + "  是否匹配： " + isOk(h));

        String i = "{[({[([{[i]}])]})]}";
        System.out.println("符号：" + i + "  是否匹配： " + isOk(i));

        String j = "{[({[([{[<>]}])]})]}";
        System.out.println("符号：" + j + "  是否匹配： " + isOk(j));

        String k = "{[({[([{[<=>]}])]})]}";
        System.out.println("符号：" + k + "  是否匹配： " + isOk(k));

        String l = "{[({[([{[<bd>]}])]})]}";
        System.out.println("符号：" + l + "  是否匹配： " + isOk(l));

        String m = "p{[({[([{[<bd>]}])]})]}q";
        System.out.println("符号：" + m + "  是否匹配： " + isOk(m));

        String n = "p{[({[([{[<b01d>]}])]})]}q";
        System.out.println("符号：" + n + "  是否匹配： " + isOk(n));

        String o = "<p{[({[([{[<b01d>]}])]})]}q";
        System.out.println("符号：" + o + "  是否匹配： " + isOk(o));
    }
}
