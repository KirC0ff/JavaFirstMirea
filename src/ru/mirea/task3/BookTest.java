package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args){
        Book b1 = new Book("Shakespeare", "Romeo and Juliet", 1595, 256);
        b1.changeAuthor("William Shakespeare");
        System.out.println(b1);
        System.out.println(b1.getName());
    }
}

