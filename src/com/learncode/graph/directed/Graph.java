package com.learncode.graph.directed;

import java.util.*;

public class Graph<T> {
    Map<T, List<T>> nodes;

    public Graph() {
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

    boolean isCyclic(){
        ArrayList<T> visited = new ArrayList<>();
        ArrayList<T> explored = new ArrayList<>();
        for(T node: nodes.keySet()){
            if(!visited.contains(node)){
                if(isCyclic(node, visited, explored))
                    return true;
            }
        }
        return false;

    }

    private boolean isCyclic(T node, ArrayList<T> visited, ArrayList<T> explored) {
            if(explored.contains(node)) return true;
            if(visited.contains(node)) return false;

            visited.add(node);
            if(nodes.get(node)!=null) {
                Iterator<T> children = nodes.get(node).listIterator();
                while (children.hasNext()) {
                    T v = children.next();
                    if (!visited.contains(v)) {
                        if (isCyclic(v, visited, explored))
                            return true;
                    }
                }
            }
        explored.add(node);
            return false;

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


}
