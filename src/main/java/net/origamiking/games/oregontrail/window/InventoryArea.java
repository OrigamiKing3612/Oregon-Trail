package net.origamiking.games.oregontrail.window;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import net.origamiking.games.oregontrail.OregonTrailApplication;

public class InventoryArea extends Pane {
    public static void clearWindow() {
        OregonTrailApplication.inventoryTextArea.clear();
    }
    public static void println(String text) {
        OregonTrailApplication.inventoryTextAreaText.append(text).append("\n");
        updateTextArea();
    }

    public static void print(String text) {
        OregonTrailApplication.inventoryTextAreaText.append(text);
        updateTextArea();
    }

    private static void updateTextArea() {
        OregonTrailApplication.inventoryTextArea.setText(OregonTrailApplication.inventoryTextAreaText.toString());
    }
    public static void addInventoryButtons(Button[] buttons) {
        OregonTrailApplication.inventoryHBox.getChildren().clear();
        OregonTrailApplication.inventoryHBox.getChildren().addAll(buttons);
    }
}