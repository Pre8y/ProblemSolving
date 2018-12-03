package com.learncode.tree;

public class Ex08BinaryTreeToDoublyLinkedList<T extends Comparable> {
    Node head = null;
    Node prev = null;
    Node<T> dll(Tree<T> tree){
        dll(tree.getRoot());
        return head;
    }

    String doublyLinkedListToString(Node<T> head){
        Node<T> temp = head;
        if(head==null) return "";
        StringBuilder str = new StringBuilder();
        while(temp!=null){
            str.append(temp.getData()+" ");
            temp = temp.getRight();
        }
        return str.toString();
    }

    private void dll(Node<T> node) {
        if(node==null) return ;
        dll(node.left);
        if(prev==null){
            head = node;
        }else{
            node.left = prev;
            prev.right = node;
        }
        prev = node;
        dll(node.right);
    }
}
