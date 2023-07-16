package com.kodilla.good.patterns;

import com.kodilla.good.patterns.airlines.FlightList;
import com.kodilla.good.patterns.airlines.FlightProcessor;
import com.kodilla.good.patterns.airlines.FlightRequest;
import com.kodilla.good.patterns.airlines.FlightRequestRetriever;
import com.kodilla.good.patterns.challenges2.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaGoodPatternsApplication {

	public static void main(String[] args) {
		FlightRequestRetriever flightRequestRetriever = new FlightRequestRetriever();
		FlightRequest flightRequest = flightRequestRetriever.retrieve();

		FlightProcessor flightProcessor = new FlightProcessor();
		System.out.println(flightProcessor.findFlightsToCity(flightRequest.getFlightList(), flightRequest.getUserOrder()));

		FlightRequest flightRequest2 = flightRequestRetriever.retrieve2();
		System.out.println(flightProcessor.findFlightsFromCity(flightRequest2.getFlightList(), flightRequest2.getUserOrder()));

		FlightRequest flightRequest3 = flightRequestRetriever.retrieve3();
		System.out.println(flightProcessor.findFlightsWithIntermediateCity(flightRequest3.getFlightList(), flightRequest3.getUserOrder()));
	}
}
