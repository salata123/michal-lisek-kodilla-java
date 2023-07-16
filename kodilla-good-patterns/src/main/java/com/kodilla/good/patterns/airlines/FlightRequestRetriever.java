package com.kodilla.good.patterns.airlines;

public class FlightRequestRetriever {
    public FlightRequest retrieve(){
        AirportList airportList = new AirportList();
        airportList.addAirports();
        FlightList flightList = new FlightList();
        flightList.addFlightsToList(airportList);
        User user1 = new User("John", "Smith");
        UserOrder userOrder = new UserOrder(user1, "Gdańsk");
        return new FlightRequest(userOrder, flightList);
    }
    public FlightRequest retrieve2(){
        AirportList airportList = new AirportList();
        airportList.addAirports();
        FlightList flightList = new FlightList();
        flightList.addFlightsToList(airportList);
        User user2 = new User("Alice", "Black");
        UserOrder userOrder2 = new UserOrder(user2, "Wrocław");
        return new FlightRequest(userOrder2, flightList);
    }
    public FlightRequest retrieve3(){
        AirportList airportList = new AirportList();
        airportList.addAirports();
        FlightList flightList = new FlightList();
        flightList.addFlightsToList(airportList);
        User user3 = new User("Michael", "Ball");
        UserOrder userOrder3 = new UserOrder(user3, "Szczecin");
        return new FlightRequest(userOrder3, flightList);
    }

}
