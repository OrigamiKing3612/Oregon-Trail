package net.origamiking.games.oregontrail.gameplay.events;

import javafx.scene.control.Button;
import net.origamiking.games.oregontrail.OregonTrailApplication;
import net.origamiking.games.oregontrail.utils.Deaths;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;

public class CrossRiver {
    final static Random rand = new Random();
    private static int FERRY_PRICE = rand.nextInt(21, 50);
    public static int RIVER_DIFFICULTY = 5;
    private static int riverDifficulty = rand.nextInt(5);
    public static void crossRiver() {
        OregonTrailApplication.println("You come to a river. What will you do?");

        Button[] buttons = new Button[3];
        buttons[0] = new Button("Use the ferry");
        buttons[1] = new Button("Caulk Wagon");
        buttons[2] = new Button("Ford the river");
        OregonTrailApplication.hBox.getChildren().clear();
        OregonTrailApplication.hBox.getChildren().addAll(buttons);
        for (Button button : buttons) {
            button.setOnAction(e -> {
                switch (button.getText()) {
                    case "Use the ferry" -> CrossRiver.ferry();
                    case "Caulk Wagon" -> CrossRiver.caulk();
                    case "Ford the river" -> CrossRiver.ford();
                }
            });
        }

        if (riverDifficulty == 1 || riverDifficulty == 0) riverDifficulty = 2;
        CrossRiver.RIVER_DIFFICULTY = riverDifficulty;
        Variables.DAY_STUFF = "";
    }
    public static void ferry() {
        if (FERRY_PRICE <= 20) FERRY_PRICE = 20;
        OregonTrailApplication.println("The ferry is " + FERRY_PRICE + " coins. 100% chance of success");
        OregonTrailApplication.println("1. Use the ferry");
        OregonTrailApplication.println("2. Caulk the wagon");
        OregonTrailApplication.println("3. Ford the river");

        Button[] buttons = new Button[3];
        buttons[0] = new Button("Use the ferry");
        buttons[1] = new Button("Caulk Wagon");
        buttons[2] = new Button("Ford the river");
        OregonTrailApplication.hBox.getChildren().clear();
        OregonTrailApplication.hBox.getChildren().addAll(buttons);
        for (Button button : buttons) {
            button.setOnAction(e -> {
                switch (button.getText()) {
                    case "Use the ferry" -> CrossRiver.use_ferry();
                    case "Caulk Wagon" -> CrossRiver.caulk();
                    case "Ford the river" -> CrossRiver.ford();
                }
            });
        }
    }
    private static void use_ferry() {
        if (Variables.COINS >= FERRY_PRICE) {
            Variables.COINS = Variables.COINS - FERRY_PRICE;
            using_ferry();
        } else {
            OregonTrailApplication.println("You don't have enough coins.");
            OregonTrailApplication.println("1. Caulk the wagon");
            OregonTrailApplication.println("2. Ford the river");

            Button[] buttons = new Button[2];
            buttons[0] = new Button("Ford the river");
            buttons[1] = new Button("Caulk Wagon");
            OregonTrailApplication.hBox.getChildren().clear();
            OregonTrailApplication.hBox.getChildren().addAll(buttons);
            for (Button button : buttons) {
                button.setOnAction(e -> {
                    switch (button.getText()) {
                        case "Ford the river" -> CrossRiver.ford();
                        case "Caulk Wagon" -> CrossRiver.caulk();
                    }
                });
            }
        }
    }
    private static void using_ferry() {
        OregonTrailApplication.println("You move the wagon onto the ferry. You make it across safely. -" + FERRY_PRICE + " coins");
    }
    public static void ford() {
        OregonTrailApplication.println("You decide to ford the river. The rivers difficultly is " + RIVER_DIFFICULTY);
        Button[] buttons = new Button[3];
        buttons[0] = new Button("Ford the river");
        buttons[1] = new Button("Caulk Wagon");
        buttons[2] = new Button("Use the ferry");
        OregonTrailApplication.hBox.getChildren().clear();
        OregonTrailApplication.hBox.getChildren().addAll(buttons);
        for (Button button : buttons) {
            button.setOnAction(e -> {
                switch (button.getText()) {
                    case "Ford the river" -> CrossRiver.will_ford();
                    case "Caulk Wagon" -> CrossRiver.caulk();
                    case "Use the ferry" -> ferry();
                }
            });
        }
    }
    public static void will_ford() {
        OregonTrailApplication.println("You seal the wagon and go in...");
        if (did_finish_ford()) {
            OregonTrailApplication.println("You made it across safely! You let everything dry off then keep traveling.");
        } else {
            int f = rand.nextInt(20);
            int b = rand.nextInt(25);
            if (f == 0 ) f++;
            if (b == 0 ) b++;
            OregonTrailApplication.println("Your wagon tips over and you lose "+ f +" pounds of food, " + b + " bullets, and 1 medicine");
            if (Variables.POUNDS_OF_FOOD <= f) {
                Variables.POUNDS_OF_FOOD = 0;
            } else {
                Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - f;
            }
            if (Variables.BULLETS <= b) {
                Variables.BULLETS = 0;
            } else {
                Variables.BULLETS = Variables.BULLETS - b;
            }
        }
    }
    public static void caulk() {
        OregonTrailApplication.println("You decide to caulk the wagon. The rivers difficultly is " + RIVER_DIFFICULTY + ". What will you do?");
        Button[] buttons = new Button[3];
        buttons[0] = new Button("Use the ferry");
        buttons[1] = new Button("Ford the river");
        buttons[2] = new Button("Caulk Wagon");
        OregonTrailApplication.hBox.getChildren().clear();
        OregonTrailApplication.hBox.getChildren().addAll(buttons);
        for (Button button : buttons) {
            button.setOnAction(e -> {
                switch (button.getText()) {
                    case "Use the ferry" -> CrossRiver.will_caulk();
                    case "Ford the river" -> CrossRiver.ford();
                    case "Caulk Wagon" -> ferry();
                }
            });
        }
    }
    private static void will_caulk() {
        OregonTrailApplication.println("You take off the wheels and caulk the wagon. Then you go in...");
        if (did_finish_caulk()) {
            OregonTrailApplication.println("You made it across! You put the wheels back on and keep traveling.");
        } else {
            death();
        }
    }
    private static boolean did_finish_caulk() {
        int t = 0;
        int f = 0;
        for (int i = 0; i < (RIVER_DIFFICULTY + 2); i++) {
            boolean a = rand.nextBoolean();
            if (a) {
                t++;
            } else {
                f++;
            }
        }
        return t > f;
    }
    private static boolean did_finish_ford() {
        int t = 0;
        int f = 0;
        for (int i = 0; i < RIVER_DIFFICULTY; i++) {
            boolean a = rand.nextBoolean();
            if (a) {
                t++;
            } else {
                f++;
            }
        }
        return t > f;
    }
    private static void death() {
        Deaths.drowning_in_river();
    }
}
