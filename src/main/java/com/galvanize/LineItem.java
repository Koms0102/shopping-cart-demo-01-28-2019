package com.galvanize;

public class LineItem {

    private int qty = 0;
    private Item item = null;

    public LineItem(int qty, Item item) {
        this.qty = qty;
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "qty=" + qty +
                ", item=" + item +
                '}';
    }

    public Item getItem() {
        return item;
    }

}
