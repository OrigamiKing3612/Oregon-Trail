package net.origamiking.games.oregontrail.utils;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.menu_features.ChangeRations;
import net.origamiking.games.oregontrail.gameplay.menu_features.Rest;
import net.origamiking.games.oregontrail.gameplay.menu_features.SeeInventory;
import net.origamiking.games.oregontrail.utils.files.SaveQuit;
import net.origamiking.games.oregontrail.window.Inventory;

import javax.swing.*;
import java.util.Objects;

public class MainGameMenu {
    public static void mainGameMenu(String dayStuff) {
        Inventory.printToWindow();
        boolean move_on = false;
        if (!(Objects.equals(dayStuff, ""))) OregonTrailMain.println(dayStuff);
        String[] options = { "Save and Quit", "Rest", "Use Stuff", "Change Rations", "Continue Traveling" };

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Main Game Menu", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, options[4]);

        switch (choice) {
            case 4 -> move_on = true;
            case 3 -> ChangeRations.changeRations();
            case 2 -> SeeInventory.useStuff();
            case 1 -> Rest.rest();
            case 0 -> SaveQuit.save_and_quit();
            default -> {}
        }
        if (!move_on) {
            mainGameMenu(dayStuff);
        }
    }
}
