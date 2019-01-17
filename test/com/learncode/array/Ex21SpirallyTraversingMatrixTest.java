package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex21SpirallyTraversingMatrixTest {

    @Test
    void printSpiral() {
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        String s = new Ex21SpirallyTraversingMatrix().printSpiral(a, 4, 4);
        assertEquals("1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 ", s);
    }
}