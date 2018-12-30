package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.Set;

public final class World {
    private final Set<Continent> continents;

    public World(final Set<Continent> continents) {
        this.continents = continents;
    }

    public Set<Continent> getContinents() {
        return continents;
    }
    public BigInteger getPeopleQuantity () {
        return continents.stream()
                .flatMap(continent -> continent.getCountryAtContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigInteger.ZERO, (sum, currentCountryPeopleQuantity)->sum = sum.add(currentCountryPeopleQuantity));

    }
}
