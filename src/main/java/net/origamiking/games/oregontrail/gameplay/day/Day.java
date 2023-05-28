package net.origamiking.games.oregontrail.gameplay.day;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.gameplay_features.Hunting;
import net.origamiking.games.oregontrail.utils.MainGameMenu;
import net.origamiking.games.oregontrail.utils.SubtractVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;
import java.util.Scanner;

public class Day {
    static Random rand = new Random();
    static int upperbound = 3; // 3 options
    private static final int switcher = rand.nextInt(upperbound);
    public static void day() {
        OregonTrailMain.println("Day " + Variables.DAY_NUMBER);
        SubtractVariables.time_1();
        ChooseGame.choose_day(switcher);
        if (switcher == 0) {
            OregonTrailMain.println(Variables.DAY_STUFF);
            Scanner input = new Scanner(System.in);
            String should_hunt = input.nextLine();
            should_hunt = should_hunt.toLowerCase();
            switch (should_hunt) {
                case "y" -> {
                    if (Variables.BULLETS >= 2) {
                        Hunting.hunt();
                    } else {
                        Variables.DAY_STUFF = "You dont have enough bullets to hunt.";
                    }
                }
                case "n" -> Variables.DAY_STUFF = "You come to a forest; you pass it.";
            }
        }
        MainGameMenu.mainGameMenu(Variables.DAY_STUFF);
        Variables.DAY_NUMBER++;
    }
}