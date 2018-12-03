package com.learncode.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopView<T extends Comparable> {
    public String topViewInorder(Tree<T> tree){
        Node<T> root = tree.getRoot();
        if(root==null) return "";
        Queue<QueueNode> queue = new LinkedList<QueueNode>();
        queue.offer(new QueueNode(root, 0));
        StringBuilder str = new StringBuilder();
        HashMap<Integer, Node> map = new HashMap<>();
        while(!queue.isEmpty()){
            QueueNode queueNode = queue.poll();
            if(!map.containsKey(queueNode.getHd())) {
                str.append(queueNode.getNode().getData() + " ");
                map.put(queueNode.getHd(), queueNode.getNode());
            }
            Node<T> left = queueNode.getNode().getLeft();
            if(left!=null) {
                queue.offer(new QueueNode(left, queueNode.getHd()-1));
            }
            Node<T> right = queueNode.getNode().getRight();
            if(right!=null){
                queue.offer(new QueueNode(right, queueNode.getHd()+1));
            }
        }
        return str.toString();
    }

}
