package ru.otus.numbers.service;

import java.util.concurrent.ThreadLocalRandom;

public class NumberGenerationImpl implements NumberGeneration{
    private int firstValue;
    private int lastValue;
    @Override
    public int generation(int firstValue, int lastValue) {
        int randomNum = ThreadLocalRandom.current().nextInt(firstValue, lastValue + 1);
        return randomNum;
    }
    @Override
    public int getFirstValue() {
        return firstValue;
    }
    @Override
    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }
    @Override
    public int getLastValue() {
        return lastValue;
    }
    @Override
    public void setLastValue(int lastValue) {
        this.lastValue = lastValue;
    }

    @Override
    public int generation(){
        return firstValue++;
    }
}
