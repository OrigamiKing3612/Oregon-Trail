package net.origamiking.games.oregontrail.gameplay.events;

import net.origamiking.games.oregontrail.variables.Variables;
import net.origamiking.games.oregontrail.variables.WeatherVariables;

import java.util.Random;

public class Weather {
    final static Random rand = new Random();
    public static void weather() {
        boolean w = rand.nextBoolean();
        if (w) {
            if (Variables.DAY_NUMBER >= 176) {
                SNOWING.get();
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
            WeatherVariables.RAINING = true;
            WeatherVariables.IS_GROUND_WET = false;
            Variables.DAY_STUFF = "Dark clouds start moving in and soon it starts snowing.";
        }
    }
    public static class THUNDERSTORM {
        public static void get() {
            WeatherVariables.RAINING = true;
            WeatherVariables.IS_GROUND_WET = true;
            Variables.DAY_STUFF = "Dark clouds start moving in and soon it starts thunder-storming.";
        }
    }
}
