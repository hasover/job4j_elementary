package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Aaaa Bbbb");
        student.setGroup(1);
        student.setAccepted(new Date());
        System.out.println(student.getFullName() + " in group " + student.getGroup() + " accepted on " + student.getAccepted());
    }
}
