package com.example;

public class Chocolates {
    private int id;
    private String Chocolate_name;

    public Chocolates(){
    }

    public Chocolates(int id, String chocolate_name) {
        this.id = id;
        Chocolate_name = chocolate_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChocolate_name() {
        return Chocolate_name;
    }

    public void setChocolate_name(String chocolate_name) {
        Chocolate_name = chocolate_name;
    }

    @Override
    public String toString() {
        return "Chocolates{" +
                "id=" + id +
                ", Chocolate_name='" + Chocolate_name + '\'' +
                '}';
    }
}
