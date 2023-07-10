package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class OrderRepository {
    ArrayList<Order> orderList = new ArrayList<>();
    public void addOrder(Order order){
        orderList.add(order);
    }
}
