package com.example.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasePizza implements PizzaOrder{
    @Override
    public BigDecimal getCost(){
        return new BigDecimal(15);
    }

    @Override
    public String getIngredients(){
        return "Pizza dough with cheese and tomato sauce";
    }
}
