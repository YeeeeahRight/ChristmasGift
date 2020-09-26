package com.epam.gifts.view;

public class ConsoleGiftWeightPrinter implements GiftWeightPrinter {

    private final static String TOTAL_WEIGHT_MESSAGE = "The total weight of christmas gift: ";

    public void print(int totalWeight) {
        System.out.println(TOTAL_WEIGHT_MESSAGE + totalWeight);
    }
}
