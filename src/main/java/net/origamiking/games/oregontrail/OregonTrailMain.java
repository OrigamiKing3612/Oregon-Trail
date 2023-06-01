package net.origamiking.games.oregontrail;

import net.origamiking.games.oregontrail.gameplay.day.Day;
import net.origamiking.games.oregontrail.utils.files.DeleteGame;
import net.origamiking.games.oregontrail.utils.files.LoadGame;
import net.origamiking.games.oregontrail.utils.files.NewGame;
import net.origamiking.games.oregontrail.variables.Variables;
import net.origamiking.games.oregontrail.window.InventoryWindow;
import net.origamiking.games.oregontrail.window.OregonTrailWindowMain;

import javax.swing.*;
import java.awt.*;

public class OregonTrailMain {
    public static OregonTrailWindowMain oregonTrailWindowMain;
    public static InventoryWindow inventoryWindow;
    public static void main(String[] args) {
        if (isMacOS()) {
            System.setProperty("apple.awt.application.name", "Oregon Trail By: OrigamiKing3612");
            System.setProperty("apple.awt.application.appearance", "system");
            System.setProperty("apple.awt.application.icon", "Info.plist");
            System.setProperty("apple.awt.brushMetalLook", "true");
            System.setProperty("apple.awt.showGrowBox", "true");
        }
        setColors();
        oregonTrailWindowMain = new OregonTrailWindowMain();
        inventoryWindow = new InventoryWindow();
        OregonTrailMain.println("Welcome to Oregon-Trail by OrigamiKing3612");
        start();
    }
    public static void println(String string) {
        oregonTrailWindowMain.appendTextln(string);
    }
    public static void print(String string) {
        oregonTrailWindowMain.appendText(string);
    }
    public static boolean isMacOS() {
        String osName = System.getProperty("os.name").toLowerCase();
        return osName.contains("mac");
    }
    public static void start() {
        // TODO Add a leave/back to Delete Save and shop
        // TODO make the harmonica Work
        // TODO if person is dead, they still show up on options
        String[] options = {"Delete Save", "Load Game", "New Game"};
        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Load Game, New Game, or Delete Save", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[2]);

        switch (choice) {
            case 2 -> NewGame.newGame();
            case 1 -> LoadGame.loadSaves();
            case 0 -> DeleteGame.deleteSave();
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        }
        for (int d = Variables.DAYS; d < Variables.MAX_DAYS; d++) {
            Day.day();
        }
    }
    private static void setColors() {
        try {
            Font font = new Font("Times New Roman", Font.PLAIN, 16);
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            UIManager.put("OptionPane.background", Color.BLACK);
            UIManager.put("OptionPane.buttonBackground", Color.BLACK);
            UIManager.put("OptionPane.messageForeground", Color.GREEN);
            UIManager.put("OptionPane.buttonForeground", Color.GREEN);
            UIManager.put("Panel.background", Color.BLACK);
            UIManager.put("TextField.background", Color.DARK_GRAY);
            UIManager.put("TextField.foreground", Color.GREEN);
            UIManager.put("Button.background", Color.BLACK);
            UIManager.put("Button.foreground", Color.WHITE);
            UIManager.put("ComboBox.background", Color.BLACK);
            UIManager.put("Label.font", font);
            UIManager.put("Button.font", font);
            UIManager.put("TextField.font", font);
            UIManager.put("ComboBox.font", font);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}