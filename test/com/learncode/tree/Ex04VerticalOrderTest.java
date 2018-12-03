package com.learncode.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex04VerticalOrderTest {

    @Test
    void verticalOrder() {
        Tree<Integer> tree = new Tree<>();
        Node root = tree.addRoot(1);
        Node two = tree.addToLeftOf(root,2);
        Node three = tree.addToRightOf(root,3);
        Node five = tree.addToLeftOf(three,5);
        assertEquals("2 1 5 3 ", new Ex04VerticalOrder<Integer>().verticalOrder(tree));
    }
}