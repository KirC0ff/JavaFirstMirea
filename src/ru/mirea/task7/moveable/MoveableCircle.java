package ru.mirea.task7.moveable;

public class MoveableCircle implements Moveable{
    private int radius;
    private MoveablePoint center = new MoveablePoint(0,0,0,0);

    public MoveableCircle(int x, int y, int xSpeed, int ySpeed){
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
    }

    public String toString(){
        return("Circle center: "+center.x+", "+center.y);
    }

    public void moveUp(){
        center.y+=center.ySpeed;
    }
    public void moveDown(){
        center.y-=center.ySpeed;
    }
    public void moveLeft(){
        center.x-=center.xSpeed;
    }
    public void moveRight(){
        center.x+=center.xSpeed;
    }
}
