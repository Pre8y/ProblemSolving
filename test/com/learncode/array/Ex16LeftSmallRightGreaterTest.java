package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex16LeftSmallRightGreaterTest {

    @Test
    void getElement() {
        int[] a  = {5, 1, 4, 3, 6, 8, 10, 7, 9};
        assertEquals(4, new Ex16LeftSmallRightGreater().getElement(a));
    }
}