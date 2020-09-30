package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        Book one = new Book();
        one.setTitle("one");
        one.setPages(100);
        Book two = new Book();
        two.setTitle("two");
        two.setPages(200);
        Book three = new Book();
        three.setTitle("three");
        three.setPages(300);
        Book four = new Book();
        four.setTitle("Clean code");
        four.setPages(400);
        books[0] = one;
        books[1] = two;
        books[2] = three;
        books[3] = four;
        for (int index = 0; index < 4; index++) {
            System.out.println(books[index].getTitle() + " " + books[index].getPages());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < 4; index++) {
            System.out.println(books[index].getTitle() + " " + books[index].getPages());
        }
        for (int index = 0; index < 4; index++) {
            if (books[index].getTitle().equals("Clean code")) {
                System.out.println(books[index].getTitle() + " " + books[index].getPages());
            }
        }
    }
}
