package com.learncode.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex02HeapTest {

    @Test
    void sort() {
        int[] a = {3, 19, 1, 14,  8, 7};
        int[] r = {1, 3, 7, 8, 14, 19};
        assertArrayEquals(r, new Ex02Heap().sort(a));
    }
}