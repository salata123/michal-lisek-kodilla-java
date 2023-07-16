package com.kodilla.good.patterns.airlines;

import java.util.List;
import java.util.Objects;

public class Flight {
    private Airport originAirport;
    private List<Airport> intermediateAirports;
    private Airport destinationAirport;

    public Flight(Airport originAirport, List<Airport> intermediateAirports, Airport destinationAirport) {
        this.originAirport = originAirport;
        this.intermediateAirports = intermediateAirports;
        this.destinationAirport = destinationAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(originAirport, flight.originAirport) && Objects.equals(intermediateAirports, flight.intermediateAirports) && Objects.equals(destinationAirport, flight.destinationAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originAirport ,intermediateAirports, destinationAirport);
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    public Airport getOriginAirport() {
        return originAirport;
    }

    public List<Airport> getIntermediateAirports() {
        return intermediateAirports;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "originAirport=" + originAirport +
                ", intermediateAirports=" + intermediateAirports +
                ", destinationAirport=" + destinationAirport +
                '}';
    }
}
