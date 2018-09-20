package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex10ReverseArrayInGroupTest {

    @Test
    void getReverseArrayInGroup() {
        int[] a = {1, 2, 3, 4, 5,};
        assertArrayEquals(new int [] {3, 2, 1, 5, 4}, new Ex10ReverseArrayInGroup().getReverseArrayInGroup(a, 5, 3));
//        assertArrayEquals(new int [] {3, 3, 4, 5, 5, 5, 6}, new Ex10ReverseArrayInGroup().getReverseArrayInGroup(a, 9,3));

    }
}