package com.learncode.tree;

public class Ex12MaxPathSum {
    int getMaxPathSum(Tree<Integer> tree){
        Res res = new Res();
        calculateMaxPathSum(tree.getRoot(), res);
        return res.getMaxPathValue();
    }
    private int calculateMaxPathSum(Node<Integer> node, Res res) {
        if(node==null) return 0;
        int lSum = calculateMaxPathSum(node.left, res);
        int rSum = calculateMaxPathSum(node.right, res);

        int sum = lSum+node.getData()+rSum;
        res.setMaxPathValue(sum>res.getMaxPathValue()?sum:res.getMaxPathValue());

        return (lSum>rSum?lSum:rSum)+node.getData();
    }
    class Res{
        int maxPathValue;

        public int getMaxPathValue() {
            return maxPathValue;
        }

        public void setMaxPathValue(int maxPathValue) {
            this.maxPathValue = maxPathValue;
        }
    }
}
