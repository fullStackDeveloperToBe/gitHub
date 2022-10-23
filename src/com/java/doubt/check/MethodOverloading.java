package com.java.doubt.check;

public class MethodOverloading {
    public static int add(int a, int b) {
        return a+b;
    }

    public static int add(int a, int b,int c) {
        return a+b+c;
    }

    public static float add(float a, float b) {
        return a+b;
    }

    public static String add(String str) {
        return str;
    }

    public static void main(String[] args) {
        System.out.println(add(12,23));
        System.out.println(add(12,23, 15));
        System.out.println(add(12.50f,23.50f));
        System.out.println(add("java"));
    }
}
