package com.test.MinusNumOfReverseArray;

/**
 * Created by xiaoyuervae on 16/9/12.
 */
public class MinusNumOfReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5} ;
        System.out.println(minusNumOfReverseArray(arr));
    }
    public static int minusNumOfReverseArray(int[] array) {

        // 越界检查
        if(array == null) {
            return 0 ;
        }
        int low = 0 , high = array.length - 1 ;
        while (low < high) {
            int mid = low + (high - low) / 2 ;
            if (array[mid] > array[high]) {
                low = mid + 1 ;
            }
            else if (array[mid] == array[high]) {
                high = high - 1 ;
            }else {
                high = mid ;
            }
        }
        return array[low] ;
    }
}
