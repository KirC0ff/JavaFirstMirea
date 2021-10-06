package ru.mirea.task8.opt1;

import javax.swing.*;
import java.awt.GridLayout;

public class PlaceShapes extends JFrame {
    public PlaceShapes(){
        setLayout(new GridLayout(4,5));
        for (int i = 0; i<20; i++){
            double n = (int)(Math.random()*255);
            if (n<100) add(new Circle());
            if ((n>=100)&&(n<179)) add (new Rectangle());
            if (n>=179) add (new Triangle());
        }
        setTitle("Colored shapes");
        setBounds(200, 100, 800, 640);
    }
}
