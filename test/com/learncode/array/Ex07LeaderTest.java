package com.learncode.array;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Ex07LeaderTest {

    static ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
    static  PrintStream outputStream = System.out;
    @BeforeAll
    static void setStream(){
        System.setOut(new PrintStream(outputContent));
    }
    @AfterAll
    static void restoreStream(){
        System.setOut(outputStream);
    }

    @Test
    void getLeader() {
        int[] a = {16, 17, 4, 3, 5, 2};
        int[] b = {16, 17, 17, 4, 3, 5, 2};
        new Ex07Leader().getLeader(b, 7);
        assertEquals("17 17 5 2 ", outputContent.toString());
    }
}