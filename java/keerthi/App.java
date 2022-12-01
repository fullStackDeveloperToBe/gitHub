package com.java.keerthi;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception{
        List list = new ArrayList<>();
        list.add(0, "A");
        list.add(1, "B");
        list.add(1, "C");
        for(Object o:list) {
            System.out.print(" "+o);
        }
    }
}
