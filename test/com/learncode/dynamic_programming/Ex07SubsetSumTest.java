package com.learncode.dynamic_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex07SubsetSumTest {

    @Test
    void isEqualPartitionPossible() {
        assertTrue(new Ex07SubsetSum().isEqualPartitionPossible(new int[]{1, 5, 11, 5}));
        assertFalse(new Ex07SubsetSum().isEqualPartitionPossible(new int[]{1, 3, 5}));

    }
}