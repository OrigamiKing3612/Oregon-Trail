package net.origamiking.games.oregontrail;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import net.origamiking.games.oregontrail.gameplay.day.Day;
import net.origamiking.games.oregontrail.utils.files.DeleteGame;
import net.origamiking.games.oregontrail.utils.files.LoadGame;
import net.origamiking.games.oregontrail.utils.files.NewGame;
import net.origamiking.games.oregontrail.variables.Variables;
import net.origamiking.games.oregontrail.window.InventoryArea;

import java.io.IOException;

public class OregonTrailApplication extends Application {
    private static TextArea textArea;
    public static TextArea inventoryTextArea;
    public static StringBuilder textAreaText = new StringBuilder();
    public static StringBuilder inventoryTextAreaText = new StringBuilder();
    public static HBox hBox;
    public static HBox inventoryHBox;
    public static VBox vBox;
    public static VBox inventoryVBox;
    public static InventoryArea inventoryScene;

    private static void startup() {
        textArea = new TextArea(textAreaText.toString());
        inventoryTextArea = new TextArea(inventoryTextAreaText.toString());
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        BorderPane root = new BorderPane();
        vBox = new VBox(10);
        vBox.setPadding(new Insets(10));

        inventoryVBox = new VBox(10);
        inventoryVBox.setPadding(new Insets(10));

        textArea.setEditable(false);
        textArea.setWrapText(true);
        textArea.setStyle("-fx-control-inner-background: black; -fx-font-family: 'Times New Roman'; -fx-font-size: 16; -fx-text-fill: green;");

        inventoryTextArea.setEditable(false);
        inventoryTextArea.setWrapText(true);
        inventoryTextArea.setStyle("-fx-control-inner-background: black; -fx-font-family: 'Times New Roman'; -fx-font-size: 16; -fx-text-fill: green;");

        ScrollPane scrollPane = new ScrollPane(textArea);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);

        ScrollPane inventoryScrollPane = new ScrollPane(inventoryTextArea);
        inventoryScrollPane.setFitToWidth(true);
        inventoryScrollPane.setFitToHeight(true);

        hBox = new HBox();
        hBox.setPadding(new Insets(10));
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        inventoryHBox = new HBox();
        inventoryHBox.setPadding(new Insets(10));
        inventoryHBox.setSpacing(10);
        inventoryHBox.setAlignment(Pos.CENTER);

        Button[] buttons = new Button[4];
        buttons[3] = new Button("Quit");
        buttons[2] = new Button("Delete Save");
        buttons[1] = new Button("Load Game");
        buttons[0] = new Button("New Game");

        for (Button button : buttons) {
            button.setOnAction(e -> {
                switch (button.getText()) {
                    case "New Game" -> NewGame.newGame();
                    case "Load Game" -> LoadGame.loadSaves();
                    case "Delete Save" -> DeleteGame.deleteSave();
                    case "Quit" -> System.exit(0);
                    default -> {
                    }
                }
            });
        }
        hBox.getChildren().addAll(buttons);

        vBox.setMinWidth(1000);
        hBox.setMinWidth(1000);
        inventoryVBox.setPrefWidth(450);
        inventoryHBox.setPrefWidth(450);

        VBox.setVgrow(scrollPane, Priority.ALWAYS);
        VBox.setVgrow(inventoryScrollPane, Priority.ALWAYS);
        vBox.getChildren().addAll(scrollPane, hBox);
        inventoryVBox.getChildren().addAll(inventoryScrollPane, inventoryHBox);
        root.setLeft(vBox);
        root.setRight(inventoryVBox);

        Scene scene = new Scene(root, 1500, 1000);
        primaryStage.setTitle("Oregon Trail by OrigamiKing3612");
        primaryStage.setScene(scene);
        primaryStage.show();

        InventoryArea.println("Inventory: ");
    }

    public static void println(String text) {
        textAreaText.append(text).append("\n");
        updateTextArea();
    }

    public static void print(String text) {
        textAreaText.append(text);
        updateTextArea();
    }

    private static void updateTextArea() {
        textArea.setText(textAreaText.toString());
    }

    public static void clearWindow() {
        textArea.clear();
    }

    public static void addButtons(Button[] buttons) {
        hBox.getChildren().clear();
        hBox.getChildren().addAll(buttons);
    }


    public static void main(String[] args) {
        OregonTrail.startup();
        OregonTrailApplication.startup();
        OregonTrailApplication.println("Welcome to Oregon-Trail by OrigamiKing3612");
        launch();
        // TODO make the harmonica Work
        // TODO if person is dead, they still show up on options
        for (int d = Variables.DAYS; d < Variables.MAX_DAYS; d++) {
            Day.day();
        }
    }
}