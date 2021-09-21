package ru.mirea.task3.opt1;

public class CircleTest {
    public static void main(String[] args){
        Circle c1 = new Circle("O1", 10);
        c1.setRadius(15);
        System.out.println(c1);
        System.out.println("Length: "+c1.getLength());
    }
}
