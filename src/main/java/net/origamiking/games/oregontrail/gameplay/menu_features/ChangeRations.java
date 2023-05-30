package net.origamiking.games.oregontrail.gameplay.menu_features;

import net.origamiking.games.oregontrail.variables.Variables;

import javax.swing.*;

public class ChangeRations {
    public static void changeRations() {
        String[] options = {"Leave","6 Rations Per Person.", "4 Rations Per Person.", "2 Rations Per Person."};

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Change Rations Per Person", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);
        switch (choice) {
            case 0 -> {}
            case 3 -> Variables.RATIONS_PER_PERSON = 2;
            case 2 -> Variables.RATIONS_PER_PERSON = 4;
            case 1 -> Variables.RATIONS_PER_PERSON = 6;
        }
    }
}
