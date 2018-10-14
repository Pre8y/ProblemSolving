package com.learncode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex01MidElementTest {

    @Test
    void getMidElement() {
        ExLinkedList<Integer> list = new ExLinkedList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        assertEquals(3, (int)new Ex01MidElement<Integer>().getMidElement(list));
        list.insert(6);
        assertEquals(4, (int)new Ex01MidElement<Integer>().getMidElement(list));

    }
}