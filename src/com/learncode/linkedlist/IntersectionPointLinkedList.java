package com.learncode.linkedlist;

public class IntersectionPointLinkedList<T> {
    public T getIntersection(ExLinkedList<T> first, ExLinkedList<T> second){
        T intersection = null;
        int fLength = first.length();
        int sLength = second.length();
        int diff = fLength>sLength?fLength-sLength:sLength-fLength;

        ExNode<T> temp = first.head;
        for(int i = 0; i<diff;i++){
            temp = temp.next;
        }
        intersection = temp.next!=null?temp.next.data:null;

        return intersection;
    }
}
