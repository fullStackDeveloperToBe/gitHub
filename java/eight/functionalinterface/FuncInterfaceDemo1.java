package com.java.eight.functionalinterface;

@FunctionalInterface
interface FuncInterface {
    void work();
}
public class FuncInterfaceDemo1 implements FuncInterface{
    public static void main(String[] args) {
        FuncInterface fi = new FuncInterfaceDemo1();
        fi.work();
        for(int i=5;i>0;i++) {
            System.out.println("for"+i);
        }
    }

    @Override
    public void work() {
        System.out.println("Working");
    }
}
