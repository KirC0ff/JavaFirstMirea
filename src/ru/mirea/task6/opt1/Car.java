package ru.mirea.task6.opt1;

public class Car implements Nameable{
    private String name;
    private int maxSpeed;

    public Car(String n, int s){
        name = n;
        maxSpeed = s;
    }
    public String getName(){
        return name;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
}
