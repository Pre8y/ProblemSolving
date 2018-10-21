package com.learncode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueFromStackTest {
    //fifo
    @Test
    void testQueue(){
        QueueFromStack queue = new QueueFromStack();
        queue.enQueue('a');
        queue.enQueue('b');
        queue.enQueue('c');

        assertEquals('a', queue.deQueue());

    }

}