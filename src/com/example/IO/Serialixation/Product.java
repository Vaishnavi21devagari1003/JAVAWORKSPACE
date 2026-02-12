//Seralization where the objects value have been converted into streambytes to store it for a long time.
//Deserialization whete the streambytes have been converted into the original values.

package com.example.IO.Serialixation;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private  String name;
    private transient int price; //transient where this value is not serialized

    public Product(){
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
