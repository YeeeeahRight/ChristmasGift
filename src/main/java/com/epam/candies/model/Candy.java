package com.epam.candies.model;


public class Candy {
    private final String name;
    private final double weight;

    public Candy(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
