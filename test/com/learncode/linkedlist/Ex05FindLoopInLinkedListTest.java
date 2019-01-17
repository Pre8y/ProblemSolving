package com.learncode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex05FindLoopInLinkedListTest {

    @Test
    void isLoopExist() {
        //1->2->3->4->5->6->7->8->3
        ExLinkedList<Integer> list = new ExLinkedList<>();
        list.insert(1);
        list.insert(2);
        ExNode<Integer> three = new ExNode<>(3);
        list.add(three);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        ExNode<Integer> eight = new ExNode<>(8);
        eight.next = three;
        list.add(eight);

        assertEquals(true, new Ex05FindLoopInLinkedList<Integer>().isLoopExist(list));

    }
}