package com.learncode.stack;

public class TwoStackInArray {
    int n = 100;
    char[] oneArray = new char[n];
    int tos1 = -1, tos2 = n;

    public void push1(char c){
        oneArray[++tos1] = c;
    }
    public char pop1(){
        if(tos1>-1) {
            return oneArray[tos1++];
        }else{
            throw  new ArrayIndexOutOfBoundsException();
        }
    }
    public void push2(char c){
        oneArray[--tos2] = c;
    }
    public char pop2(){
        if(tos2<n) {
            return oneArray[tos2++];
        }else{
            throw  new ArrayIndexOutOfBoundsException();
        }
    }
}
