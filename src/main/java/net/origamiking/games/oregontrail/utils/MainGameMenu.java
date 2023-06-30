package net.origamiking.games.oregontrail.utils;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import net.origamiking.games.oregontrail.OregonTrailApplication;

public class MainGameMenu {
    public static void mainGameMenu(String dayStuff) {
        Stage primaryStage = new Stage();
//        Inventory.printToWindow();

        if (!dayStuff.isEmpty()) {
            System.out.println(dayStuff);
        }

        Button[] buttons = new Button[5];
        buttons[0] = new Button("Save and Quit");
        buttons[1] = new Button("Rest");
        buttons[2] = new Button("Use Stuff");
        buttons[3] = new Button("Change Rations");
        buttons[4] = new Button("Continue Traveling");
        OregonTrailApplication.hBox.getChildren().clear();
        OregonTrailApplication.hBox.getChildren().addAll(buttons);
        for (Button button : buttons) {
            button.setOnAction(e -> {
                boolean move_on = false;

                switch (button.getText()) {
                    case "Continue Traveling" -> move_on = true;
//            case "Change Rations" -> ChangeRations.changeRations();
//            case "Use Stuff" -> SeeInventory.useStuff();
//            case "Rest" -> Rest.rest();
//            case "Save and Quit" -> SaveQuit.save_and_quit();
                    default -> {
                    }
                }

                if (!move_on) {
                    mainGameMenu(dayStuff);
                }
            });
        }

        VBox menuLayout = new VBox(10);
        menuLayout.setPadding(new Insets(10));
        menuLayout.setAlignment(Pos.CENTER);
        menuLayout.getChildren().addAll(buttons);

        Scene scene = new Scene(menuLayout);
        primaryStage.setTitle("Main Game Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
