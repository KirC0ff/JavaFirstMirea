package ru.mirea.task3.opt2;

public class Main {
    public static void main(String[] args){
        Human chel = new Human();
        chel.h.turn("Right");
        chel.leftLeg.raise();
        chel.rightHand.bend();
        chel.leftHand.bend();
        chel.leftHand.unbend();
        chel.doStep();

        System.out.println(chel);
    }
}
