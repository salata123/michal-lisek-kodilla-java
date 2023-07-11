package com.kodilla.good.patterns.challenges2;

public class Order {
    private String firstName;
    private String secondName;
    private int quantity;
    private Item item;

    public Order(String firstName, String secondName, Item item, int quantity) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.item = item;
        this.quantity = quantity;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getQuantity() {
        return quantity;
    }

    public Item getItem() {
        return item;
    }
}
