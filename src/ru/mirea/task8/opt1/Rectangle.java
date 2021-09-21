package ru.mirea.task8.opt1;

import java.awt.*;

public class Rectangle extends Shape{
    protected void paintShape(Graphics g){
        int red = (int) (Math.random()*255);
        int green = (int) (Math.random()*255);
        int blue = (int) (Math.random()*255);
        g.setColor(new Color(red, green, blue));
        g.drawRect(5,5,getWidth()-10, getHeight()-10);
    }
}
