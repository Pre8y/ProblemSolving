package com.learncode.tree;

import java.util.Comparator;

public class Node<T extends Comparable> {

    T data;

    Node<T> left, right;

    public Node<T> getNextRight() {
        return nextRight;
    }

    public void setNextRight(Node<T> nextRight) {
        this.nextRight = nextRight;
    }

    Node<T> nextRight = null;



    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return toString(this);
    }

    private String toString(Node<T> node) {
        if(node==null) return "";
        StringBuilder builder = new StringBuilder();
        if(node!=null){
            if(node.left!=null){
                builder.append("["+toString(node.left)+"]");
            }
            builder.append("["+node.data.toString()+"]");
            if(node.right!=null){
                builder.append("["+toString(node.right)+"]");
            }
        }
        return builder.toString();
    }
}
