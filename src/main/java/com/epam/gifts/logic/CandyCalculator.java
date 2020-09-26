package com.epam.gifts.logic;

import com.epam.gifts.exceptions.NullGiftException;
import com.epam.gifts.model.Candy;
import com.epam.gifts.model.KidGift;

public class CandyCalculator {

    private final static String NULL_GIFT_MESSAGE = "Gift is not created.";

    public int findGiftWeight(KidGift gift) throws NullGiftException {
        if (gift == null) {
            throw new NullGiftException(NULL_GIFT_MESSAGE);
        }
        int giftWeight = 0;
        for (Candy candy : gift.getGift()) {
            giftWeight += candy.getWeight();
        }
        return giftWeight;
    }
}
