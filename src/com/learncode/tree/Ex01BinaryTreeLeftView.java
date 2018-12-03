package com.learncode.tree;

public class Ex01BinaryTreeLeftView<T extends Comparable> {

    int level = 0;
    StringBuilder str = new StringBuilder();
    public String leftView(Tree<T> tree){
        Node root = tree.getRoot();
        if(root==null) return null;
        leftView(root, level+1);
        return str.toString();
    }

    private void leftView(Node node, int nextLevel) {
        if(node==null) return;
        System.out.println();
        if(nextLevel>level){
            str.append(node.getData()).append(" ");
            level++;
        }
        nextLevel++;
        if(node.getLeft()!=null){
            leftView(node.getLeft(), nextLevel);
        }
        if(node.getRight()!=null){
            leftView(node.getRight(),nextLevel);
        }
    }
}
