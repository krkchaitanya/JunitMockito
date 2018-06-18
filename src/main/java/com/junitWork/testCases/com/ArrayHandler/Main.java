package com.junitWork.testCases.com.ArrayHandler;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CarDetails> cars = new ArrayList<CarDetails>();
        CarDetails car1 = new CarDetails("Suziki", "baleno", 2016);
        CarDetails car2 = new CarDetails("Maruti Suziki", "swift", 2012);
        CarDetails car3 = new CarDetails("Hundai", "i20", 2010);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        for (CarDetails carinfo : cars) {
            System.out.println("Car details gonna be.." + carinfo);
        }
    }
}