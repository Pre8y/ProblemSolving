package com.learncode.array;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Ex03SubArrayForGivenSumTest {

    private final static  ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final static ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final static PrintStream originalOut = System.out;
    private final static PrintStream originalErr = System.err;
    @BeforeAll
    public static void setUpStream(){
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    @AfterAll
    public static void restoreStream(){
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
    @Test
    void findSubArrayForGivenSum() {
        int[] a = {1, 2, 3, 7, 5};
        new Ex03SubArrayForGivenSum().findSubArrayForGivenSum(a, 5, 12);
        assertEquals("2 4", outContent.toString());
    }
}