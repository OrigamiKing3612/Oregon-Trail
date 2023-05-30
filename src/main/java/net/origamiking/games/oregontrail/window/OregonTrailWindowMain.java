package net.origamiking.games.oregontrail.window;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.*;

public class OregonTrailWindowMain {
    private final JFrame frame;
    private final JTextArea textArea;

    public OregonTrailWindowMain() {
        frame = new JFrame("Oregon Trail by OrigamiKing3612");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int rows = 20;
        textArea = new JTextArea(rows, rows * 2);
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.getContentPane().add(scrollPane);

        frame.getContentPane().setBackground(Color.BLACK);
        Font font = new Font("Arial", Font.BOLD, 16);
        textArea.setFont(font);
        textArea.setForeground(Color.GREEN);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public void appendText(String text) {
        textArea.append(text);
    }
}
