package com.learncode.stack;

public class QueueFromStack {

    Stack stack1 = new Stack();
    Stack stack2 = new Stack();
    public void enQueue(char c){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(c);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

    }
    public char deQueue(){
        return stack1.pop();
    }
}
