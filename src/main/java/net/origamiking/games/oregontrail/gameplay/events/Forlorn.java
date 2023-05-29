package net.origamiking.games.oregontrail.gameplay.events;

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
            case 0 -> { person = CharacterVariables.PERSON_1.PERSON_1; CharacterVariables.PERSON_1.IS_FORLORN = true; }
            case 1 -> { person = CharacterVariables.PERSON_2.PERSON_2; CharacterVariables.PERSON_2.IS_FORLORN = true; }
            case 2 -> { person = CharacterVariables.PERSON_3.PERSON_3; CharacterVariables.PERSON_3.IS_FORLORN = true; }
            case 3 -> { person = CharacterVariables.PERSON_4.PERSON_4; CharacterVariables.PERSON_4.IS_FORLORN = true; }
        }
    }
}
