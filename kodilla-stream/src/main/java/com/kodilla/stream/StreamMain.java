package com.kodilla.stream;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class StreamMain {
    public static void main(String[] args) {
        Country bulgaria = new Country("Bulgaria", new BigDecimal("111111111111"));
        Country croatia = new Country("Croatia", new BigDecimal ("222222222222"));
        Country finland = new Country("Finland", new BigDecimal ("333333333333"));

        ArrayList<Country> europeanCountries = new ArrayList<>();
        europeanCountries.add(bulgaria);
        europeanCountries.add(croatia);
        europeanCountries.add(finland);

        Country nigeria = new Country("Nigeria", new BigDecimal ("111111111111"));
        Country egypt = new Country("Egypt", new BigDecimal ("222222222222"));
        Country southAfrica = new Country("South Africa", new BigDecimal ("333333333333"));

        ArrayList<Country> africanCountries = new ArrayList<>();
        africanCountries.add(nigeria);
        africanCountries.add(egypt);
        africanCountries.add(southAfrica);

        Continent africa = new Continent("Africa", africanCountries);
        Continent europe = new Continent("Europe", europeanCountries);

        Set<Continent> world = new HashSet<>();
        world.add(africa);
        world.add(europe);

        World worldPopulation = new World(world);
        System.out.println(worldPopulation.getPeopleQuantity());
    }
}