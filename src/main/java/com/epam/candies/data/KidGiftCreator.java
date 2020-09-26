package com.epam.candies.data;

import com.epam.candies.model.Candy;

import java.util.ArrayList;

public class KidGiftCreator {
    public ArrayList<Candy> createGift() {
        ArrayList<Candy> creator = new ArrayList<Candy>();
        creator.add(new Candy("Truffle", 50));
        creator.add(new Candy("Chocolate santa", 20.5));
        creator.add(new Candy("Toffee", 70));
        return creator;
    }
}
