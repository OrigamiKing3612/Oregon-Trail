package net.origamiking.games.oregontrail.utils.files;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.start.ChooseCharacters;
import net.origamiking.games.oregontrail.gameplay.start.FirstStore;
import net.origamiking.games.oregontrail.window.Inventory;

import javax.swing.*;

public class NewGame {
    public static void newGame() {
        OregonTrailMain.println("This is a text based game.");
        OregonTrailMain.println("Your goal is to get to Oregon before winter.");
        OregonTrailMain.println("Are you ready to get started? Y/N");
        String[] options = {"No", "Yes"};

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Are you ready to get started?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, options[1]);

        if (!(choice == 1)) OregonTrailMain.println("Too bad.");
        ChooseCharacters.choose_characters();
        Inventory.printToWindow();
        FirstStore.firstStore();
        OregonTrailMain.println("Its May 1st\nYou leave for Oregon Tomorrow...");
    }
}
