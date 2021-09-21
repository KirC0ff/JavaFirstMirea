package ru.mirea.task6.opt2;

public class Laptop implements Priceable{
    private String model;
    private int price;

    public Laptop(String m, int p){
        model = m;
        price = p;
    }

    public int getPrice(){
        return price;
    }
    public String getModel(){
        return model;
    }
}
