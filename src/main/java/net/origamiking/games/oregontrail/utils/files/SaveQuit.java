package net.origamiking.games.oregontrail.utils.files;

import net.origamiking.games.oregontrail.OregonTrailMain;

public class SaveQuit {
    public static void save_and_quit() {
        SaveGame.saveGame();
        OregonTrailMain.oregonTrailWindow.clearWindow();
        OregonTrailMain.inventoryWindow.clearWindow();
        OregonTrailMain.inventoryWindow.closeWindow();
        OregonTrailMain.start();
    }
}
