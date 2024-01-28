package ru.netology.services;

public class calcRestService {

    public int calculate(int income, int expenses, int threshold) {

        int money = 0;
        int rest = 0;

        for (int mounth = 0; mounth < 12; mounth++) {
            if (money >= threshold) {

                money = money - expenses;
                money = money / 3;
                rest = rest + 1;
            } else {
                money = money + income;
                money = money - expenses;
            }
        }
        return rest;
    }
}
