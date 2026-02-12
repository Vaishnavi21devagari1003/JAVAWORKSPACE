package com.example.IO.Serialixation;

import java.io.*;

public class ObjectSerializationExample {
    public static void main(String[] args) {
        try {
            Product p1=new Product(100,"TV",2000);
            FileOutputStream fos=new FileOutputStream("myobject.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);

            FileInputStream fis=new FileInputStream("myobject.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);

            oos.writeObject(p1);
            System.out.println("Object is serialized");
            System.out.println("STrat deser....");
            Product prod=(Product)ois.readObject();
            System.out.println(prod);

        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
