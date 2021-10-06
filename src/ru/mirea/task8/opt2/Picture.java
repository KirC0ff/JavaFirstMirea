package ru.mirea.task8.opt2;

import javax.swing.*;
import java.awt.*;

public class Picture extends JFrame {
    private JLabel picLabel;
    private Container component;

    public Picture(String s) {
        setTitle("РТУ МИРЭА");
        setBounds(150, 150, 520, 360);

        component = new Container();
        component = getContentPane();
        component.setLayout(new BorderLayout());
        picLabel = new JLabel(new ImageIcon(s));
        component.add(picLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}