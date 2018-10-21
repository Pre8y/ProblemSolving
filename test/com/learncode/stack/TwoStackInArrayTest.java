package com.learncode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoStackInArrayTest {
    @Test
    void testTwoStack(){
        TwoStackInArray twoStackInArray = new TwoStackInArray();
        twoStackInArray.push1('a');
        twoStackInArray.push1('b');
        twoStackInArray.push1('c');
        twoStackInArray.push2('p');
        twoStackInArray.push2('q');
        twoStackInArray.push2('r');
        assertEquals('c', twoStackInArray.pop1());
        assertEquals('r', twoStackInArray.pop2());
    }

}