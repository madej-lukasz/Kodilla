package com.kodilla.stream.world;

import java.math.BigInteger;

public final class Country {
    private BigInteger peopleQuantity;
    private String countryName;

    public Country(final BigInteger peopleQuantity, final String countryName) {
        this.peopleQuantity = peopleQuantity;
        this.countryName = countryName;
    }

    public BigInteger getPeopleQuantity() {
        return peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country = (Country) o;

        return peopleQuantity.equals(country.peopleQuantity);
    }


}
