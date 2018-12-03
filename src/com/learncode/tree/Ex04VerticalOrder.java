package com.learncode.tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Ex04VerticalOrder<T extends Comparable> {
    StringBuilder str = new StringBuilder();
    TreeMap<Integer, LinkedList<Node>> map = new TreeMap<>();
    public String verticalOrder(Tree<T> tree){
        verticalOrder(tree.getRoot(), 0);
        for(Map.Entry<Integer, LinkedList<Node>> entry: map.entrySet()){
            for(Node node: entry.getValue()){
                str.append(node.getData()+" ");
            }

        }
        return str.toString();
    }

    private void verticalOrder(Node<T> node, int hd) {
        if(node==null) return;
        LinkedList<Node> list;
        if(map.containsKey(hd)){
            list= map.get(hd);
        }else{
            list = new LinkedList<>();
        }
        list.add(node);
        map.put(hd, list);
        verticalOrder(node.getLeft(), hd-1);
        verticalOrder(node.getRight(), hd+1);
    }
}
