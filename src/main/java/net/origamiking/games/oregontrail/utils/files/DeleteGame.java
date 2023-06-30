package net.origamiking.games.oregontrail.utils.files;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import net.origamiking.games.oregontrail.OregonTrailApplication;
import net.origamiking.games.oregontrail.utils.Utils;
import net.origamiking.games.oregontrail.variables.FileVariables;

import java.io.File;

public class DeleteGame {
    public static void deleteSave() {
        Stage primaryStage = new Stage();
        File folder = new File(FileVariables.SAVES_DIRECTORY);

        if (folder.isDirectory()) {
            File[] files = folder.listFiles();

            if (files != null) {
                int fileCount = 0;
                for (File file : files) {
                    if (file.isFile() && !file.getName().equals(".DS_Store")) {
                        fileCount++;
                    }
                }

                String[] options = new String[fileCount + 1];
                int index = 0;

                for (File file : files) {
                    if (file.isFile() && !file.getName().equals(".DS_Store")) {
                        String fileName = file.getName();
                        String option = fileName.substring(0, fileName.lastIndexOf("."));
                        options[index] = option;
                        index++;
                    }
                }
                options[fileCount] = "Back";
                Utils.reverseArray(options);

                HBox menuLayout = new HBox(10);
                menuLayout.setPadding(new Insets(10));
                menuLayout.setAlignment(Pos.CENTER);

                for (String option : options) {
                    Button button = new Button(option);
                    button.setOnAction(e -> handleButtonClick(button.getText()));
                    menuLayout.getChildren().add(button);
                }

                Scene scene = new Scene(menuLayout);
                primaryStage.setTitle("Saves");
                primaryStage.setScene(scene);
                primaryStage.show();
            }
        }
    }

    private static void handleButtonClick(String buttonText) {
        if (buttonText.equals("Back")) {
//            OregonTrailMain.start();
        } else {
            String saveFileName = buttonText + ".txt";
            File saveFile = new File(FileVariables.SAVES_DIRECTORY, saveFileName);
            if (saveFile.delete()) {
                OregonTrailApplication.println("Save deleted successfully: " + saveFile.getName());
            } else {
                OregonTrailApplication.println("Failed to delete the save: " + saveFile.getName());
            }
        }
    }
}