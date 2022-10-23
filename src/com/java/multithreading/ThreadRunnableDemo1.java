package com.java.multithreading;

import static java.lang.Thread.currentThread;

public class ThreadRunnableDemo1 implements Runnable{
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
//            ThreadRunnableDemo1 runnable = new ThreadRunnableDemo1();
//            Thread t = new Thread(runnable);


            Thread t = new Thread(new ThreadRunnableDemo1());
            t.start();
        }
    }
}
