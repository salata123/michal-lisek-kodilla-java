package com.kodilla.good.patterns.airlines;

import java.util.Objects;

public class Airport {
    private String airportName;
    private String airportCity;

    public Airport(String airportName, String airportCity) {
        this.airportName = airportName;
        this.airportCity = airportCity;
    }

    public String getAirportName() {
        return airportName;
    }

    public String getAirportCity() {
        return airportCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(airportName, airport.airportName) && Objects.equals(airportCity, airport.airportCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airportName, airportCity);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airportName='" + airportName + '\'' +
                ", airportCity='" + airportCity + '\'' +
                '}';
    }
}
