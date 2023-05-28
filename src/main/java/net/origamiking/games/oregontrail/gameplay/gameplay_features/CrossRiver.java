package net.origamiking.games.oregontrail.gameplay.gameplay_features;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;
import java.util.Scanner;

public class CrossRiver {
    static Random rand = new Random();
    private static int FERRY_PRICE = rand.nextInt(50);
    public static int RIVER_DIFFICULTY = 5;
    private static int riverDifficulty = rand.nextInt(5);
    public static void crossRiver() {
        OregonTrailMain.println("You come to a river. What will you do.");
        OregonTrailMain.println("1. Use the ferry");
        OregonTrailMain.println("2. Caulk Wagon");
        OregonTrailMain.println("3. Ford the river");
        Scanner input = new Scanner(System.in);
        String river = input.nextLine();
        if (riverDifficulty == 1 || riverDifficulty == 0) riverDifficulty = 2;
        CrossRiver.RIVER_DIFFICULTY = riverDifficulty;
        switch (river) {
            case "1" -> CrossRiver.ferry();
            case "2" -> CrossRiver.caulk();
            case "3" -> CrossRiver.ford();
        }
        Variables.DAY_STUFF = "";
    }
    public static void ferry() {
        if (FERRY_PRICE <= 20) FERRY_PRICE = 20;
        OregonTrailMain.println("The ferry is " + FERRY_PRICE + " coins. 100% chance of success");
        OregonTrailMain.println("1. Use the ferry");
        OregonTrailMain.println("2. Caulk the wagon");
        OregonTrailMain.println("3. Ford the river");
        Scanner input = new Scanner(System.in);
        String to_do = input.nextLine();
        switch (to_do) {
            case "1" -> CrossRiver.use_ferry();
            case "2" -> CrossRiver.caulk();
            case "3" -> CrossRiver.ford();
        }
    }
    private static void use_ferry() {
        if (Variables.COINS >= FERRY_PRICE) {
            Variables.COINS = Variables.COINS - FERRY_PRICE;
            using_ferry();
        } else {
            OregonTrailMain.println("You don't have enough coins.");
            OregonTrailMain.println("1. Caulk the wagon");
            OregonTrailMain.println("2. Ford the river");
            Scanner input = new Scanner(System.in);
            String to_do = input.nextLine();
            switch (to_do) {
                case "1" -> CrossRiver.caulk();
                case "2" -> CrossRiver.ford();
            }
        }
    }
    private static void using_ferry() {
        OregonTrailMain.println("You move the wagon onto the ferry. You make it across safely. -" + FERRY_PRICE + " coins");
    }
    public static void ford() {
        OregonTrailMain.println("You decide to ford the river. The rivers difficultly is " + RIVER_DIFFICULTY);
        OregonTrailMain.println("1. Ford the river");
        OregonTrailMain.println("2. Caulk the wagon");
        OregonTrailMain.println("3. Use Ferry");
        Scanner input = new Scanner(System.in);
        String to_do = input.nextLine();
        switch (to_do) {
            case "1" -> CrossRiver.will_ford();
            case "2" -> CrossRiver.caulk();
            case "3" -> ferry();
        }
    }
    public static void will_ford() {
        OregonTrailMain.println("You seal the wagon and go in...");
        if (did_finish_ford()) {
            OregonTrailMain.println("You made it across safely! You let everything dry off then keep traveling.");
        } else {
            int f = rand.nextInt(20);
            int b = rand.nextInt(25);
            if (f == 0 ) f++;
            if (b == 0 ) b++;
            OregonTrailMain.println("Your wagon tips over and you lose "+ f +" pounds of food, " + b + " bullets, and 1 medicine");
            if (Variables.POUNDS_OF_FOOD <= f) {
                Variables.POUNDS_OF_FOOD = 0;
            } else {
                Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - f;
            }
            if (Variables.BULLETS <= b) {
                Variables.BULLETS = 0;
            } else {
                Variables.BULLETS = Variables.BULLETS - b;
            }
        }
    }
    public static void caulk() {
        OregonTrailMain.println("You decide to caulk you wagon. The rivers difficultly is " + RIVER_DIFFICULTY);
        OregonTrailMain.println("1. Caulk the wagon");
        OregonTrailMain.println("2. Ford the river");
        OregonTrailMain.println("3. Use Ferry");
        Scanner input = new Scanner(System.in);
        String to_do = input.nextLine();
        switch (to_do) {
            case "1" -> CrossRiver.will_caulk();
            case "2" -> CrossRiver.ford();
            case "3" -> ferry();
        }
    }
    private static void will_caulk() {
        OregonTrailMain.println("You take off the wheels and caulk the wagon. Then you go in...");
        if (did_finish_caulk()) {
            OregonTrailMain.println("You made it across! You put the wheels back on and keep traveling.");
        } else {
            death();
        }
    }
    private static boolean did_finish_caulk() {
        int t = 0;
        int f = 0;
        for (int i = 0; i < (RIVER_DIFFICULTY + 2); i++) {
            boolean a = rand.nextBoolean();
            if (a) {
                t++;
            } else {
                f++;
            }
        }
        return t > f;
    }
    private static boolean did_finish_ford() {
        int t = 0;
        int f = 0;
        for (int i = 0; i < RIVER_DIFFICULTY; i++) {
            boolean a = rand.nextBoolean();
            if (a) {
                t++;
            } else {
                f++;
            }
        }
        return t > f;
    }
    private static void death() {
        Deaths.drowning_in_river();
    }
}
