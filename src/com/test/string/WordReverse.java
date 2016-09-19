package com.test.string;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import javax.sound.midi.Soundbank;

/**
 * Created by xiaoyuervae on 16/9/11.
 */
public class WordReverse {
    public static String reverseString(String str) {
        if (str == null) {
            return "" ;
        }
        String[] splitedStr = str.split(" ") ; //将字符串分割成一个数组
        StringBuffer sb = new StringBuffer() ; // stringbuffer用于拼接字符串
        int len = splitedStr.length ;
        for (int i = len-1 ; i >= 0 ; i--) {
            if (i== 0) {
                sb.append(splitedStr[i]) ;
            }else {
                sb.append(splitedStr[i]+" ") ;
            }
        }
        return sb.toString() ;
    }

    public static void main(String[] args) {
        String str = "I am a student." ;
        str = reverseString(str) ;
        System.out.println(str);
        /*int len = str.length() ;
        int from = 0 ;
        int to = 0;
        for (int i= 0 ; i< len ; i++) {
            if (Character.isSpaceChar(str.charAt(i))){
                to = i+1 ;
            }
            str = reverseString(str , from , to) ;
            //System.out.println(str);
            from = i ;
        }
        str = reverseString(str , 0 , len-1) ;
        //System.out.println(str);*/

    }
}
