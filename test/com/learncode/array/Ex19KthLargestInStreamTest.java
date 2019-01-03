package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex19KthLargestInStreamTest {

    @Test
    void printKthLargest() {
        int a[] = {10, 20, 11, 70, 50, 40, 100, 5};
        assertEquals("-1, -1, 10, 11, 20, 40, 50, 50, ", new Ex19KthLargestInStream().printKthLargest(a, 8, 3));
    }
}