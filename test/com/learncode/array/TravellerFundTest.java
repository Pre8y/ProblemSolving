package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TravellerFundTest {

    @Test
    void getInitialFund() {
        int[] a= {4, 2, -3};
        int[] b= {-5, -5, 5};
        assertEquals(0, new TravellerFund().getInitialFund(a, 3));
        assertEquals(10, new TravellerFund().getInitialFund(b, 3));

    }
}