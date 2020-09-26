package com.epam.candies.logic;

import com.epam.candies.exceptions.NullGiftException;
import com.epam.candies.model.Candy;
import com.epam.candies.model.KidGift;
import org.junit.Assert;
import org.junit.Test;

public class CandyCalculatorTest {
    private CandyCalculator candyCalculator = new CandyCalculator();
    KidGift kidGift;
    private static final double DELTA = 0.01;

    @Test
    public void testFindGiftWeightWhenOnlyOneCandy() throws NullGiftException {
        kidGift = new KidGift();
        kidGift.addCandy(new Candy("Truffle", 20));
        double giftWeight = candyCalculator.findGiftWeight(kidGift);
        Assert.assertEquals(20, giftWeight, DELTA);
    }

    @Test
    public void testFindGiftWeightWhenLotOfCandies() throws NullGiftException {
        kidGift = new KidGift();
        kidGift.addCandy(new Candy("Truffle", 20.5));
        kidGift.addCandy(new Candy("Chocolate santa", 10));
        kidGift.addCandy(new Candy("Toffee", 50));
        kidGift.addCandy(new Candy("M&M'S", 35));
        double giftWeight = candyCalculator.findGiftWeight(kidGift);
        Assert.assertEquals(115.5, giftWeight, DELTA);
    }

    @Test
    public void testFindGiftWeightWhenNoCandies() throws NullGiftException {
        kidGift = new KidGift();
        double giftWeight = candyCalculator.findGiftWeight(kidGift);
        Assert.assertEquals(0, giftWeight, DELTA);
    }

    @Test(expected = NullGiftException.class)
    public void testFindGiftWeightWhenGiftIsNotCreated() throws NullGiftException {
        candyCalculator.findGiftWeight(kidGift);
    }
}
