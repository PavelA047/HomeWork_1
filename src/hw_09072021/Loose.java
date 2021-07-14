package hw_09072021;

import javax.swing.*;
import java.awt.*;

public class Loose extends JFrame {
    public Loose() {
        setBounds(250, 250, 200, 100);
        setTitle("TicTacToe");
        setLayout(new GridLayout(2, 1));
        JButton button = new JButton("ok");
        add(new Label("You have lost! Congratulations :("));
        add(button);
        button.addActionListener(e -> {
            setVisible(false);
        });
    }
}
