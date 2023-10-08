package com.example.kodillapatterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
public class PizzaOrderTestSuite {

    @Test
    void testBuildingPizza(){
        //Given
        PizzaOrder pizzaOrder = new BasePizza();
        pizzaOrder = new PizzaBaconDecorator(pizzaOrder);
        pizzaOrder = new PizzaCheeseDecorator(pizzaOrder);
        pizzaOrder = new PizzaOnionsDecorator(pizzaOrder);

        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        String pizzaIngredients = pizzaOrder.getIngredients();

        //Then
        assertEquals(new BigDecimal(23), calculatedCost);
        assertEquals("Pizza dough with cheese and tomato sauce + bacon + additional cheese + onions", pizzaIngredients);
    }
}
