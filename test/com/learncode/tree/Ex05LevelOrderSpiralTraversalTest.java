package com.learncode.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex05LevelOrderSpiralTraversalTest {

    @Test
    void traverse() {
        Tree<Integer> tree = new Tree<>();
        Node root = tree.addRoot(4);
        Node two = tree.addToLeftOf(root, 2);
        Node five = tree.addToRightOf(root, 5);
        Node one = tree.addToLeftOf(two, 1);
        Node three = tree.addToRightOf(two, 3);
        Node six = tree.addToLeftOf(five, 6);
        Node seven = tree.addToRightOf(five, 7);
        assertEquals("4 2 5 7 6 3 1 ", new Ex05LevelOrderSpiralTraversal<Integer>().traverse(tree));


    }
}