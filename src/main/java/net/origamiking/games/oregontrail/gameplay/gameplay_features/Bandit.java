package net.origamiking.games.oregontrail.gameplay.gameplay_features;

import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;

public class Bandit {
    protected static Random rand = new Random();
    public static class PACK {
        public static void bandits() {
            throw new RuntimeException("PACK OF BANDITS");
        }
    }
    public static class ONE {
        static int coins = rand.nextInt(5, 15);
        static int pounds = rand.nextInt(7, 20);
        public static void bandit() {
            Variables.DAY_STUFF = "A bandit comes and takes some stuff. -" + thing_1() + " Coins, -" + thing_2() + " Pounds of Food, and -" + thing_3() + " Medicine";
        }
        private static int thing_1() {
            Variables.COINS = Variables.COINS - coins;
            return coins;
        }
        private static int thing_2() {
            if (Variables.POUNDS_OF_FOOD >= pounds) {
                Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - pounds;
            } else {
                Variables.POUNDS_OF_FOOD = 0;
            }
            return pounds;
        }
        private static int thing_3() {
            if (Variables.MEDICINE >= 1) {
                Variables.MEDICINE--;
            } else {
                Variables.MEDICINE = 0;
            }
            return 1;
        }
    }
}
