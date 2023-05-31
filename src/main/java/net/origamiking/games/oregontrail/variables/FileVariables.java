package net.origamiking.games.oregontrail.variables;

import net.origamiking.games.oregontrail.OregonTrailMain;

import java.io.File;

public class FileVariables {
    public static String SAVE_NAME;
    public static String FILE_NAME = getSaveDirectory() + SAVE_NAME + ".txt";
    public static String SAVES_DIRECTORY = getSaveDirectory();
    public static String DIRECTORY = getDirectory();


    public static String getSaveDirectory() {
        String home = System.getProperty("user.home");
        if (OregonTrailMain.isMacOS()) {
            return home + "/Library/Application Support/Oregon-Trail/saves/";
        } else {
            return home + File.separator + "Oregon-Trail" + File.separator + "saves";
        }
    }

    public static String getDirectory() {
        String home = System.getProperty("user.home");
        if (OregonTrailMain.isMacOS()) {
            return home + "/Library/Application Support/Oregon-Trail/";
        } else {
            return home + File.separator + "Oregon-Trail" + File.separator;
        }
    }

    //    public static void getFileName() {
//        File file;
//        file.getName();
//    }
    public static String return_save_name() {
        return FileVariables.SAVE_NAME;
    }
    public static void load() {}
}