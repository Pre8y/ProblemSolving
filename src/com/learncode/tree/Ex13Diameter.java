package com.learncode.tree;

public class Ex13Diameter {

    int getDiameter(Tree tree) {
        Res res = new Res();
        calculateDiameter(tree.getRoot(), res);
        return res.getVal();
    }

    private int calculateDiameter(Node node, Res res) {
        if(node==null) return 0;
        int lLen = calculateDiameter(node.getLeft(), res);
        int rLen = calculateDiameter(node.getRight(), res);

        int dia = rLen+lLen+1;
        res.setVal(dia>res.getVal()?dia:res.getVal());

        return (lLen>rLen?lLen:rLen)+1;
    }

    class Res {
        int val;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }
    }
}
