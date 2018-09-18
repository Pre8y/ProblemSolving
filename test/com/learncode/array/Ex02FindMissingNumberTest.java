package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex02FindMissingNumberTest {

    @Test
    void findMissingNumber() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        assertEquals(9, new Ex02FindMissingNumber().findMissingNumber(a, 10));
    }
}