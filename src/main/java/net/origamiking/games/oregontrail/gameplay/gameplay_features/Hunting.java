package net.origamiking.games.oregontrail.gameplay.gameplay_features;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Hunting {
    static Random rand = new Random();
    static int upperbound_numbers = 15; // 16 options
    private static int timesHunting = rand.nextInt(5);
    public static void hunt() {
        if (timesHunting == 0) timesHunting = 1;
//        for (int i = 0; i < timesHunting; i++) {
            int number_to_pick = rand.nextInt(upperbound_numbers);
            OregonTrailMain.println("Pick a number between 0 and " + upperbound_numbers);
            Scanner input = new Scanner(System.in);
            String number_picked = input.nextLine();
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
//        }
    }
    private static void killedAnimal() {
        int pounds_of_food_gotten = rand.nextInt(110);
        Variables.DAY_STUFF = "You got an animal! +" + pounds_of_food_gotten + " Pounds of food\n -1 Bullet";
        Variables.BULLETS--;
        Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD + pounds_of_food_gotten;
    }
}
