package com.test.string;

import java.util.Scanner;

/**
 * Created by xiaoyuervae on 16/9/11.
 */
public class StrToInt {
    public static void main(String[] args) {
        System.out.println(strToInt("5464"));
    }
    public static int strToInt(String str) {
        int len = str.length() ;
        // 初始化结果
        int sum = 0 ;
        int n  ;
        for (int i = 0  ; i < len ; i++) {
            String s = String.valueOf(str.charAt(i)) ;
            n = Integer.parseInt(s) ;
            sum += n*Math.pow(10 , len-1-i) ;
            System.out.println(sum);
        }
        return sum ;
    }
}
