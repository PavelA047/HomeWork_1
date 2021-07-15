package hw_09072021;

import javax.swing.*;
import java.awt.*;

public class Settings extends JFrame {
    private final int MIN_FIELD_SIZE = 3;
    private final int MAX_FIELD_SIZE = 10;
    private GameWindow gameWindow;
    private JSlider slFieldSize;
    private JSlider slDotsToWin;

    public Settings(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBounds(250, 250, 450, 450);
        setTitle("TicTacToe settings");

        setLayout(new GridLayout(5, 1));
        slFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        slFieldSize.setMajorTickSpacing(1);
        slFieldSize.setPaintTicks(true);
        slFieldSize.setPaintLabels(true);
        slDotsToWin = new JSlider(MIN_FIELD_SIZE, MIN_FIELD_SIZE, MIN_FIELD_SIZE);
        slDotsToWin.setMajorTickSpacing(1);
        slDotsToWin.setPaintTicks(true);
        slDotsToWin.setPaintLabels(true);
        slFieldSize.addChangeListener(e -> {
            slDotsToWin.setMaximum(slFieldSize.getValue());
        });
        add(new Label("Choose FieldSize"));
        add(slFieldSize);
        add(new Label("Choose winning line"));
        add(slDotsToWin);

        JButton button = new JButton("Start a game");
        add(button);
        button.addActionListener(e -> {
            int fieldSize = slFieldSize.getValue();
            int winLength = slDotsToWin.getValue();
            Logic.SIZE = fieldSize;
            Logic.DOTS_TO_WIN = winLength;
            Logic.initMap();
            Logic.printMap();
            Logic.isGameFinished = false;
            gameWindow.startNewGame(fieldSize, winLength);
            setVisible(false);
        });
    }
}
