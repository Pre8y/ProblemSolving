package com.learncode.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    @Test
    void test(){
        Tree<Integer> tree = new Tree<>();
        Node root = tree.addRoot(4);
        tree.addToLeftOf(root, 2);
        tree.addToRightOf(root, 5);
        assertEquals("[[2]][4][[5]]", tree.toString());
    }

}