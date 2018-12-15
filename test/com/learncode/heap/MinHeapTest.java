package com.learncode.heap;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class MinHeapTest {

    @Test
    void sort() {
        int[] a = {3, 19, 1, 14,  8, 7};
        int[] r = {19, 14, 8, 7, 3, 1};

        assertArrayEquals(r, new MinHeap().sort(a));
    }
}