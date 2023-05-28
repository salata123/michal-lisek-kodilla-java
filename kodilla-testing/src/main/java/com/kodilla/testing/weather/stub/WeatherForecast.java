package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }

        return resultMap;
    }

    public double calculateAverageTemperature(Temperatures temperatures){
        ArrayList<Double> temperatureData = new ArrayList<>(temperatures.getTemperatures().values());
        double average;
        double sum = 0;

        for(int i = 0; i < temperatureData.size(); i++){
            sum += temperatureData.get(i);
        }
        average = sum / temperatures.getTemperatures().size();
        System.out.println(average);
        return average;
    }

    public double calculateMedianTemperature(Temperatures temperatures){
        ArrayList<Double> temperatureData = new ArrayList<>(temperatures.getTemperatures().values());
        double median;
        Collections.sort(temperatureData);

        if (temperatureData.size() % 2 == 0){
            median = (temperatureData.get(temperatureData.size() / 2) + temperatureData.get((temperatureData.size() / 2) - 1 )) / 2;
            System.out.println(median);
            return median;
        } else {
            median = temperatureData.get(temperatureData.size() / 2);
            System.out.println(median);
            return median;
        }
    }


}