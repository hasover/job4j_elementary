package ru.job4j.poly;

public class VehicleTest {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Train train = new Train();
        Plane plane = new Plane();
        Vehicle[] vehicles = new Vehicle[]{bus, train, plane};
        for (Vehicle vehicle: vehicles) {
            vehicle.move();
        }
    }
}
