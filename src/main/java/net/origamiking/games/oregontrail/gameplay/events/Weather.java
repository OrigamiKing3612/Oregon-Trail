package net.origamiking.games.oregontrail.gameplay.events;

import net.origamiking.games.oregontrail.variables.Variables;
import net.origamiking.games.oregontrail.variables.WeatherVariables;

import java.util.Random;

public class Weather {
    static Random rand = new Random();
    public static void weather() {
        boolean w = rand.nextBoolean();
        if (w) {
            if (Variables.DAY_NUMBER >= 200) {
//                SNOWING.get();
                //TODO SNOWING
            } else {
                RAINING.get();
            }
        } else {
            THUNDERSTORM.get();
        }
    }
    public static class RAINING {
        public static void get() {
            WeatherVariables.RAINING = true;
            WeatherVariables.IS_GROUND_WET = true;
            Variables.DAY_STUFF = "Dark clouds start moving in and soon it starts raining.";
        }
    }
    public static class SNOWING {
        public static void get() {

        }
    }
    public static class SEVERE {

    }
    public static class THUNDERSTORM {
        public static void get() {

        }
    }
}
