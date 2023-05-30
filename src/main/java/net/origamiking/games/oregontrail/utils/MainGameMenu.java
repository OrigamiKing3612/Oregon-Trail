package net.origamiking.games.oregontrail.utils;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.menu_features.ChangeRations;
import net.origamiking.games.oregontrail.gameplay.menu_features.Rest;
import net.origamiking.games.oregontrail.gameplay.menu_features.SeeInventory;
import net.origamiking.games.oregontrail.window.Inventory;

import javax.swing.*;
import java.util.Objects;

public class MainGameMenu {
    public static void mainGameMenu(String dayStuff) {
        Inventory.printToWindow();
        boolean move_on = false;
        if (!(Objects.equals(dayStuff, ""))) OregonTrailMain.println(dayStuff);
        String[] options = { "Rest", "Use Stuff", "Change Rations", "Continue Traveling" };

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Main Game Menu", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, options[3]);

        switch (choice) {
            case 3 -> move_on = true;
            case 2 -> ChangeRations.changeRations();
            case 1 -> SeeInventory.useStuff();
            case 0 -> Rest.rest();
            default -> {}
        }
        if (!move_on) {
            mainGameMenu(dayStuff);
        }
    }
}
