package net.origamiking.games.oregontrail.utils;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.events.Deaths;
import net.origamiking.games.oregontrail.variables.Variables;

public class SubtractVariables {
    public static void feed_people() {
        if (Variables.POUNDS_OF_FOOD >= (Variables.RATIONS_PER_PERSON * Variables.PERSON_COUNTER)) {
            Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - (Variables.RATIONS_PER_PERSON * Variables.PERSON_COUNTER);
        } else if (Variables.OUT_OF_FOOD_COUNTER > 0) {
            Variables.OUT_OF_FOOD_COUNTER--;
            OregonTrailMain.println("You are out of food, and your party is hungry.");
        } else {
            Deaths.hunger();
        }
    }
}
