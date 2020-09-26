package com.epam.candies.model;

import java.util.ArrayList;

public class KidGift {
    private ArrayList<Candy> candies;

    public KidGift() {
        candies = new ArrayList<Candy>();
    }

    public void fillGift(ArrayList<Candy> candies) {
        this.candies = candies;
    }

    public void addCandy(Candy candy) {
        candies.add(candy);
    }

    public ArrayList<Candy> getGift() {
        return candies;
    }
}
