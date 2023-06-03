package net.origamiking.games.oregontrail.gameplay.events;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.utils.Utils;
import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import javax.swing.*;
import java.util.Objects;
import java.util.Random;

public class Hunting {
    final static Random rand = new Random();
    public static void hunt() {
        Variables.DAY_STUFF = "";
        String person = "";
        boolean go = false;
        OregonTrailMain.println("You come to a forest, should someone in your party go hunt?");

        String[] options = {"Leave", CharacterVariables.PERSON_4.PERSON, CharacterVariables.PERSON_3.PERSON, CharacterVariables.PERSON_2.PERSON, CharacterVariables.PERSON_1.PERSON};

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Who should go hunting?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);
        switch (choice) {
            case 0 -> OregonTrailMain.println("You come to a forest; you pass it.");
            case 1 -> {
                person = CharacterVariables.PERSON_4.PERSON;
                go = true;
            }
            case 2 -> {
                person = CharacterVariables.PERSON_3.PERSON;
                go = true;
            }
            case 3 -> {
                person = CharacterVariables.PERSON_2.PERSON;
                go = true;
            }
            case 4 -> {
                person = CharacterVariables.PERSON_1.PERSON;
                go = true;
            }
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        }
        if (go) {
            if (Variables.BULLETS >= 2) {
                Hunting.go_hunt(person);
            } else {
                OregonTrailMain.println("You dont have enough bullets to hunt.");
            }
        }
    }
    private static void go_hunt(String person) {
        int bullets_brought = 0;
        int personHuntingNumber = Utils.returnPersonNumber(person);
        String personHunting = Utils.returnPersonName(personHuntingNumber);
        OregonTrailMain.println("How many bullets should " + person + " bring?");

        String[] options = {"4", "3", "2", "1"};

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "How many bullets should " + personHunting + " bring?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);
        switch (choice) {
            case 0 -> bullets_brought = 4;
            case 1 -> bullets_brought = 3;
            case 2 -> bullets_brought = 2;
            case 3 -> bullets_brought = 1;
        }
        OregonTrailMain.println(personHunting + " brings " + bullets_brought + " bullets.");
        OregonTrailMain.println("You send " + personHunting + " to go hunt.");
        for (int i = 0; i < bullets_brought; i++) {
            hunting();
        }
    }
    private static void hunting() {
        int max_number = 15;
        int number_to_pick = rand.nextInt(max_number);
        OregonTrailMain.println("Pick a number between 0 and " + max_number);
        String number_picked = JOptionPane.showInputDialog("Pick a number between 0 and " + max_number + ":");
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
            OregonTrailMain.println("You missed an animal.\n -1 Bullet");
            Variables.BULLETS--;
        }
    }
    private static void killedAnimal() {
        int pounds_of_food_gotten = rand.nextInt(40, 110);
        OregonTrailMain.println("You got an animal! +" + pounds_of_food_gotten + " Pounds of food\n -1 Bullet");
        Variables.BULLETS--;
        Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD + pounds_of_food_gotten;
    }
}
