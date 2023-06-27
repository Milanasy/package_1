package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationPlannerServiceTest {
    VacationPlannerService plannerService = new VacationPlannerService();

    @Test
    public void testVacationPlannerServiceWithThreeMonthsOfRest() {
        int vacations = plannerService.calculateVacationMonths(10_000, 3_000, 20_000);
        int expected = 3;
        Assertions.assertEquals(expected, vacations);
    }

    @Test
    public void testVacationPlannerServiceWithTwoMonthsOfRest() {
        int vacations = plannerService.calculateVacationMonths(100_000, 60_000, 150_000);
        int expected = 2;
        System.out.println(vacations);
        Assertions.assertEquals(expected, vacations);
    }

    @ParameterizedTest(name = "Тест №{index}. Доход = {0}, Расход = {1}, Лимит = {2}")
    @CsvFileSource(resources = "/test_data.csv")
    public void testCalculateWithParams(int income, int expenses, int threshold, int expected) {
        VacationPlannerService plannerService = new VacationPlannerService();

        int vacations = plannerService.calculateVacationMonths(income, expenses, threshold);

        System.out.println(vacations);

        Assertions.assertEquals(expected, vacations);
    }
}