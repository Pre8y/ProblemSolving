package com.learncode.stack;

public class Stack {
    Character[] stack;
    int[] a = new int[100];
    int tos = -1;

    public Stack() {
        stack = new Character[100];
    }
    public void push(char c){
        stack[++tos] = c;
    }
    public char pop(){
        if(tos>-1) {
            return stack[tos--];
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public boolean isEmpty() {
        return tos==-1;
    }
}
