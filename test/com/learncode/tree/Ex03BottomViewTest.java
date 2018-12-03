package com.learncode.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex03BottomViewTest {

    @Test
    void bottomView() {
        Tree<Integer> tree1 = new Tree<>();
        Node root1 = tree1.addRoot(0);
        Node one = tree1.addToLeftOf(root1, 1);
        Node two = tree1.addToRightOf(root1, 2);
        Node three = tree1.addToLeftOf(one, 3);
        Node four = tree1.addToRightOf(one, 4);
        Node five = tree1.addToLeftOf(two, 5);
        Node six = tree1.addToRightOf(two, 6);


        assertEquals("3 1 5 2 6 ", new Ex03BottomView<Integer>().bottomView(tree1));

       }
}