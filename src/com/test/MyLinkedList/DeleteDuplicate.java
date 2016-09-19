package com.test.MyLinkedList;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by xiaoyuervae on 16/9/13.
 */
public class DeleteDuplicate {
    public void deleteDuplicate(Node head){
        Hashtable<Integer , Integer> table = new Hashtable<Integer, Integer>() ;
        Node tmp = head ;
        Node pre = null ;
        while (tmp != null) {
            if (table.containsKey(tmp.data)) {
                pre.next = tmp.next ;
            }
            else {
                table.put(tmp.data , 1) ;
                pre = tmp ;
            }
            tmp = tmp.next ;
        }
    }

}
