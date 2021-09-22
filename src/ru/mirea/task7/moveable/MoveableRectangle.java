package ru.mirea.task7.moveable;

public class MoveableRectangle implements Moveable{
    private MoveablePoint topLeft = new MoveablePoint(0,0,0,0);
    private MoveablePoint bottomRight = new MoveablePoint(0,0,0,0);

    public MoveableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft.x = x1;
        topLeft.y = y1;
        bottomRight.x = x2;
        bottomRight.y = y2;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }

    public String toString(){
        return("Rectangle a: "+topLeft.x+", "+topLeft.y+"; b: "+bottomRight.x+", "+bottomRight.y);
    }

    public void moveUp(){
        topLeft.y+=topLeft.ySpeed;
        bottomRight.y+=bottomRight.ySpeed;
    }
    public void moveDown(){
        topLeft.y-=topLeft.ySpeed;
        bottomRight.y-=bottomRight.ySpeed;
    }
    public void moveLeft(){
        topLeft.x-=topLeft.xSpeed;
        bottomRight.x-=bottomRight.xSpeed;
    }
    public void moveRight(){
        topLeft.x+=topLeft.xSpeed;
        bottomRight.x+=bottomRight.xSpeed;
    }
}
