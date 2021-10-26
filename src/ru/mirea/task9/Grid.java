package ru.mirea.task9;
import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame{
    public int scoreZenit = 0, scoreSpartak = 0;
    public JButton zenitButton = new JButton("Zenit");
    public JButton spartakButton = new JButton("Spartak");
    public JLabel lastScore = new JLabel("Last Soccer: N/A");
    public JLabel score = new JLabel("Result: 0:0");
    public Label result = new Label("Winner: DRAW");
    void check() {
        if (scoreZenit > scoreSpartak)
            result.setText("Winner: Zenit SPB");
        else if (scoreSpartak > scoreZenit)
            result.setText("Winner: Spartak MSK");
        else result.setText("Winner: DRAW");
    }
    public Grid(){
        super("Football match: Zenit SPB - Spartak MSK");

        Container container = getContentPane();
        GridBagConstraints constraints = new GridBagConstraints();
        container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        setLayout(new GridBagLayout());
        setSize(500,300);
        setLocationRelativeTo(null);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady = 40;
        constraints.weightx = 0.5;
        constraints.gridy = 0;
        constraints.gridx = 0;
        container.add(zenitButton, constraints);

        constraints.ipady = 40;
        constraints.weightx = 0.5;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy = 0;
        constraints.gridx = 2;
        container.add(spartakButton, constraints);

        constraints.ipady = 20;
        constraints.weightx = 1;
        constraints.gridy = 0;
        constraints.gridx = 1;
        constraints.fill=GridBagConstraints.CENTER;
        container.add(score, constraints);

        constraints.gridy = 1;
        constraints.gridx = 1;
        container.add(lastScore, constraints);

        constraints.ipady = 0;
        constraints.weightx = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.gridy = 2;
        constraints.gridx = 1;
        container.add(result, constraints);
        zenitButton.addActionListener(f -> {
            scoreZenit++;
            score.setText("Result: "+scoreZenit+":"+scoreSpartak);
            lastScore.setText("Last Scorer: Zenit");
            check();
        });
        spartakButton.addActionListener(f -> {
            scoreSpartak++;
            score.setText("Result: "+scoreZenit+":"+scoreSpartak);
            lastScore.setText("Last Scorer: Spartak");
            check();
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
