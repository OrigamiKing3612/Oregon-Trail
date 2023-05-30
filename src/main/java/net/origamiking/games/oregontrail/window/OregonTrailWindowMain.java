package net.origamiking.games.oregontrail.window;

import javax.swing.*;
import java.awt.*;

public class OregonTrailWindowMain {
    private final JFrame frame;
    private final JTextArea textArea;

    public OregonTrailWindowMain() {
        frame = new JFrame("Oregon Trail by OrigamiKing3612");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea(20, 40);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.add(scrollPane, BorderLayout.CENTER);

//        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.getContentPane().add(scrollPane);

        Font font = new Font("Trebuchet MS", Font.PLAIN, 16);
        textArea.setFont(font);
//        textArea.setForeground(Color.GREEN);

        frame.setSize(1100, 1000);
        frame.setVisible(true);
    }

    public void appendTextln(String text) {
        textArea.append(text + "\n");
        textArea.setCaretPosition(textArea.getDocument().getLength());

    }
    public void appendText(String text) {
        textArea.append(text);
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}
