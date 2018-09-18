package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex04DutchNationalFlagTest {

    @Test
    void sortArray() {
        int[] a = { 2, 1, 2, 0, 0};
        assertArrayEquals(new int[]{0, 0, 1, 2, 2}, new Ex04DutchNationalFlag().sortArray(a, 5));
    }
}