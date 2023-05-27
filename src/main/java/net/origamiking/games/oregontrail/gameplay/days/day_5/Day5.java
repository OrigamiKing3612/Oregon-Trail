package net.origamiking.games.oregontrail.gameplay.days.day_5;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.days.day_4.Day4;
import net.origamiking.games.oregontrail.utils.MainGameMenu;
import net.origamiking.games.oregontrail.utils.SubtractVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;

public class Day5 {
    static Random rand = new Random();
    static int upperbound = 3; // 3 options
    private static int switcher = rand.nextInt(upperbound);
    public static void day() {
        OregonTrailMain.println("Day 5");
        SubtractVariables.time_1();
        choose_day();
        MainGameMenu.mainGameMenu(Variables.DAY_STUFF);
    }
    private static void choose_day() {
        if (Day4.person) switcher = 0;
        switch (switcher) {
            case 0 -> {
                Variables.DAY_STUFF = "As you keep traveling a person starts coming toward you. He greets you and says his name is Lukas. He says that he lost and he is looking for his people. He asks for some food and you graciously give him 5 pounds of food.";
                Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - 5;
            }
            case 1, 2 -> Variables.DAY_STUFF = "You have an uneventful day.";
        }
    }
}
