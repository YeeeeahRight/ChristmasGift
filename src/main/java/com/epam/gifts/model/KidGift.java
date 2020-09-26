package com.epam.gifts.model;

import java.util.ArrayList;

public class KidGift {
    private ArrayList<Candy> candies;

    public KidGift() {
        candies = new ArrayList<Candy>();
    }

    public void fillGift(Candy... newCandies) {
        for (Candy candy : newCandies) {
            candies.add(candy);
        }
    }

    public ArrayList<Candy> getGift() {
        return candies;
    }
}
