package com.java.func;

import java.util.Comparator;

public class PriceComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        if(c1.getPrice()==c2.getPrice())
            return 0;
        else if(c1.getPrice()>c2.getPrice()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
