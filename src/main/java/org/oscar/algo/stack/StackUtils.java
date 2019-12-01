package org.oscar.algo.stack;

/**
 * @author huaying
 * @version 0.0.1
 * @since 2019-12-01
 */
public class StackUtils {

    private String leftOne = "(", leftTwo = "{", leftThree = "[", rightOne = ")", rightTwo = "}", rightThree = "]";


    public static StackUtils getInstance() {
        return new StackUtils();
    }

    public boolean isValid(String target) {
        SimplyStack stack = new SimplyStack();


        if ("".equals(target)) {
            return true;
        }

        if (target == null || target.length() % 2 == 1) {
            return false;
        }

        for (int i = 0; i < target.length(); i++) {
            String c = String.valueOf(target.charAt(i));
            if (isLeft(c)) {
                stack.push(c);
                continue;
            }
            if (isRight(c)) {
                if (!isPair(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.pop() == null;
    }

    private boolean isLeft(String target) {
        return target.equals(leftOne) || target.equals(leftTwo) || target.equals(leftThree);
    }

    private boolean isRight(String target) {
        return target.equals(rightOne) || target.equals(rightTwo) || target.equals(rightThree);
    }

    private boolean isPair(String left, String right) {

        if (left == null || right == null) {
            return false;
        }

        if (left.equals(leftOne)) {
            return right.equals(rightOne);
        }
        if (left.equals(leftTwo)) {
            return right.equals(rightTwo);
        }
        if (left.equals(leftThree)) {
            return right.equals(rightThree);
        }
        return false;
    }

    private static class SimplyStack {

        private ListNode head = new ListNode("", null);

        public void push(String item) {
            ListNode itemNode = new ListNode(item, null);
            if (this.head.next == null) {
                this.head.next = itemNode;
                return;
            }

            ListNode next = this.head.next;

            this.head.next = itemNode;
            itemNode.next = next;
        }

        public String pop() {
            if (head.next == null) {
                return null;
            }
            ListNode next = this.head.next;
            this.head.next = this.head.next.next;
            return next.val;
        }


        private static class ListNode {
            String val;
            ListNode next;

            public ListNode(String val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }
    }
}
