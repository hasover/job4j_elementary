package ru.job4j.strategy;

public class Circle implements Shape {

    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return " **" + ln + "****" + ln + " **";
    }
}
