package com.example.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaOnionsDecorator extends AbstractPizzaOrderDecorator{
    public PizzaOnionsDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + onions";
    }
}
