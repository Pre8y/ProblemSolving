package com.learncode.tree;

public class Ex14CountLeafNode {

    int getCount(Tree tree){
        return getCount(tree.getRoot());
    }

    private int getCount(Node node) {
        if(node==null) return 0;
        if(node.getLeft()==null&&node.getRight()==null) return 1;
        return getCount(node.getLeft())+getCount(node.getRight());
    }
}
