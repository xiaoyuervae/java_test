package com.test.isPalindrome;

/**
 * Created by xiaoyuervae on 16/9/10.
 */
public class OutputLongestPalindrome {
    public static int beg , end ;
    public static void main(String[] args) {
        String str = "safjlasdfjlasjgosjglsdjglsnlvmlslfsdfls" ;
        beg = 0 ;
        end = str.length()-1 ;
        splitPalindromeNumber(str , beg , end);
    }

    private static void splitPalindromeNumber(String str, int beg, int end) {
        int lbeg = beg ;
        int rend = end ;
        // beg , end 返回当前最大回文串的起始点和截止点
        maxPalindromeNumber(str , beg , end) ;
        System.out.println(beg);
        System.out.println(end);
        int lend = beg - 1;
        int rbeg = end + 1;
        // lbeg lend 最大回文串的左部
        // rbeg rend 最大回文串的右部
        if(lbeg <= lend){
            splitPalindromeNumber(str,lbeg,lend);
        }
        System.out.println(str.substring(beg , end-beg+1));
        if (rbeg <= rend) {
            splitPalindromeNumber(str,rbeg,rend);
        }

    }

    /**
     *
     * @param str
     * @param beg 最大回文数的起始位置
     * @param end 最大回文数的终止位置
     */
    private static void maxPalindromeNumber(String str, int beg, int end) {
        int maxLen = 1,start = beg;
        int left,right;
        for(int i = beg;i <= end;i++){
            //奇数字串
            int oddLen = 1;
            left = i-1;
            right = i+1;
            while(left >= beg && right <= end && str.charAt(left) == str.charAt(right)){
                left--;
                right++;
                oddLen += 2;
            }
            //更新最大长度
            if(oddLen > maxLen){
                maxLen = oddLen;
                //记录当前最大回文串的起始位置
                start = left+1;
            }
            //偶数字串
            left = i;
            right = i+1;
            int evenLen = 0;
            while(left >= beg && right <= end && str.charAt(left) == str.charAt(right)){
                left--;
                right++;
                evenLen += 2;
            }
            //更新最大长度
            if(evenLen > maxLen){
                maxLen = evenLen;
                //记录当前最大回文串的起始位置
                start = left+1;
            }
        }
        beg = start;
        end = start + maxLen - 1;
    }
}
