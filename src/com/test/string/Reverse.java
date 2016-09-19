package com.test.string;

import java.util.Scanner;

/**
 * Created by xiaoyuervae on 16/9/12.
 */
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s ;
        while (sc.hasNext()) {
            int a = sc.nextInt() ;
            int b = sc.nextInt() ;
            System.out.println(rev(a)+rev(b));
        }
    }
    public static int rev(int n) {
        int result = 0 ;
        while (n != 0) {
            int tail = n % 10 ;
            result = result*10 + tail ;
            n /= 10 ;
        }
        return result ;
    }
}
