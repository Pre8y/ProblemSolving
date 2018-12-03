package com.learncode.tree;

public class Ex06ConnectNode<T extends Comparable> {
    public String connect(Tree<T> tree){
        if(tree==null) return "";
        connectNodes(tree.getRoot());
        return levelOrderTraversalUsingNextRight(tree.getRoot());
    }

    private void connectNodes(Node<T> root) {
        root.setNextRight(null);
        Node<T> p = root;

        while(p!=null){
            Node<T> temp = p;
            while (temp!=null) {
                if (temp.getLeft() != null) {
                    if (temp.getRight() != null) {
                        temp.getLeft().setNextRight(temp.getRight());
                    } else {
                        temp.getLeft().setNextRight(getNextRight(temp));
                    }
                }
                if (temp.getRight() != null) {
                    temp.getRight().setNextRight(getNextRight(temp));
                }
            temp = temp.getNextRight();
            }
            if(p.getLeft()!=null){
                p=p.getLeft();
            }else if(p.getRight()!=null){
                p = p.getRight();
            }else{
                p = getNextRight(p);
            }
        }
    }

    private Node<T> getNextRight(Node<T> node) {
        Node temp = node.getNextRight();
        if(temp!=null){
            if(temp.getLeft()!=null) {
                return temp.getLeft();
            }
            if(temp.getRight()!=null){
                return temp.getRight();
            }

        }
        return null;
    }

    private String levelOrderTraversalUsingNextRight(Node<T> root){
        if(root==null) return "";
        StringBuilder str = new StringBuilder();
        Node<T> temp = root;
        while (temp!=null){
            str.append(temp.getData()+" ");
            Node p = temp;
            if(p.getNextRight()!=null) {
                while (p.getNextRight() != null) {
                    p = p.getNextRight();
                    str.append(p.getData()+" ");
                }
            }

            if(temp.getLeft()!=null){
                temp = temp.getLeft();
            }else if(temp.getRight()!=null){
                temp =  temp.getRight();
            }else{
                temp=null;
            }
        }
        return str.toString();
    }
}
