package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Item chocolate = new Item("Chocolate", 3);
        Order order = new Order("John", "Wekl", chocolate, 2);
        return new OrderRequest(order);
    }
}
