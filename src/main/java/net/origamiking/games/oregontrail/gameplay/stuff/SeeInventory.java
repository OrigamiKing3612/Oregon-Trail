package net.origamiking.games.oregontrail.gameplay.stuff;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Scanner;

public class SeeInventory {
    public static void seeInventory() {
        OregonTrailMain.println("Coins: " + Variables.COINS);
        OregonTrailMain.println("Pounds of Food: " + Variables.POUNDS_OF_FOOD);
        OregonTrailMain.println("Medicine: " + Variables.MEDICINE);
        if (Variables.HAS_GUN) { OregonTrailMain.println("Gun: 1"); } else { OregonTrailMain.println("Gun: None"); }
        OregonTrailMain.println("Bullets: " + Variables.BULLETS);
        OregonTrailMain.println("People Left: " + Variables.PERSON_COUNTER);
        //TODO add people and sickness/forlorn

        OregonTrailMain.println("Are you ready to leave? (Type \"Y\")");
        Scanner input = new Scanner(System.in);
        String ready = input.nextLine();
        ready = ready.toLowerCase();
        if (ready.equals("y")) {}
    }
}
