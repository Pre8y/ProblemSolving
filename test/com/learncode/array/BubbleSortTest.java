package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sort() {
        int[] a = {4, 3, 1, 5, 2};
        new BubbleSort().sort(a);
        assertArrayEquals(new int[]{1, 2, 3,  4, 5}, a);
    }
}