package com.junitWork.testCases.com.ArrayHandler;

public class CarDetails {
    private String name;
    private String model;
    private int releaseYear;

    public CarDetails(String name, String model, int releaseYear) {
        this.name = name;
        this.model = model;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "CarDetails{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
