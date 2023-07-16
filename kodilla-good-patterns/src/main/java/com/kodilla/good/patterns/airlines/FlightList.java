package com.kodilla.good.patterns.airlines;

import java.util.ArrayList;
import java.util.List;

public class FlightList {
    private ArrayList<Flight> flightList;
    private Flight flight1;
    private Flight flight2;
    private Flight flight3;

    public void addFlightsToList(AirportList airportList){
        flightList = new ArrayList<>();

        flightList.add(flightCreator1(airportList));
        flightList.add(flightCreator2(airportList));
        flightList.add(flightCreator3(airportList));
    }

    private Flight flightCreator1(AirportList airportList){
        List<Airport> flight1intermediateAirports = new ArrayList<>();
        flight1intermediateAirports.add(airportList.getAirportMap().get(2));

        flight1 = new Flight(airportList.getAirportMap().get(1), flight1intermediateAirports, airportList.getAirportMap().get(3));
        return flight1;
    }

    private Flight flightCreator2(AirportList airportList){
        List<Airport> flight1intermediateAirports = new ArrayList<>();
        flight1intermediateAirports.add(airportList.getAirportMap().get(5));

        flight2 = new Flight(airportList.getAirportMap().get(4), flight1intermediateAirports, airportList.getAirportMap().get(6));
        return flight2;
    }
    private Flight flightCreator3(AirportList airportList){
        List<Airport> flight1intermediateAirports = new ArrayList<>();
        flight1intermediateAirports.add(airportList.getAirportMap().get(8));

        flight3 = new Flight(airportList.getAirportMap().get(7), flight1intermediateAirports, airportList.getAirportMap().get(9));
        return flight3;
    }
    public Flight getFlight1() {
        return flight1;
    }

    public Flight getFlight2() {
        return flight2;
    }

    public Flight getFlight3() {
        return flight3;
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    @Override
    public String toString() {
        return "FlightList{" +
                "flight1=" + flight1 +
                ", flight2=" + flight2 +
                ", flight3=" + flight3 +
                ", flightList=" + flightList +
                '}';
    }
}