package net.origamiking.games.oregontrail;

import net.origamiking.games.oregontrail.utils.Utils;
import net.origamiking.games.oregontrail.utils.files.SaveGame;

public class OregonTrail {
    public static final String VERSION = "0.1.0";
    public static final String SAVE_VERSION_1 = "1";
    public static final String SAVE_VERSION_2 = "a";
    public static final String FULL_SAVE_VERSION = "Save-Version: " + SAVE_VERSION_1 + SAVE_VERSION_2;
    public static boolean game = false;

//  Update
//  To update change versions in OregonTrailMain
//  And the checkers in LoadGame
//  Then build jar
    public static void startup() {
        System.out.println("Starting Oregon Trail version: " + VERSION);
        OregonTrailApplication.println("Starting Oregon Trail version: " + VERSION);
        Utils.macStuff();
        Runtime.getRuntime().addShutdownHook(new Thread(SaveGame::saveGame));
    }
}
