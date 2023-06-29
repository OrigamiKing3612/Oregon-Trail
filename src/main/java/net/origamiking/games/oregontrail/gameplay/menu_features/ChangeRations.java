package net.origamiking.games.oregontrail.gameplay.menu_features;

import javafx.scene.control.Button;
import net.origamiking.games.oregontrail.variables.Variables;

public class ChangeRations {
    public static void changeRations() {
        Button[] buttons = new Button[4];
        buttons[0] = new Button("Leave");
        buttons[1] = new Button("6 Rations Per Person");
        buttons[2] = new Button("4 Rations Per Person");
        buttons[3] = new Button("2 Rations Per Person");

        for (Button button : buttons) {
            button.setOnAction(e -> handleButtonClick(button.getText()));
        }
    }
    private static void handleButtonClick(String buttonText) {
        switch (buttonText) {
            case "2 Rations Per Person" -> Variables.RATIONS_PER_PERSON = 2;
            case "4 Rations Per Person" -> Variables.RATIONS_PER_PERSON = 4;
            case "6 Rations Per Person" -> Variables.RATIONS_PER_PERSON = 6;
            case "Leave" -> {/*TODO Leave*/}
            default -> {
            }
        }
    }
}
