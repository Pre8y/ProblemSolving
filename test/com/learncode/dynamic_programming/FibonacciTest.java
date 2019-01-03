package com.learncode.dynamic_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void getNthFibonacciNumber() {

        assertEquals(34, new Fibonacci().getNthFibonacciNumber(9));
    }
}