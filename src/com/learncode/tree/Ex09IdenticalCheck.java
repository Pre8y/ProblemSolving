package com.learncode.tree;

public class Ex09IdenticalCheck<T extends Comparable>{
    boolean isIdentical(Tree<T> tree1, Tree<T> tree2){

        return isIdentical(tree1.getRoot(), tree2.getRoot());
    }

    private boolean isIdentical(Node<T> node1, Node<T> node2) {

        if(node1==null && node2==null) return true;

        if(node1!=null && node2!=null){
            return node1.getData().equals(node2.getData()) && isIdentical(node1.getLeft(), node2.getLeft())
                    && isIdentical(node1.getRight(), node2.getRight());
        }
        return false;
    }
}
