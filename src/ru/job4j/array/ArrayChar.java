package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        int i;
        for (i = 0; i < pref.length; i++) {
            if (i >= word.length || word[i] != pref[i]) {
                break;
            }
        }
        return (i == pref.length);
    }
}