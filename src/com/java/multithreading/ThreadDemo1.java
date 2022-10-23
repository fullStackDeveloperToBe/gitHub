package com.java.multithreading;

public class ThreadDemo1 extends Thread {

    public void run() {
        try {
            System.out.println("Thread name = "+currentThread().getName()+" with id = "+currentThread().getId());
        }
        catch (Exception e) {
            System.out.println("Exception is caught "+e);
        }
    }
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            ThreadDemo1 thread1 = new ThreadDemo1();
            thread1.start();
        }
    }
}
