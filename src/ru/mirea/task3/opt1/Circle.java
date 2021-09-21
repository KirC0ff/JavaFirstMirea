package ru.mirea.task3.opt1;

public class Circle {
    private float radius;
    private String name;

    public Circle(String n, float r){
        name = n;
        radius = r;
    }
    public void setRadius(float r){
        radius = r;
    }
    public float getRadius(){
        return radius;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "Circle "+name+", R = "+radius;
    }

    public float getLength(){
        float length;
        length = (float) (radius*6.28);
        return length;
    }
}
