package com.learncode.linkedlist;

public class Ex02ReverseLinkedList<T> {
    public ExLinkedList<T> reverse(ExLinkedList<T> list){

        if(list.isEmpty()) return list;
        ExNode<T> current = list.head;
        ExNode prev = null, next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        list.head = prev;
       return list;
    }
}
