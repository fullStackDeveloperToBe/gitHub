package com.java.string;

public class Number {

    static boolean isPresent(int x, int d) {
        while(x>0) {
            if(x%10 == d)
                break;
            x=x/10;
        }
        return (x>0);
    }
    public static void main(String[] args) {
        int d = 1;
        for(int i=100;i<=200;i++) {
            if(i == d || isPresent(i, d)) {
                System.out.print(i+" ");
            }
        }
    }
}
