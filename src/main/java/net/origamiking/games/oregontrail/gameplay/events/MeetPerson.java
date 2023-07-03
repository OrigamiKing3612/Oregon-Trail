package net.origamiking.games.oregontrail.gameplay.events;

import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import net.origamiking.games.oregontrail.OregonTrailApplication;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;

public class MeetPerson {
    final static Random rand = new Random();
    public static void meetPerson() {
        Variables.DAY_STUFF = "";
        int meetPerson = rand.nextInt(9);
//        meetPerson = 3;
        switch (meetPerson) {
            case 0 -> john();
            case 1 -> mary();
            case 2 -> elizabeth();
            case 3 -> james();
            case 4 -> sarah();
            case 5 -> margaret();
            case 6 -> charles();
            case 7 -> emily();
            case 8 -> robert();
        }
    }
    private static void john() {
        int p = rand.nextInt(10, 25);
        OregonTrailApplication.println("You come across a person. He greets you and says that is name is John.\nYou tell him where you are going. He asks if you have any spare food. He asks for " + p + " pounds of food.\nDo you give it to him? Y/N");
        Button[] buttons = new Button[2];
        buttons[0] = new Button("Yes");
        buttons[1] = new Button("No");

        for (Button button : buttons) {
            button.setOnAction(e -> {
                switch (button.getText().toLowerCase()) {
                    case "yes" -> {
                        if (Variables.POUNDS_OF_FOOD >= p) {
                            OregonTrailApplication.println("You give him " + p + " pounds of food. He thanks you and leaves.");
                            Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - p;
                        } else {
                            OregonTrailApplication.println("You don't have the amount of food he wants.");
                        }
                    }
                    case "no" -> OregonTrailApplication.println("You say no and move on.");
                    default -> {}
                }
            });
        }
    }
    private static void mary() {
        OregonTrailApplication.println("You come across a person. She tells you her name is Mary and she has a riddle for you.\nShe says that if you answer it correctly she will give you some coins.");
        OregonTrailApplication.println("She says \"What comes once in a minute, twice in a moment, but never in a thousand years?\"");
        String riddle = "";
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("\"What comes once in a minute, twice in a moment, but never in a thousand years?\"");
        dialog.setHeaderText(null);
        dialog.setContentText("\"What comes once in a minute, twice in a moment, but never in a thousand years?\"");
        String finalRiddle = riddle;
        dialog.showAndWait().ifPresent(e -> e = finalRiddle);
        OregonTrailApplication.println("You answer with: " + riddle);
        riddle = riddle.toLowerCase();
        if (riddle.contains("m")) {
            OregonTrailApplication.println("She says that the letter\"M\" it the correct answer and she gives you some coins. +15 Coins");
            Variables.COINS = Variables.COINS + 15;
        } else {
            OregonTrailApplication.println("She says that that is the wrong answer then walks away.");
        }
    }
    private static void elizabeth() {
        OregonTrailApplication.println("You come across a person. She tells you her name is Elizabeth and she has a riddle for you.\nShe says that if you answer it correctly she will give you some coins.");
        OregonTrailApplication.println("She says \"I am always hungry, I must always be fed. The finger I touch will soon turn red. What am I?\"");
        String riddle = "";
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("She says \"I am always hungry, I must always be fed. The finger I touch will soon turn red. What am I?\"");
        dialog.setHeaderText(null);
        dialog.setContentText("She says \"I am always hungry, I must always be fed. The finger I touch will soon turn red. What am I?\"");
        String finalRiddle = riddle;
        dialog.showAndWait().ifPresent(e -> e = finalRiddle);
        OregonTrailApplication.println("You answer with: " + riddle);
        riddle = riddle.toLowerCase();
        if (riddle.contains("fire")) {
            OregonTrailApplication.println("She says that Fire it the correct answer and she gives you some coins. +10 Coins");
            Variables.COINS = Variables.COINS + 10;
        } else {
            OregonTrailApplication.println("She says that that is the wrong answer then walks away.");
        }
    }
    private static void james() {
        OregonTrailApplication.println("You come across a person. He tells you his name is James and he has a riddle for you.\nHe says that if you answer it correctly he will give you some coins.");
        OregonTrailApplication.println("He says \"The more you take, the more you leave behind. What am I?\"");
        String riddle = "";
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("He says \"The more you take, the more you leave behind. What am I?\"");
        dialog.setHeaderText(null);
        dialog.setContentText("He says \"The more you take, the more you leave behind. What am I?\"");
        String finalRiddle = riddle;
        dialog.showAndWait().ifPresent(e -> e = finalRiddle);
        OregonTrailApplication.println("You answer with: " + riddle);
        riddle = riddle.toLowerCase();
        if (riddle.contains("footsteps")) {
            OregonTrailApplication.println("He says that footsteps it the correct answer and he gives you some coins. +10 Coins");
            Variables.COINS = Variables.COINS + 10;
        } else {
            OregonTrailApplication.println("He says that that is the wrong answer then walks away.");
        }
    }
    private static void sarah() {
        OregonTrailApplication.println("You come across a person. She tells you her name is Sarah and she has a riddle for you.\nShe says that if you answer it correctly she will give you some coins.");
        OregonTrailApplication.println("She says \"What has keys but can't open locks, space but no room, and you can enter but can't go inside?\"");
        String riddle = "";
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("She says \"What has keys but can't open locks, space but no room, and you can enter but can't go inside?\"");
        dialog.setHeaderText(null);
        dialog.setContentText("She says \"What has keys but can't open locks, space but no room, and you can enter but can't go inside?\"");
        String finalRiddle = riddle;
        dialog.showAndWait().ifPresent(e -> e = finalRiddle);
        OregonTrailApplication.println("You answer with: " + riddle);
        riddle = riddle.toLowerCase();
        if (riddle.contains("keyboard")) {
            OregonTrailApplication.println("She says that Keyboard it the correct answer and she gives you some coins. +15 Coins");
            Variables.COINS = Variables.COINS + 15;
        } else {
            OregonTrailApplication.println("She says that that is the wrong answer then walks away.");
        }
    }
    private static void margaret() {
        OregonTrailApplication.println("You come across a person. She tells you her name is Margaret and she has a riddle for you.\nShe says that if you answer it correctly she will give you some coins.");
        OregonTrailApplication.println("She says \"The person who makes it, sells it. The person who buys it, never uses it. The person who uses it, never knows they're using it. What is it?\"");
        String riddle = "";
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("She says \"The person who makes it, sells it. The person who buys it, never uses it. The person who uses it, never knows they're using it. What is it?\"");
        dialog.setHeaderText(null);
        dialog.setContentText("She says \"The person who makes it, sells it. The person who buys it, never uses it. The person who uses it, never knows they're using it. What is it?\"");
        String finalRiddle = riddle;
        dialog.showAndWait().ifPresent(e -> e = finalRiddle);
        OregonTrailApplication.println("You answer with: " + riddle);
        riddle = riddle.toLowerCase();
        if (riddle.contains("coffin")) {
            OregonTrailApplication.println("She says that a Coffin it the correct answer and she gives you some coins. +30 Coins");
            Variables.COINS = Variables.COINS + 30;
        } else {
            OregonTrailApplication.println("She says that that is the wrong answer then walks away.");
        }
    }
    private static void charles() {
        OregonTrailApplication.println("You come across a person named Charles. He says he thinks your wagon is going to break soon.\nHe says he can fix it for 20 Coins. Do you let him fix it?");
        Button[] buttons = new Button[2];
        buttons[0] = new Button("Yes");
        buttons[1] = new Button("No");
        OregonTrailApplication.hBox.getChildren().clear();
        OregonTrailApplication.hBox.getChildren().addAll(buttons);
        for (Button button : buttons) {
            button.setOnAction(e -> {
                switch (button.getText().toLowerCase()) {
                    case "no" -> OregonTrailApplication.println("You say no and start moving on. He warns you then leaves.");
                    case "yes" -> {
                        int f = rand.nextInt(10, 15);
                        int b = rand.nextInt(10, 20);
                        OregonTrailApplication.println("-20 Coins");
                        Variables.COINS = Variables.COINS - 20;
                        OregonTrailApplication.println("You let him look at your wagon. You hear him doing something.\nThen he comes back and says he fixed it. You thank him and leave.");
                        OregonTrailApplication.println("Later you find that some of your stuff is missing.");
                        Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - f;
                        Variables.BULLETS = Variables.BULLETS - b;
                        OregonTrailApplication.println("-" + b + " bullets\n-" + f + " pounds of food");
                    }
                }
            });
        }
    }
    private static void emily() {
        OregonTrailApplication.println("You come across a person. She tells you her name is Emily and she has a riddle for you.\nShe says that if you answer it correctly she will give you some coins.");
        OregonTrailApplication.println("She says \"I have cities but no houses, forests but no trees, and rivers but no water. What am I?\"");
        String riddle = "";
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("She says \"I have cities but no houses, forests but no trees, and rivers but no water. What am I?\"");
        dialog.setHeaderText(null);
        dialog.setContentText("She says \"I have cities but no houses, forests but no trees, and rivers but no water. What am I?\"");
        String finalRiddle = riddle;
        dialog.showAndWait().ifPresent(e -> e = finalRiddle);
        OregonTrailApplication.println("You answer with: " + riddle);
        riddle = riddle.toLowerCase();
        if (riddle.contains("map")) {
            OregonTrailApplication.println("She says that a Map it the correct answer and she gives you some coins. +15 Coins");
            Variables.COINS = Variables.COINS + 15;
        } else {
            OregonTrailApplication.println("She says that that is the wrong answer then walks away.");
        }
    }
    private static void robert() {
        int p = rand.nextInt(25, 35);
        OregonTrailApplication.println("You come across a person. He greets you and says that is name is Robert.\nYou tell him where you are going. He asks if you have any spare food. He asks for " + p + " pounds of food.\nDo you give it to him? Y/N");
        Button[] buttons = new Button[2];
        buttons[0] = new Button("Yes");
        buttons[1] = new Button("No");
        OregonTrailApplication.hBox.getChildren().clear();
        OregonTrailApplication.hBox.getChildren().addAll(buttons);
        for (Button button : buttons) {
            button.setOnAction(e -> {
                switch (button.getText().toLowerCase()) {
                    case "yes" -> {
                        if (Variables.POUNDS_OF_FOOD >= p) {
                            OregonTrailApplication.println("You give him " + p + " pounds of food. He thanks you and leaves.");
                            Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - p;
                        } else {
                            OregonTrailApplication.println("You don't have the amount of food he wants.");
                        }
                    }
                    case "no" -> OregonTrailApplication.println("You say no and move on.");
                }
            });
        }
    }
}
