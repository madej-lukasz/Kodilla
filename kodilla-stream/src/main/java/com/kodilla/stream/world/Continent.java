package com.kodilla.stream.world;

import java.util.Set;

public final class Continent {
    private final String continentName;
    private final Set<Country> countryAtContinent;

    public Continent(final String continentName, final Set<Country> countryAtContinent) {
        this.continentName = continentName;
        this.countryAtContinent = countryAtContinent;
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getCountryAtContinent() {
        return countryAtContinent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;

        Continent continent = (Continent) o;

        return continentName.equals(continent.continentName);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
