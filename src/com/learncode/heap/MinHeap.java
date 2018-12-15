package com.learncode.heap;

public class MinHeap {

    public int[] sort(int[] a){
        buildHeap(a);
        int n = a.length;
        for(int i = n-1;i>=0;i--){
            int t = a[0];
            a[0] = a[i];
            a[i] = t;
            heapify(a, i, 0);
        }
        return a;
    }

    private void buildHeap(int[] a) {
        int n = a.length;
        for(int i = n/2-1 ;i>=0;i--){
            heapify(a, n ,i);
        }
    }

    private void heapify(int[] a, int max, int i) {
        int smallest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if(l<max && a[l]<a[smallest]){
            smallest = l;
        }
        if(r<max && a[r]<a[smallest]){
            smallest = r;
        }

        if(smallest!=i){
            int t = a[smallest];
            a[smallest] = a[i];
            a[i] = t;
            heapify(a, max, smallest);
        }

    }
}
