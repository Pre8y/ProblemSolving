package com.learncode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdjacencyMatrixGraphTest {

    @Test
    void getAdjMatrix() {
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1,3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3,4);
        int[][] a = graph.getAdjMatrix();

       for (int i=0; i<5;i++){
           for (int j=0; j<5;j++){
                System.out.print(a[i][j]+" ");
           }
           System.out.println();
       }
    }
}