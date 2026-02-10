package com.example.StringConcepts;

public class StringExample {
    public static void main(String[] args) {
        String name="Vaishu";
        name="Hello"+name;
        System.out.println(name);

        StringBuilder str=new StringBuilder();
        str.append("GOOD MORNING");
        System.out.println(str);
        str.replace(4,7,"VAISH");
        System.out.println(str);
        System.out.println(str.reverse());
    }
}
