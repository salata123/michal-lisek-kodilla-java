package com.kodilla.good.patterns.challenges2;

import java.util.ArrayList;

public class OrderRepository {
    ArrayList<Order> orderList = new ArrayList<>();
    public void addOrder(Order order){
        orderList.add(order);
    }
}
