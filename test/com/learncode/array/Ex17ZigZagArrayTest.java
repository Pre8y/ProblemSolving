package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex17ZigZagArrayTest {

    @Test
    void zigZag() {
        int[] a = {4, 3, 7, 8, 6, 2, 1};
        assertArrayEquals(new int[]{3, 7, 4, 8, 2, 6, 1}, new Ex17ZigZagArray().zigZag(a));
    }
}