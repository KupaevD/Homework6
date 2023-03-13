package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void minSalesMonth() {
        StatsService calculate = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 9;
        int actual = calculate.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesMonth() {
        StatsService calculate = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 8;
        int actual = calculate.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amountSales() {
        StatsService calculate = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 180;
        int actual = calculate.salesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesAmount() {
        StatsService calculate = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 15;
        int actual = calculate.averageAmount(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void SalesAboveAverage() {
        StatsService calculate = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = calculate.SalesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void SalesOfLessThanAverage() {
        StatsService calculate = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = calculate.SalesOfLessThanAverage(sales);

        Assertions.assertEquals(expected, actual);
    }


}
