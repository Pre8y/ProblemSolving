package com.learncode.tree;


import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal<T extends Comparable> {
    StringBuilder str = new StringBuilder();
    public String traverse(Tree<T> tree){
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(tree.getRoot());

        while(!queue.isEmpty()){
            Node node = queue.poll();
            str.append(node.getData()+" ");
            if(node.getLeft()!=null) queue.offer(node.getLeft());
            if(node.getRight()!=null) queue.offer(node.getRight());
        }
        return str.toString();
    }
}
