package com.learncode.graph;

public class AdjacencyMatrixGraph {
    //vertices count
    int v;
    int[][] adjMatrix;

    public AdjacencyMatrixGraph(int v) {
        this.v = v;
        adjMatrix = new int[v][v];
    }
    public void addEdge(int src, int dest){
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1;
    }

    public int[][] getAdjMatrix() {
        return adjMatrix;
    }
}
