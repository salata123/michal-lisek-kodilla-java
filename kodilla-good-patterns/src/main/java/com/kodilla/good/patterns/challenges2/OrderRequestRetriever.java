package com.kodilla.good.patterns.challenges2;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        ProducerList producerList = new ProducerList();
        producerList.producerListPopulate();
        Item chocolate = new Item("Chocolate", 3, producerList.getProducersList().get(222));
        Order order = new Order("John", "Wekl", chocolate, 2);
        return new OrderRequest(order);
    }
}
