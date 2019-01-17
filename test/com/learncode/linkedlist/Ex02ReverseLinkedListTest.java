package com.learncode.linkedlist;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Ex02ReverseLinkedListTest {
    static ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
    static PrintStream outputStream = System.out;
    @BeforeAll
    static void setStream(){
        System.setOut(new PrintStream(outputContent));
    }
    @AfterAll
    static void restoreStream(){
        System.setOut(outputStream);
    }
    @Test
    void reverse() {
        ExLinkedList<Integer> list = new ExLinkedList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list = new Ex02ReverseLinkedList<Integer>().reverse(list);
        list.printList();
        assertEquals("4->3->2->1->", outputContent.toString());

    }
}