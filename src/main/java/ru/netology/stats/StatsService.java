package ru.netology.stats;
public class StatsService {  //1.Сумму всех продаж.
    public long calculateSumAllSale(long[] dataSet) {
        long sum = 0;
        for (long sale : dataSet) {
            sum = sum + sale;
        }
        return sum;
    }

    //2.Среднюю сумму продаж в месяц.
    public long calculateSumAverageSale(long[] dataSet) {
        long sumAllSales = calculateSumAllSale(dataSet);
        return sumAllSales / dataSet.length;

    }

    //3.Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
    public long maxSales(long[] dataSet) {
        int max = 0;
        for (int i = 0; i < dataSet.length; i++) {
            if (dataSet[i] >= dataSet[max]) {
                max = i;
            }
        }
        return max + 1;
    }

    //4.Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    public long minSales(long[] dataSet) {
        int min = 0;
        for (int i = 0; i < dataSet.length; i++) {
            if (dataSet[i] <= dataSet[min]) {
                min = i;
            }
        }
        return min + 1;
    }

    //5.Кол-во месяцев, в которых продажи были ниже среднего.
    public long salesBelowAverage(long[] dataSet) {
        long calcumAverage = calculateSumAverageSale(dataSet);
        int count = 0;
        for (long sale : dataSet) {
            if (sale < calcumAverage) {
                count++;
            }
        }
        return count;
    }

    //6.Кол-во месяцев, в которых продажи были выше среднего.
    public long salesAboveAverage(long[] dataSet) {
        long calcumAveraqe = calculateSumAverageSale(dataSet);
        int count = 0;
        for (long sale : dataSet) {
            if (sale > calcumAveraqe) {
                count++;
            }
        }
        return count;
    }


}

