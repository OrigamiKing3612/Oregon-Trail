package net.origamiking.games.oregontrail.utils.files;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.utils.Utils;
import net.origamiking.games.oregontrail.variables.FileVariables;

import javax.swing.*;
import java.io.File;

public class DeleteGame {
    public static void deleteSave() {
        File folder = new File(FileVariables.SAVES_DIRECTORY);

        if (folder.isDirectory()) {
            File[] files = folder.listFiles();

            if (files != null) {
                int fileCount = 0;
                for (File file : files) {
                    if (file.isFile() && !file.getName().equals(".DS_Store")) {
                        fileCount++;
                    }
                }

                String[] options = new String[fileCount + 1];
                int index = 0;

                for (File file : files) {
                    if (file.isFile() && !file.getName().equals(".DS_Store")) {
                        String fileName = file.getName();
                        String option = fileName.substring(0, fileName.lastIndexOf("."));
                        options[index] = option;
                        index++;
                    }
                }
                options[fileCount] = "Back";
                Utils.reverseArray(options);
                int choice = JOptionPane.showOptionDialog(null, "Pick a save:", "Saves", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE, null, options, null);
                if (choice >= 0 && choice < options.length - 1) {
                    File selectedFile = files[choice];
                    if (selectedFile.delete()) {
                        System.out.println("Save deleted successfully: " + selectedFile.getName());
                    } else {
                        System.out.println("Failed to delete the save: " + selectedFile.getName());
                    }
                } else {
                    OregonTrailMain.start();
                }
            }
        }
        OregonTrailMain.start();
    }
}
