package com.epam.candies;

import com.epam.candies.data.KidGiftFactory;
import com.epam.candies.enums.PrinterType;
import com.epam.candies.exceptions.NullGiftException;
import com.epam.candies.exceptions.UnknownPrinterTypeException;
import com.epam.candies.logic.CandyCalculator;
import com.epam.candies.model.KidGift;
import com.epam.candies.view.GiftWeightPrinter;
import com.epam.candies.view.GiftWeightPrinterFactory;

public class Main {
    public static void main(String[] args) throws UnknownPrinterTypeException, NullGiftException {
        KidGiftFactory kidGiftFactory = new KidGiftFactory();
        KidGift kidGift = kidGiftFactory.createGift();
        CandyCalculator candyCalculator = new CandyCalculator();
        double giftWeight = candyCalculator.findGiftWeight(kidGift);
        GiftWeightPrinterFactory giftWeightPrinterCreator = new GiftWeightPrinterFactory();
        PrinterType printerType = PrinterType.CONSOLE;
        GiftWeightPrinter giftWeightPrinter = giftWeightPrinterCreator.createGiftWeightPrinter(printerType);
        giftWeightPrinter.print(giftWeight);
    }
}
