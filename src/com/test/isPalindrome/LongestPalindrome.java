package com.test.isPalindrome;

/**
 * Created by xiaoyuervae on 16/9/10.
 */
public class LongestPalindrome {
    /**
     * 中心扩展法
     * @param s
     * @return
     */
    public int longestPalindrome(String s) {
        // 考虑特殊情况
        if (s == null) {
            return 0 ;
        }
        int len = s.length() ;
        int max = 0 ;
        int c = 0 ;
        int i , j ; //i为回文中心的位置
        for (i = 0 ; i < len; i++) {
            // 回文子串长度为奇数
            for (j = 0 ; (j < i) && (i+j < len)  ; j++) {
                if (s.charAt(i-j) != s.charAt(i+j)) {
                    break ;
                }
                c = j*2 + 1 ;
            }
            if (c > max) {
                max = c ;
            }

            // 回文子串长度为偶数
            for (j = 0 ; (j < i) && (i+j < len-1)  ; j++) {
                if (s.charAt(i-j) != s.charAt(i+j+1)) {
                    break ;
                }
                c = j*2 + 2 ;
            }
            if (c > max) {
                max = c ;
            }
        }
        return max ;
    }

    public static void main(String[] args) {
        int n = new LongestPalindrome().longestPalindrome("15646646213") ;
        System.out.println(n);
    }
}
