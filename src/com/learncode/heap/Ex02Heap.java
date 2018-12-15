package com.learncode.heap;

public class Ex02Heap {
    public int[] sort(int[] a){

        //build heap will return first element max
        buildHeap(a);
        int n = a.length;
        for(int i = n-1;i>=0;i--){
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            //heapify first element
            heapify(a, i, 0);
        }
        return a;
    }

    /*
    tree is complete binary tree, already in array but this is not heap
    so will create max heap first root element should be max
    will divide array and check first half
     */
    private void buildHeap(int[] a) {
        int n = a.length;
        for(int i = n/2-1;i>=0;i--){
            heapify(a, n, i);
        }
    }

    private void heapify(int[] a, int max, int i) {
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;

        if(l<max && a[l]<a[largest]){
            largest = l;
        }
        if(r<max && a[r]<a[largest]){
            largest = r;
        }

        if(largest!=i){
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            heapify(a, max, largest);
        }
    }
}
