package ru.netology.services;

public class SalesService {
    public int calculateTotalSales(int[] sales) {
        int totalSales = 0;

        for (int sale : sales) {
            totalSales += sale;
        }

        return totalSales;
    }

    public double calculateAverageSales(int[] sales) {
        double totalSales = calculateTotalSales(sales);
        double averageSales = totalSales / sales.length;

        return averageSales;
    }

    public int findPeakMonth(int[] sales) {
        int peakMonth = 0;
        int maxSales = sales[0];

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                peakMonth = i;
            }
        }

        return peakMonth;
    }

    public int findMinMonth(int[] sales) {
        int minMonth = 0;
        int minSales = sales[0];

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < minSales) {
                minSales = sales[i];
                minMonth = i;
            }
        }

        return minMonth;
    }

    public int countMonthsBelowAverage(int[] sales) {
        double averageSales = calculateAverageSales(sales);
        int count = 0;

        for (int sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }

        return count;
    }

    public int countMonthsAboveAverage(int[] sales) {
        double averageSales = calculateAverageSales(sales);
        int count = 0;

        for (int sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }

        return count;
    }
}