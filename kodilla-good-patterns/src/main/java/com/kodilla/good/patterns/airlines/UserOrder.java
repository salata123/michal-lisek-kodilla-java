package com.kodilla.good.patterns.airlines;

public class UserOrder {
    private User user;
    private String airportCityName;

    public UserOrder(User user, String airportCityName) {
        this.user = user;
        this.airportCityName = airportCityName;
    }

    public User getUser() {
        return user;
    }

    public String getAirportCityName() {
        return airportCityName;
    }
}
