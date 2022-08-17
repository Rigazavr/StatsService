package ru.netology.stats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @Test
    void shouldCalculateSalesSum() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.salesSum(allSales);

        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateAverageAmount() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageAmount(allSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxSales() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;

        int actual = service.maxSales(allSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinSales() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 0;

        int actual = service.minSales(allSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSaleMonths() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.minAverageSaleMonths(allSales);

        assertEquals(expected, actual);
    }

    @Test
    void higherThanAverageSaleMonths() {
        StatsService service = new StatsService();
        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.maxAverageSaleMonths(allSales);

        assertEquals(expected, actual);
    }
}

