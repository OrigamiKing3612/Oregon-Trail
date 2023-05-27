package net.origamiking.games.oregontrail.gameplay.days.day_9;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.gameplay_features.Camp;
import net.origamiking.games.oregontrail.gameplay.gameplay_features.Weather;
import net.origamiking.games.oregontrail.utils.MainGameMenu;
import net.origamiking.games.oregontrail.utils.SubtractVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;
import java.util.Scanner;

public class Day9 {
    static Random rand = new Random();
    static int upperbound = 3; // 3 options
    private static final int switcher = rand.nextInt(upperbound);
    public static void day() {
        OregonTrailMain.println("Day 9");
        SubtractVariables.time_1();
        choose_day();
        if (switcher == 0) {
            OregonTrailMain.println(Variables.DAY_STUFF);
            Scanner input = new Scanner(System.in);
            String shouldCamp = input.nextLine();
            shouldCamp = shouldCamp.toLowerCase();
            switch (shouldCamp) {
                case "y" -> {
                    Variables.CAMP_MESSAGE = 9;
                    Camp.camp();
                }
                case "n" -> Variables.DAY_STUFF = "You come to an old camp, a few other people have been here recently. Your party decides to pass and keep traveling.";
            }
        }
        MainGameMenu.mainGameMenu(Variables.DAY_STUFF);
    }
    private static void choose_day() {
        switch (switcher) {
            case 0 -> Variables.DAY_STUFF = "You see a small forest coming up.";
            case 1 -> Weather.RAINING.get();
            case 2 -> Variables.DAY_STUFF = "You come to an old camp, a few other people have been here recently. Should your party rest? (Type \"Y/N\")";
        }
    }
}
