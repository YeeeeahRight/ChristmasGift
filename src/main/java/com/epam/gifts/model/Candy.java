package com.epam.gifts.model;


public class Candy {
    private String name;
    private int weight;

    public Candy(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
