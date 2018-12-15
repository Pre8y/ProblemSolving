package com.learncode.heap;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Ex01MedianInStream {

/*
maintain 2 priority queue max size difference should be 1
1 ascending order for higher elements
2 descending order for lower elements
eg 4- 5,15, 1, 3
lowers = 3, 1
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] a = new int[count];
        for (int i = 0; i < count; i++) {
            a[i] = scan.nextInt();
        }
        getMedian(a);

    }

    static void getMedian(int[] a) {
        int size = a.length;
        PriorityQueue<Integer> lowers = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> highers = new PriorityQueue<Integer>();
        for (int i = 0; i < size; i++) {
            add(a[i], lowers, highers);
            rebalance(lowers, highers);
            System.out.println(getMedian(lowers, highers));
        }

    }

    static void add(int a, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        if (lowers.size() == 0 || a < lowers.peek()) {
            lowers.add(a);
        } else {
            highers.add(a);
        }
    }

    static int getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> bigger = lowers.size() > highers.size() ? lowers : highers;
        PriorityQueue<Integer> smaller = lowers.size() > highers.size() ? highers : lowers;
        if (bigger.size() == smaller.size()) {
            return (bigger.peek() + smaller.peek()) / 2;
        } else {
            return bigger.peek();
        }

    }

    static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> bigger = lowers.size() > highers.size() ? lowers : highers;
        PriorityQueue<Integer> smaller = lowers.size() > highers.size() ? highers : lowers;
        if (bigger.size() - smaller.size() >= 2) {
            smaller.add(bigger.poll());
        }
    }
}

