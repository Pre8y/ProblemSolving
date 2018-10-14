package com.learncode.linkedlist;

public class ExNode<T> {
    T data;
    ExNode<T> next;

    public ExNode(T data) {
        this.data = data;
        next = null;
    }


    public T getData() {
        return data;
    }

}
