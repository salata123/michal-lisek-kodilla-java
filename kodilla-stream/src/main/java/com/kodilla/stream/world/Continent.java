package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Continent {
    private final String continentName;

    private final ArrayList<Country> countryList;

    public Continent(String continentName, ArrayList<Country> countryList) {
        this.continentName = continentName;
        this.countryList = countryList;
    }

    public String getContinentName() {
        return continentName;
    }

    public ArrayList<Country> getCountryList() {
        return countryList;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", countryList=" + countryList +
                '}';
    }
}
