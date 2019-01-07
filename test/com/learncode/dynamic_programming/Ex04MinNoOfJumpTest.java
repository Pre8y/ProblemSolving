package com.learncode.dynamic_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex04MinNoOfJumpTest {

    @Test
    void getMinJump() {
        int[] a = {1, 3, 5, 8, 9, 2, 6, 7, 8, 9};
        assertEquals(3, new Ex04MinNoOfJump().getMinJump(a));
        int[] b = {2, 3, 1, 1, 2, 4, 2, 0, 1, 1};
        assertEquals(4, new Ex04MinNoOfJump().getMinJump(b));
        int[] c = {0, 1, 1, 1, 1};
        assertEquals(-1, new Ex04MinNoOfJump().getMinJump(c));
    }
}