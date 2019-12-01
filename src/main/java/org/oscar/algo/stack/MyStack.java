package org.oscar.algo.stack;

import java.util.LinkedList;

/**
 * @author huaying
 * @version 0.0.1
 * @since 2019-12-01
 */
public class MyStack {
    private LinkedList<Integer> queue = new LinkedList<>();

    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.addFirst(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (queue.isEmpty()) {
            throw new IllegalStateException();
        }
        return queue.pop();
    }

    /** Get the top element. */
    public int top() {
        return queue.getFirst();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
