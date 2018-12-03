package com.learncode.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex13DiameterTest {

    @Test
    void getDiameter() {
        Tree tree = new Tree();

        Node root = tree.addRoot(0);
        Node l1 = tree.addToLeftOf(root, 1);
        Node r1 = tree.addToRightOf(root, 2);


        Node ll2 = tree.addToLeftOf(l1, 3);
        Node lr2 = tree.addToRightOf(l1, 4);
        Node rr2 = tree.addToRightOf(r1, 5);


        Node lll3 = tree.addToLeftOf(ll2, 6);
        Node llr3 = tree.addToRightOf(ll2, 7);

        Node lrr3 = tree.addToLeftOf(lr2, 8);

        Node llrl4 = tree.addToLeftOf(llr3, 9);
        Node lrrl4 = tree.addToLeftOf(lrr3, 10);
        Node lrrr4 = tree.addToRightOf(lrr3, 11);

        Node llrll5 = tree.addToLeftOf(llrl4, 12);
        Node llrlr5 = tree.addToRightOf(llrl4, 13);
        Node lrrrr5 = tree.addToRightOf(lrrr4, 14);

        assertEquals(9 , new Ex13Diameter().getDiameter(tree));
    }
}