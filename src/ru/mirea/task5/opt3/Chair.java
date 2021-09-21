package ru.mirea.task5.opt3;

class Chair extends Furniture{
    private int height;

    public Chair(String name, String material, String color, int price, int height) {
        super(name, material, color, price);
        this.height = height;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Высота сидения: "+height+" см");
    }
}
