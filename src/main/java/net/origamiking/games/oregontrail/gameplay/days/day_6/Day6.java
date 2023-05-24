package net.origamiking.games.oregontrail.gameplay.days.day_6;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.utils.MainGameMenu;
import net.origamiking.games.oregontrail.utils.SubtractVariables;
import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;

public class Day6 {
    static Random rand = new Random();
    static int upperbound = 3; // 3 options
    private static int swicher = rand.nextInt(upperbound);
    public static void day() {
        OregonTrailMain.println("Day 6");
        SubtractVariables.time_1();
        choose_day();
        MainGameMenu.mainGameMenu(Variables.DAY_STUFF);
    }
    private static void choose_day() {
        switch (swicher) {
            case 0 -> {
                Variables.DAY_STUFF = "You find an apple tree with some good apples. " + CharacterVariables.PERSON_3 + "Picks them and puts them in the wagon. +5 pounds of food";
                Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD + 5;
            }
            case 1 -> {
                Variables.DAY_STUFF = CharacterVariables.PERSON_2 + " sees a bush with some good berries. The berries can be used as medicine. " + CharacterVariables.PERSON_2 + " collects them and brings them back. Everyone turns them into some medicine. Everyone is tired now. +2 medicine";
                Variables.MEDICINE = Variables.MEDICINE + 2;
                Variables.REST_COUNTER--;
            }
            case 2 -> {
                int person = rand.nextInt(4);
                String p = CharacterVariables.PERSON_1;
                switch (person) {
                    case 0 -> {
                        p = CharacterVariables.PERSON_1;
                        CharacterVariables.P1_IS_FORLORN = true;
                    }
                    case 1 -> {
                        p = CharacterVariables.PERSON_2;
                        CharacterVariables.P2_IS_FORLORN = true;
                    }
                    case 2 -> {
                        p = CharacterVariables.PERSON_3;
                        CharacterVariables.P3_IS_FORLORN = true;
                    }
                    case 3 -> {
                        p = CharacterVariables.PERSON_4;
                        CharacterVariables.P4_IS_FORLORN = true;
                    }
                }
                Variables.DAY_STUFF = p + " wishes they where back home. " + p + " is forlorn";
            }
        }
    }
}
