package com.learncode.linkedlist;

public class Ex05FindLoopInLinkedList<T> {

    boolean isLoopExist(ExLinkedList<T> list){
        ExNode<T> slow = list.head, fast = list.head;
        //1->2->3->4->5->6->7->8->3
        while(slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) return true;
        }

        return false;
    }
}
