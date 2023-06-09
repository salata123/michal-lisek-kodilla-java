package com.kodilla.stream.world;

import com.kodilla.stream.sand.Africa;
import com.kodilla.stream.sand.Asia;
import com.kodilla.stream.sand.Europe;
import com.kodilla.stream.sand.SandStorage;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
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

        //When
        World worldPopulation = new World(world);

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("1333333333332");
        assertEquals(expectedPeopleQuantity, worldPopulation.getPeopleQuantity());
    }

}
