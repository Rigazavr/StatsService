package ru.netology.stats;

public class StatsService {
    public int salesSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int averageAmount(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum / sales.length;
    }

    public int maxSales(int[] sales) {
        int salesPeak = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[salesPeak]) {
                salesPeak = month;
            }
            month = month + 1;
        }
        return salesPeak;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
                   }
        return minMonth;
    }

    public int minAverageSaleMonths(int[] sales) {
        int averageSaleMonth = averageAmount(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale < averageSaleMonth)
                month = month + 1;
        }
        return month;
    }

    public int maxAverageSaleMonths(int[] sales) {
        int averageSaleMonth = averageAmount(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale > averageSaleMonth)
                month = month + 1;
        }
        return month;
    }
}
