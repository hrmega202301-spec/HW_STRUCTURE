package ru.netology.service;

public class CustomsService{
    public static final int CALCULATE_CUSTOMS(int price, int weight) {
        int result = (price / 100) + (weight * 100);
        return result;
    }
}
