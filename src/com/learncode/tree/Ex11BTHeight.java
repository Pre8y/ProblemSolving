package com.learncode.tree;

public class Ex11BTHeight {

    int getHeight(Tree tree){

        return getHeight(tree.getRoot());
    }

    private int getHeight(Node node) {
        if(node==null) return 0;
        int lHeight = getHeight(node.getLeft());
        int rHeight = getHeight(node.getRight());

        return lHeight>rHeight?lHeight+1:rHeight+1;
    }
}
