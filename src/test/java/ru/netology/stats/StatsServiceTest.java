package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldGetSumSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20_000_000_000L, 7, 14, 14, 18 };

        long expectedSum = 20_000_000_160L;
        long actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldGetAvgSumSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20_000_000_000L, 7, 14, 14, 18 };

        long expectedAvg = 1_666_666_680;
        long actualAvg = service.avgSumSales(sales);

        Assertions.assertEquals(expectedAvg, actualAvg);
    }

    @Test
    public void shouldFindMaxMonthSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxMonthSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFindMinMonthSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMinMonth = 9;
        int actualMinMonth = service.minMonthSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldGetCountMinMonthSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedCountMinMonth = 5;
        int actualCountMinMonth = service.countMinMonthSales(sales);

        Assertions.assertEquals(expectedCountMinMonth, actualCountMinMonth);
    }

    @Test
    public void shouldGetCountMaxMonthSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedCountMaxMonth = 5;
        int actualCountMaxMonth = service.countMaxMonthSales(sales);

        Assertions.assertEquals(expectedCountMaxMonth, actualCountMaxMonth);
    }

}
