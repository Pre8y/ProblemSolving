package com.learncode.tree;

public class Ex10SymmetricTest<T extends Comparable> {

    boolean isSymmetric(Tree<T> tree){
        return isSymmetric(tree.getRoot(), tree.getRoot());
    }

    private boolean isSymmetric(Node<T> node1, Node<T> node2) {

        if(node1==null && node2==null) return true;

        if(node1!=null && node2!=null &&  node1.getData().equals(node2.getData())) {
            return isSymmetric(node1.getLeft(), node2.getRight())
                    && isSymmetric(node1.getRight(), node2.getLeft());
        }
        return false;

    }
}
