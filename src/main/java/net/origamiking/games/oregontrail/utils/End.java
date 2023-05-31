package net.origamiking.games.oregontrail.utils;

import net.origamiking.games.oregontrail.OregonTrailMain;

import javax.swing.*;

public class End {
    public static void end() {

        String[] options = {"Leave", "Replay"};

        OregonTrailMain.println("You Died. Thanks for playing!");

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Replay or Leave", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);
        switch (choice) {
            case 0 -> System.exit(0);
            case 1 -> OregonTrailMain.start();
        }
    }
}
