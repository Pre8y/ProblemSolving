package com.learncode.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionPointLinkedListTest {

    @Test
    void getIntersection() {
        ExLinkedList<Integer> first = new ExLinkedList<>();
        first.insert(3);
        first.insert(6);
        first.insert(9);
        first.insert(15);
        first.insert(30);
        ExLinkedList<Integer> second = new ExLinkedList<>();
        second.insert(10);
        second.insert(15);
        second.insert(30);

        assertEquals(15, (int)new IntersectionPointLinkedList<Integer>().getIntersection(first,second));
    }
}