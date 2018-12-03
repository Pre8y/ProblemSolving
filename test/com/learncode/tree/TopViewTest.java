package com.learncode.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopViewTest {

    @Test
    void topViewInorder() {
        Tree<Integer> tree = new Tree<>();
        Node root = tree.addRoot(10);
        Node twenty = tree.addToLeftOf(root, 20);
        Node thirty = tree.addToRightOf(root, 30);
        Node forty = tree.addToLeftOf(twenty, 40);
        Node sixty = tree.addToRightOf(twenty, 60);

        assertEquals("10 20 30 40 ", new TopView<Integer>().topViewInorder(tree));

    }
}