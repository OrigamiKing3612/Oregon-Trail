package net.origamiking.games.oregontrail.gameplay.days.day_1;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.utils.MainGameMenu;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;

public class Day1 {
    static Random rand = new Random();
    static int upperbound = 3; // 3 options
    private static final int switcher = rand.nextInt(upperbound);
    public static void day() {
        OregonTrailMain.println("Day 1");
        choose_day();
        MainGameMenu.mainGameMenu(Variables.DAY_STUFF);
    }
    private static void choose_day() {
        switch (switcher) {
            case 0, 1 -> {
                Variables.DAY_STUFF = "You keep traveling, you have an uneventful day.";
            }
//            case 1 -> {
//                Variables.DAY_STUFF = "";
//            }
            case 2 -> {
                Variables.DAY_STUFF = "It starts raining and your party and the wagon gets wet.";
            }
        }
    }
}
