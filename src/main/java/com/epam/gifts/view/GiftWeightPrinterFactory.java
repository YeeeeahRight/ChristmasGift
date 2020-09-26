package com.epam.gifts.view;

import com.epam.gifts.enums.PrinterType;
import com.epam.gifts.exceptions.UnknownPrinterTypeException;

public class GiftWeightPrinterFactory {

    private final static String UNKNOWN_PRINTER_TYPE_MESSAGE = "Unknown printer type for your gift weight.";

    public GiftWeightPrinter createGiftWeightPrinter(PrinterType printerType) throws UnknownPrinterTypeException {
        if (printerType == PrinterType.CONSOLE) {
            return new ConsoleGiftWeightPrinter();
        }
        throw new UnknownPrinterTypeException(UNKNOWN_PRINTER_TYPE_MESSAGE);
    }
}
