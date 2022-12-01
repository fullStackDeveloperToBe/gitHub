package com.java.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"apple");
        map.put(2, "ball");
        map.put(3, "cat");
        //map.clear();
        System.out.println(map.keySet());
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey()+"->"+m.getValue());
        }
    }
}
