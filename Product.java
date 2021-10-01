package com.company;

public class Product {

    private int id;
    private String name;
    private String brand;
    private int quantity;
    private int price;

    public Product(int id, String name, String brand, int quantity, int price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.quantity = quantity;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product " +
                "id =" + id +
                ", name = " + name + '\'' +
                ", brand = " + brand + '\'' +
                ", quantity = " + quantity +
                ", price = " + price;
    }
}
