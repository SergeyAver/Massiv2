package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StatsServiceTest {
    @Test
    public void testCalculateSumAllSale() {
        StatsService service = new StatsService();

        long[] dataSet = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        long actual = service.calculateSumAllSale(dataSet);

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateSumAverageSale() {
        StatsService service = new StatsService();

        long[] dataSet = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        long actual = service.calculateSumAverageSale(dataSet);

        assertEquals(expected, actual);

    }

    @Test
    public void testMaximumSales() {
        StatsService service = new StatsService();

        long[] dataSet = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        long actual = service.maxSales(dataSet);

        assertEquals(expected, actual);
    }

    @Test
    public void testMinimumSales() {
        StatsService service = new StatsService();

        long[] dataSet = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        long actual = service.minSales(dataSet);

        assertEquals(expected, actual);
    }

    @Test
    public void testSalesBelowAverage() {
        StatsService service = new StatsService();

        long[] dataSet = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        long actual = service.salesBelowAverage(dataSet);

        assertEquals(expected, actual);
    }

    @Test
    public void testSalesAboveAverage() {
        StatsService service = new StatsService();

        long[] dataSet = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        long actual = service.salesAboveAverage(dataSet);

        assertEquals(expected, actual);
    }

}
