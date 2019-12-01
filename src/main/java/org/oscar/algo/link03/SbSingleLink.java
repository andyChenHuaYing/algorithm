package org.oscar.algo.link03;

/**
 * @author huaying
 * @version 0.0.1
 * @since 2019-11-29
 */
public class SbSingleLink<T> {

    private Node<T> head = new Node<>(null, null);

    public void add(T item) {
        head.next = new Node<>(item, null);
    }

    public void printAll() {
        while (head.next != null) {

        }
    }

    private static class Node<T> {
        T item;
        Node<T> next;

        public Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }
    }
}
