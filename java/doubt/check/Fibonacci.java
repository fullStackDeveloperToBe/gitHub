package com.java.doubt.check;

public class Fibonacci {

    static int fibonacci(int n) {
        if(n<=1)
            return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n = 4;
        for(int i=0;i<n;i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }
}
