package com.learncode.graph;

import java.util.LinkedList;

public class AdjacencyListGraph {
    int v;
    LinkedList<Integer>[] adjList;

    public AdjacencyListGraph(int v) {
        this.v = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i]=new LinkedList<>();
        }
    }

    public LinkedList<Integer>[] getAdjList() {
        return adjList;
    }

    public void addEdge(int src, int dest){
        adjList[src].add(dest) ;
        adjList[dest].add(src) ;
    }
    void printGraph()
    {
        for(int i = 0; i < v; i++)
        {
            System.out.println("Adjacency list of vertex "+ i);
            System.out.print("head");
            for(Integer pCrawl: adjList[i]){
                System.out.print(" -> "+pCrawl);
            }
            System.out.println("\n");
        }
    }

}
