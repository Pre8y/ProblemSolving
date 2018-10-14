package com.learncode.linkedlist;

public class ExLinkedList<T> {
    ExNode<T> head;

    public ExLinkedList() {
        head = null;
    }

    public void insert(T data) {
        ExNode node = new ExNode(data);
        add(node);

    }

    public void printList() {
        if (head != null) {
            ExNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int length() {
        int count = 0;
        if (head != null) {
            ExNode temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
        }
        return count;
    }

    public void add(ExNode<T> node) {
        if (head != null) {
            ExNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        } else {
            head = node;
        }
    }
}
