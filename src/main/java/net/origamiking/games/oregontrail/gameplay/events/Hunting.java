package net.origamiking.games.oregontrail.gameplay.events;

import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import net.origamiking.games.oregontrail.OregonTrailApplication;
import net.origamiking.games.oregontrail.utils.Utils;
import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Hunting {
    final static Random rand = new Random();

    public static void hunt() {
        Variables.DAY_STUFF = "";
        AtomicReference<String> person = new AtomicReference<>("");
        AtomicBoolean go = new AtomicBoolean(false);
        OregonTrailApplication.println("You come to a forest, who should go hunt?");
        int fileCount = 0;
        if (!CharacterVariables.PERSON_1.IS_GONE) fileCount++;
        if (!CharacterVariables.PERSON_2.IS_GONE) fileCount++;
        if (!CharacterVariables.PERSON_3.IS_GONE) fileCount++;
        if (!CharacterVariables.PERSON_4.IS_GONE) fileCount++;
        String[] options = new String[fileCount + 1];
        int index = 0;
        if (!CharacterVariables.PERSON_1.IS_GONE) {
            options[index] = CharacterVariables.PERSON_1.PERSON;
            index++;
        }
        if (!CharacterVariables.PERSON_2.IS_GONE) {
            options[index] = CharacterVariables.PERSON_2.PERSON;
            index++;
        }
        if (!CharacterVariables.PERSON_3.IS_GONE) {
            options[index] = CharacterVariables.PERSON_3.PERSON;
            index++;
        }
        if (!CharacterVariables.PERSON_4.IS_GONE) {
            options[index] = CharacterVariables.PERSON_4.PERSON;
        }

        options[fileCount] = "Leave";
        Utils.reverseArray(options);

        Button[] buttons = new Button[5];
        buttons[0] = new Button(options[0]);
        buttons[1] = new Button(options[1]);
        buttons[2] = new Button(options[2]);
        buttons[3] = new Button(options[3]);
        buttons[4] = new Button(options[4]);


        for (Button button : buttons) {
            button.setOnAction(e -> {
                String text = button.getText();
                if (text.equals("Leave")) {
                    OregonTrailApplication.println("You come to a forest; you pass it.");
                } else if (text.equals(CharacterVariables.PERSON_1.PERSON)) {
                    if (Objects.equals(options[1], CharacterVariables.PERSON_1.PERSON))
                        person.set(CharacterVariables.PERSON_1.PERSON);
                    if (Objects.equals(options[1], CharacterVariables.PERSON_2.PERSON))
                        person.set(CharacterVariables.PERSON_2.PERSON);
                    if (Objects.equals(options[1], CharacterVariables.PERSON_3.PERSON))
                        person.set(CharacterVariables.PERSON_3.PERSON);
                    if (Objects.equals(options[1], CharacterVariables.PERSON_4.PERSON))
                        person.set(CharacterVariables.PERSON_4.PERSON);
                    go.set(true);
                } else if (text.equals(CharacterVariables.PERSON_2.PERSON)) {
                    if (Objects.equals(options[2], CharacterVariables.PERSON_1.PERSON))
                        person.set(CharacterVariables.PERSON_1.PERSON);
                    if (Objects.equals(options[2], CharacterVariables.PERSON_2.PERSON))
                        person.set(CharacterVariables.PERSON_2.PERSON);
                    if (Objects.equals(options[2], CharacterVariables.PERSON_3.PERSON))
                        person.set(CharacterVariables.PERSON_3.PERSON);
                    if (Objects.equals(options[2], CharacterVariables.PERSON_4.PERSON))
                        person.set(CharacterVariables.PERSON_4.PERSON);
                    go.set(true);
                } else if (text.equals(CharacterVariables.PERSON_3.PERSON)) {
                    if (Objects.equals(options[3], CharacterVariables.PERSON_1.PERSON))
                        person.set(CharacterVariables.PERSON_1.PERSON);
                    if (Objects.equals(options[3], CharacterVariables.PERSON_2.PERSON))
                        person.set(CharacterVariables.PERSON_2.PERSON);
                    if (Objects.equals(options[3], CharacterVariables.PERSON_3.PERSON))
                        person.set(CharacterVariables.PERSON_3.PERSON);
                    if (Objects.equals(options[3], CharacterVariables.PERSON_4.PERSON))
                        person.set(CharacterVariables.PERSON_4.PERSON);
                    go.set(true);
                } else if (text.equals(CharacterVariables.PERSON_4.PERSON)) {
                    if (Objects.equals(options[4], CharacterVariables.PERSON_1.PERSON))
                        person.set(CharacterVariables.PERSON_1.PERSON);
                    if (Objects.equals(options[4], CharacterVariables.PERSON_2.PERSON))
                        person.set(CharacterVariables.PERSON_2.PERSON);
                    if (Objects.equals(options[4], CharacterVariables.PERSON_3.PERSON))
                        person.set(CharacterVariables.PERSON_3.PERSON);
                    if (Objects.equals(options[4], CharacterVariables.PERSON_4.PERSON))
                        person.set(CharacterVariables.PERSON_4.PERSON);
                    go.set(true);
                } else {
                    throw new IllegalStateException("Unexpected value: " + button.getText());
                }
                if (go.get()) {
                    if (Variables.BULLETS >= 2) {
                        Hunting.go_hunt(person.get());
                    } else {
                        OregonTrailApplication.println("You dont have enough bullets to hunt.");
                    }
                }
            });
        }
    }

    private static void go_hunt(String person) {
        AtomicInteger bullets_brought = new AtomicInteger();
        int personHuntingNumber = Utils.returnPersonNumber(person);
        String personHunting = Utils.returnPersonName(personHuntingNumber);
        OregonTrailApplication.println("How many bullets should " + person + " bring?");

        Button[] buttons = new Button[4];
        buttons[0] = new Button("1");
        buttons[1] = new Button("2");
        buttons[2] = new Button("3");
        buttons[3] = new Button("4");


        for (Button button : buttons) {
            button.setOnAction(e -> {
                switch (button.getText()) {
                    case "4" -> bullets_brought.set(4);
                    case "3" -> bullets_brought.set(3);
                    case "2" -> bullets_brought.set(2);
                    case "1" -> bullets_brought.set(1);
                }
            });
        }
        OregonTrailApplication.println(personHunting + " brings " + bullets_brought + " bullets.");
        OregonTrailApplication.println("You send " + personHunting + " to go hunt.");
        for (int i = 0; i < bullets_brought.get(); i++) {
            hunting();
        }
    }

    private static void hunting() {
        int max_number = 15;
        int number_to_pick = rand.nextInt(max_number);
        OregonTrailApplication.println("Pick a number between 0 and " + max_number);
        String number_picked = "";
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Pick a number between 0 and " + max_number + ":");
        dialog.setHeaderText(null);
        dialog.setContentText("Pick a number between 0 and " + max_number + ":");
        dialog.showAndWait().ifPresent(e -> e = number_picked);
        if (Objects.equals(number_picked, String.valueOf(number_to_pick))) {
            killedAnimal();
        } else if (Objects.equals(number_picked, String.valueOf(number_to_pick - 1))) {
            killedAnimal();
        } else if (Objects.equals(number_picked, String.valueOf(number_to_pick + 1))) {
            killedAnimal();
        } else if (Objects.equals(number_picked, String.valueOf(number_to_pick - 2))) {
            killedAnimal();
        } else if (Objects.equals(number_picked, String.valueOf(number_to_pick + 2))) {
            killedAnimal();
        } else {
            OregonTrailApplication.println("You missed an animal.\n -1 Bullet");
            Variables.BULLETS--;
        }
    }

    private static void killedAnimal() {
        int pounds_of_food_gotten = rand.nextInt(40, 110);
        OregonTrailApplication.println("You got an animal! +" + pounds_of_food_gotten + " Pounds of food\n -1 Bullet");
        Variables.BULLETS--;
        Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD + pounds_of_food_gotten;
    }
}
