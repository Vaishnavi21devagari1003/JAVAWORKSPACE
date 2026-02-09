package com.example.OOPS.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//when write operations are more use hashset.
public class SetExample {
    public static void main(String[] args) {
        Set<String> set1=new HashSet<>();
        set1.add("Vaishu");
        set1.add("Dhoni");
        set1.add("Harshi");
        set1.add("Chinmayi");
        System.out.println(set1);

//when read operations are more then TREESET(To have an organize data)
        Set<String> set2=new TreeSet();
        set2.add("Upasana");
        set2.add("David");
        set2.add("Virat");
        set2.add("Upasana");
        set2.add("Dhoni");
        set2.add("Sharma");
        System.out.println(set2);
    }
}
