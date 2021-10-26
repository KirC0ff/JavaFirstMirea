package ru.mirea.task12.opt1;

public class Student {
    private int id, number;

    public Student(int id, int number) {
        this.id = id;
        this.number = number;
    }

    public int getID() {
        return id;
    }

    public String toString() {
        return "Student "+number+" ID: "+id;
    }
}