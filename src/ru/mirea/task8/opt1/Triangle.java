package ru.mirea.task8.opt1;

import java.awt.*;

public class Triangle extends Shape{
    protected void paintShape(Graphics g){
        int red = (int) (Math.random()*255);
        int green = (int) (Math.random()*255);
        int blue = (int) (Math.random()*255);
        g.setColor(new Color(red, green, blue));
        g.drawLine(5, getHeight()-10, getWidth()/2-5,5);
        g.drawLine(getWidth()/2-5,5, getWidth()-10, getHeight()-10);
        g.drawLine(getWidth()-10, getHeight()-10, 5, getHeight()-10);
    }
}
