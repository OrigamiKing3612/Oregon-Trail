package net.origamiking.games.oregontrail.gameplay.events;

import javafx.scene.control.Button;
import net.origamiking.games.oregontrail.OregonTrailApplication;
import net.origamiking.games.oregontrail.utils.Utils;
import net.origamiking.games.oregontrail.variables.Variables;

public class DonnerParty {
    public static void donnerParty() {
        int p = Utils.returnNumber(90, 140);
        int person_to_die_number = Utils.returnPerson();
        String person_to_die = Utils.returnPersonName(person_to_die_number);
        OregonTrailApplication.println("The Donner Party shows up and sabotages you. They ask for " + p + " pounds of food.");
        Button[] buttons = new Button[2];
        buttons[0] = new Button("Yes");
        buttons[1] = new Button("No");
        for (Button button : buttons) {
            button.setOnAction(e -> {
                switch (button.getText().toLowerCase()) {
                    case "yes" -> {
                        if (Variables.POUNDS_OF_FOOD >= p) {
                            OregonTrailApplication.println("You give then " + p + " pounds of food. They take it and leave.");
                            Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - p;
                        } else {
                            OregonTrailApplication.println("You don't have the amount of food they wants.");
                        }
                    }
                    case "no" -> {
                        OregonTrailApplication.println("You say no and try move on, but they stop you and take " + person_to_die + ".\nThey walk off. " + person_to_die + " has been eaten. " + person_to_die + " is dead");
                        Utils.die(person_to_die_number);
                    }
                }
            });
        }
    }
}
