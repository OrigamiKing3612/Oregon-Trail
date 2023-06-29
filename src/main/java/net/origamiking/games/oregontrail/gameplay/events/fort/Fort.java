package net.origamiking.games.oregontrail.gameplay.events.fort;

import javafx.scene.control.Button;
import net.origamiking.games.oregontrail.OregonTrailApplication;
import net.origamiking.games.oregontrail.gameplay.menu_features.Rest;
import net.origamiking.games.oregontrail.gameplay.menu_features.SeeInventory;
import net.origamiking.games.oregontrail.utils.files.SaveQuit;

public class Fort {
    public static void fort() {
        final boolean[] move_on = {false};
        OregonTrailApplication.println("You came to a Fort.");
        OregonTrailApplication.println("What would you like to do?");

        Button[] buttons = new Button[6];
        buttons[0] = new Button("See the doctor");
        buttons[1] = new Button("Shop");
        buttons[2] = new Button("Rest");
        buttons[3] = new Button("See Inventory");
        buttons[4] = new Button("Depart");
        buttons[5] = new Button("Save and Quit");

        for (Button button : buttons) {
            button.setOnAction(e -> {
                switch (button.getText()) {
//                    case "See the doctor" -> SeeDoctor.seeDoctor();
                    case "Shop" -> FortStore.fortStore();
                    case "Rest" -> Rest.rest();
                    case "See Inventory" -> SeeInventory.useStuff();
                    case "Depart" -> move_on[0] = true;
                    case "Save and Quit" -> SaveQuit.save_and_quit();
                }
                if (!move_on[0]) fort();
            });
        }
    }
}
