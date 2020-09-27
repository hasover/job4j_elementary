package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        int i;
        for (i = 0; i < post.length; i++) {
            if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                break;
            }
        }

        return i == post.length;
    }
}