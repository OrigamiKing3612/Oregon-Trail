package net.origamiking.games.oregontrail.gameplay.menu_features;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.menu_features.inentory.UseStuff;
import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Scanner;

public class SeeInventory {
    public static void seeInventory() {
        OregonTrailMain.println("You have:");
        OregonTrailMain.println("Coins: " + Variables.COINS);
        OregonTrailMain.println("Pounds of Food: " + Variables.POUNDS_OF_FOOD);
        OregonTrailMain.println("Medicine: " + Variables.MEDICINE);
        if (Variables.HAS_GUN) { OregonTrailMain.println("Gun: 1"); } else { OregonTrailMain.println("Gun: None"); }
        OregonTrailMain.println("Knife: " + Variables.KNIFE);
        OregonTrailMain.println("Bullets: " + Variables.BULLETS);
        OregonTrailMain.println("Axels: " + Variables.AXELS);
        OregonTrailMain.println("Wheels: " + Variables.WHEELS);
        OregonTrailMain.println("Harmonica: " + Variables.HARMONICA);
        OregonTrailMain.println("Clothes: " + Variables.CLOTHES);
        OregonTrailMain.println("Coffee: " + Variables.COFFEE);
        OregonTrailMain.println("People Left: " + Variables.PERSON_COUNTER);
        SeeInventory.characters();


        OregonTrailMain.println("1. Use Medicine");
        OregonTrailMain.println("2. Use Coffee");
        OregonTrailMain.println("3. Use Clothes");
        OregonTrailMain.println("0. Leave");
        Scanner input = new Scanner(System.in);
        String ready = input.nextLine();
        ready = ready.toLowerCase();
        switch (ready) {
            case "1" -> UseStuff.useMedicine();
            case "2" -> UseStuff.useCoffee();
            case "3" -> UseStuff.useClothes();
            case "0" -> leave();
        }
    }
    public static void characters() {
        if (!CharacterVariables.PERSON_1.IS_GONE) {
            OregonTrailMain.println("");
            show_person(CharacterVariables.PERSON_1.PERSON, CharacterVariables.PERSON_1.IS_FORLORN, CharacterVariables.PERSON_1.IS_SICK, CharacterVariables.PERSON_1.SICK_WITH);
            OregonTrailMain.println("   Health: " + CharacterVariables.PERSON_1.STATS.HEALTH + " out of " + CharacterVariables.PERSON_1.STATS.MAX_HEALTH);
            OregonTrailMain.println("   Stamina: " + CharacterVariables.PERSON_1.STATS.STAMINA + " out of " + CharacterVariables.PERSON_1.STATS.MAX_STAMINA);
            OregonTrailMain.println("   Happiness: " + CharacterVariables.PERSON_1.STATS.HAPPINESS + " out of " + CharacterVariables.PERSON_1.STATS.MAX_HAPPINESS);
            OregonTrailMain.println("   Hygiene: " + CharacterVariables.PERSON_1.STATS.HYGIENE + " out of " + CharacterVariables.PERSON_1.STATS.MAX_HYGIENE);
            OregonTrailMain.println("");
        }
        if (!CharacterVariables.PERSON_2.IS_GONE) {
            show_person(CharacterVariables.PERSON_2.PERSON, CharacterVariables.PERSON_2.IS_FORLORN, CharacterVariables.PERSON_2.IS_SICK, CharacterVariables.PERSON_2.SICK_WITH);
            OregonTrailMain.println("   Health: " + CharacterVariables.PERSON_2.STATS.HEALTH + " out of " + CharacterVariables.PERSON_2.STATS.MAX_HEALTH);
            OregonTrailMain.println("   Stamina: " + CharacterVariables.PERSON_2.STATS.STAMINA + " out of " + CharacterVariables.PERSON_2.STATS.MAX_STAMINA);
            OregonTrailMain.println("   Happiness: " + CharacterVariables.PERSON_2.STATS.HAPPINESS + " out of " + CharacterVariables.PERSON_2.STATS.MAX_HAPPINESS);
            OregonTrailMain.println("   Hygiene: " + CharacterVariables.PERSON_2.STATS.HYGIENE + " out of " + CharacterVariables.PERSON_2.STATS.MAX_HYGIENE);
            OregonTrailMain.println("");
        }
        if (!CharacterVariables.PERSON_3.IS_GONE) {
            show_person(CharacterVariables.PERSON_3.PERSON, CharacterVariables.PERSON_3.IS_FORLORN, CharacterVariables.PERSON_3.IS_SICK, CharacterVariables.PERSON_3.SICK_WITH);
            OregonTrailMain.println("   Health: " + CharacterVariables.PERSON_3.STATS.HEALTH + " out of " + CharacterVariables.PERSON_3.STATS.MAX_HEALTH);
            OregonTrailMain.println("   Stamina: " + CharacterVariables.PERSON_3.STATS.STAMINA + " out of " + CharacterVariables.PERSON_3.STATS.MAX_STAMINA);
            OregonTrailMain.println("   Happiness: " + CharacterVariables.PERSON_3.STATS.HAPPINESS + " out of " + CharacterVariables.PERSON_3.STATS.MAX_HAPPINESS);
            OregonTrailMain.println("   Hygiene: " + CharacterVariables.PERSON_3.STATS.HYGIENE + " out of " + CharacterVariables.PERSON_3.STATS.MAX_HYGIENE);
            OregonTrailMain.println("");
        }
        if (!CharacterVariables.PERSON_4.IS_GONE) {
            show_person(CharacterVariables.PERSON_4.PERSON, CharacterVariables.PERSON_4.IS_FORLORN, CharacterVariables.PERSON_4.IS_SICK, CharacterVariables.PERSON_4.SICK_WITH);
            OregonTrailMain.println("   Health: " + CharacterVariables.PERSON_4.STATS.HEALTH + " out of " + CharacterVariables.PERSON_4.STATS.MAX_HEALTH);
            OregonTrailMain.println("   Stamina: " + CharacterVariables.PERSON_4.STATS.STAMINA + " out of " + CharacterVariables.PERSON_4.STATS.MAX_STAMINA);
            OregonTrailMain.println("   Happiness: " + CharacterVariables.PERSON_4.STATS.HAPPINESS + " out of " + CharacterVariables.PERSON_4.STATS.MAX_HAPPINESS);
            OregonTrailMain.println("   Hygiene: " + CharacterVariables.PERSON_4.STATS.HYGIENE + " out of " + CharacterVariables.PERSON_4.STATS.MAX_HYGIENE);
            OregonTrailMain.println("");
        }
    }
    private static void displayForlorn(Boolean p_is_forlorn) {
        if (p_is_forlorn) {
            OregonTrailMain.println("   Is forlorn.");
        } else {
            OregonTrailMain.println("   Is not forlorn.");
        }
    }
    private static void displaySick(Boolean sick, String s) {
        if (sick) {
            OregonTrailMain.println("   Is sick with " + s + ".");
        } else {
            OregonTrailMain.println("   Is not sick.");
        }
    }
    private static void show_person(String p, Boolean p_is_forlorn, Boolean sick, String s) {
            OregonTrailMain.println(p + ":");
            displayForlorn(p_is_forlorn);
            displaySick(sick, s);
    }
    public static void leave() {}
}
