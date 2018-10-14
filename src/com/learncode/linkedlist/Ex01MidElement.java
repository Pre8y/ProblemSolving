package com.learncode.linkedlist;

public class Ex01MidElement<T> {
    T getMidElement(ExLinkedList<T> list){
        T mid = null;
        ExNode<T> ptr1, ptr2;
        ptr1 = list.head;
        ptr2 = list.head;
        int i = 1;
        while(ptr1!=null){
            ptr1 = ptr1.next;
            if(i%2==0){
                ptr2 = ptr2.next;
            }
            i++;
        }
        mid = ptr2.data;
        return mid;
    }
}
