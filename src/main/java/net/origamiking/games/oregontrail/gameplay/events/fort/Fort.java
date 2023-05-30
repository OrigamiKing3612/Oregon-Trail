package net.origamiking.games.oregontrail.gameplay.events.fort;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.menu_features.Rest;
import net.origamiking.games.oregontrail.gameplay.menu_features.SeeInventory;

import javax.swing.*;

public class Fort {
    public static void fort() {
        boolean move_on = false;
        OregonTrailMain.println("You came to a Fort.");
        OregonTrailMain.println("What would you like to do?");

        String[] options = {"Depart", "See Inventory", "Rest", "Shop", "See the doctor"};

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "What would you like to do?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);
        switch (choice) {
            case 4 -> SeeDoctor.seeDoctor();
            case 3 -> FortStore.fortStore();
            case 2 -> Rest.rest();
            case 1 -> SeeInventory.seeInventory();
            case 0 -> move_on = true;
        }
        if (!move_on) fort();
    }
}
