package ru.mirea.task7.moveable;

public class Main {
    public static void main(String[] args){
        MoveablePoint p1 = new MoveablePoint(10,10,5,7);
        MoveableCircle c1 = new MoveableCircle(50,25,1,10);
        MoveableRectangle r1 = new MoveableRectangle(0, 10, 15, 0,2,3);

        p1.moveUp();
        c1.moveLeft();
        r1.moveRight();
        r1.moveDown();

        System.out.println(p1+"\n"+c1+"\n"+r1);
    }
}
