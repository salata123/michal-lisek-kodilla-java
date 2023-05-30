package com.kodilla.testing;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;

import java.util.HashMap;
import java.util.Map;

public class TestingMain {

    public static void main(String[] args) {
/*
        OddNumbersExterminator firstTest = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        firstTest.exterminate(firstTest.insertNumbers(32, numbers));

        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square();
        Circle circle = new Circle();
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);

        System.out.println(shapeCollector.toString());
        System.out.println(square.toString() + circle.toString());
 */
        Temperatures temperatures = new Temperatures() {
            @Override
            public Map<String, Double> getTemperatures() {
                Map<String, Double> temperaturesMap = new HashMap<>();
                temperaturesMap.put("Rzeszow", 25.5);
                temperaturesMap.put("Krakow", 26.2);
                temperaturesMap.put("Wroclaw", 24.8);
                temperaturesMap.put("Warszawa", 25.2);
                temperaturesMap.put("Gdansk", 26.1);
                return temperaturesMap;
            }
        };

        WeatherForecast weatherForecast = new WeatherForecast(temperatures);
        weatherForecast.calculateMedianTemperature(temperatures);

        weatherForecast.calculateAverageTemperature(temperatures);


    }
}