package net.origamiking.games.oregontrail.gameplay.gameplay_features;

import net.origamiking.games.oregontrail.variables.Variables;
import net.origamiking.games.oregontrail.variables.WeatherVariables;

public class Weather {
    public static class RAINING {
        public static void get() {
            WeatherVariables.RAINING = true;
            WeatherVariables.IS_GROUND_WET = true;
            raining();
        }
        private static void raining() {
            Variables.DAY_STUFF = "Dark clouds start moving in and soon it starts raining.";
        }
    }
    public static class SNOWING {

    }
    public static class SEVERE {

    }
    public static class THUNDERSTORM {

    }
}
