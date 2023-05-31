package net.origamiking.games.oregontrail.utils;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.events.Deaths;
import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.Variables;

public class SubtractVariables {
    public static void subtractVariables() {
        feed_people();
        sickStuff();
        Utils.setStatsToMaxStats();
    }
    private static void feed_people() {
        if (Variables.POUNDS_OF_FOOD >= (Variables.RATIONS_PER_PERSON * Variables.PERSON_COUNTER)) {
            Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - (Variables.RATIONS_PER_PERSON * Variables.PERSON_COUNTER);
        } else if (Variables.OUT_OF_FOOD_COUNTER > 0) {
            Variables.OUT_OF_FOOD_COUNTER--;
            OregonTrailMain.println("You are out of food, and your party is hungry.");
        } else {
            Deaths.hunger();
        }
    }
    private static void sickStuff() {
        if (!(CharacterVariables.PERSON_1.SICK_COUNTER <= 0)) {
            CharacterVariables.PERSON_1.SICK_COUNTER--;
            CharacterVariables.PERSON_1.IS_SICK = true;
        } else {
            CharacterVariables.PERSON_1.IS_SICK = false;
            CharacterVariables.PERSON_1.SICK_COUNTER = 0;
        }
        if (!(CharacterVariables.PERSON_2.SICK_COUNTER <= 0)) {
            CharacterVariables.PERSON_2.SICK_COUNTER--;
            CharacterVariables.PERSON_2.IS_SICK = true;
        } else {
            CharacterVariables.PERSON_2.IS_SICK = false;
            CharacterVariables.PERSON_2.SICK_COUNTER = 0;
        }
        if (!(CharacterVariables.PERSON_3.SICK_COUNTER <= 0)) {
            CharacterVariables.PERSON_3.SICK_COUNTER--;
            CharacterVariables.PERSON_3.IS_SICK = true;
        } else {
            CharacterVariables.PERSON_3.IS_SICK = false;
            CharacterVariables.PERSON_3.SICK_COUNTER = 0;
        }
        if (!(CharacterVariables.PERSON_4.SICK_COUNTER <= 0)) {
            CharacterVariables.PERSON_4.SICK_COUNTER--;
            CharacterVariables.PERSON_4.IS_SICK = true;
        } else {
            CharacterVariables.PERSON_4.IS_SICK = false;
            CharacterVariables.PERSON_4.SICK_COUNTER = 0;
        }
    }
}
