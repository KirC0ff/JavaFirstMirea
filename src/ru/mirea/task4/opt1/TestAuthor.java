package ru.mirea.task4.opt1;

public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Артур Гвоздев", "none", 'f');
        Author a2 = new Author("Василий Яковлев", "vyakovlev@mail.ru", 'm');

        a1.setEmail("artur@gvozd.ru");

        System.out.println(a1);
        System.out.println(a2);


    }
}
