package com.learncode.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex10SymmetricTestTest {

    @Test
    void isSymmetric() {
        Tree<Integer> tree = new Tree<>();
        Node one = tree.addRoot(1);
        Node twoL = tree.addToLeftOf(one, 2);
        Node twoR = tree.addToRightOf(one, 2);

        Node threeL = tree.addToLeftOf(twoL, 3);
        Node fourR = tree.addToRightOf(twoL, 4);

        Node threeR = tree.addToRightOf(twoR, 3);
        Node fourL = tree.addToLeftOf(twoR, 4);

        assertEquals(true, new Ex10SymmetricTest<Integer>().isSymmetric(tree));

        Tree<Integer> tree1 = new Tree<>();
        Node one1 = tree1.addRoot(1);
        Node twoL1 = tree.addToLeftOf(one1, 2);
        Node twoR1 = tree.addToRightOf(one1, 2);
        Node threeL1 = tree.addToRightOf(twoL1, 3);
        Node threeR1 = tree.addToRightOf(twoR1, 3);

        assertEquals(false, new Ex10SymmetricTest<Integer>().isSymmetric(tree1));



    }
}