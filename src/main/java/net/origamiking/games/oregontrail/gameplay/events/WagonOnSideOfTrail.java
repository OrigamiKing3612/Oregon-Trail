package net.origamiking.games.oregontrail.gameplay.events;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.utils.Utils;
import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import javax.swing.*;
import java.util.Objects;
import java.util.Random;

public class WagonOnSideOfTrail {
    final static Random rand = new Random();
    public static void wagonOnSideOfTrail() {
        Variables.DAY_STUFF = "";
        String person = "";
        boolean go = false;
        OregonTrailMain.println("You come across an old abandoned wagon on the side of the trail. Should one go check it out?");
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
        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Who should check out the wagon?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);

        switch (choice) {
            case 0 -> OregonTrailMain.println("You come to a forest; you pass it.");
            case 1 -> {
                if (Objects.equals(options[1], CharacterVariables.PERSON_1.PERSON)) person = CharacterVariables.PERSON_1.PERSON;
                if (Objects.equals(options[1], CharacterVariables.PERSON_2.PERSON)) person = CharacterVariables.PERSON_2.PERSON;
                if (Objects.equals(options[1], CharacterVariables.PERSON_3.PERSON)) person = CharacterVariables.PERSON_3.PERSON;
                if (Objects.equals(options[1], CharacterVariables.PERSON_4.PERSON)) person = CharacterVariables.PERSON_4.PERSON;
                go = true;
            }
            case 2 -> {
                if (Objects.equals(options[2], CharacterVariables.PERSON_1.PERSON)) person = CharacterVariables.PERSON_1.PERSON;
                if (Objects.equals(options[2], CharacterVariables.PERSON_2.PERSON)) person = CharacterVariables.PERSON_2.PERSON;
                if (Objects.equals(options[2], CharacterVariables.PERSON_3.PERSON)) person = CharacterVariables.PERSON_3.PERSON;
                if (Objects.equals(options[2], CharacterVariables.PERSON_4.PERSON)) person = CharacterVariables.PERSON_4.PERSON;
                go = true;
            }
            case 3 -> {
                if (Objects.equals(options[3], CharacterVariables.PERSON_1.PERSON)) person = CharacterVariables.PERSON_1.PERSON;
                if (Objects.equals(options[3], CharacterVariables.PERSON_2.PERSON)) person = CharacterVariables.PERSON_2.PERSON;
                if (Objects.equals(options[3], CharacterVariables.PERSON_3.PERSON)) person = CharacterVariables.PERSON_3.PERSON;
                if (Objects.equals(options[3], CharacterVariables.PERSON_4.PERSON)) person = CharacterVariables.PERSON_4.PERSON;
                go = true;
            }
            case 4 -> {
                if (Objects.equals(options[4], CharacterVariables.PERSON_1.PERSON)) person = CharacterVariables.PERSON_1.PERSON;
                if (Objects.equals(options[4], CharacterVariables.PERSON_2.PERSON)) person = CharacterVariables.PERSON_2.PERSON;
                if (Objects.equals(options[4], CharacterVariables.PERSON_3.PERSON)) person = CharacterVariables.PERSON_3.PERSON;
                if (Objects.equals(options[4], CharacterVariables.PERSON_4.PERSON)) person = CharacterVariables.PERSON_4.PERSON;
                go = true;
            }
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        }
        if (go) {
            boolean r = rand.nextBoolean();
            if (r) {
                goodWagon(person);
            } else {
                badWagon(person);
            }
        }
    }
    private static void goodWagon(String person) {
        int b = rand.nextInt(10, 20);
        int m = rand.nextInt(1, 3);
        int c = rand.nextInt(20, 35);
        OregonTrailMain.println(person + " goes to check it out. " + person + " finds some bullets, medicine, and coins.");
        OregonTrailMain.println("+" + b + " bullets\n+"+ m + " medicine\n +" + c + " coins");
        Variables.BULLETS = Variables.BULLETS + b;
        Variables.MEDICINE = Variables.MEDICINE + m;
        Variables.COINS = Variables.COINS + c;
        OregonTrailMain.println("You continue traveling.");
    }
    private static void badWagon(String person) {
        final int personGetsSnakeBiteNumber = Utils.returnPersonNumber(person);
        final String personGetsSnakeBite = Utils.returnPersonName(personGetsSnakeBiteNumber);
        OregonTrailMain.println(personGetsSnakeBite + " goes to check out the wagon. " + personGetsSnakeBite + " finds some stuff, but suddenly a snake jumps out and bites them.\nThey run back to the wagon. " + personGetsSnakeBite + " is sick with a Snake Bite.");
        Utils.setSICK_WITH(personGetsSnakeBiteNumber, "Snake Bite");
        Utils.subStamina(personGetsSnakeBiteNumber, 3);
        Utils.setMAX_HEALTH(personGetsSnakeBiteNumber, 7);
        Utils.setSICK_COUNTER(personGetsSnakeBiteNumber, 6);
        if (CharacterVariables.PERSON_1.STATS.HAPPINESS >= 4) {
            CharacterVariables.PERSON_1.STATS.HAPPINESS--;
        } else {
            CharacterVariables.PERSON_1.STATS.HAPPINESS = 4;
        }
    }
}
