package ru.mirea.task2;

public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book("Shakespeare", "Romeo and Juliet", 1595, 256);
        b1.changeAuthor("William Shakespeare");
        System.out.println(b1);
    }
}
