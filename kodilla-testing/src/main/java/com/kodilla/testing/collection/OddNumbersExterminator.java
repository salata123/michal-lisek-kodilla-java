package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List <Integer> insertNumbers(int j, List<Integer> numbers){
        for (int i = 0; i < j; i++){
            numbers.add(i);
        }
        System.out.println("List of numbers: " + numbers);
        return numbers;
    }

    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) % 2 == 0){
                evenNumbers.add(i);
            }
        }
        System.out.println("List of even numbers: " + evenNumbers);
        return numbers;
    }






}
