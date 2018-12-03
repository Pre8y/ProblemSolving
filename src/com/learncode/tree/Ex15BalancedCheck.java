package com.learncode.tree;

public class Ex15BalancedCheck {
    boolean isBalanced(Tree tree){
        return isBalanced(tree.getRoot());
    }

    private boolean isBalanced(Node node) {
        if(node==null) return true;
        int lHeight = height(node.getLeft());
        int rHeight = height(node.getRight());
        int diff = Math.abs(lHeight-rHeight);
        return diff<=1 && isBalanced(node.getLeft()) && isBalanced(node.getRight());
    }

    int height(Node node){
        if(node==null) return 0;
        return height(node.left)+height(node.right)+1;
    }
}
