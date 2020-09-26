package com.epam.candies.view;

public class ConsoleGiftWeightPrinter implements GiftWeightPrinter {

    private final static String GIFT_WEIGHT_MESSAGE = "The total weight of christmas gift: ";

    public void print(double giftWeight) {
        System.out.printf(GIFT_WEIGHT_MESSAGE + "%.2f", giftWeight);
    }
}
