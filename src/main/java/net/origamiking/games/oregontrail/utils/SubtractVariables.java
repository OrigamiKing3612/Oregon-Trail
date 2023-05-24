package net.origamiking.games.oregontrail.utils;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.gameplay_features.Deaths;
import net.origamiking.games.oregontrail.variables.Variables;

public class SubtractVariables {
    public static void time_1() {
        feed_people();
        if (Variables.FOOD_COUNTER <= 1 || Variables.REST_COUNTER <= 1) {
            if (Variables.FOOD_COUNTER <= 1) {
                Deaths.hunger();
            } else if (Variables.REST_COUNTER <= 1) {
                Deaths.sleep_deprived();
            } else {
                Deaths.hunger_and_sleep_deprived();
            }
        } else {
            Variables.FOOD_COUNTER = Variables.FOOD_COUNTER - 1;
            Variables.REST_COUNTER = Variables.REST_COUNTER - 1;
        }
    }

    public static void feed_people() {
        if (Variables.POUNDS_OF_FOOD >= (Variables.RATIONS_PER_PERSON * Variables.PERSON_COUNTER)) {
            Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - (Variables.RATIONS_PER_PERSON * Variables.PERSON_COUNTER);
        } else {
            Deaths.hunger();
        }
    }
}
