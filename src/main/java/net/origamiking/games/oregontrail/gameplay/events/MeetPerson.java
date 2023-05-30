package net.origamiking.games.oregontrail.gameplay.events;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;
import java.util.Scanner;

public class MeetPerson {
    static Random rand = new Random();
    public static void meetPerson() {
        Variables.DAY_STUFF = "";
        int meetPerson = rand.nextInt(10);
        meetPerson = 0;
        switch (meetPerson) {
            case 0 -> john();
            case 1 -> mary();
            case 2 -> elizabeth();
            case 3 -> james();
            case 4 -> sarah();
            case 5 -> margaret();
            case 6 -> charles();
            case 7 -> joseph();
            case 8 -> emily();
            case 9 -> robert();
            //TODO PEOPLE
        }
    }
    private static void john() {
        int p = rand.nextInt(10, 25);
        OregonTrailMain.println("You come across a person. He greets you and says that is name is John. You tell him where you are going. He asks if you have any spare food. He asks for " + p + " pounds of food. Do you give it to him? Y/N");
        Scanner i = new Scanner(System.in);
        String input = i.nextLine();
        if (input.equalsIgnoreCase("y")) {
            if (Variables.POUNDS_OF_FOOD >= p) {
                OregonTrailMain.println("You give him " + p + " pounds of food. He thanks you and leaves.");
            } else {
                OregonTrailMain.println("You don't have the amount of food he wants.");
            }
        }
    }
    private static void mary() {

    }
    private static void elizabeth() {

    }
    private static void james() {

    }
    private static void sarah() {

    }
    private static void margaret() {

    }
    private static void charles() {

    }
    private static void joseph() {

    }
    private static void emily() {

    }
    private static void robert() {

    }
}
