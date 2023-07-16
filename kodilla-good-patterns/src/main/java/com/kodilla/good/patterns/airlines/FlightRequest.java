package com.kodilla.good.patterns.airlines;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class FlightRequest {
    private UserOrder userOrder;
    private FlightList flightList;

    public FlightRequest(UserOrder userOrder, FlightList flightList) {
        this.userOrder = userOrder;
        this.flightList = flightList;
    }

    public FlightList getFlightList() {
        return flightList;
    }

    public UserOrder getUserOrder() {
        return userOrder;
    }
}
