package ru.netology.stats;

public class StatsService {
    public long sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSales(int[] sales) {
        long averageSales = 0;
        for (long sale : sales) {
            averageSales = sum(sales) / sales.length;
        }
        return averageSales;
    }

    public int maxSales(int[] sales) {
        int max = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[max]) {
                max = i;
            }
        }
        return max;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverage(int[] sales) {
        int n = 0;
        for (int sale : sales) {
            if (sale < averageSales(sales)) {
                n++;
            }
        }
        return n;
    }

    public int aboveAverage(int[] sales) {
        int n = 0;
        for (int sale : sales) {
            if (sale > averageSales(sales)) {
                n++;
            }
        }
        return n;
    }
}
