package com.learncode.dynamic_programming;

public class Fibonacci {

    int getNthFibonacciNumber(int n){
        int[] fib = new int[n];
        fib[0] = 1;
        fib[1] = 1;
        for(int i = 2; i<n;i++){
            fib[i] = fib[i-1]+fib[i-2];
        }
        return fib[n-1];
    }
}
