package com.learncode.array;

public class Ex17ZigZagArray {
    int[] zigZag(int[] a){
        boolean flag = true;//i+1 big

        for(int i=0;i<a.length-2;i++){
            if(flag){
                if(a[i+1]<a[i]){
                    swap(a, i, i+1);
                }
            }else{
                if(a[i+1]>a[i]){
                    swap(a, i, i+1);
                }
            }
            flag = !flag;
        }
        return a;
    }

    private void swap(int[] a, int i, int j) {
        int temp= a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
