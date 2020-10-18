package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[0];
        int i;
        for (i = 1; i < data.length; i++) {
            if (result != data[i]) {
                break;
            }
        }

        return (i == data.length);
    }
}