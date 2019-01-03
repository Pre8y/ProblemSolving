package com.learncode.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
    public void printDFS( int count, AdjacencyListGraph graph){
        boolean[] visited = new boolean[count];
        for(int i=0;i<count;i++){
            if(!visited[i]) {
                dfsUtil(i, graph, visited);
            }
        }
    }

    private void dfsUtil(int index, AdjacencyListGraph graph, boolean[] visited) {
        LinkedList<Integer>[] lists = graph.getAdjList();
        LinkedList<Integer> list = lists[index];
        visited[index] = true;
        System.out.println(list.get(0));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
//            if()
        }
    }
}
