package com.test.partOfInt;

import java.util.Scanner;

/**
 * Created by xiaoyuervae on 16/9/11.
 */
public class PartOfAPlusB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a , Da  ;
        int sum = 0 ;
        while (sc.hasNextLine()) {
            String str = sc.nextLine() ;
            String[] str1 = str.split(" ") ;
            for (int i=0 ; i < str.length() ; i++) {

            }
        }
        System.out.println(sum);
    }

    public static int partOfAPlusB(int num , int m) {
        char[] numArray = String.valueOf(num).toCharArray() ;
        int len = numArray.length ;
        StringBuffer sb = new StringBuffer() ;
        for (int i = 0 ; i < len ; i++) {
            if (Integer.parseInt(String.valueOf(numArray[i])) == m) {
                sb.append(m) ;
            }
        }
        System.out.println(sb.toString());
        return Integer.parseInt(sb.toString()) ;
    }
}
