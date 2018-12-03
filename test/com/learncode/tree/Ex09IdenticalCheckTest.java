package com.learncode.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex09IdenticalCheckTest {

    @Test
    void isIdentical() {
        Tree<Integer> tree1 = new Tree<>();
        Node root1 = tree1.addRoot(0);
        Node one = tree1.addToLeftOf(root1, 1);
        Node two = tree1.addToRightOf(root1, 2);
        Node three = tree1.addToLeftOf(one, 3);
        Node four = tree1.addToRightOf(one, 4);
        Node five = tree1.addToLeftOf(two, 5);
        Node six = tree1.addToRightOf(two, 6);

        Tree<Integer> tree2 = new Tree<>();
        Node root2 = tree2.addRoot(0);
        Node one2 = tree2.addToLeftOf(root2, 1);
        Node two2 = tree2.addToRightOf(root2, 2);
        Node three2 = tree2.addToLeftOf(one2, 3);
        Node four2 = tree2.addToRightOf(one2, 4);
        Node five2 = tree2.addToLeftOf(two2, 5);
        Node six2 = tree2.addToRightOf(two2, 6);

        assertEquals(true, new Ex09IdenticalCheck<Integer>().isIdentical(tree1, tree2));
    }
}