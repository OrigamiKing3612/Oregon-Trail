package net.origamiking.games.oregontrail;

import net.origamiking.games.oregontrail.gameplay.days.day_1.Day1;
import net.origamiking.games.oregontrail.gameplay.days.day_7.Day7;
import net.origamiking.games.oregontrail.gameplay.gameplay_features.CrossRiver;
import net.origamiking.games.oregontrail.gameplay.gameplay_features.Deaths;
import net.origamiking.games.oregontrail.gameplay.start.ChooseCharacters;
import net.origamiking.games.oregontrail.gameplay.start.FirstStore;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Scanner;

public class OregonTrailMain {
    public static boolean DEBUG_MODE = true;
    public static void main(String[] args) {
        if (DEBUG_MODE) {
            OregonTrailMain.println("DEBUG MODE");
            isDebugMode();
        } else {
            Scanner input = new Scanner(System.in);
            OregonTrailMain.println("Welcome to Oregon Trail by OrigamiKing3612.");
            OregonTrailMain.println("This is a text based game.");
            OregonTrailMain.println("Your goal is to get to Oregon before winter.");
            OregonTrailMain.println("Are you ready to get started? Y/N");
            String ready = input.nextLine();
            ready = ready.toLowerCase();
            if (!(ready.equals("y") || ready.equals("Y"))) OregonTrailMain.println("Too bad.");
            ChooseCharacters.choose_characters();
            FirstStore.firststore();
        }
        OregonTrailMain.println("You leave for Oregon Tomorrow...");
//        Day1.day();
        Day7.day();
    }
    public static void println(String string) {
        System.out.println(string);
    }
    public static void print(String string) {
        System.out.print(string);
    }
    public static void isDebugMode() {
        if (DEBUG_MODE) {
            Variables.POUNDS_OF_FOOD = 10000;
            Variables.COINS = 10000;
            Variables.BULLETS = 10000;
            Variables.WAGON_TYPE = "DEBUG WAGON";
        }
    }
}