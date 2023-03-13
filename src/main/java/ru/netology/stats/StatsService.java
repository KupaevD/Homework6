package ru.netology.stats;

public class StatsService {


    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[(int) minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;

    }
    public int salesAmount(int[] sales) {
        int amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }
        return amount;
    }

    public int averageAmount(int[] sales) {
        int amount = salesAmount(sales);
        int salesLength = sales.length;
        int averageSalesAmount = amount / salesLength;
        return averageSalesAmount;
    }

    public int SalesAboveAverage (int[] sales) {
        int medium = averageAmount(sales);
        int count = 0;
        for (int i = 0; i <sales.length; i++) {
            if (sales[i] > medium) {
                count++;
            }
        }
        return count;
    }

    public int SalesOfLessThanAverage (int[] sales) {
        int medium = averageAmount(sales);
        int count = 0;
        for (int i = 0; i <sales.length; i++) {
            if (sales[i] < medium) {
                count++;
            }
        }
        return count;
    }




}
