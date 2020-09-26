package com.epam.gifts;

import com.epam.gifts.enums.PrinterType;
import com.epam.gifts.exceptions.NullGiftException;
import com.epam.gifts.exceptions.UnknownPrinterTypeException;
import com.epam.gifts.logic.CandyCalculator;
import com.epam.gifts.model.Candy;
import com.epam.gifts.model.KidGift;
import com.epam.gifts.view.GiftWeightPrinter;
import com.epam.gifts.view.GiftWeightPrinterFactory;

public class Main {
    public static void main(String[] args) throws UnknownPrinterTypeException, NullGiftException {
        Candy firstCandy = new Candy("candy1", 50);
        Candy secondCandy = new Candy("candy2", 20);
        Candy thirdCandy = new Candy("candy3", 70);
        KidGift kidGift = new KidGift();
        kidGift.fillGift(firstCandy, secondCandy, thirdCandy);
        CandyCalculator candyCalculator = new CandyCalculator();
        int giftWeight = candyCalculator.findGiftWeight(kidGift);
        GiftWeightPrinterFactory giftWeightPrinterCreator = new GiftWeightPrinterFactory();
        PrinterType printerType = PrinterType.CONSOLE;
        GiftWeightPrinter giftWeightPrinter = giftWeightPrinterCreator.createGiftWeightPrinter(printerType);
        giftWeightPrinter.print(giftWeight);
    }
}
