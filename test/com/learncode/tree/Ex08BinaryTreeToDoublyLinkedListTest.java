package com.learncode.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex08BinaryTreeToDoublyLinkedListTest {

    @Test
    void dll() {
        Tree<Integer> tree = new Tree<>();
        Node root = tree.addRoot(10);
        Node twelve = tree.addToLeftOf(root, 12);
        Node fifteen = tree.addToRightOf(root, 15);
        Node three = tree.addToLeftOf(twelve, 25);
        Node four = tree.addToRightOf(twelve, 30);
        Node five = tree.addToLeftOf(fifteen, 36);
        Ex08BinaryTreeToDoublyLinkedList<Integer> test = new Ex08BinaryTreeToDoublyLinkedList<Integer>();
        String s = test.doublyLinkedListToString(test.dll(tree));
        assertEquals("25 12 30 10 36 15 ", s);
    }
}