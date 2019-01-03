package com.learncode.array;

public class SelectionSort {
    public void sort(int[] a){
        int l = a.length;
        int min = 0;
        for(int out = 0; out<l;out++){
            min = out;
            for(int in = out+1; in<l;in++){
                min = a[in]<a[min]?in:min;
            }
            if(min!=out)
            swap(a, min, out);
        }
    }

    private void swap(int[] a, int min, int out) {
        int t = a[min];
        a[min] = a[out];
        a[out] = t;
    }
}
