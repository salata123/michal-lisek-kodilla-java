package com.kodilla.good.patterns.airlines;

import java.util.List;
import java.util.stream.Collectors;

public class FlightProcessor {
    public List<Flight> findFlightsFromCity(FlightList flightList, UserOrder userOrder) {
        return flightList.getFlightList().stream()
                .filter(flight -> flight.getOriginAirport().getAirportCity().equals(userOrder.getAirportCityName()))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsToCity(FlightList flightList, UserOrder userOrder) {
        return flightList.getFlightList().stream()
                .filter(flight -> flight.getDestinationAirport().getAirportCity().equals(userOrder.getAirportCityName()))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsWithIntermediateCity(FlightList flightList, UserOrder userOrder){
        return flightList.getFlightList().stream()
                .filter(flight -> flight.getIntermediateAirports().stream()
                        .anyMatch(airport -> airport.getAirportCity().equals(userOrder.getAirportCityName())))
                .collect(Collectors.toList());

    }
}
