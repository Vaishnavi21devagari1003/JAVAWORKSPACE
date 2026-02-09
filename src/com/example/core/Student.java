package com.example.core;


public class Student {
    int id;
    String name;
    String course;

    public Student(int id, String name, String course){
        this.id=id;
        this.name=name;
        this.course=course;
    }
//
//    public Student(){
//        System.out.println("THE STUDENT ID IS CREATED");
//    }

    public void show(){
        System.out.println("id: "+id+"  Name: "+name+"  course: "+course);
    }
}

