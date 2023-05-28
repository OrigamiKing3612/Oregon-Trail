package net.origamiking.games.oregontrail.gameplay.gameplay_features;

import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;

public class Forlorn {
    static Random rand = new Random();
    private static final int switcher = rand.nextInt(4);
    private static String person;
    public static void forlorn() {
        pickPerson();
        Variables.DAY_STUFF = person + " Wishes they were home. " + person + " is now Forlorn.";
    }
    public static void pickPerson() {
        switch (switcher) {
            case 0 -> { person = CharacterVariables.PERSON_1; CharacterVariables.P1_IS_FORLORN = true; }
            case 1 -> { person = CharacterVariables.PERSON_2; CharacterVariables.P2_IS_FORLORN = true; }
            case 2 -> { person = CharacterVariables.PERSON_3; CharacterVariables.P3_IS_FORLORN = true; }
            case 3 -> { person = CharacterVariables.PERSON_4; CharacterVariables.P4_IS_FORLORN = true; }
        }
    }
}
