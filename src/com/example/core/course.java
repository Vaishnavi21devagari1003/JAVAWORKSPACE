package com.example.core;

public class course {
    int id;
    String title;

    public course(int id,String title){
        this.id=id;
        this.title=title;

    }
    public course(){
        System.out.println("THE COURSE IS CREATED");
    }

    public void show(){
        System.out.println("id: "+id+"  Title: "+title);
    }
}
