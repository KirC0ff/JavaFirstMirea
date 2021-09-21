package ru.mirea.task8.opt1;

import java.awt.*;

public class Circle extends Shape{
    protected void paintShape(Graphics g){
        int red = (int) (Math.random()*255);
        int green = (int) (Math.random()*255);
        int blue = (int) (Math.random()*255);
        g.setColor(new Color(red, green, blue));
        g.drawOval(5,5,getWidth()-10, getHeight()-10);
        g.setColor(Color.blue);
    }
}
