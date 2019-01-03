package com.learncode.array;

public class BubbleSort {
    public void sort(int[] a){
        int l = a.length;
        for(int out = l-1;out>0;out--){
            for(int in = 0; in<out;in++){
                if(a[in]>a[in+1]){
                    swap(a, in, in+1);
                }
            }
        }
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
