package com.learncode.graph.unordered;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnorderedGraphTest {

    @Test
    void printGraph() {
        UnorderedGraph<Integer> graph = new UnorderedGraph<>();
        graph.addEdge( 0, 1);
        graph.addEdge( 0, 4);
        graph.addEdge( 1, 2);
        graph.addEdge( 1, 3);
        graph.addEdge( 1, 4);
        graph.addEdge( 2, 3);
        graph.addEdge( 3, 4);
        graph.printGraph();

        assertEquals("0 1 2 3 4 ", graph.getDFS());
        assertEquals("0 1 4 2 3 ", graph.getBFS(0));

    }
}