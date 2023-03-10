package ru.netology.stats;

public class StatsService {


    public double minSales(double[] sales) {
        double minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[(int) minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public double maxSales(double[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;

    }
    public double salesAmount(double[] sales) {
        double amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }
        return amount;
    }

    public double averageAmount(double[] sales) {
        double amount = salesAmount(sales);
        double salesLength = sales.length;
        double averageSalesAmount = amount / salesLength;
        return averageSalesAmount;
    }

    public int SalesAboveAverage (double[] sales) {
        double medium = averageAmount(sales);
        int count = 0;
        for (int i = 0; i <sales.length; i++) {
            if (sales[i] > medium) {
                count++;
            }
        }
        return count;
    }

    public int SalesOfLessThanAverage (double[] sales) {
        double medium = averageAmount(sales);
        int count = 0;
        for (int i = 0; i <sales.length; i++) {
            if (sales[i] < medium) {
                count++;
            }
        }
        return count;
    }




}
