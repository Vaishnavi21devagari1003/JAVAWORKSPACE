package com.example.stream1;

public class Test {
    public static void main(String[] args) {
        Sample obj=new Sample();
        obj.setX(10);
        obj.incrementX();
        obj.show();

        //The stream as been used here where the entire code is written in a single line.
        new Sample().setX(100).incrementX().show();
    }
}
