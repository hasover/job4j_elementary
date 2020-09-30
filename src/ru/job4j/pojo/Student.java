package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fullName;
    int group;
    private Date accepted;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Date getAccepted() {
        return accepted;
    }

    public void setAccepted(Date accepted) {
        this.accepted = accepted;
    }
}
