package com.learncode.tree;

import java.util.*;

public class Ex03BottomView<T extends Comparable> {
    // Should print bottom view of tree with given root
    public String bottomView(Tree<T> tree)
    {
        // Your code here
        Node root = tree.getRoot();
        bottomViewUtil(root, 0);
        StringBuilder str = new StringBuilder();
        for(Map.Entry<Integer, Node> e: map.entrySet()){
            str.append(e.getValue().data).append(" ");
        }
        return str.toString();
    }
    TreeMap<Integer, Node> map = new TreeMap<Integer, Node>();
    public void bottomViewUtil(Node node, int hd)
    {
        if(node==null) return;
        map.put(hd, node);
        bottomViewUtil(node.left, hd-1);
        bottomViewUtil(node.right, hd+1);
    }

}
