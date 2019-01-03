package com.learncode.graph.unordered;

import java.util.*;

public class UnorderedGraph<T> {
    Map<T, List<T>> nodes;

    public UnorderedGraph() {
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

    public String getDFS() {
        StringBuffer buffer =  new StringBuffer();
        HashMap<T,Boolean> visited = new HashMap<>();
        for(T node: nodes.keySet()) {
            if(!visited.containsKey(node)) {
                getDFS(node, buffer, visited);
            }
        }
        return buffer.toString();
    }

    private void getDFS(T start, StringBuffer buffer, HashMap<T,Boolean> visited) {
            buffer.append(start.toString()+" ");
            visited.put(start, true);
            List<T> adjacentNodes = nodes.get(start);
            if(adjacentNodes!=null) {
                for (T node1 : adjacentNodes) {
                    if(!visited.containsKey(node1))
                        getDFS(node1, buffer, visited);
                }
            }
    }
    public String getBFS(T src) {
        StringBuffer buffer =  new StringBuffer();
        HashMap<T,Boolean> visited = new HashMap<>();
        Queue<T> queue = new LinkedList<>();
        queue.offer(src);
        while (!queue.isEmpty()){
            src = queue.poll();
            buffer.append(src+" ");
            visited.put(src, true);
            Iterator<T> adjacentNodes = nodes.get(src).listIterator();
            while (adjacentNodes.hasNext()){
                T adjacencyNode = adjacentNodes.next();
                if(!visited.containsKey(adjacencyNode)){
                    queue.offer(adjacencyNode);
                    visited.put(adjacencyNode, true);
                }
            }
        }
        return buffer.toString();
    }
}
