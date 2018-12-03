package com.learncode.tree;

public class BinaryTree<T extends Comparable> {
    Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void addData(T data){
        if(data==null) return;
        if(root==null){
            root = new Node<T>(data);
        }else{
            addData(root, data);
        }
    }

    public void addData(Node<T> node, T data){
        if(node!=null){
            if(node.getData().compareTo(data)<0){
                if(node.getLeft()!=null){
                    addData(node.getLeft(), data);
                }else{
                    node.setLeft(new Node<>(data));
                }
            }else{
                if(node.getRight()!=null){
                    addData(node.getRight(), data);
                }else{
                    node.setLeft(new Node<>(data));
                }
            }
        }
    }

    public void delete(T data){
        if(root==null)return;
        delete(root, data);
    }

    private void delete(Node<T> node, T data) {
        if(node!=null){
            if(node.getData().compareTo(data)<0){
                if(node.getLeft()!=null){
                    delete(node.getLeft(), data);
                }
            }else if(node.getData().compareTo(data)>0){
                if(node.getRight()!=null){
                    delete(node.getRight(), data);
                }
            }else{
                //todo
            }
        }
    }

    @Override
    public String toString() {
        if(root==null) return "";
        return root.toString();
    }
}
