package ru.netology.services;

public class VacationPlannerService {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int money = 0;
        int vacationMonths = 0;

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                int vacationMoney = (money - expenses) / 3;
                System.out.println(
                        "Месяц " + month + ". Денег " + money + ". "
                        + "Буду отдыхать. Потратил -" + expenses + ", затем еще -" + (money - vacationMoney)
                );
                money = vacationMoney;
                vacationMonths++;
            } else {
                System.out.println(
                        "Месяц " + month + ". Денег " + money +
                        ". Придется работать. Заработал +" + income + ", потратил -" + expenses
                );
                money = money + income - expenses;
            }
        }

        System.out.println();
        return vacationMonths;
    }
}
