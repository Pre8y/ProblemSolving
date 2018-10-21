package com.learncode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverse() {
        assertEquals("olleh", new ReverseString().reverse("hello"));
    }
}