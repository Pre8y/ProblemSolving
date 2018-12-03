package com.learncode.tree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex05LevelOrderSpiralTraversal<T extends Comparable> {
    StringBuilder str = new StringBuilder();
    public String traverse(Tree<T> tree){
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(tree.getRoot());
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                Node node = stack1.pop();
                str.append(node.getData() + " ");
                //stack is lifo
                if(node.getRight()!=null)stack2.push(node.getRight());
                if(node.getLeft()!=null) stack2.push(node.getLeft());
      }
            while (!stack2.isEmpty()) {
                Node node = stack2.pop();
                str.append(node.getData() + " ");

                if(node.getLeft()!=null) stack1.push(node.getLeft());
                if(node.getRight()!=null)stack1.push(node.getRight());

            }
        }
        return str.toString();
    }
}
