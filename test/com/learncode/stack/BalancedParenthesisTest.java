package com.learncode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedParenthesisTest {

    @Test
    void isBalanced() {
        assertEquals(true, new BalancedParenthesis().isBalanced("[()]{}{[()()]()}"));
    }
}