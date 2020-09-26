package com.epam.candies.data;

import com.epam.candies.model.Candy;
import com.epam.candies.model.KidGift;

import java.util.ArrayList;

public class KidGiftFactory {
    public KidGift createGift() {
        ArrayList<Candy> candies = new ArrayList<Candy>();
        candies.add(new Candy("Truffle", 50));
        candies.add(new Candy("Chocolate santa", 20.5));
        candies.add(new Candy("Toffee", 70));
        KidGift gift = new KidGift();
        gift.fillGift(candies);
        return gift;
    }
}
