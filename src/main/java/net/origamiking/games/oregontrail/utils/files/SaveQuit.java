package net.origamiking.games.oregontrail.utils.files;

import net.origamiking.games.oregontrail.OregonTrailApplication;

public class SaveQuit {
    public static void save_and_quit() {
        SaveGame.saveGame();
        OregonTrailApplication.clearWindow();
//        OregonTrailApplication.inventoryWindow.clearWindow();
//        OregonTrailApplication.inventoryWindow.closeWindow();
//        OregonTrail.start();
    }
}
