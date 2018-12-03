package com.learncode.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevelOrderTraversalTest {

    @Test
    void traverse() {
        Tree<Integer> tree = new Tree<>();
        Node root = tree.addRoot(4);
        Node two = tree.addToLeftOf(root, 2);
        Node five = tree.addToRightOf(root, 5);
        Node one = tree.addToLeftOf(two, 1);
        Node three = tree.addToRightOf(two, 3);
        assertEquals("4 2 5 1 3 ", new LevelOrderTraversal<Integer>().traverse(tree));

    }
}