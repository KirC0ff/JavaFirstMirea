package ru.mirea.task6.opt1;

public class Planet implements Nameable{
    private String name;
    private int radius;

    public Planet(String n, int r){
        name = n;
        radius = r;
    }
    public String getName(){
        return name;
    }
    public int getRadius(){
        return radius;
    }
}
