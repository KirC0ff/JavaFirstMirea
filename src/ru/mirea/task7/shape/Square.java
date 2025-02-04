package ru.mirea.task7.shape;

import ru.mirea.task7.shape.Rectangle;

public class Square extends Rectangle {
    public Square(){
        width = 0;
        length = 0;
        color = "White";
        filled = false;
    }
    public Square(double side){
        width = side;
        length = side;
        color = "White";
        filled = false;
    }
    public Square(double side, String color, boolean filled){
        width = side;
        length = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        width = side;
        length = side;
    }
    public void setWidth(double side){
        width = side;
        length = side;
    }
    public void setLength(double side){
        width = side;
        length = side;
    }

    public String toString(){
        return("Square, "+width+"x"+length+", color: "+color+", filled: "+filled);
    }
}
