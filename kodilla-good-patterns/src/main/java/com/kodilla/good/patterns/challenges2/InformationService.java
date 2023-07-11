package com.kodilla.good.patterns.challenges2;

public class InformationService {
    public void inform(Order order){
        System.out.println("Thank You " + order.getFirstName() + " " + order.getSecondName() +
                " for purchasing " + order.getQuantity() + " pcs. of " + order.getItem().getItemName() + " from " + order.getItem().getProducer().getProducerName());
    }

    public void informOutOfStock(Order order){
        System.out.println("Sorry " + order.getFirstName() + " " + order.getSecondName() +
                ", but maximum quantity we have in stock for " + order.getItem().getItemName()+ " is " +
                order.getItem().getStockQuantity() + " pcs.");
    }
}
