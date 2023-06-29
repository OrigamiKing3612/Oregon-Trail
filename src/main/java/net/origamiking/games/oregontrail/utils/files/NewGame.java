package net.origamiking.games.oregontrail.utils.files;

import javafx.scene.control.TextInputDialog;
import net.origamiking.games.oregontrail.OregonTrailApplication;
import net.origamiking.games.oregontrail.gameplay.start.ChooseCharacters;
import net.origamiking.games.oregontrail.gameplay.start.FirstStore;
import net.origamiking.games.oregontrail.variables.FileVariables;

import static net.origamiking.games.oregontrail.variables.FileVariables.getSaveDirectory;

public class NewGame {
    public static void set_save_name() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Save Name");
        dialog.setHeaderText(null);
        dialog.setContentText("Please name your save:");
        dialog.showAndWait().ifPresent(saveName -> FileVariables.SAVE_NAME = saveName);
        if (FileVariables.SAVE_NAME.isEmpty()) {
            FileVariables.SAVE_NAME = "Oregon-Trail-Save";
        }
        FileVariables.FILE_NAME = getSaveDirectory() + FileVariables.SAVE_NAME + ".txt";
        OregonTrailApplication.println("Your save is named: " + FileVariables.SAVE_NAME);
    }

    public static void newGame() {
        set_save_name();
        OregonTrailApplication.println("");
        OregonTrailApplication.println("This is a text based game.");
        OregonTrailApplication.println("Your goal is to get to Oregon before winter.");
        ChooseCharacters.choose_characters();
//        OregonTrailApplication.inventoryWindow = new InventoryWindow();
//        Inventory.printToWindow();
        FirstStore.firstStore();
        OregonTrailApplication.println("Its May 1st\nYou leave for Oregon Tomorrow...");
    }
}
