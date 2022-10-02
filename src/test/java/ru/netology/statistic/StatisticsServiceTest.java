package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {7, 5, 8, 4, 5, 3, 8, 6, 11, 11, 8};
        long expected = 11;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxArray(){
        StatisticsService service = new StatisticsService();

        long [] incomesInBillions = {8, git, 8, 4, 5, 3, 8, 6 , 11, 11, 12};

        int expected = 12;
        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}