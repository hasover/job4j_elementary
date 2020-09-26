package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[0];
        int i;
        for (i = 1; i < data.length; i++) {
            if (result != data[i]) {  // если пройдем весь массив, то он однородный
                break;
            }

        }

        return (i == data.length); // прошли весь массив?
    }
}