package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int sumSales = 0;

        for (int sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public int avgSumSales(int[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int maxMonthSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minMonthSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countMinMonthSales(int[] sales) {
        int countMinMonth = 0;
        int avgSum = avgSumSales(sales);

        for (int sale : sales) {
            if (sale < avgSum) {
                countMinMonth++;
            }
        }
        return countMinMonth;
    }

    public int countMaxMonthSales(int[] sales) {
        int countMaxMonth = 0;
        int avgSum = avgSumSales(sales);

        for (int sale : sales) {
            if (sale > avgSum) {
                countMaxMonth++;
            }
        }
        return countMaxMonth;
    }
}
