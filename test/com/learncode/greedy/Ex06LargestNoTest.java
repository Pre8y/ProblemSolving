package com.learncode.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex06LargestNoTest {

    @Test
    void getLargestNo() {
        assertEquals("90", new Ex06LargestNo().getLargestNo(2, 9));
        assertEquals("992", new Ex06LargestNo().getLargestNo(3, 20));
        assertEquals("-1", new Ex06LargestNo().getLargestNo(35, 0));
        assertEquals("-1", new Ex06LargestNo().getLargestNo(20, 224));
        assertEquals("-1", new Ex06LargestNo().getLargestNo(6, 145));

    }
}