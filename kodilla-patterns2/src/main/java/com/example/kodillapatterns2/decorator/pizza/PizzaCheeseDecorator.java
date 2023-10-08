package com.example.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaCheeseDecorator extends AbstractPizzaOrderDecorator{
    public PizzaCheeseDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " + additional cheese";
    }
}
