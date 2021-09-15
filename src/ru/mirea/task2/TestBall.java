package ru.mirea.task2;

import java.lang.*;

public class TestBall {
    public static void main (String[] args){
        Ball b1 = new Ball("Red", 4);
        Ball b2 = new Ball();
        b2.setColor("White");
        System.out.println(b2);
        b1.ballVolume();
    }
}
