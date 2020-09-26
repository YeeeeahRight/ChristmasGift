package com.epam.candies.logic;

import com.epam.candies.exceptions.NullGiftException;
import com.epam.candies.model.Candy;
import com.epam.candies.model.KidGift;

public class CandyCalculator {

    private final static String NULL_GIFT_MESSAGE = "Gift is not created.";

    public double findGiftWeight(KidGift gift) throws NullGiftException {
        if (gift == null) {
            throw new NullGiftException(NULL_GIFT_MESSAGE);
        }
        double giftWeight = 0;
        for (Candy candy : gift.getGift()) {
            giftWeight += candy.getWeight();
        }
        return giftWeight;
    }
}
