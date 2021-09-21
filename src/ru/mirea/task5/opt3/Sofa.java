package ru.mirea.task5.opt3;

class Sofa extends Furniture{
    private String scale, pullOut;

    public Sofa(String name, String material, String color, int price, String scale, String pullOut) {
        super(name, material, color, price);
        this.scale = scale;
        this.pullOut = pullOut;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Размеры "+scale+" см; Раздвижной: "+pullOut);
    }
}
