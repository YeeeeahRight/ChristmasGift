package com.epam.gifts.logic;

import com.epam.gifts.exceptions.NullGiftException;
import com.epam.gifts.model.Candy;
import com.epam.gifts.model.KidGift;
import org.junit.Assert;
import org.junit.Test;

public class CandyCalculatorTest {
    private CandyCalculator candyCalculator = new CandyCalculator();
    KidGift kidGift;

    @Test
    public void testFindGiftWeightWhenOnlyOneCandy() throws NullGiftException {
        kidGift = new KidGift();
        kidGift.fillGift(new Candy("Truffle", 20));
        int giftWeight = candyCalculator.findGiftWeight(kidGift);
        Assert.assertEquals(20, giftWeight);
    }

    @Test
    public void testFindGiftWeightWhenLotOfCandies() throws NullGiftException {
        kidGift = new KidGift();
        kidGift.fillGift(new Candy("Truffle", 20));
        kidGift.fillGift(new Candy("Chocolate santa", 10));
        kidGift.fillGift(new Candy("Toffee", 50));
        kidGift.fillGift(new Candy("M&M'S", 35));
        int giftWeight = candyCalculator.findGiftWeight(kidGift);
        Assert.assertEquals(115, giftWeight);
    }

    @Test
    public void testFindGiftWeightWhenNoCandies() throws NullGiftException {
        kidGift = new KidGift();
        int giftWeight = candyCalculator.findGiftWeight(kidGift);
        Assert.assertEquals(0, giftWeight);
    }

    @Test(expected = NullGiftException.class)
    public void testFindGiftWeightWhenGiftIsNotCreated() throws NullGiftException {
        candyCalculator.findGiftWeight(kidGift);
    }
}
