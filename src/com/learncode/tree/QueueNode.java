package com.learncode.tree;

class QueueNode<T extends  Comparable> {
        int hd;
        Node<T> node;
        public QueueNode(Node<T> node, int hd) {
            this.hd = hd;
            this.node = node;
        }

        public void setHd(int hd) {
            this.hd = hd;
        }

        public int getHd() {
            return hd;
        }

        public Node<T> getNode() {
            return node;
        }
    }