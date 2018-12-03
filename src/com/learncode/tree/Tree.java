package com.learncode.tree;

public class Tree<T extends Comparable> {
    Node<T> root;
    public Tree() {
        root = null;
    }
    public Node addRoot(T data){
        root = new Node<>(data);
        return root;
    }
    public Node addToLeftOf(Node node, T data){
        Node newNode = new Node(data);
        node.setLeft(newNode);
        return newNode;
    }
    public Node addToRightOf(Node node, T data){
        Node newNode = new Node(data);
        node.setRight(newNode);
        return newNode;
    }

    @Override
    public String toString() {
       return root.toString();

    }

    public Node<T> getRoot() {
        return root;
    }
}
