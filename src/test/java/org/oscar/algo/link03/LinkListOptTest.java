package org.oscar.algo.link03;

import org.junit.Test;
import org.oscar.algo.TestInitData;
import org.oscar.algo.leetcode.ListNode;

import static org.junit.Assert.*;

/**
 * @author huaying
 * @version 0.0.1
 * @since 2019-12-01
 */
public class LinkListOptTest {

    @Test
    public void reverse() {
        ListNode head = TestInitData.head(5);
        ListNode reverse = LinkListOpt.reverse(head);
        reverse.printAll();
    }

    @Test
    public void testData() {
        ListNode head = TestInitData.head(5);
        head.printAll();
    }

    @Test
    public void headWithCycle() {
        ListNode head = TestInitData.headWithCycle(5);
        assertTrue(LinkListOpt.hasCycle(head));

        ListNode head1 = TestInitData.head(5);
        assertFalse(LinkListOpt.hasCycle(head1));

        ListNode listNode = TestInitData.headWithCycle(1);
        assertTrue(LinkListOpt.hasCycle(listNode));


    }

    @Test
    public void middleNode() {
        ListNode fiveNode = TestInitData.head(5);
        ListNode middleNode = LinkListOpt.middleNode(fiveNode);
        assertEquals(middleNode.getVal(), 3);

        ListNode oneNode = TestInitData.head(1);
        assertEquals(LinkListOpt.middleNode(oneNode).getVal(), 1);

        ListNode twoNode = TestInitData.head(2);
        assertEquals(LinkListOpt.middleNode(twoNode).getVal(), 2);

        ListNode fourNode = TestInitData.head(4);
        assertEquals(LinkListOpt.middleNode(fourNode).getVal(), 3);
    }
}