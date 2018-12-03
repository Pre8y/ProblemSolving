package com.learncode.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex06ConnectNodeTest {

    @Test
    void connect() {
        Tree<Character> tree = new Tree<>();
        Node a = tree.addRoot('A');
        Node b = tree.addToLeftOf(a, 'B');
        Node c = tree.addToRightOf(a, 'C');
        Node d = tree.addToLeftOf(b, 'D');
        Node e = tree.addToRightOf(b, 'E');
        Node f = tree.addToRightOf(c, 'F');

        assertEquals("A B C D E F ", new Ex06ConnectNode<Character>().connect(tree));

    }
}