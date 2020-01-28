package com.galvanize;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingCartTest {
    ShoppingCart cart;

    @Before
    public void setUp() throws Exception {
        cart = new ShoppingCart();
    }

    //    can create a new cart
    @Test
    public void canCreateNewCart() {
        assertTrue(cart != null);
    }

//    cart should be empty before the customer places anything into it.
    @Test
    public void newCartIsEmpty() {
        assertTrue(cart.isEmpty());
    }

//    can an item to the cart with the upc, name, quantity and price
    @Test
    public void cartAddItemWithArgs() {
        Item item = new Item("aa123", "widget", 11.99f);
        cart.addItem(6, item);

        assertFalse(cart.isEmpty());
    }

    @Test
    public void canAddMoreThanOneItem() {
        Item item = new Item("aa123", "widget", 11.99f);
        cart.addItem(1, item);
        Item item2 = new Item("aa124", "stuff", 3.00f);
        cart.addItem(1, item2);

        assertEquals(2, cart.getCartQty());

    }

    //    can calculate the price of items in their cart

    @Test
    public void canGetTotalPriceWithTwoItems() {
        Item item = new Item("aa123", "widget", 11.10f);
        cart.addItem(1, item);
        Item item2 = new Item("aa124", "stuff", 3.00f);
        cart.addItem(3, item2);

        assertEquals(20.10f, cart.getTotalPrice(), 2);

    }

//    can display the items in the cart

    @Test
    public void canDisplayItems() {
        Item item = new Item("aa123", "widget", 11.10f);
        cart.addItem(1, item);
        Item item2 = new Item("aa124", "stuff", 3.00f);
        cart.addItem(3, item2);

        cart.printItems();
    }
}
