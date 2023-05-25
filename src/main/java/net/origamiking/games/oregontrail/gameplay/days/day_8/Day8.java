package net.origamiking.games.oregontrail.gameplay.days.day_8;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.gameplay_features.BrokenWagon;
import net.origamiking.games.oregontrail.utils.MainGameMenu;
import net.origamiking.games.oregontrail.utils.SubtractVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;

public class Day8 {
    static Random rand = new Random();
    static int upperbound = 3; // 3 options
    private static final int switcher = rand.nextInt(upperbound);
    public static void day() {
        OregonTrailMain.println("Day 8");
        SubtractVariables.time_1();
        choose_day();
        if (switcher == 0) {
            BrokenWagon.Axel.axel();
         }else if (switcher == 1) {
            BrokenWagon.Wheel.wheel();
        }
        MainGameMenu.mainGameMenu(Variables.DAY_STUFF);
    }
    private static void choose_day() {
        switch (switcher) {
            case 0 -> Variables.DAY_STUFF = "Suddenly your wagon's axel breaks. What will you do?";
            case 1 -> Variables.DAY_STUFF = "Suddenly one of your wagon's wheel breaks. What will you do?";
            case 2 -> Variables.DAY_STUFF = "You have an uneventful day.";
        }
    }
}
