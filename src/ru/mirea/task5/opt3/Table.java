package ru.mirea.task5.opt3;

class Table extends Furniture{
    private String scale;

    public Table(String name, String material, String color, int price, String scale) {
        super(name, material, color, price);
        this.scale = scale;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Размеры "+scale+" см");
    }
}
