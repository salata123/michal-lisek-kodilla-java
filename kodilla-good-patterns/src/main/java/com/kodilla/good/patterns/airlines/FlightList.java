package com.kodilla.good.patterns.airlines;

import java.util.ArrayList;

public class FlightList {

    private ArrayList<Airport> flight1;

    private void flight1(AirportList airportList){
        flight1 = new ArrayList<>();

        flight1.add(airportList.getAirportMap().get(1));
        flight1.add(airportList.getAirportMap().get(2));
        flight1.add(airportList.getAirportMap().get(3));
    }

    private void flight2(AirportList airportList){
        flight1 = new ArrayList<>();

        flight1.add(airportList.getAirportMap().get(4));
        flight1.add(airportList.getAirportMap().get(5));
        flight1.add(airportList.getAirportMap().get(6));
    }

    public ArrayList<Airport> getFlight1() {
        return flight1;
    }
}