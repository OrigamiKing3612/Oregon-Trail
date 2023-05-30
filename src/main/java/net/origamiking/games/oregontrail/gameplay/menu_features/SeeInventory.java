package net.origamiking.games.oregontrail.gameplay.menu_features;

import net.origamiking.games.oregontrail.OregonTrailMain;
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
        OregonTrailMain.println("0. Leave");
        Scanner input = new Scanner(System.in);
        String ready = input.nextLine();
        ready = ready.toLowerCase();
        if (ready.equals("1")) {
            useMedicine();
        }
        if (ready.equals("0")) {
            leave();
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
    private static void useMedicine() {
            if (CharacterVariables.PERSON_1.IS_SICK) {
                OregonTrailMain.println("1. Heal " + CharacterVariables.PERSON_1.PERSON);
            } else if (CharacterVariables.PERSON_2.IS_SICK) {
                OregonTrailMain.println("2. Heal " + CharacterVariables.PERSON_2.PERSON);
            } else if (CharacterVariables.PERSON_3.IS_SICK) {
                OregonTrailMain.println("3. Heal " + CharacterVariables.PERSON_3.PERSON);
            } else if (CharacterVariables.PERSON_4.IS_SICK) {
                OregonTrailMain.println("4. Heal " + CharacterVariables.PERSON_4.PERSON);
            } else {
                OregonTrailMain.println("No one is sick.");
            }
        Scanner input = new Scanner(System.in);
        String m = input.nextLine();
        switch (m) {
            case "1" -> {
                if (CharacterVariables.PERSON_1.IS_SICK) {
                    p1();
                } else {
                    OregonTrailMain.println("This Person is not sick");
                }
            }
            case "2" -> {
                if (CharacterVariables.PERSON_2.IS_SICK) {
                    p2();
                } else {
                    OregonTrailMain.println("This Person is not sick");
                }
            }
            case "3" -> {
                if (CharacterVariables.PERSON_3.IS_SICK) {
                    p3();
                } else {
                    OregonTrailMain.println("This Person is not sick");
                }
            }
            case "4" -> {
                if (CharacterVariables.PERSON_4.IS_SICK) {
                    p4();
                } else {
                    OregonTrailMain.println("This Person is not sick");
                }
            }
        }
    }
    private static void p1() {
        if (CharacterVariables.PERSON_1.SICK_WITH.equalsIgnoreCase("dysentery")) {
            OregonTrailMain.println("This takes 2 Medicine. Use Medicine Y/N");
            Scanner input = new Scanner(System.in);
            String use_med = input.nextLine();
            use_med = use_med.toLowerCase();
            switch (use_med) {
                case "y" -> {
                    if (Variables.MEDICINE >= 2) {
                        OregonTrailMain.println("-2 Medicine\n" + CharacterVariables.PERSON_1.PERSON + " is now better.");
                        CharacterVariables.PERSON_1.SICK_WITH = "";
                        CharacterVariables.PERSON_1.IS_SICK = false;
                        Variables.MEDICINE = Variables.MEDICINE - 2;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case "n" -> {}
            }
        } else if (CharacterVariables.PERSON_1.SICK_WITH.equalsIgnoreCase("fever")) {
            OregonTrailMain.println("This takes 1 Medicine. Use Medicine Y/N");
            Scanner input = new Scanner(System.in);
            String use_med = input.nextLine();
            use_med = use_med.toLowerCase();
            switch (use_med) {
                case "y" -> {
                    if (Variables.MEDICINE >= 1) {
                        OregonTrailMain.println("-1 Medicine\n" + CharacterVariables.PERSON_1.PERSON + " is now better.");
                        CharacterVariables.PERSON_1.SICK_WITH = "";
                        CharacterVariables.PERSON_1.IS_SICK = false;
                        Variables.MEDICINE--;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case "n" -> {}
            }
        }
    }
    private static void p2() {
        if (CharacterVariables.PERSON_2.SICK_WITH.equalsIgnoreCase("dysentery")) {
            OregonTrailMain.println("This takes 2 Medicine. Use Medicine Y/N");
            Scanner input = new Scanner(System.in);
            String use_med = input.nextLine();
            use_med = use_med.toLowerCase();
            switch (use_med) {
                case "y" -> {
                    if (Variables.MEDICINE >= 2) {
                        OregonTrailMain.println("-2 Medicine\n" + CharacterVariables.PERSON_2.PERSON + " is now better.");
                        CharacterVariables.PERSON_2.SICK_WITH = "";
                        CharacterVariables.PERSON_2.IS_SICK = false;
                        Variables.MEDICINE = Variables.MEDICINE - 2;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case "n" -> {}
            }
        } else if (CharacterVariables.PERSON_2.SICK_WITH.equalsIgnoreCase("fever")) {
            OregonTrailMain.println("This takes 1 Medicine. Use Medicine Y/N");
            Scanner input = new Scanner(System.in);
            String use_med = input.nextLine();
            use_med = use_med.toLowerCase();
            switch (use_med) {
                case "y" -> {
                    if (Variables.MEDICINE >= 1) {
                        OregonTrailMain.println("-1 Medicine\n" + CharacterVariables.PERSON_2.PERSON + " is now better.");
                        CharacterVariables.PERSON_2.SICK_WITH = "";
                        CharacterVariables.PERSON_2.IS_SICK = false;
                        Variables.MEDICINE--;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case "n" -> {}
            }
        }
    }
    private static void p3() {
        if (CharacterVariables.PERSON_3.SICK_WITH.equalsIgnoreCase("dysentery")) {
            OregonTrailMain.println("This takes 2 Medicine. Use Medicine Y/N");
            Scanner input = new Scanner(System.in);
            String use_med = input.nextLine();
            use_med = use_med.toLowerCase();
            switch (use_med) {
                case "y" -> {
                    if (Variables.MEDICINE >= 2) {
                        OregonTrailMain.println("-2 Medicine\n" + CharacterVariables.PERSON_3.PERSON + " is now better.");
                        CharacterVariables.PERSON_3.SICK_WITH = "";
                        CharacterVariables.PERSON_3.IS_SICK = false;
                        Variables.MEDICINE = Variables.MEDICINE - 2;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case "n" -> {}
            }
        } else if (CharacterVariables.PERSON_3.SICK_WITH.equalsIgnoreCase("fever")) {
            OregonTrailMain.println("This takes 1 Medicine. Use Medicine Y/N");
            Scanner input = new Scanner(System.in);
            String use_med = input.nextLine();
            use_med = use_med.toLowerCase();
            switch (use_med) {
                case "y" -> {
                    if (Variables.MEDICINE >= 1) {
                        OregonTrailMain.println("-1 Medicine\n" + CharacterVariables.PERSON_3.PERSON + " is now better.");
                        CharacterVariables.PERSON_3.SICK_WITH = "";
                        CharacterVariables.PERSON_3.IS_SICK = false;
                        Variables.MEDICINE--;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case "n" -> {}
            }
        }
    }
    private static void p4() {
        if (CharacterVariables.PERSON_3.SICK_WITH.equalsIgnoreCase("dysentery")) {
            OregonTrailMain.println("This takes 2 Medicine. Use Medicine Y/N");
            Scanner input = new Scanner(System.in);
            String use_med = input.nextLine();
            use_med = use_med.toLowerCase();
            switch (use_med) {
                case "y" -> {
                    if (Variables.MEDICINE >= 2) {
                        OregonTrailMain.println("-2 Medicine\n" + CharacterVariables.PERSON_3.PERSON + " is now better.");
                        CharacterVariables.PERSON_3.SICK_WITH = "";
                        CharacterVariables.PERSON_3.IS_SICK = false;
                        Variables.MEDICINE = Variables.MEDICINE - 2;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case "n" -> {}
            }
        } else if (CharacterVariables.PERSON_3.SICK_WITH.equalsIgnoreCase("fever")) {
            OregonTrailMain.println("This takes 1 Medicine. Use Medicine Y/N");
            Scanner input = new Scanner(System.in);
            String use_med = input.nextLine();
            use_med = use_med.toLowerCase();
            switch (use_med) {
                case "y" -> {
                    if (Variables.MEDICINE >= 1) {
                        OregonTrailMain.println("-1 Medicine\n" + CharacterVariables.PERSON_3.PERSON + " is now better.");
                        CharacterVariables.PERSON_3.SICK_WITH = "";
                        CharacterVariables.PERSON_3.IS_SICK = false;
                        Variables.MEDICINE--;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case "n" -> {}
            }
        }
    }
    public static void leave() {}
}
