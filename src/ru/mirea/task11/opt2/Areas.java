package ru.mirea.task11.opt2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Areas extends JFrame {
    public JPanel north = new JPanel();
    public JPanel center = new JPanel();
    public JPanel south = new JPanel();
    public JPanel west = new JPanel();
    public JPanel east = new JPanel();

    public Areas() {
        super("Тамриэль");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 400);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setVisible(true);

        north.setBackground(Color.lightGray);
        north.setPreferredSize(new Dimension(50,100));
        JLabel jNorth = new JLabel("Скайрим");
        north.add(jNorth);

        south.setBackground(Color.magenta);
        south.setPreferredSize(new Dimension(50,100));
        JLabel jSouth = new JLabel("Эльсвейр");
        south.add(jSouth);

        center.setBackground(Color.green);
        JLabel jCenter = new JLabel("Сиродил");
        center.add(jCenter);

        west.setBackground(Color.orange);
        west.setPreferredSize(new Dimension(275,50));
        JLabel jWest = new JLabel("Хаммерфелл");
        west.add(jWest);

        east.setBackground(Color.red);
        east.setPreferredSize(new Dimension(275,50));
        JLabel jEast = new JLabel("Морровинд");
        east.add(jEast);

        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);
        add(west, BorderLayout.WEST);
        add(east, BorderLayout.EAST);

        north.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {
                jNorth.setText("Скайрим - родина Нордов");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                jNorth.setText("Скайрим");
            }
        });
        west.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {
                jWest.setText("Хаммерфелл больше не в составе Империи");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                jWest.setText("Хаммерфелл");
            }
        });
        center.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {
                jCenter.setText("Сиродил - центр Империи");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                jCenter.setText("Сиродил");
            }
        });
        south.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {
                jSouth.setText("Эльсвейр - родина каджитов");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                jSouth.setText("Эльсвейр");
            }
        });
        east.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {
                jEast.setText("Морровинд - центр двемерской цивилизации");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                jEast.setText("Морровинд");
            }
        });
    }

    public static void main(String[] args) {
        new Areas();
    }
}