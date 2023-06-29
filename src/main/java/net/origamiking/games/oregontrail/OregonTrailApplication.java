package net.origamiking.games.oregontrail;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import net.origamiking.games.oregontrail.utils.Utils;
import net.origamiking.games.oregontrail.utils.files.DeleteGame;
import net.origamiking.games.oregontrail.utils.files.LoadGame;
import net.origamiking.games.oregontrail.utils.files.NewGame;
import net.origamiking.games.oregontrail.variables.Variables;

import java.io.IOException;

public class OregonTrailApplication extends Application {
    private static TextArea textArea;
    public static String textAreaText = "";
    public static HBox hBox;// TODO have other files change what is in here; hBox.getChildren().addAll(buttons); in the after I change the buttons

    @Override
    public void init() throws Exception {
        if (Utils.isMacOS()) {
            //TODO Test
            System.setProperty("apple.awt.application.name", "Oregon Trail By: OrigamiKing3612");
            System.setProperty("apple.awt.application.appearance", "system");
            System.setProperty("apple.awt.application.icon", "Info.plist");
            System.setProperty("apple.awt.brushMetalLook", "true");
            System.setProperty("apple.awt.showGrowBox", "true");
        }
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(OregonTrailApplication.class.getResource("oregon-trail-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());

        VBox root = new VBox(10);
        root.setPadding(new Insets(10));

        textArea = new TextArea(textAreaText);
        textArea.setEditable(false);
        textArea.setWrapText(true);
//        textArea.setTextFill(Color.GREEN);
//        textArea.setStyle("-fx-control-inner-background: black;");
        textArea.setFont(new javafx.scene.text.Font("Times New Roman", 16));

        ScrollPane scrollPane = new ScrollPane(textArea);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);

        hBox = new HBox();
        hBox.setPadding(new Insets(10));
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        Button[] buttons = new Button[4];
        buttons[3] = new Button("Quit");
        buttons[2] = new Button("Delete Save");
        buttons[1] = new Button("Load Game");
        buttons[0] = new Button("New Game");

        for (Button button : buttons) {
            button.setOnAction(e -> handleButtonClick(button.getText()));
        }
        hBox.getChildren().addAll(buttons);

        root.getChildren().addAll(scrollPane, hBox);
        VBox.setVgrow(scrollPane, Priority.ALWAYS);

        Scene scene = new Scene(root, 1100, 1000);
//        primaryStage.setHeight(1100);
//        primaryStage.setWidth(1000);
        primaryStage.setTitle("Oregon Trail by OrigamiKing3612");

        primaryStage.setScene(scene);
        primaryStage.show();

//        root.setVgap(10);
//        root.setHgap(10);
//        root.getChildren().addAll(b1, b2, b3, b4);
//

//        primaryStage.getIcons().add(new Image("icon.png"));

//        BorderPane root = new BorderPane();
//        Scene scene = new Scene(root);
    }
    public static void println(String text) {
        textAreaText = textAreaText + text + "\n";
        System.out.println(text);
//        textArea.appendText(" " + text + "\n");
//        textArea.positionCaret(textArea.getText().length());
    }
    public static void print(String text) {
        textAreaText = textAreaText + text;
        System.out.print(text);
//        textArea.appendText(text);
//        textArea.positionCaret(textArea.getText().length());
    }

    public static void clearWindow() {
        textArea.clear();
    }
    private static void handleButtonClick(String buttonText) {
        switch (buttonText) {
            case "New Game" -> NewGame.newGame();
            case "Load Game" -> LoadGame.loadSaves();
            case "Delete Save" -> DeleteGame.deleteSave();
            case "Quit" -> System.exit(0);
            default -> {
            }
        }
    }
    public static void main(String[] args) {
        OregonTrail.startup();
        launch();
        OregonTrailApplication.println("Welcome to Oregon-Trail by OrigamiKing3612");
        // TODO make the harmonica Work
        // TODO if person is dead, they still show up on options
        for (int d = Variables.DAYS; d < Variables.MAX_DAYS; d++) {
//            Day.day();
        }
    }
}