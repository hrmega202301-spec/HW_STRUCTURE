package ru.netology.service;

public class CustomsService {

    public static final int TAX = 100;

    public static int calculateCustoms(int price, int weight) {
        int result = (price / TAX) + (weight * TAX);
        return result;
    }
}
