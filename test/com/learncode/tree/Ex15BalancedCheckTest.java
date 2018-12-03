package com.learncode.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex15BalancedCheckTest {

    @Test
    void isBalanced() {
        Tree tree = new Tree();

        Node root = tree.addRoot(0);
        Node l1 = tree.addToLeftOf(root, 1);
        Node r1 = tree.addToRightOf(root, 2);
        Node ll2 = tree.addToLeftOf(l1, 3);
        assertEquals(true, new Ex15BalancedCheck().isBalanced(tree));
        Node llr3 = tree.addToRightOf(ll2, 4);
        assertEquals(false, new Ex15BalancedCheck().isBalanced(tree));


    }
}