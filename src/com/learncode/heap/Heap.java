package com.learncode.heap;

import java.util.Arrays;

public class Heap {
    int MAX = 10;
    int[] heap = new int[MAX];
    int currentSize = 0;
    public void insert(int a){
        ensureCapacity();
        int index = currentSize;
        heap[index] = a;
        currentSize++;

        for(int i=currentSize-1;i>=0;i--){
            int t = heap[0];
            heap[0] = heap[i];
            heap[i] = t;
            heapify(heap, currentSize, 0);
        }
    }
    public void delete(int i){
        int a = heap[i];
        heap[i] = heap[--currentSize];
        heapify(heap, currentSize, i);
    }
    public int getMin(){
        if(currentSize==0) return -1;
        int a = heap[0];
        heap[0] = heap[--currentSize];
        heapify(heap, currentSize, 0);
        return a;
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
            int t = a[largest];
            a[largest] = a[i];
            a[i] = t;
            heapify(a, max, i);
        }
    }

    private void ensureCapacity() {
        if(currentSize>=MAX){
            MAX = 2*MAX;
            heap = Arrays.copyOf(heap, MAX);
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for(int i=0; i<currentSize;i++){
            str.append(heap[i]+" ");
        }
        return str.toString();
    }
}
