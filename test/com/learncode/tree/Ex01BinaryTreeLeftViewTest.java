package com.learncode.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex01BinaryTreeLeftViewTest {

    @Test
    void leftView() {
//        Tree<Integer> tree = new Tree<>();
//        Node root = tree.addRoot(1);
//        Node two = tree.addToLeftOf(root, 2);
//        Node three = tree.addToRightOf(root, 3);
//        Node four = tree.addToLeftOf(two, 4);
//        Node five = tree.addToRightOf(two, 5);
//        tree.addToLeftOf(three, 6);
//        tree.addToRightOf(three, 7);
//        tree.addToRightOf(four, 8);
//
//        assertEquals("1 2 4 8 ", new Ex01BinaryTreeLeftView<Integer>().leftView(tree));
        Tree<Integer> tree = new Tree<>();
        Node root = tree.addRoot(1);
        Node two = tree.addToLeftOf(root, 2);
        Node three = tree.addToRightOf(root, 3);
        Node four = tree.addToLeftOf(two, 4);
        Node five = tree.addToRightOf(two, 5);
        tree.addToLeftOf(five, 6);

        assertEquals("1 2 4 6 ", new Ex01BinaryTreeLeftView<Integer>().leftView(tree));

    }
}