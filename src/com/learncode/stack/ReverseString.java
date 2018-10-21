package com.learncode.stack;

public class ReverseString {
    String reverse(String string){
        char[] charArray = string.toCharArray();
        Stack stack = new Stack();
        for(char c: charArray){
            stack.push(c);
        }

        string = "";
        while(!stack.isEmpty()){
            string += stack.pop();
        }
        return string;
    }
}
