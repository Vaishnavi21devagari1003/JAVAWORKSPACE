package com.example.OOPS.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map=new HashMap<>();
        map.put(37,"VAishu");
        map.put(100,"Harshiii");
        map.put(101,"Chinmayii");
        map.put(37,"Vaishuuuuu");
        System.out.println(map);

    }
}
