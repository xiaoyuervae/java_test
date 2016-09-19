package com.test.MyLinkedList;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Hashtable;

/**
 * Created by xiaoyuervae on 16/9/13.
 */
public class MyLinkedList {
    Node head = null ; //  链表头的引用

    /**
     * 向链表中插入数据
     * @param d
     */
    public void addNode(int d) {
        Node newNode = new Node(d) ;
        if (head == null) {
            head = newNode ;
            return ;
        }
        Node tmp = head ;
        while (tmp.next != null) {
            tmp = tmp.next ;
        }
        // add node to end
        tmp.next = newNode ;
    }

    /**
     * @param index :删除第index个节点
     * @return 成功返回true , 失败返回false
     */
    public Boolean deleteNode(int index) {
        // 处理不合理的数据
        if (index < 1 || index > length()) {
            return false ;
        }
        // 删除链表的第一个元素
        if (index == 1) {
            head = head.next ;
            return true ;
        }
        // 从1开始向下找
        int i = 1 ;
        Node preNode = head ;
        Node curNode = preNode.next ;
        while (curNode != null) {
            if (i == index) {
                preNode.next = curNode.next ;
                return true ;
            }
            // update the preNode and curNode
            preNode = curNode ;
            curNode = curNode.next ;
            i++ ;
        }
        return true ;
    }
    /**
     * @return 返回结点的长度
     */
    public int length(){
        int length = 0 ;
        Node tmp = head ;
        while (tmp != null) {
            length++ ;
            tmp = tmp.next ;
        }
        return length ;
    }

    /**
     * 对链表进行排序
     * @return : 排序后的头结点
     */
    public Node orderList() {
        Node curNode = head ;
        Node nextNode = null ;
        int temp = 0 ;
        while (curNode.next != null) {
            nextNode = curNode.next ;
            while (nextNode != null) {
                if (curNode.data > nextNode.data) {
                    temp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next ;
            }
            curNode = curNode.next ;
        }
        return head ;
    }

    /**
     * 打印链表
     */
    public void printList(){
        Node tmp = head ;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next ;
        }
    }

    /**
     * 删除链表中重复的数据
     * 时间复杂度较低,但是需要额外的存储空间来保存已遍历的值
     */
    public void deleteDuplicate(){
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

    /**
     * 时间复杂度较高,但是不需要额外空间
     */
    public void deleteDuplicate1(){
        Node curNode = head ;
        while (curNode != null) {
            Node tmp = curNode ;
            while (tmp.next != null) {
                if (curNode.data == tmp.next.data) {
                    tmp.next = tmp.next.next ;
                }else {
                    tmp = tmp.next ;
                }
            }
            curNode = curNode.next ;
        }
    }

    /**
     * 查找链表中的倒数第k个元素
     * @param k
     * @return
     */
    public Node findElem(int k){
        if (k<1 || k< length()){
            return null ;
        }
        Node p1 = head ;
        Node p2 = head ;
        for (int i =0 ; i < k-1 ; i++) {
            p1 = p1.next ;
        }
        while (p1 != null) {
            p1 = p1.next ;
            p2 = p2.next ;
        }
        return p2 ;
    }

    /**
     * 实现链表的反转
     */
    public void reverseIteratively(){
        Node pResersedHead = head ;
        Node pNode = head ;
        Node pPrev = null ;
        while (pNode != null) {
            Node pNext = pNode.next ;
            if (pNext == null) {
                pResersedHead = pNode ;
            }
            pNode.next = pPrev ;
            pPrev = pNode ;
            pNode = pNext ;
        }
        head = pResersedHead ;
    }

    /**
     * 从尾到头输出单链表
     * @param pListHead
     */
    public void printListReversely(Node pListHead){
        if (pListHead != null) {
            printListReversely(pListHead.next);
            System.out.println(pListHead.data);
        }
    }

    /**
     * 寻找单链表的中间结点
     * @return
     */
    public Node searchMid() {
        Node p = head ;
        Node q = head ;
        while (p !=null && p.next != null && p.next.next != null) {
            p = p.next.next ;
            q = q.next ;
        }
        return q ;
    }

    /**
     * 检测一个链表是否有环
     * @return
     */
    public boolean isLoop() {
        Node fast = head ;
        Node slow = head ;
        if (fast == null) {
            return false ;
        }
        while (fast != null && fast.next.next != null) {
            fast = fast.next.next ;
            slow = slow.next ;
            if (fast == slow) {
                return true ;
            }
        }
        return ! (fast == null || fast.next == null) ;
    }
    public Node findLoopPort() {
        Node slow = head ;
        Node fast = head ;
        while (fast != null && fast.next != null) {
            slow = slow.next ;
            fast = fast.next.next ;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null ;
        }
        slow =head ;
        while (slow != fast) {
            slow = slow.next ;
            fast = fast.next ;
        }
        return slow ;
    }

    /**
     * 在不知道头指针的情况下删除指定结点
     * @param n
     * @return
     */
    public boolean deleteNode(Node n) {
        if (n == null || n.next == null) {
            return false ;
        }
        int tmp = n.data ;
        n.data = n.next.data ;
        n.next.data = tmp ;
        n.next = n.next.next ;
        return true ;
    }

    /**
     * 判断两个链表是否相交
     * @param h1
     * @param h2
     * @return
     */
    public static boolean isIntersect(Node h1 , Node h2) {
        if (h1 == null || h2 == null) {
            return false ;
        }
        Node tail1 = h1 ;
        // 找到链表的最后一个结点
        while (tail1.next != null) {
            tail1 = tail1.next ;
        }
        Node tail2 = h2 ;
        // 找到链表2 的最后一个结点
        while (tail2.next != null) {
            tail2 = tail2.next ;
        }
        return tail1 == tail2 ;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList() ;
        list.addNode(5);
        list.addNode(3);
        list.addNode(1);
        list.addNode(3);
        list.reverseIteratively();
        list.printList();
    }
}

class Node {
    Node next = null ;
    int data ;
    public Node(int data){
        this.data = data ;
    }
}
