package com.test.HailStone;

/**
 * Created by xiaoyuervae on 16/9/13.
 */
public class HailStone {
    public static int hailStone(int n) {
        int len = 1 ;
        while (1<n) {
            if (n%2 == 0) {
                n = n/2 ;
            }else {
                n = 3*n + 1 ;
            }
            len++ ;
        }
        return len ;
    }

    public static void main(String[] args) {
        System.out.println(hailStone(500));
    }
}
