package com.test.isPalindrome;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by xiaoyuervae on 16/9/10.
 */
public class LongestPalindromeByManacher {
    public static int findByManacher(String str) {
        int len = str.length() ;
        // 构造新的字符串,避免奇数回文和偶数回文的不同处理问题,在原字符串之间插入"#",变成了奇数
        StringBuilder newStr = new StringBuilder() ;
        newStr.append("#");
        for (int i=0 ; i < len ; i++) {
            newStr.append(str.charAt(i));
            newStr.append("#");
        }
        // rad[i] 表示以i为中心的回文的最大半径 , i 至少为1 , 即该字符本身
        int[] rad = new int[newStr.length()] ;
        // right表示已知的回文中,最右的边界的坐标
        int right = -1 ;
        // id 表示最大回文子串中心的位置
        int id = -1 ;
        // 下面开始计算所有的rad
        // 这个算法是O(n)的 , 因为right只会随着里层while的迭代而增长,不会减少
        for (int i = 0 ; i < newStr.length() ; i++) {
            // 1.确定一个最小的半径
            int r = 1 ;
            if (i <= right) {
                r = Math.min(rad[id] - i + id, rad[2 * id - i]);
            }
            // 2.尝试更大的半径
            while (i - r >= 0 && i + r < newStr.length() && newStr.charAt(i - r) == newStr.charAt(i + r)) {
                r++;
            }
            // 3.更新边界和回文中心坐标
            if (i + r - 1> right) {
                right = i + r - 1;
                id = i;
            }
            rad[i] = r;
        }

        // 扫描一遍rad数组，找出最大的半径
        int maxLength = 0;
        for (int r : rad) {
            if (r > maxLength) {
                maxLength = r;
            }
        }
        return maxLength - 1;
    }

    public static void main(String[] args) throws FileNotFoundException {
        int caseNum = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if (str.equals("END")) {
                break;
            } else {
                caseNum ++;
                System.out.println("Case " + caseNum + ": " + findByManacher(str));
            }
        }
    }
}
