package com.learncode.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex04MinNoOfCoinsTest {

    @Test
    void getMinNumCoin() {
        assertEquals("2000 2000 2000 2000 50 20 20 5 2 1 ", new Ex04MinNoOfCoins().getMinNumCoin(8098));
    }
}