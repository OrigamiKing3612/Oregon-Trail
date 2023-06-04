package net.origamiking.games.oregontrail;

import net.origamiking.games.oregontrail.gameplay.day.Day;
import net.origamiking.games.oregontrail.utils.Utils;
import net.origamiking.games.oregontrail.utils.files.DeleteGame;
import net.origamiking.games.oregontrail.utils.files.LoadGame;
import net.origamiking.games.oregontrail.utils.files.NewGame;
import net.origamiking.games.oregontrail.utils.files.SaveGame;
import net.origamiking.games.oregontrail.variables.Variables;
import net.origamiking.games.oregontrail.window.InventoryWindow;
import net.origamiking.games.oregontrail.window.OregonTrailWindow;

import javax.swing.*;

public class OregonTrailMain {
    public static OregonTrailWindow oregonTrailWindow;
    public static InventoryWindow inventoryWindow;
    public static final String VERSION = "0.1.0";
    public static final String SAVE_VERSION_1 = "1";
    public static final String SAVE_VERSION_2 = "a";
    public static final String FULL_SAVE_VERSION = "Save-Version: " + SAVE_VERSION_1 + SAVE_VERSION_2;
    public static boolean game = false;

//  Update
//  To update change versions in OregonTrailMain
//  And the checkers in LoadGame
//  Then build jar
    private static void startup() {
        System.out.println("Starting Oregon Trail version: " + VERSION);
        Utils.macStuff();
        Runtime.getRuntime().addShutdownHook(new Thread(SaveGame::saveGame));
        Utils.setColors();
        oregonTrailWindow = new OregonTrailWindow();
    }
    public static void start() {
        // TODO make the harmonica Work
        // TODO if person is dead, they still show up on options
        OregonTrailMain.println("Welcome to Oregon-Trail by OrigamiKing3612");
        game = false;
        String[] options = {"Quit", "Delete Save", "Load Game", "New Game"};
        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Load Game, New Game, or Delete Save", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[3]);

        switch (choice) {
            case 3 -> NewGame.newGame();
            case 2 -> LoadGame.loadSaves();
            case 1 -> DeleteGame.deleteSave();
            case 0 -> System.exit(0);
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        }

        for (int d = Variables.DAYS; d < Variables.MAX_DAYS; d++) {
            Day.day();
        }
    }
    public static void println(String string) {
        oregonTrailWindow.appendTextln(string);
    }
    public static void print(String string) {
        oregonTrailWindow.appendText(string);
    }
    public static void main(String[] args) {
        startup();
        start();
    }

}