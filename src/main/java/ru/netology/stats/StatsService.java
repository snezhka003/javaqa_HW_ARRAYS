package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sumSales = 0;

        for (long sale : sales) sumSales += sale;
        return sumSales;
    }

    public long avgSumSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int maxMonthSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minMonthSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countMinMonthSales(long[] sales) {
        int countMinMonth = 0;
        long avgSum = avgSumSales(sales);

        for (long sale : sales) {
            if (sale < avgSum) {
                countMinMonth++;
            }
        }
        return countMinMonth;
    }

    public int countMaxMonthSales(long[] sales) {
        int countMaxMonth = 0;
        long avgSum = avgSumSales(sales);

        for (long sale : sales) {
            if (sale > avgSum) {
                countMaxMonth++;
            }
        }
        return countMaxMonth;
    }
}
