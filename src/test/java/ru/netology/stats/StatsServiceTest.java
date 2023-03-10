package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void minSalesMonth() {
        StatsService calculate = new StatsService();
        double[] sales = {
                5.3, 1, 8.4, 1, 15.6, 8, 10, 3.9, 14
        };
        double expected = 4;
        double actual = calculate.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesMonth() {
        StatsService calculate = new StatsService();
        double[] sales = {
                5.3, 1, 8.4, 1, 15.6, 8, 10, 3.9, 14
        };
        double expected = 5;
        double actual = calculate.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amountSales() {
        StatsService calculate = new StatsService();
        double[] sales = {
                5.3, 1, 8.4, 1, 15.6, 8, 10, 3.9, 14
        };
        double expected = 67.199999999999999;
        double actual = calculate.salesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesAmount() {
        StatsService calculate = new StatsService();
        double[] sales = {
                5.3, 1, 8.4, 1, 15.6, 8, 10, 3.9, 14
        };
        double expected = 7.466666666666665;
        double actual = calculate.averageAmount(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void SalesAboveAverage() {
        StatsService calculate = new StatsService();
        double[] sales = {
                5.3, 1, 8.4, 1, 15.6, 8, 10, 3.9, 14
        };
        int expected = 5;
        int actual = calculate.SalesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void SalesOfLessThanAverage() {
        StatsService calculate = new StatsService();
        double[] sales = {
                5.3, 1, 8.4, 1, 15.6, 8, 10, 3.9, 14
        };
        int expected = 4;
        int actual = calculate.SalesOfLessThanAverage(sales);

        Assertions.assertEquals(expected, actual);
    }


}
