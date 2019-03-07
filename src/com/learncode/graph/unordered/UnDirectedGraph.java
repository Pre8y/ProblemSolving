package com.learncode.graph.unordered;

import java.util.*;

public class UnDirectedGraph<T> {
    Map<T, List<T>> nodes;

    public UnDirectedGraph() {
        this.nodes = new HashMap<>();
    }

    public void printGraph(){
        for(T node: nodes.keySet()){
            System.out.print(node.toString()+" --> ");
            List<T> adjacentNodes = nodes.get(node);
            if(adjacentNodes!=null) {
                for (T node1 : adjacentNodes) {
                    System.out.print("  "+node1.toString());
                }
            }
            System.out.println();
        }
    }

    public void addEdge(T node1, T node2) {
        addOneSideEdge(node1, node2);
        addOneSideEdge(node2, node1);

    }

    private void addOneSideEdge(T src, T dest){
        if(nodes.containsKey(src)){
            List<T> adjacentNodes = nodes.get(src);
            if(adjacentNodes==null){
                adjacentNodes = new LinkedList<>();
            }
            adjacentNodes.add(dest);
        }else{
            List<T> adjacentNodes = new LinkedList<>();
            adjacentNodes.add(dest);
            nodes.put(src,adjacentNodes);
        }
    }


}
