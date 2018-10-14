package com.learncode.linkedlist;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ExLinkedListTest {
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
    void printList() {
        ExLinkedList<Integer> list = new ExLinkedList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.printList();
        assertEquals(4, list.length());
        assertEquals("1->2->3->4->", outputContent.toString());


    }
}