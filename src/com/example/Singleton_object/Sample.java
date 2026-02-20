package com.example.Singleton_object;

public class Sample {
    //Only one instance of the class is created and that instance is stored in a static variable.
    private static Sample x=new Sample();
    //private constructor to prevent instantiation from outside the class
    private Sample(){
    }
    //public static method to provide access to the instance
    public static Sample getSample()
    {
        return x;
    }

    public void show()
    {
        System.out.println("Showing");
    }

}
