package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<LineItem> lineItems = new ArrayList<LineItem>();

    public boolean isEmpty() {
        return lineItems.isEmpty();
    }

    public void addItem(int i, Item item) {
        this.lineItems.add(new LineItem(i, item));
    }

    public int getCartQty() {
        int qty = 0;

        for(LineItem lineItem : lineItems){
            qty += lineItem.getQty();
        }

        return qty;
    }

    public float getTotalPrice() {
        float totalPrice = 0.0f;

        for(LineItem lineItem : lineItems){
            totalPrice += lineItem.getQty() * lineItem.getItem().getPrice();
        }

        return totalPrice;
    }

    public void printItems() {
        for(LineItem lineItem : lineItems){
            System.out.println(lineItem);
        }
    }

}
