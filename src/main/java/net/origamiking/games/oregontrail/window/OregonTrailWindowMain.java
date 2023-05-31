package net.origamiking.games.oregontrail.window;

import javax.swing.*;
import java.awt.*;

public class OregonTrailWindowMain {
    private final JTextArea textArea;

    public OregonTrailWindowMain() {
        JFrame frame = new JFrame("Oregon Trail by OrigamiKing3612");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea(20, 40);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.add(scrollPane, BorderLayout.CENTER);

        ImageIcon icon = new ImageIcon("icon.png");

        frame.setIconImage(icon.getImage());

        frame.getContentPane().add(scrollPane);

        Font font = new Font("Times New Roman", Font.PLAIN, 16);
        textArea.setFont(font);
        textArea.setForeground(Color.GREEN);
        textArea.setBackground(Color.BLACK);

        frame.setSize(1100, 1000);
        frame.setVisible(true);
    }

    public void appendTextln(String text) {
        textArea.append(" " + text + "\n");
        textArea.setCaretPosition(textArea.getDocument().getLength());

    }

    public void appendText(String text) {
        textArea.append(text);
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}
