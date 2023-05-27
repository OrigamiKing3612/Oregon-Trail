package net.origamiking.games.oregontrail.gameplay.days.day_3;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.utils.MainGameMenu;
import net.origamiking.games.oregontrail.utils.SubtractVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;

public class Day3 {
    static Random rand = new Random();
    static int upperbound = 3; // 3 options
    private static final int switcher = rand.nextInt(upperbound);
    private static int rations = rand.nextInt(13); // 14
    private static int bullets = rand.nextInt(14); // 15
    public static void day() {
        OregonTrailMain.println("Day 3");
        SubtractVariables.time_1();
        choose_day();
        MainGameMenu.mainGameMenu(Variables.DAY_STUFF);
    }
    private static void choose_day() {
        switch (switcher) {
            case 0 -> {
                if (rations == 0) rations++;
                Variables.DAY_STUFF = "Some of your food goes bad. -" + rations + " pounds of food.";
                Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - rations;
            }
            case 1, 2 -> {
                if (bullets == 0) bullets++;
                if (rations == 0) rations++;
                Variables.DAY_STUFF = "Some wolves attack you. -" + bullets + "+" + rations;
                Variables.BULLETS = Variables.BULLETS - bullets;

            }
        }
    }
}
