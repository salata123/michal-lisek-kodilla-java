package com.kodilla.good.patterns.challenges2;

public class Item {
    private final String itemName;
    private int stockQuantity;
    private Producer producer;

    public Item(String itemName, int stockQuantity, Producer producer) {
        this.itemName = itemName;
        this.stockQuantity = stockQuantity;
        this.producer = producer;
    }

    public Producer getProducer() {
        return producer;
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
