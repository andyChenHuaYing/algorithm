package org.oscar.algo.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author huaying
 * @version 0.0.1
 * @since 2019-11-30
 */
public class LeetCode19Test {

    private LeetCode19 leetCode19 = new LeetCode19();

    @Test
    public void removeNthFromEnd() {
        ListNode removedNode = leetCode19.removeNthFromEnd(null, 1);
        assertNull(removedNode);

        //one node
        ListNode oneNode = new ListNode(1);
        ListNode listNode = leetCode19.removeNthFromEnd(oneNode, 1);
        assertNull(listNode);
    }

    @Test
    public void fiveNode() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        four.next = new ListNode(5);
        three.next = four;
        two.next = three;
        one.next = two;

        ListNode expected = leetCode19.removeNthFromEnd(one, 2);
        assertEquals(one.getVal(), expected.getVal());

    }
}