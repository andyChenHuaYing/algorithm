package org.oscar.algo.leetcode;

/**
 * @author huaying
 * @version 0.0.1
 * @since 2019-11-30
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void printAll() {
        StringBuilder s = new StringBuilder(val + "->");
        while (next != null) {
            s.append(next.val).append("->");
            next = next.next;
        }
        s.append("null");
        System.out.println(s);
    }
}
