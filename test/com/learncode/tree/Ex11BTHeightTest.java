package com.learncode.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex11BTHeightTest {

    @Test
    void getHeight() {
        Tree<Integer> tree = new Tree<>();
        Node one = tree.addRoot(1);
        Node ten = tree.addToLeftOf(one, 10);
        Node thirtyNine = tree.addToRightOf(one, 39);
        Node five = tree.addToLeftOf(ten, 5);

        assertEquals(3, new Ex11BTHeight().getHeight(tree));

        Node six = tree.addToRightOf(thirtyNine, 6);
        Node seven = tree.addToLeftOf(six, 7);
        assertEquals(4, new Ex11BTHeight().getHeight(tree));

    }
}