package com.epam.gifts.model;

import java.util.ArrayList;
import java.util.Collections;

public class KidGift {
    private ArrayList<Candy> candies;

    public KidGift() {
        candies = new ArrayList<Candy>();
    }

    public void fillGift(Candy... newCandies) {
        Collections.addAll(candies, newCandies);
    }

    public ArrayList<Candy> getGift() {
        return candies;
    }
}
