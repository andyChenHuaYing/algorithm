package org.oscar.algo.link03;

/**
 * @author huaying
 * @version 0.0.1
 * @since 2019-11-29
 */
public class SimplySingleLink<T> {

    private Node<T> head;

    public SimplySingleLink() {
    }

    public void insertTail(T item) {
        Node<T> newNode = new Node<>(item, null);

        if (head == null) {
            head = new Node<>(item, null);
            return;
        }

        Node<T> tailNode = head;
        while (tailNode.next != null) {
            tailNode = tailNode.next;
        }
        tailNode.next = newNode;
    }

    public void insertHead(T item) {
        Node<T> newNode = new Node<>(item, null);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void insertHeadWrong(T item) {
        Node<T> newNode = new Node<>(item, null);
        if (head == null) {
            head = newNode;
            return;
        }

        head = newNode;
        newNode.next = head;
    }

    public void printAll() {
        Node<T> head = this.head;

        while (head != null) {
            System.out.println(head.item);
            head = head.next;
        }
    }

    /**
     * 关键点是Node结构
     * @param <T> Node中存储的数据
     */
    private static class Node<T> {
        T item;
        Node<T> next;

        Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }
    }

    public void reverse() {

    }
}
