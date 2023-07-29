package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {
    @Test
    public void bigmacBuilderTest(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Standard")
                .burgers(2)
                .sauce("Ketchup")
                .ingredients("Onions")
                .ingredients("Tomatoes")
                .build();

        String expectedBun = "Standard";
        String expectedSauce = "Ketchup";
        int expectedBurgerCount = 2;
        String expectedIngredient1 = "Onions";
        String expectedIngredient2 = "Tomatoes";

        //When & Then
        Assertions.assertEquals(expectedBun, bigmac.getBun());
        Assertions.assertEquals(expectedSauce, bigmac.getSauce());
        Assertions.assertEquals(expectedBurgerCount, bigmac.getBurgers());
        Assertions.assertTrue(bigmac.getIngredients().contains(expectedIngredient1));
        Assertions.assertTrue(bigmac.getIngredients().contains(expectedIngredient2));
    }
}
