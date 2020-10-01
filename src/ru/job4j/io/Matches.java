package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        int round = 1;
        String player = "";
        Scanner scanner = new Scanner(System.in);
        while (matches > 0) {
            player = round % 2 == 1 ? "First player" : "Second player";
            System.out.println(matches + " matchers left");
            System.out.print(player + " pull the matchers(1-3):");
            int number = Integer.valueOf(scanner.nextLine());
            if (matches - number < 0) {
                System.out.println("There are not so many matchers. Try again.");
            } else if (number > 3 || number < 1) {
                System.out.println("You can pick 1-3 matchers");
            } else {
                    matches -= number;
                    round++;
            }
        }
        System.out.println(player + " won.");
    }
}
