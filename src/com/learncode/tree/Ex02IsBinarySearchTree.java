package com.learncode.tree;

public class Ex02IsBinarySearchTree<T extends Comparable> {
    public boolean isBinaryTree(Tree<T> tree, T min, T max) {
        Node root = tree.getRoot();
        if (root == null) return true;
//        return isBinaryTree(root, min, max);
        return isBST(root);
    }

    /*
    wrong method
     */
    private boolean isBinaryTreeWrong(Node node) {

        if (node == null) return true;
        if (node.getLeft() != null && node.getLeft().getData().compareTo(node.getData()) >= 0) {
            return false;
        }
        if (node.getRight() != null && node.getRight().getData().compareTo(node.getData()) < 0) {
            return false;
        }
        return isBinaryTreeWrong(node.getLeft()) && isBinaryTreeWrong(node.getRight());
    }

    private boolean isBinaryTree(Node<T> node, T min, T max) {

        if (node == null) return true;
        if (node.getData().compareTo(min) < 0 || node.getData().compareTo(max) > 0) {
            return false;
        }
        return isBinaryTree(node.getLeft(), min, node.getData()) && isBinaryTree(node.getRight(), node.getData(), max);
    }

    Node<T> prev = null;

    //  inorder traversal is sorted or not prev should be less than current
    private boolean isBST(Node<T> node) {
        if (node == null) return true;
        if (!isBST(node.getLeft())) {
            return false;
        }
        if (prev != null && prev.getData().compareTo(node.getData()) > 0) {
            return false;

        }
        prev = node;
        if (!isBST(node.getRight())) {
            return false;
        }
        return true;

    }
}
