package net.origamiking.games.oregontrail.gameplay.events.fort;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.menu_features.Rest;
import net.origamiking.games.oregontrail.gameplay.menu_features.SeeInventory;
import net.origamiking.games.oregontrail.utils.files.SaveQuit;

import javax.swing.*;

public class Fort {
    public static void fort() {
        boolean move_on = false;
        OregonTrailMain.println("You came to a Fort.");
        OregonTrailMain.println("What would you like to do?");

        String[] options = {"Save and Quit", "Depart", "See Inventory", "Rest", "Shop", "See the doctor"};

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "What would you like to do?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);
        switch (choice) {
            case 5 -> SeeDoctor.seeDoctor();
            case 4 -> FortStore.fortStore();
            case 3 -> Rest.rest();
            case 2 -> SeeInventory.useStuff();
            case 1 -> move_on = true;
            case 0 -> SaveQuit.save_and_quit();
        }
        if (!move_on) fort();
    }
}
