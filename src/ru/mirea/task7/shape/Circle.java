package ru.mirea.task7.shape;

public class Circle extends Shape {
    protected double radius;

    public Circle(){
        radius = 0;
        color = "White";
        filled = false;
    }
    public Circle(double radius){
        this.radius = radius;
        color = "White";
        filled = false;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return(3.14*radius*radius);
    }
    public double getPerimeter(){
        return(6.28*radius);
    }

    public String toString(){
        return("Circle, radius: "+radius+", color: "+color+", filled: "+filled);
    }
}
