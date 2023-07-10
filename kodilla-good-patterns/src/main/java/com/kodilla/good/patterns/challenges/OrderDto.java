package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private Order order;
    private boolean hasOpenOrder;

    public OrderDto(final Order order, final boolean hasOpenOrder){
        this.order = order;
        this.hasOpenOrder = hasOpenOrder;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isHasOpenOrder() {
        return hasOpenOrder;
    }
}
