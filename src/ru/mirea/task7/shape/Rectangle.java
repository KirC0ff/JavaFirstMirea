package ru.mirea.task7.shape;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        width = 0;
        length = 0;
        color = "White";
        filled = false;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        color = "White";
        filled = false;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        return(width*length);
    }
    public double getPerimeter(){
        return(2*width+2*length);
    }

    public String toString(){
        return("Rectangle, "+width+"x"+length+", color: "+color+", filled: "+filled);
    }
}
