package net.origamiking.games.oregontrail.gameplay.days.day_7;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.gameplay_features.CrossRiver;
import net.origamiking.games.oregontrail.gameplay.gameplay_features.Hunting;
import net.origamiking.games.oregontrail.utils.MainGameMenu;
import net.origamiking.games.oregontrail.utils.SubtractVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;
import java.util.Scanner;

public class Day7 {
    static Random rand = new Random();
    static int upperbound = 5;
    private static int river_d = rand.nextInt(upperbound);
    public static void day() {
        OregonTrailMain.println("Day 7");
        SubtractVariables.time_1();
        choose_day();
        OregonTrailMain.println(Variables.DAY_STUFF);
        OregonTrailMain.println("1. Use the ferry");
        OregonTrailMain.println("2. Caulk Wagon");
        OregonTrailMain.println("3. Ford the river");
        Scanner input = new Scanner(System.in);
        String river = input.nextLine();
        if (river_d == 1 || river_d == 0) river_d = 2;
        CrossRiver.RIVER_DIFFICULTY = river_d;
        switch (river) {
            case "1" -> CrossRiver.ferry();
            case "2" -> CrossRiver.caulk();
            case "3" -> CrossRiver.ford();
        }
        Variables.DAY_STUFF = "";
        MainGameMenu.mainGameMenu(Variables.DAY_STUFF);
    }
    private static void choose_day() {
        Variables.DAY_STUFF = "You come to a river. What will you do.";
    }
}
