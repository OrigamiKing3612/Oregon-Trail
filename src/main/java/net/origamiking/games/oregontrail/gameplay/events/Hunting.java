package net.origamiking.games.oregontrail.gameplay.events;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import javax.swing.*;
import java.util.Objects;
import java.util.Random;

public class Hunting {
    //TODO redo to let player choose a character (see WagonOnSideOfTrail.java) and move the stuff from Day.java. (All stuff from Hunting.hunt())
    static Random rand = new Random();
    static int upperbound_numbers = 15; // 16 options
    private static int timesHunting = rand.nextInt(5);
    public static void hunt() {
        if (timesHunting == 0) timesHunting = 1;
        int number_to_pick = rand.nextInt(upperbound_numbers);
        OregonTrailMain.println("Pick a number between 0 and " + upperbound_numbers);
        String number_picked = JOptionPane.showInputDialog("Pick a number between 0 and " + upperbound_numbers + ":");
        CharacterVariables.PERSON_4.PERSON = (number_picked != null) ? number_picked : "";
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
        int pounds_of_food_gotten = rand.nextInt(110);
        Variables.DAY_STUFF = "You got an animal! +" + pounds_of_food_gotten + " Pounds of food\n -1 Bullet";
        Variables.BULLETS--;
        Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD + pounds_of_food_gotten;
    }
}
