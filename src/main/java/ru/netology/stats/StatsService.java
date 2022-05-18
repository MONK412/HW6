package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageAmountSales(long[] sales) {
        long sum = 0;
        long average = 0;
        for (long sale : sales) {
            sum += sale;
            average = sum / 12;
        }
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int minMonthSales(long[] sales) {
        int count = 0;
        long sum = 0;
        long average = 0;
        for (long sale : sales) {
            sum += sale;
            average = sum / 12;
        }
        for (long sale : sales) {
            if (sale < average) {
                count = count + 1;
            }
        }
        return count;
    }

    public int maxMonthSales(long[] sales) {
        int count = 0;
        long sum = 0;
        long average = 0;
        for (long sale : sales) {
            sum += sale;
            average = sum / 12;
        }
        for (long sale : sales) {
            if (sale > average) {
                count = count + 1;
            }
        }
        return count;
    }
}
