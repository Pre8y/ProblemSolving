package com.learncode.graph.directed;

import org.junit.jupiter.api.Test;

class DirectedGraphTest {

    @Test
    void isCyclic() {
        DirectedGraph<Integer> graph = new DirectedGraph<>();
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
//        graph.printGraph();
//        assertEquals(false, graph.isCyclic());
        graph.addEdge(3, 0);
        graph.printGraph();
//        assertEquals(true, graph.isCyclic());
    }
}