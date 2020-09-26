package com.epam.candies;

import com.epam.candies.enums.PrinterType;
import com.epam.candies.exceptions.NullGiftException;
import com.epam.candies.exceptions.UnknownPrinterTypeException;
import com.epam.candies.logic.CandyCalculator;
import com.epam.candies.model.Candy;
import com.epam.candies.model.KidGift;
import com.epam.candies.view.GiftWeightPrinter;
import com.epam.candies.view.GiftWeightPrinterFactory;

public class Main {
    public static void main(String[] args) throws UnknownPrinterTypeException, NullGiftException {
        Candy firstCandy = new Candy("Truffle", 50);
        Candy secondCandy = new Candy("Chocolate santa", 20.5);
        Candy thirdCandy = new Candy("Toffee", 70);
        KidGift kidGift = new KidGift();
        kidGift.fillGift(firstCandy, secondCandy, thirdCandy);
        CandyCalculator candyCalculator = new CandyCalculator();
        double giftWeight = candyCalculator.findGiftWeight(kidGift);
        GiftWeightPrinterFactory giftWeightPrinterCreator = new GiftWeightPrinterFactory();
        PrinterType printerType = PrinterType.CONSOLE;
        GiftWeightPrinter giftWeightPrinter = giftWeightPrinterCreator.createGiftWeightPrinter(printerType);
        giftWeightPrinter.print(giftWeight);
    }
}
