package net.origamiking.games.oregontrail.gameplay.gameplay_features;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;
import java.util.Scanner;

public class BrokenWagon {
    static Random rand = new Random();
    public static class Axel {
        public static void axel() {
            OregonTrailMain.println("1. Wait and see if someone comes.");
            if (Variables.AXELS >= 1) OregonTrailMain.println("2. Repair.");
            Scanner input = new Scanner(System.in);
            String a = input.nextLine();
            if (Variables.AXELS >= 1) {
                switch (a) {
                    case "1" -> waitForPeople();
                    case "2" -> repair();
                }
            } else {
                if (a.equals("1")) {
                    waitForPeople();
                }
            }
        }
        private static void waitForPeople() {
            int hasAxel = rand.nextInt(5);
            if (personCome()) {
                if (hasAxel == 2 || hasAxel == 4 || hasAxel == 0) {
                    OregonTrailMain.println("Some people pass by and ask if you need help. " + CharacterVariables.PERSON_4 + " responds and says that their axel broke and they need a new one. \n" + CharacterVariables.PERSON_4 + " asks if they have an extra one.");
                    boolean haveAxel = rand.nextBoolean();
                    int coins = rand.nextInt(50);
                    if (coins == 0) coins = 10;
                    if (haveAxel) {
                        OregonTrailMain.println("They have one and offer to sell it to you for " + coins);
                        if (Variables.COINS >= coins) {
                            OregonTrailMain.println("You give them the money and fix your wagon.");
                            Variables.COINS = Variables.COINS - coins;
                        } else {
                            OregonTrailMain.println("You don't have enough money to buy the axel. You try to haggle but there price firm.");
                            Deaths.stuck();
                        }
                    } else {
                        OregonTrailMain.println("They don't have an extra axel. They leave");
                        Deaths.stuck();
                    }
                } else {
                    Deaths.stuck();
                }
            }
        }
        private static boolean personCome() {
            int t = 0;
            int f = 0;
            for (int i = 0; i < 7; i++) {
                boolean a = rand.nextBoolean();
                if (a) {
                    t++;
                } else {
                    f++;
                }
            }
            return t > f;
        }
        private static void repair() {
            if (Variables.AXELS >= 1) {
                OregonTrailMain.println("You use your axel and fix your wagon.");
                Variables.AXELS--;
            } else {
                OregonTrailMain.println("You don't have an extra axel.");
                Deaths.stuck();
            }
        }
    }
    public static class Wheel {
        public static void wheel() {
            OregonTrailMain.println("1. Wait and see if someone comes.");
            if (Variables.WHEELS >= 1) OregonTrailMain.println("2. Repair.");
            Scanner input = new Scanner(System.in);
            String a = input.nextLine();
            if (Variables.WHEELS >= 1) {
                switch (a) {
                    case "1" -> waitForPeople();
                    case "2" -> repair();
                }
            } else {
                if (a.equals("1")) {
                    waitForPeople();
                }
            }
        }
        private static void waitForPeople() {
            int hasAxel = rand.nextInt(5);
            if (personCome()) {
                if (hasAxel == 2 || hasAxel == 4 || hasAxel == 0) {
                    OregonTrailMain.println("Some people pass by and ask if you need help. " + CharacterVariables.PERSON_4 + " responds and says that one of their wheels broke and they need a new one. \n" + CharacterVariables.PERSON_4 + " asks if they have an extra one.");
                    boolean haveWheel = rand.nextBoolean();
                    int coins = rand.nextInt(30);
                    if (coins == 0) coins = 10;
                    if (haveWheel) {
                        OregonTrailMain.println("They have one and offer to sell it to you for " + coins);
                        if (Variables.COINS >= coins) {
                            OregonTrailMain.println("You give them the money and fix your wagon.");
                            Variables.COINS = Variables.COINS - coins;
                        } else {
                            OregonTrailMain.println("You don't have enough money to buy the wheel. You try to haggle but there price firm.");
                            Deaths.stuck();
                        }
                    } else {
                        OregonTrailMain.println("They don't have an extra wheel. They leave");
                        Deaths.stuck();
                    }
                } else {
                    Deaths.stuck();
                }
            }
        }
        private static boolean personCome() {
            int t = 0;
            int f = 0;
            for (int i = 0; i < 7; i++) {
                boolean a = rand.nextBoolean();
                if (a) {
                    t++;
                } else {
                    f++;
                }
            }
            return t > f;
        }
        private static void repair() {
            if (Variables.WHEELS >= 1) {
                OregonTrailMain.println("You use your wheel and fix your wagon.");
                Variables.WHEELS--;
            } else {
                OregonTrailMain.println("You don't have an extra wheel.");
                Deaths.stuck();
            }
        }
    }
}
