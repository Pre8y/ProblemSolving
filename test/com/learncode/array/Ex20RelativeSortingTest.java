package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex20RelativeSortingTest {

    @Test
    void sort() {
        Integer[] a  = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int[] b  = {2, 1, 8, 3};
        new Ex20RelativeSorting().sort(a, b);
        assertArrayEquals(new Integer[]{2, 2, 1, 1, 8, 8, 3, 5, 6, 7, 9}, a);
    }
}