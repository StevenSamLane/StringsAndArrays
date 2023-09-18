package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesServiceTest {
    @Test
    public void testCalculateTotalSales() {
        SalesService salesService = new SalesService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int result = salesService.calculateTotalSales(sales);

        Assertions.assertEquals(180, result);
    }

    @Test
    public void testCalculateAverageSales() {
        SalesService salesService = new SalesService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double result = salesService.calculateAverageSales(sales);

        Assertions.assertEquals(15.0, result);
    }

    @Test
    public void testFindPeakMonth() {
        SalesService salesService = new SalesService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int result = salesService.findPeakMonth(sales);

        Assertions.assertEquals(5, result);
    }

    @Test
    public void testFindMinMonth() {
        SalesService salesService = new SalesService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int result = salesService.findMinMonth(sales);

        Assertions.assertEquals(8, result);
    }

    @Test
    public void testCountMonthsBelowAverage() {
        SalesService salesService = new SalesService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int result = salesService.countMonthsBelowAverage(sales);

        Assertions.assertEquals(5, result);
    }

    @Test
    public void testCountMonthsAboveAverage() {
        SalesService salesService = new SalesService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int result = salesService.countMonthsAboveAverage(sales);

        Assertions.assertEquals(5, result);
    }
}