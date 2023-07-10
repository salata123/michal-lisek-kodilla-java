package com.kodilla.good.patterns.challenges;

public class Item {
    private final String itemName;
    private int stockQuantity;

    public Item(String itemName, int stockQuantity) {
        this.itemName = itemName;
        this.stockQuantity = stockQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
