package com.galvanize;

public class Item {

    private String upc;
    private String name;
    private float price;

    public Item(String upc, String name, float price) {
        this.upc = upc;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "upc='" + upc + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public float getPrice() {
        return price;
    }

}
