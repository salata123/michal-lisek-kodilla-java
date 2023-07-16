package com.kodilla.good.patterns.airlines;

import java.util.HashMap;

public class AirportList {

    private HashMap<Integer, Airport> airportMap;

    public void addAirports() {
        airportMap = new HashMap<>();

        airportMap.put(1, new Airport("Warsaw Chopin Airport", "Warsaw"));
        airportMap.put(2, new Airport("Kraków John Paul II International Airport", "Kraków"));
        airportMap.put(3, new Airport("Gdańsk Lech Wałęsa Airport", "Gdańsk"));
        airportMap.put(4, new Airport("Wrocław Nicolaus Copernicus Airport", "Wrocław"));
        airportMap.put(5, new Airport("Poznań-Ławica Henryk Wieniawski Airport", "Poznań"));
        airportMap.put(6, new Airport("Katowice Airport", "Katowice"));
        airportMap.put(7, new Airport("Łódź Władysław Reymont Airport", "Łódź"));
        airportMap.put(8, new Airport("Szczecin-Goleniów Solidarity Airport", "Szczecin"));
        airportMap.put(9, new Airport("Rzeszów-Jasionka Airport", "Rzeszów"));
        airportMap.put(10, new Airport("Bydgoszcz Ignacy Jan Paderewski Airport", "Bydgoszcz"));
    }

    public HashMap<Integer, Airport> getAirportMap() {
        return airportMap;
    }

    @Override
    public String toString() {
        return "AirportList{" +
                "airportMap=" + airportMap +
                '}';
    }
}
