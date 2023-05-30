package net.origamiking.games.oregontrail;

import net.origamiking.games.oregontrail.gameplay.start.ChooseCharacters;
import net.origamiking.games.oregontrail.gameplay.start.FirstStore;
import net.origamiking.games.oregontrail.gameplay.day.Day;
import net.origamiking.games.oregontrail.variables.Variables;
import net.origamiking.games.oregontrail.window.OregonTrailWindowMain;

import javax.swing.*;

public class OregonTrailMain {
    public static boolean DEBUG_MODE = false;
    private static OregonTrailWindowMain window;

    public static void main(String[] args) {

        if (isMacOS()) {
            System.setProperty("apple.awt.application.name", "Oregon Trail");
            System.setProperty("apple.awt.application.appearance", "system");
            System.setProperty("apple.awt.application.icon", "Info.plist");
            System.setProperty("apple.awt.brushMetalLook", "true");
            System.setProperty("apple.awt.showGrowBox", "true");
        }
        window  = new OregonTrailWindowMain();
        if (DEBUG_MODE) {
                OregonTrailMain.println("DEBUG MODE");
                isDebugMode();
            } else {
                OregonTrailMain.println("Welcome to Oregon Trail by OrigamiKing3612.");
                OregonTrailMain.println("This is a text based game.");
                OregonTrailMain.println("Your goal is to get to Oregon before winter.");
                OregonTrailMain.println("Are you ready to get started? Y/N");
                String[] options = {"No", "Yes"};

                int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Are you ready to get started?", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE, null, options, options[1]);

                if (!(choice == 1)) OregonTrailMain.println("Too bad.");
                ChooseCharacters.choose_characters();
                FirstStore.firstStore();
            }
            OregonTrailMain.println("Its May 1st\nYou leave for Oregon Tomorrow...");
            for (int d = Variables.DAYS; d < Variables.MAX_DAYS; d++) {
                Day.day();
            }
//        });
    }
    public static void println(String string) {
        window.appendTextln(string);
    }
    public static void print(String string) {
        window.appendText(string);
    }

    public static void isDebugMode() {
        if (DEBUG_MODE) {
            Variables.POUNDS_OF_FOOD = 10000;
            Variables.COINS = 10000;
            Variables.BULLETS = 10000;
            Variables.WAGON_TYPE = "DEBUG WAGON";
        }
    }
    private static boolean isMacOS() {
        String osName = System.getProperty("os.name").toLowerCase();
        return osName.contains("mac");
    }
}