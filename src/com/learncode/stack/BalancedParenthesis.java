package com.learncode.stack;

public class BalancedParenthesis {
    boolean isBalanced(String exp){
        boolean bal = false;
        Stack stack = new Stack();
        for(int i =0; i<exp.length();i++){
            char c = exp.charAt(i);
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else if(c==')'|| c=='}'||c==']'){
                char pop = stack.pop();
                if(pop == '(' && c==')'){
                    bal = true;
                }
                if(pop == '{' && c=='}'){
                    bal = true;
                }
                if(pop == '[' && c==']'){
                    bal = true;
                }
            }
        }
        if(!stack.isEmpty()) return false;
        return bal;
    }
}
