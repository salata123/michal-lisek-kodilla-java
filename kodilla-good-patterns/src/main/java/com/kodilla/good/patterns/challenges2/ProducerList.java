package com.kodilla.good.patterns.challenges2;

import java.util.HashMap;

public class ProducerList {
    private HashMap<Integer, Producer> producersList;

    public void producerListPopulate(){
        producersList = new HashMap<>();

        Producer extraFoodShop = new Producer("ExtraFoodShop", "ExtraFoodShop@gmail.com");
        int extraFoodShopId = 111;

        Producer healthyShop = new Producer("HealthyShop", "HealthyShop@gmail.com");
        int healthyShopId = 222;

        Producer glutenFreeShop = new Producer("GlutenFreeShop", "GlutenFreeShop@gmail.com");
        int glutenFreeShopId = 333;

        producersList.put(extraFoodShopId, extraFoodShop);
        producersList.put(healthyShopId, healthyShop);
        producersList.put(glutenFreeShopId, glutenFreeShop);
    }

    public HashMap<Integer, Producer> getProducersList() {
        return producersList;
    }
}
