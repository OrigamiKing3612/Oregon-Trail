package net.origamiking.games.oregontrail.gameplay.days.day_2;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.gameplay_features.Hunting;
import net.origamiking.games.oregontrail.utils.MainGameMenu;
import net.origamiking.games.oregontrail.utils.SubtractVariables;
import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.time.temporal.ValueRange;
import java.util.Random;
import java.util.Scanner;

public class Day2 {
    static Random rand = new Random();
    static int upperbound = 2; // 3 options
    private static int swicher = rand.nextInt(upperbound);
    public static void day() {
        OregonTrailMain.println("Day 2");
        SubtractVariables.time_1();
        choose_day();
        if (swicher == 0) {
            OregonTrailMain.println(Variables.DAY_STUFF);
            Scanner input = new Scanner(System.in);
            String should_hunt = input.nextLine();
            should_hunt = should_hunt.toLowerCase();
            switch (should_hunt) {
                case "y" -> {
                    if (Variables.BULLETS >= 2) {
                        Hunting.hunt();
                    } else {
                        Variables.DAY_STUFF = "You dont have enough bullets to hunt.";
                    }
                }
                case "n" -> Variables.DAY_STUFF = "You come to a forest; you pass it.";
            }
        }
        MainGameMenu.mainGameMenu(Variables.DAY_STUFF);
    }
    private static void choose_day() {
        switch (swicher) {
            case 0 -> Variables.DAY_STUFF = "You come to a forest, should someone in your party go hunt? (Type \"Y/N\")";
            case 1 -> {
                if (Variables.POUNDS_OF_FOOD >= 2) {
                    Variables.DAY_STUFF = "Your wagon gets stuck in some mud. You lose 2 Pounds of Food";
                    Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - 2;
                } else {
                    Variables.DAY_STUFF = "Your wagon gets stuck in some mud.";
                }
            }
            case 2 -> {
                Variables.DAY_STUFF = CharacterVariables.PERSON_1 + " is Forlorn. " + CharacterVariables.PERSON_1 + " Wishes they were home.";
                CharacterVariables.P1_IS_FORLORN = true;
            }
        }
    }
}
