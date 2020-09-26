package com.epam.gifts.view;

public class ConsoleGiftWeightPrinter implements GiftWeightPrinter {

    private final static String GIFT_WEIGHT_MESSAGE = "The total weight of christmas gift: ";

    public void print(int giftWeight) {
        System.out.println(GIFT_WEIGHT_MESSAGE + giftWeight);
    }
}
