package com.epam.candies;

import com.epam.candies.data.KidGiftCreator;
import com.epam.candies.enums.PrinterType;
import com.epam.candies.exceptions.NullGiftException;
import com.epam.candies.exceptions.UnknownPrinterTypeException;
import com.epam.candies.logic.CandyCalculator;
import com.epam.candies.model.Candy;
import com.epam.candies.model.KidGift;
import com.epam.candies.view.GiftWeightPrinter;
import com.epam.candies.view.GiftWeightPrinterFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws UnknownPrinterTypeException, NullGiftException {
        KidGiftCreator kidGiftCreator = new KidGiftCreator();
        ArrayList<Candy> candies = kidGiftCreator.createGift();
        KidGift kidGift = new KidGift();
        kidGift.fillGift(candies);
        CandyCalculator candyCalculator = new CandyCalculator();
        double giftWeight = candyCalculator.findGiftWeight(kidGift);
        GiftWeightPrinterFactory giftWeightPrinterCreator = new GiftWeightPrinterFactory();
        PrinterType printerType = PrinterType.CONSOLE;
        GiftWeightPrinter giftWeightPrinter = giftWeightPrinterCreator.createGiftWeightPrinter(printerType);
        giftWeightPrinter.print(giftWeight);
    }
}
