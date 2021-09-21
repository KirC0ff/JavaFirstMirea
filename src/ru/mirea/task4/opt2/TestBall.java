package ru.mirea.task4.opt2;

public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball();
        b1.setXY(99, 88);
        System.out.println(b1);
        b1.move(10, -7);
        System.out.println(b1);
    }
}
