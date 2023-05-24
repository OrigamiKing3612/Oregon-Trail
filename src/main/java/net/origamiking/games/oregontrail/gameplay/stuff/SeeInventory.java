package net.origamiking.games.oregontrail.gameplay.stuff;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Scanner;

public class SeeInventory {
    public static void seeInventory() {
        OregonTrailMain.println("Coins: " + Variables.COINS);
        OregonTrailMain.println("Pounds of Food: " + Variables.POUNDS_OF_FOOD);
        OregonTrailMain.println("Medicine: " + Variables.MEDICINE);
        if (Variables.HAS_GUN) { OregonTrailMain.println("Gun: 1"); } else { OregonTrailMain.println("Gun: None"); }
        OregonTrailMain.println("Bullets: " + Variables.BULLETS);
        OregonTrailMain.println("Axels: " + Variables.AXELS);
        OregonTrailMain.println("Wheels: " + Variables.WHEELS);
        OregonTrailMain.println("People Left: " + Variables.PERSON_COUNTER);
        SeeInventory.characters();


        OregonTrailMain.println("Are you ready to leave? (Type \"Y\")");
        Scanner input = new Scanner(System.in);
        String ready = input.nextLine();
        ready = ready.toLowerCase();
        if (ready.equals("y")) {}
    }
    public static void characters() {
        OregonTrailMain.println("");
        show_person(CharacterVariables.PERSON_1, CharacterVariables.P1_GONE, CharacterVariables.P1_IS_FORLORN, CharacterVariables.IS_PERSON_1_SICK, CharacterVariables.P1_SICK_WITH);
        show_person(CharacterVariables.PERSON_2, CharacterVariables.P2_GONE, CharacterVariables.P2_IS_FORLORN, CharacterVariables.IS_PERSON_2_SICK, CharacterVariables.P2_SICK_WITH);
        show_person(CharacterVariables.PERSON_3, CharacterVariables.P3_GONE, CharacterVariables.P3_IS_FORLORN, CharacterVariables.IS_PERSON_3_SICK, CharacterVariables.P3_SICK_WITH);
        show_person(CharacterVariables.PERSON_4, CharacterVariables.P4_GONE, CharacterVariables.P4_IS_FORLORN, CharacterVariables.IS_PERSON_4_SICK, CharacterVariables.P4_SICK_WITH);
    }
    public static void displayForlorn(Boolean p_is_forlorn, String p) {
        if (p_is_forlorn) {
            OregonTrailMain.println(p + " is forlorn.");
        } else {
            OregonTrailMain.println(p + " is not forlorn.");
        }
    }
    public static void displaySick(Boolean sick, String p, String s) {
        if (!(sick)) OregonTrailMain.println(p + " is sick with " + s);
    }
    public static void show_person(String p, Boolean gone, Boolean p_is_forlorn, Boolean sick, String s) {
        if (!(gone)) {
            OregonTrailMain.println(p);
            displayForlorn(p_is_forlorn, p);
            displaySick(sick, p, s);
        }
    }
}
