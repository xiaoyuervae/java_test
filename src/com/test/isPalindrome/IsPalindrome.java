package com.test.isPalindrome;

/**
 * Created by xiaoyuervae on 16/9/10.
 * 给定一个字符串 , 如何判断这个字符串是否是回文串
 */
public class IsPalindrome {
    /**
     * 解法一: 从两头往中间扫
     * @param s
     * @return
     */
    public boolean IsPalindRome(String s){
        // 非法输入
        if (s == null){
            return false ;
        }
        // 初始化头节点和尾节点
        int front = 0 ;
        int back = s.length() - 1;
        while (back > front) {
            if (s.charAt(front) != s.charAt(back)){
                return false ;
            }
            front++ ;
            back-- ;
        }

        return true ;
    }

    public static void main(String[] args) {
        Boolean flag = new IsPalindrome().IsPalindRome("1001") ;
        System.out.print(flag);
    }
}
