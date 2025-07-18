package com.Java.DSA.Stack;

import java.sql.SQLOutput;
import java.util.Stack;

public class ReverseString {
    public static String isReverseString(String s){
        Stack<Character> stack=new Stack<>();
        int i=0;
        while(i<s.length()){
            stack.push(s.charAt(i));
            i++;
        }
        StringBuilder sb=new StringBuilder();
        while (!stack.isEmpty()){
            char ch=stack.pop();
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(isReverseString("Swastika Bose"));
    }
}
