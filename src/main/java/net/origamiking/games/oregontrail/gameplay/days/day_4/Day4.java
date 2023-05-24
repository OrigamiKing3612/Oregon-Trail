package net.origamiking.games.oregontrail.gameplay.days.day_4;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.gameplay_features.Camp;
import net.origamiking.games.oregontrail.utils.MainGameMenu;
import net.origamiking.games.oregontrail.utils.SubtractVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;
import java.util.Scanner;

public class Day4 {
    static Random rand = new Random();
    static int upperbound = 3; // 3 options
    private static int swicher = rand.nextInt(upperbound);
    public static boolean person = false;
    public static void day() {
        OregonTrailMain.println("Day 4");
        SubtractVariables.time_1();
        choose_day();
        if (swicher == 0) {
            OregonTrailMain.println(Variables.DAY_STUFF);
            Scanner input = new Scanner(System.in);
            String should_camp = input.nextLine();
            should_camp = should_camp.toLowerCase();
            switch (should_camp) {
                case "y" -> {
                    Variables.CAMP_MESSAGE = 4;
                    Camp.camp();
                }
                case "n" -> Variables.DAY_STUFF = "You come to an old camp, a few other people have been here recently. Your party decides to pass and keep traveling.";
            }
        }
        MainGameMenu.mainGameMenu(Variables.DAY_STUFF);
    }
    private static void choose_day() {
        switch (swicher) {
            case 0 -> Variables.DAY_STUFF = "You come to an old camp, a few other people have been here recently. Should your party rest? (Type \"Y/N\")";
            case 1 -> {
                Variables.DAY_STUFF = "You see someone standing in the distance.";
                person = true;
            }
            case 2 -> Variables.DAY_STUFF = "You have an uneventful day.";
        }
    }
}
