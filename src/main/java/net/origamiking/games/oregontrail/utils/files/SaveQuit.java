package net.origamiking.games.oregontrail.utils.files;

public class SaveQuit {
    public static void save_and_quit() {
        SaveGame.saveGame();
        System.exit(0);
    }
}
