package ru.mirea.task11.opt1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guess extends JFrame{
    private int value, attempts = 3;
    private JButton button = new JButton("Enter");
    private JTextField textValue = new JTextField(10);
    private JLabel message = new JLabel("Угадайте число от 0 до 20 за 3 попытки!");

    private void check(int enterValue) {
        String info;
        if (enterValue > value) {
            JOptionPane.showMessageDialog(null, "Число меньше");
            textValue.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Число больше");
            textValue.setText("");
        }
    }

    public Guess(int value){
        super("Игра \"Угадай-ка\"");
        this.value = value;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(300, 100);
        setLocationRelativeTo(null);

        add(button);
        add(textValue);
        add(message);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int enterValue = Integer.parseInt(textValue.getText());
                    if (enterValue != value) {
                        attempts--;
                        if(attempts == 0){
                            JOptionPane.showMessageDialog(null, "Вы проиграли :(");
                            System.exit(0);
                        } else {
                            check(enterValue);
                            message.setText("Осталось попыток: "+attempts);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "В точку!");
                        System.exit(0);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Введите число");
                }
            }
        });
    }

    public static void main(String[] args) {
        int value = (int)(Math.random()*20);
        new Guess(value);
        System.out.println(value);
    }
}