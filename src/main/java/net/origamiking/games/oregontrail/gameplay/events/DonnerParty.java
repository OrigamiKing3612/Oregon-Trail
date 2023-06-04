package net.origamiking.games.oregontrail.gameplay.events;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.utils.Utils;
import net.origamiking.games.oregontrail.variables.Variables;

import javax.swing.*;

public class DonnerParty {
    public static void donnerParty() {
        int p = Utils.returnNumber(90, 140);
        int person_to_die_number = Utils.returnPerson();
        String person_to_die = Utils.returnPersonName(person_to_die_number);
        OregonTrailMain.println("The Donner Party shows up and sabotages you. They ask for " + p + " pounds of food.");
        String[] options = {"No", "Yes"};

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Do you give the food to the Donner Party?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);

        switch (choice) {
            case 1 -> {
                if (Variables.POUNDS_OF_FOOD >= p) {
                    OregonTrailMain.println("You give then " + p + " pounds of food. They take it and leave.");
                    Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - p;
                } else {
                    OregonTrailMain.println("You don't have the amount of food they wants.");
                }
            }
            case 0 -> {
                OregonTrailMain.println("You say no and try move on, but they stop you and take " + person_to_die + ".\nThey walk off. " + person_to_die + " has been eaten. " + person_to_die + " is dead");
                Utils.die(person_to_die_number);
            }
        }
    }
}
