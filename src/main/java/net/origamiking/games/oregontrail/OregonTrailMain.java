package net.origamiking.games.oregontrail;

import net.origamiking.games.oregontrail.gameplay.day.Day;
import net.origamiking.games.oregontrail.utils.files.LoadGame;
import net.origamiking.games.oregontrail.utils.files.NewGame;
import net.origamiking.games.oregontrail.variables.Variables;
import net.origamiking.games.oregontrail.window.InventoryWindow;
import net.origamiking.games.oregontrail.window.OregonTrailWindowMain;

import javax.swing.*;

public class OregonTrailMain {
    private static OregonTrailWindowMain window;
    public static InventoryWindow inventoryWindow;

    public static void main(String[] args) {
        if (isMacOS()) {
            System.setProperty("apple.awt.application.name", "Oregon Trail");
            System.setProperty("apple.awt.application.appearance", "system");
            System.setProperty("apple.awt.application.icon", "Info.plist");
            System.setProperty("apple.awt.brushMetalLook", "true");
            System.setProperty("apple.awt.showGrowBox", "true");
        }
        window = new OregonTrailWindowMain();
        inventoryWindow = new InventoryWindow();
        OregonTrailMain.println("Welcome to Oregon-Trail by OrigamiKing3612");
        String[] options = {"Load Game", "New Game"};
        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Load Game or New Game", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, options[1]);

        switch (choice) {
            case 0 -> LoadGame.loadGame();
            case 1 -> NewGame.newGame();
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        }
        for (int d = Variables.DAYS; d < Variables.MAX_DAYS; d++) {
            Day.day();
        }
    }

    public static void println(String string) {
        window.appendTextln(string);
    }

    public static void print(String string) {
        window.appendText(string);
    }
    public static boolean isMacOS() {
        String osName = System.getProperty("os.name").toLowerCase();
        return osName.contains("mac");
    }
}