package com.learncode.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex12MaxPathSumTest {

    @Test
    void getMaxPathSum() {
        Tree<Integer> tree = new Tree<>();

        Node n_minus_15 = tree.addRoot(-15);
        Node n_5 = tree.addToLeftOf(n_minus_15, 5);
        Node n_6 = tree.addToRightOf(n_minus_15, 6);

        Node n_minus_8 = tree.addToLeftOf(n_5, -8);
        Node n_1 = tree.addToRightOf(n_5, 1);

        Node n_3 = tree.addToLeftOf(n_6, 3);
        Node n_9 = tree.addToRightOf(n_6, 9);

        Node n_2 = tree.addToLeftOf(n_minus_8, 2);
        Node n_6l = tree.addToRightOf(n_minus_8, 6);

        Node n_0 = tree.addToRightOf(n_9, 0);

        Node n_4 = tree.addToLeftOf(n_0, 4);
        Node n_minus_1 = tree.addToRightOf(n_0, -1);

        Node n_10 = tree.addToLeftOf(n_minus_1, 10);

        assertEquals(27, new Ex12MaxPathSum().getMaxPathSum(tree));

    }
}