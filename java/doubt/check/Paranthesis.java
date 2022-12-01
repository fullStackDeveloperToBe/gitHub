package com.java.doubt.check;

import java.util.ArrayDeque;
import java.util.Stack;

public class Paranthesis {

    static boolean isEqual(String str) {
//        Stack<Character> ch = new Stack<>();
        ArrayDeque<Character> dq = new ArrayDeque<>();
        dq.addLast(str.charAt(0));
        for(int i =1; i< str.length();i++)

        {

            if(dq.isEmpty() && (str.charAt(i)=='}' || str.charAt(i)==']' || str.charAt(i)==')' )) // this can never be true

                return false;

            if(str.charAt(i)=='}' && !(dq.isEmpty()) && dq.getLast()=='{')

                dq.removeLast();

            else if(str.charAt(i)==']'  && !(dq.isEmpty())&&  dq.getLast()=='[')

                dq.removeLast();

            else if(str.charAt(i)==')' && !(dq.isEmpty()) && dq.getLast()=='(')

                dq.removeLast();

            else dq.addLast(str.charAt(i));

        }

        boolean retVal = (dq.size()==0)?true:false;
        return retVal;

    }
    public static void main(String[] args) {
        String str = "{([])}";
        System.out.println(isEqual(str));
    }
}
