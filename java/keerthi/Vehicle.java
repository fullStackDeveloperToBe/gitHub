package com.java.keerthi;

public class Vehicle {
    static class Car {
        public void go() {
            System.out.println("car ig");
        }
    }

    static class ElecCar extends Car {
        public void go() {
            System.out.println(" ele car ig");
        }
    }

    static class Pet extends Car {
        public void go() {
            System.out.println("pet car ig");
        }
    }

    public static void main(String[] args) {
        Car c = new ElecCar();
        c.go();
    }
}
