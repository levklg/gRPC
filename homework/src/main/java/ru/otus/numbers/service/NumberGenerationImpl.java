package ru.otus.numbers.service;

import java.util.concurrent.ThreadLocalRandom;

public class NumberGenerationImpl implements NumberGeneration{
    @Override
    public int generation(int firstValue, int lastValue) {
        int randomNum = ThreadLocalRandom.current().nextInt(firstValue, lastValue + 1);
        return randomNum;
    }
}
