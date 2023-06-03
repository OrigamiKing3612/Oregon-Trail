package net.origamiking.games.oregontrail.gameplay.events;

import net.origamiking.games.oregontrail.utils.Utils;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;

public class Bandit {
    protected static final Random rand = new Random();
    public static class PACK {
        static final int coins = rand.nextInt(5, 20);
        static final int pounds = rand.nextInt(10, 30);
        static final int bullets = rand.nextInt(5, 25);
        public static void bandits() {
            Variables.DAY_STUFF = "A pack of bandits come and take some stuff.\n-" + thing_1() + " Coins\n-" + thing_2() + " Pounds of Food\n-" + thing_3();
            removeStats();
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
        private static String thing_3() {
            boolean switcher = rand.nextBoolean();
            if (switcher) {
                if (Variables.MEDICINE >= 2) {
                    Variables.MEDICINE = Variables.MEDICINE - 2;
                } else {
                    Variables.MEDICINE = 0;
                }
                return "1 Medicine";
            } else {
                if (Variables.BULLETS >= bullets) {
                    Variables.BULLETS = Variables.BULLETS - bullets;
                } else {
                    Variables.BULLETS = 0;
                }
                return bullets + " Bullets";
            }
        }
        private static void removeStats() {
            Utils.subStamina(1, 3);
            Utils.subStamina(2, 3);
            Utils.subStamina(3, 3);
            Utils.subStamina(4, 3);
            Utils.subHealth(1, 3);
            Utils.subHealth(2, 3);
            Utils.subHealth(3, 3);
            Utils.subHealth(4, 3);
            Utils.subHappiness(1, 2);
            Utils.subHappiness(2, 2);
            Utils.subHappiness(3, 2);
            Utils.subHappiness(4, 2);
            Utils.subHygiene(1, 2);
            Utils.subHygiene(2, 2);
            Utils.subHygiene(3, 2);
            Utils.subHygiene(4, 2);
        }
    }
    public static class ONE {
        static final int coins = rand.nextInt(5, 15);
        static final int pounds = rand.nextInt(7, 20);
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
