package net.origamiking.games.oregontrail.window;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.Variables;

public class Inventory {
    public static void printToWindow() {
        OregonTrailMain.inventoryWindow.clearWindow();
        OregonTrailMain.inventoryWindow.appendTextln("");
        OregonTrailMain.inventoryWindow.appendTextln("You have:");
        OregonTrailMain.inventoryWindow.appendTextln("Coins: " + Variables.COINS);
        OregonTrailMain.inventoryWindow.appendTextln("Wagon Type: " + Variables.WAGON_TYPE);
        OregonTrailMain.inventoryWindow.appendTextln("Pounds of Food: " + Variables.POUNDS_OF_FOOD);
        OregonTrailMain.inventoryWindow.appendTextln("Medicine: " + Variables.MEDICINE);
        if (Variables.HAS_GUN) { OregonTrailMain.inventoryWindow.appendTextln("Gun: 1"); } else { OregonTrailMain.inventoryWindow.appendTextln("Gun: None"); }
        OregonTrailMain.inventoryWindow.appendTextln("Knife: " + Variables.KNIFE);
        OregonTrailMain.inventoryWindow.appendTextln("Bullets: " + Variables.BULLETS);
        OregonTrailMain.inventoryWindow.appendTextln("Axels: " + Variables.AXELS);
        OregonTrailMain.inventoryWindow.appendTextln("Wheels: " + Variables.WHEELS);
        OregonTrailMain.inventoryWindow.appendTextln("Harmonica: " + Variables.HARMONICA);
        OregonTrailMain.inventoryWindow.appendTextln("Clothes: " + Variables.CLOTHES);
        OregonTrailMain.inventoryWindow.appendTextln("Coffee: " + Variables.COFFEE);
        OregonTrailMain.inventoryWindow.appendTextln("People Left: " + Variables.PERSON_COUNTER);
        characters();
    }
    private static void characters() {
        if (!CharacterVariables.PERSON_1.IS_GONE) {
            OregonTrailMain.inventoryWindow.appendTextln("");
            show_person(CharacterVariables.PERSON_1.PERSON, CharacterVariables.PERSON_1.IS_FORLORN, CharacterVariables.PERSON_1.IS_SICK, CharacterVariables.PERSON_1.SICK_WITH);
            OregonTrailMain.inventoryWindow.appendTextln("   Health: " + CharacterVariables.PERSON_1.STATS.HEALTH + " out of " + CharacterVariables.PERSON_1.STATS.MAX_HEALTH);
            OregonTrailMain.inventoryWindow.appendTextln("   Stamina: " + CharacterVariables.PERSON_1.STATS.STAMINA + " out of " + CharacterVariables.PERSON_1.STATS.MAX_STAMINA);
            OregonTrailMain.inventoryWindow.appendTextln("   Happiness: " + CharacterVariables.PERSON_1.STATS.HAPPINESS + " out of " + CharacterVariables.PERSON_1.STATS.MAX_HAPPINESS);
            OregonTrailMain.inventoryWindow.appendTextln("   Hygiene: " + CharacterVariables.PERSON_1.STATS.HYGIENE + " out of " + CharacterVariables.PERSON_1.STATS.MAX_HYGIENE);
            OregonTrailMain.inventoryWindow.appendTextln("");
        }
        if (!CharacterVariables.PERSON_2.IS_GONE) {
            show_person(CharacterVariables.PERSON_2.PERSON, CharacterVariables.PERSON_2.IS_FORLORN, CharacterVariables.PERSON_2.IS_SICK, CharacterVariables.PERSON_2.SICK_WITH);
            OregonTrailMain.inventoryWindow.appendTextln("   Health: " + CharacterVariables.PERSON_2.STATS.HEALTH + " out of " + CharacterVariables.PERSON_2.STATS.MAX_HEALTH);
            OregonTrailMain.inventoryWindow.appendTextln("   Stamina: " + CharacterVariables.PERSON_2.STATS.STAMINA + " out of " + CharacterVariables.PERSON_2.STATS.MAX_STAMINA);
            OregonTrailMain.inventoryWindow.appendTextln("   Happiness: " + CharacterVariables.PERSON_2.STATS.HAPPINESS + " out of " + CharacterVariables.PERSON_2.STATS.MAX_HAPPINESS);
            OregonTrailMain.inventoryWindow.appendTextln("   Hygiene: " + CharacterVariables.PERSON_2.STATS.HYGIENE + " out of " + CharacterVariables.PERSON_2.STATS.MAX_HYGIENE);
            OregonTrailMain.inventoryWindow.appendTextln("");
        }
        if (!CharacterVariables.PERSON_3.IS_GONE) {
            show_person(CharacterVariables.PERSON_3.PERSON, CharacterVariables.PERSON_3.IS_FORLORN, CharacterVariables.PERSON_3.IS_SICK, CharacterVariables.PERSON_3.SICK_WITH);
            OregonTrailMain.inventoryWindow.appendTextln("   Health: " + CharacterVariables.PERSON_3.STATS.HEALTH + " out of " + CharacterVariables.PERSON_3.STATS.MAX_HEALTH);
            OregonTrailMain.inventoryWindow.appendTextln("   Stamina: " + CharacterVariables.PERSON_3.STATS.STAMINA + " out of " + CharacterVariables.PERSON_3.STATS.MAX_STAMINA);
            OregonTrailMain.inventoryWindow.appendTextln("   Happiness: " + CharacterVariables.PERSON_3.STATS.HAPPINESS + " out of " + CharacterVariables.PERSON_3.STATS.MAX_HAPPINESS);
            OregonTrailMain.inventoryWindow.appendTextln("   Hygiene: " + CharacterVariables.PERSON_3.STATS.HYGIENE + " out of " + CharacterVariables.PERSON_3.STATS.MAX_HYGIENE);
            OregonTrailMain.inventoryWindow.appendTextln("");
        }
        if (!CharacterVariables.PERSON_4.IS_GONE) {
            show_person(CharacterVariables.PERSON_4.PERSON, CharacterVariables.PERSON_4.IS_FORLORN, CharacterVariables.PERSON_4.IS_SICK, CharacterVariables.PERSON_4.SICK_WITH);
            OregonTrailMain.inventoryWindow.appendTextln("   Health: " + CharacterVariables.PERSON_4.STATS.HEALTH + " out of " + CharacterVariables.PERSON_4.STATS.MAX_HEALTH);
            OregonTrailMain.inventoryWindow.appendTextln("   Stamina: " + CharacterVariables.PERSON_4.STATS.STAMINA + " out of " + CharacterVariables.PERSON_4.STATS.MAX_STAMINA);
            OregonTrailMain.inventoryWindow.appendTextln("   Happiness: " + CharacterVariables.PERSON_4.STATS.HAPPINESS + " out of " + CharacterVariables.PERSON_4.STATS.MAX_HAPPINESS);
            OregonTrailMain.inventoryWindow.appendTextln("   Hygiene: " + CharacterVariables.PERSON_4.STATS.HYGIENE + " out of " + CharacterVariables.PERSON_4.STATS.MAX_HYGIENE);
            OregonTrailMain.inventoryWindow.appendTextln("");
        }
    }
    private static void displayForlorn(Boolean p_is_forlorn) {
        if (p_is_forlorn) {
            OregonTrailMain.inventoryWindow.appendTextln("   Is forlorn.");
        } else {
            OregonTrailMain.inventoryWindow.appendTextln("   Is not forlorn.");
        }
    }
    private static void displaySick(Boolean sick, String s) {
        if (sick) {
            OregonTrailMain.inventoryWindow.appendTextln("   Is sick with " + s + ".");
        } else {
            OregonTrailMain.inventoryWindow.appendTextln("   Is not sick.");
        }
    }
    private static void show_person(String p, Boolean p_is_forlorn, Boolean sick, String s) {
        OregonTrailMain.inventoryWindow.appendTextln(p + ":");
        displayForlorn(p_is_forlorn);
        displaySick(sick, s);
    }
}
