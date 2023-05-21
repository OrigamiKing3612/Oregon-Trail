package net.origamiking.games.oregontrail.utils;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.Variables;

public class SubtractVariables {
    public static void time_1() {
        if (Variables.FOOD_COUNTER <= 1 || Variables.REST_COUNTER <= 1) {
            throw new RuntimeException("DIED OF HUNGER OR NO REST ADD A DEATH HERE IN SubtractVariables");
        } else {
            Variables.FOOD_COUNTER = Variables.FOOD_COUNTER - 1;
            Variables.REST_COUNTER = Variables.REST_COUNTER - 1;
        }
    }

    public static void feed_people() {
        if (Variables.POUNDS_OF_FOOD >= (Variables.RATIONS_PER_PERSON * Variables.PERSON_COUNTER)) {
            Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - (Variables.RATIONS_PER_PERSON * Variables.PERSON_COUNTER);
        } else {
            OregonTrailMain.println("YOU RAN OUT OF FOOD");
            throw new RuntimeException("RAN OUT OF FOOD IN SubtractVariables, ADD A DEATH");
        }
    }
}
