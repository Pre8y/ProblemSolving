package com.learncode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapTest {

    @Test
    void allTest(){
        Heap heap = new Heap();
        heap.insert(4);
        assertEquals("4 ", heap.toString());
        heap.insert(2);
        assertEquals("2 4 ", heap.toString());
        assertEquals(2, heap.getMin());
        assertEquals("4 ", heap.toString());
        heap.insert(6);
        assertEquals("4 6 ", heap.toString());
        heap.delete(0);
        assertEquals("6 ", heap.toString());
        assertEquals(6, heap.getMin());
        assertEquals(-1, heap.getMin());
    }
}