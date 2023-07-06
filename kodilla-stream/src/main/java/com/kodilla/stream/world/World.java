package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Set;

public class World {
    private final Set<Continent> continentSet;

    public World(Set<Continent> continentSet) {
        this.continentSet = continentSet;
    }

    public BigDecimal getPeopleQuantity(){
        return continentSet.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .peek(System.out::println)
                .map(country -> country.getPeopleQuantity())
                .peek(System.out::println)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

    public Set<Continent> getContinentSet() {
        return continentSet;
    }

    @Override
    public String toString() {
        return "World{" +
                "continentSet=" + continentSet +
                '}';
    }
}
