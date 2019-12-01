package org.oscar.algo.leetcode;

/**
 * @author huaying
 * @version 0.0.1
 * @since 2019-11-30
 */
public class LeetCode19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode needRemoveNodePrev = dummyHead;
        ListNode tailNode = dummyHead;
        int loopTimes = 0;
        while (tailNode.next != null) {
            loopTimes++;
            if (loopTimes > n) {
                needRemoveNodePrev = needRemoveNodePrev.next;
            }
            tailNode = tailNode.next;

            if (tailNode.next == null && loopTimes >= n) {
                needRemoveNodePrev.next = needRemoveNodePrev.next.next;
            }
        }

        return dummyHead.next;
    }
}
