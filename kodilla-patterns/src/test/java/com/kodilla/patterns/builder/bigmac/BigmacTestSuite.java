package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMac(){
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .setBun("Sezam")
                .setBurgers(1)
                .setIngredient("bekon")
                .setIngredient("cebula")
                .setSauce("standard")
                .build();
        System.out.println(bigMac);

        //When
        int howManyIngredients = bigMac.getIngredients().size();

        //Then
        Assert.assertEquals(2,howManyIngredients);
    }
}
