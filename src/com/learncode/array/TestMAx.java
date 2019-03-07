package com.learncode.array;

public class TestMAx {
    public int max(int n, int[]a ){
      int expectedSum = 0;
      int start = 0;
      int end = n-1;
      while (start<end){
          int sum = a[start]+a[end];
          if(expectedSum!=sum){
              expectedSum = sum;
          }
          start++;
          end--;
          if(start==end)
          {
              return expectedSum-a[start];
          }
      }
      return -1;
    }
}
