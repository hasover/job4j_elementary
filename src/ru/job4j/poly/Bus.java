package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("The bus is going.");
    }

    @Override
    public void passengers(int number) {
        System.out.println(number + " passengers");
    }

    @Override
    public double fuel(double liters) {
        return liters * 70.5;
    }
}
