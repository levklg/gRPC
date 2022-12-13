package ru.otus.numbers.service;

public interface NumberGeneration {
    public int generation(int firstValue, int lastValue);
    public int generation();
    public int getFirstValue();
    public void setFirstValue(int firstValue);
    public int getLastValue();
    public void setLastValue(int lastValue);

}
