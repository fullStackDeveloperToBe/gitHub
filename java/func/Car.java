package com.java.func;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Car implements Comparable<Car> {
    String name;
    int model;
    int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(String name, int model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    @Override
    public int compareTo(Car c) {
        if(model==c.model)
        return 0;
        else if(model>c.model) {
            return 1;
        }
        else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model=" + model +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        List<Car> car = new ArrayList<Car>();
        Car c0 = new Car("Creta", 2022, 1800000);
        Car c1 = new Car("Swift", 2020, 700000);
        Car c2 = new Car("Baleno", 2022, 800000);
        Car c3 = new Car("Nexon", 2021, 1200000);
        car.add(c0);
        car.add(c1);
        car.add(c2);
        car.add(c3);
        //Collections.sort(car);
        //Collections.sort(car, new PriceComparator());
        Collections.sort(car, new NameComparator());
        System.out.print(car.toString());
    }
}
