package com.kodilla.exception.test;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Optional;

public class FlightFinder {
    public void findFlight(Flight flight){
        HashMap<String, Boolean> availableAirports = new HashMap<>();
        availableAirports.put("John F. Kennedy International Airport", true);
        availableAirports.put("Los Angeles International Airport", false);
        availableAirports.put("O'Hare International Airport", true);
        availableAirports.put("Dallas/Fort Worth International Airport", true);
        availableAirports.put("Denver International Airport", false);
        availableAirports.put("Hartsfield-Jackson Atlanta International Airport", true);
        availableAirports.put("San Francisco International Airport", true);
        availableAirports.put("McCarran International Airport", true);
        availableAirports.put("Seattle-Tacoma International Airport", false);
        availableAirports.put("Miami International Airport", true);
        availableAirports.put("Logan International Airport", true);
        availableAirports.put("Phoenix Sky Harbor International Airport", true);
        availableAirports.put("George Bush Intercontinental Airport", false);
        availableAirports.put("Orlando International Airport", true);
        availableAirports.put("Newark Liberty International Airport", true);
        availableAirports.put("Detroit Metropolitan Wayne County Airport", true);
        availableAirports.put("Minneapolis−Saint Paul International Airport", true);
        availableAirports.put("Charlotte Douglas International Airport", true);
        availableAirports.put("Philadelphia International Airport", true);
        availableAirports.put("LaGuardia Airport", false);
        try {
            if(availableAirports.get(flight.getDepartureAirport())){
                System.out.println(flight.getDepartureAirport() + " is available");
            } else {
                throw new RouteNotFoundException();
            }
        } catch (RouteNotFoundException e){
            System.out.println("Route not found: " + e);
        } finally {
            System.out.println(LocalDateTime.now());
        }

        try {
            if(availableAirports.get(flight.getArrivalAirport())){
                System.out.println(flight.getArrivalAirport() + " is available");
            } else {
                throw new RouteNotFoundException();
            }
        } catch (RouteNotFoundException e){
            System.out.println("Route not found: " + e);
        } finally {
            System.out.println(LocalDateTime.now());
        }
    }

    public static void main(String[] args){
        Flight flight = new Flight("LaGuardia Airport", "Philadelphia International Airport");
        FlightFinder flightFinder = new FlightFinder();

        Optional<Flight> optionalFlight = Optional.ofNullable(flight);

        flightFinder.findFlight(optionalFlight.orElse(new Flight("", "")));
    }
}
