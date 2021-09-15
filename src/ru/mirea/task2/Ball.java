package ru.mirea.task2;

public class Ball {
    private String color;
    private double size;

    public Ball(String c, int s){
        color = c;
        size = s;
    }
    public Ball(String c){
        color = c;
        size = 5;
    }
    public Ball(){
        color = "Black and white";
        size = 5;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getSize(){
        return size;
    }
    public String toString(){
        return this.color+", size: "+this.size;
    }
    public void ballVolume(){
        System.out.println("Volume of "+color+" ball is "+(size*size*size*68.6)+"cm3");
    }
}
