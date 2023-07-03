package net.origamiking.games.oregontrail.utils;

import net.origamiking.games.oregontrail.OregonTrailApplication;

public class End {
    public static void end() {
        OregonTrailApplication.println("You Died. Thanks for playing!");
//
//        String[] options = {"Leave", "Replay"};
//        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Replay or Leave", JOptionPane.DEFAULT_OPTION,
//                JOptionPane.PLAIN_MESSAGE, null, options, null);
//        switch (choice) {
//            case 0 -> System.exit(0);
//            case 1 -> {
//                OregonTrailMain.oregonTrailWindow.clearWindow();
//                OregonTrailMain.start();
//            }
//        }
        System.exit(0);
    }
}
