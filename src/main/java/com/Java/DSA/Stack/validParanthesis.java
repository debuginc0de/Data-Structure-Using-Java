package com.Java.DSA.Stack;

import java.util.Stack;

public class validParanthesis {
    public static boolean isValid(String s){
        if(s.length()%2!=0){return false;}
        Stack<Character> st=new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') st.push(')');
            else if (ch == '{') st.push('}');
            else if (ch == '[') st.push(']');
                // For a closing bracket: check for match
            else if (st.isEmpty() || st.pop() != ch)return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));

    }
}
