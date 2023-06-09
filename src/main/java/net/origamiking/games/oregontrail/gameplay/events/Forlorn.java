package net.origamiking.games.oregontrail.gameplay.events;

import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;

public class Forlorn {
    final static Random rand = new Random();
    private static final int switcher = rand.nextInt(4);
    private static String person;
    public static void forlorn() {
        pickPerson();
        Variables.DAY_STUFF = person + " wishes they were home. " + person + " is now Forlorn.";
    }
    public static void pickPerson() {
        switch (switcher) {
            case 0 -> { person = CharacterVariables.PERSON_1.PERSON; CharacterVariables.PERSON_1.IS_FORLORN = true; }
            case 1 -> { person = CharacterVariables.PERSON_2.PERSON; CharacterVariables.PERSON_2.IS_FORLORN = true; }
            case 2 -> { person = CharacterVariables.PERSON_3.PERSON; CharacterVariables.PERSON_3.IS_FORLORN = true; }
            case 3 -> { person = CharacterVariables.PERSON_4.PERSON; CharacterVariables.PERSON_4.IS_FORLORN = true; }
        }
    }
}
