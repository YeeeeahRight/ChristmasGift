package com.epam.candies.view;

import com.epam.candies.enums.PrinterType;
import com.epam.candies.exceptions.UnknownPrinterTypeException;
import org.junit.Assert;
import org.junit.Test;

public class GiftWeightPrinterFactoryTest {
    private GiftWeightPrinterFactory giftWeightPrinterCreator = new GiftWeightPrinterFactory();

    @Test
    public void testCreateGiftWeightPrinterWhenPrinterTypeIsConsole() throws UnknownPrinterTypeException {
        PrinterType printerType = PrinterType.CONSOLE;
        GiftWeightPrinter giftWeightPrinter = giftWeightPrinterCreator.createGiftWeightPrinter(printerType);
        Assert.assertTrue(giftWeightPrinter instanceof ConsoleGiftWeightPrinter);
    }

    @Test(expected = UnknownPrinterTypeException.class)
    public void testCreateGiftWeightPrinterWhenPrinterTypeIsFile() throws UnknownPrinterTypeException {
        PrinterType printerType = PrinterType.FILE;
        giftWeightPrinterCreator.createGiftWeightPrinter(printerType);
    }


}
