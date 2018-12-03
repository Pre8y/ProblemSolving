package com.learncode.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex02IsBinarySearchTreeTest {

    @Test
    void isBinaryTree() {
        Tree<Integer> tree = new Tree<>();
        Node root = tree.addRoot(4);
        Node two = tree.addToLeftOf(root, 2);
        Node five = tree.addToRightOf(root, 5);
        Node one = tree.addToLeftOf(two, 1);
        Node three = tree.addToRightOf(two, 3);
        assertEquals(true, new Ex02IsBinarySearchTree<Integer>().isBinaryTree(tree, Integer.MIN_VALUE, Integer.MAX_VALUE));

        Tree<Integer> tree1 = new Tree<>();
        Node root1 = tree1.addRoot(10);
        Node seven = tree1.addToLeftOf(root1, 7);
        Node thirtyNine = tree1.addToRightOf(root1, 39);
        Node eleven = tree1.addToRightOf(seven, 11);

        assertEquals(false, new Ex02IsBinarySearchTree<Integer>().isBinaryTree(tree1, Integer.MIN_VALUE, Integer.MAX_VALUE));

    }
}