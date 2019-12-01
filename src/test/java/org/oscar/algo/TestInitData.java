package org.oscar.algo;

import org.oscar.algo.leetcode.ListNode;

/**
 * @author huaying
 * @version 0.0.1
 * @since 2019-12-01
 */
public class TestInitData {

    public static ListNode head(int n) {
        if (n == 0) {
            throw new IllegalArgumentException();
        }

        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i <= n; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }

        return head;
    }

    public static ListNode headWithCycle(int i) {
        ListNode head = head(i);
        ListNode headPoint = head;
        while (head.next != null) {
            head = head.next;
        }

        head.next = headPoint;

        return head;
    }
}
