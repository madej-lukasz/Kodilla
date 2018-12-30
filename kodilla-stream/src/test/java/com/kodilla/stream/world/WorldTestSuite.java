package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Set<Country> europeList = new HashSet<>();
        europeList.add(new Country(new BigInteger("40009894"), "Poland"));
        europeList.add(new Country(new BigInteger("405009894"), "Germany"));
        europeList.add(new Country(new BigInteger("4008709894"), "Spain"));
        europeList.add(new Country(new BigInteger("40002569894"), "Italy"));

        Continent europe = new Continent("Europe",europeList);
        Set<Continent> countryAtContinent = new HashSet<>();
        countryAtContinent.add(europe);
        World world = new World(countryAtContinent);

        //When

        BigInteger totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigInteger expected = new BigInteger("5498463");
        Assert.assertEquals(expected, totalPeopleQuantity);

    }

}
