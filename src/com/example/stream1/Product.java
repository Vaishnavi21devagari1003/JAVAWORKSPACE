package com.example.stream1;

public class Product {
    public int prodId;
    public String name;
    public float price;

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", brand='" + brand + '\'' +
                ", deliveryCharges=" + deliveryCharges +
                '}';
    }

    public int quantity;
    public String brand;
    public float deliveryCharges;

    public Product(int prodId, String name, float price, int quantity, String brand, float deliveryCharges) {
        super();
        this.prodId = prodId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
        this.deliveryCharges = deliveryCharges;
    }
}
