package com.learncode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex15StockBuyAndSellTest {

    @Test
    void getDaysForMaxProfit() {
        int[] a = {100, 180, 260,310, 40, 535, 695};

        assertEquals("(0, 3)(4, 6)", new Ex15StockBuyAndSell().getDaysForMaxProfit(a));
        int[] b = {23, 13, 25, 29, 33, 19, 34, 45, 65, 67};
        assertEquals("(1, 4)(5, 9)", new Ex15StockBuyAndSell().getDaysForMaxProfit(b));
        int[] c = {23, 5};
        assertEquals("No Profit", new Ex15StockBuyAndSell().getDaysForMaxProfit(c));

    }
}