package org.example;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int vacation; // отдыхать
        int work; // работать
        int count = 0; //счетчик месяца
        int money = 0; //деньги
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {// можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;

    }
}

