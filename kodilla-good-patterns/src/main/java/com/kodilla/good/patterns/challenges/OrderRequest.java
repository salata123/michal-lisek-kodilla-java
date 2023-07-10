package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private Order order;

    public OrderRequest(final Order order) {
        this.order = order;
    }

    public boolean isInStock(){
        return order.getItem().getStockQuantity() > order.getQuantity();
    }

    public Order getOrder() { return order; }
}
