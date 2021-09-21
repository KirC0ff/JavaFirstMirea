package ru.mirea.task5.opt3;

public abstract class Furniture {
    private String name, material, color;
    private int price;

    public Furniture(String name, String material, String color, int price)
    {
        this.name = name;
        this.material = material;
        this.color = color;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public String getMaterial(){
        return this.material;
    }
    public String getMColor(){
        return this.color;
    }

    public void displayInfo(){
        System.out.println("Артикул: "+name+"; Материал: "+material+"; Цвет: "+color+"; Цена: "+price+"руб.");
    }
}
