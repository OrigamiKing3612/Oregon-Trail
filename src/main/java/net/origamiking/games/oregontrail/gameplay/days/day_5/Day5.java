package net.origamiking.games.oregontrail.gameplay.days.day_5;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.days.day_4.Day4;
import net.origamiking.games.oregontrail.utils.MainGameMenu;
import net.origamiking.games.oregontrail.utils.SubtractVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;

public class Day5 {
    static Random rand = new Random();
    static int upperbound = 2; // 3 options
    private static int swicher = rand.nextInt(upperbound);
    public static void day() {
        OregonTrailMain.println("Day 5");
        SubtractVariables.time_1();
        choose_day();
        MainGameMenu.mainGameMenu(Variables.DAY_STUFF);
    }
    private static void choose_day() {
        if (Day4.person) swicher = 0;
        switch (swicher) {
            case 0 -> {

            }
            case 1 -> {

            }
            case 2 -> {

            }
        }
    }
}
