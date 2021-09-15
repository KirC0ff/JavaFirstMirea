package ru.mirea.task2;

public class Shape {
    private String type;
    private int volume;

    public Shape(String type, int vol){
        this.type = type;
        volume = vol;
    }
    public Shape(String type){
        this.type = type;
        volume = 0;
    }
    public String toString(){
        return this.type +", V = "+ this.volume +" m3";
    }
}
