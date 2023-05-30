package net.origamiking.games.oregontrail.gameplay.events.fort;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Scanner;

public class SeeDoctor {
    public static void seeDoctor() {
        OregonTrailMain.println("You go see the doctor. He asks who you want to heal.");
        useMedicine();
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
            OregonTrailMain.println("He says it will take 30 Coins. Pay Y/N");
            Scanner input = new Scanner(System.in);
            String use_med = input.nextLine();
            use_med = use_med.toLowerCase();
            switch (use_med) {
                case "y" -> {
                    if (Variables.COINS >= 30) {
                        OregonTrailMain.println("-30 Coins\n" + CharacterVariables.PERSON_1.PERSON + " is now better.");
                        CharacterVariables.PERSON_1.SICK_WITH = "";
                        CharacterVariables.PERSON_1.IS_SICK = false;
                        Variables.COINS = Variables.COINS - 30;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case "n" -> {}
            }
        } else if (CharacterVariables.PERSON_1.SICK_WITH.equalsIgnoreCase("fever")) {
            OregonTrailMain.println("This takes 10 coins. Pay Y/N");
            Scanner input = new Scanner(System.in);
            String use_med = input.nextLine();
            use_med = use_med.toLowerCase();
            switch (use_med) {
                case "y" -> {
                    if (Variables.COINS >= 10) {
                        OregonTrailMain.println("-10 Coins\n" + CharacterVariables.PERSON_1.PERSON + " is now better.");
                        CharacterVariables.PERSON_1.SICK_WITH = "";
                        CharacterVariables.PERSON_1.IS_SICK = false;
                        Variables.COINS = Variables.COINS - 10;
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
            OregonTrailMain.println("He says it will take 30 Coins. Pay Y/N");
            Scanner input = new Scanner(System.in);
            String use_med = input.nextLine();
            use_med = use_med.toLowerCase();
            switch (use_med) {
                case "y" -> {
                    if (Variables.COINS >= 30) {
                        OregonTrailMain.println("-30 Coins\n" + CharacterVariables.PERSON_2.PERSON + " is now better.");
                        CharacterVariables.PERSON_2.SICK_WITH = "";
                        CharacterVariables.PERSON_2.IS_SICK = false;
                        Variables.COINS = Variables.COINS - 30;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case "n" -> {}
            }
        } else if (CharacterVariables.PERSON_2.SICK_WITH.equalsIgnoreCase("fever")) {
            OregonTrailMain.println("This takes 10 coins. Pay Y/N");
            Scanner input = new Scanner(System.in);
            String use_med = input.nextLine();
            use_med = use_med.toLowerCase();
            switch (use_med) {
                case "y" -> {
                    if (Variables.COINS >= 10) {
                        OregonTrailMain.println("-10 Coins\n" + CharacterVariables.PERSON_2.PERSON + " is now better.");
                        CharacterVariables.PERSON_2.SICK_WITH = "";
                        CharacterVariables.PERSON_2.IS_SICK = false;
                        Variables.COINS = Variables.COINS - 10;
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
            OregonTrailMain.println("He says it will take 30 Coins. Pay Y/N");
            Scanner input = new Scanner(System.in);
            String use_med = input.nextLine();
            use_med = use_med.toLowerCase();
            switch (use_med) {
                case "y" -> {
                    if (Variables.COINS >= 30) {
                        OregonTrailMain.println("-30 Coins\n" + CharacterVariables.PERSON_3.PERSON + " is now better.");
                        CharacterVariables.PERSON_3.SICK_WITH = "";
                        CharacterVariables.PERSON_3.IS_SICK = false;
                        Variables.COINS = Variables.COINS - 30;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case "n" -> {}
            }
        } else if (CharacterVariables.PERSON_3.SICK_WITH.equalsIgnoreCase("fever")) {
            OregonTrailMain.println("This takes 10 coins. Pay Y/N");
            Scanner input = new Scanner(System.in);
            String use_med = input.nextLine();
            use_med = use_med.toLowerCase();
            switch (use_med) {
                case "y" -> {
                    if (Variables.COINS >= 10) {
                        OregonTrailMain.println("-10 Coins\n" + CharacterVariables.PERSON_3.PERSON + " is now better.");
                        CharacterVariables.PERSON_3.SICK_WITH = "";
                        CharacterVariables.PERSON_3.IS_SICK = false;
                        Variables.COINS = Variables.COINS - 10;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case "n" -> {}
            }
        }
    }
    private static void p4() {
        if (CharacterVariables.PERSON_4.SICK_WITH.equalsIgnoreCase("dysentery")) {
            OregonTrailMain.println("He says it will take 30 Coins. Pay Y/N");
            Scanner input = new Scanner(System.in);
            String use_med = input.nextLine();
            use_med = use_med.toLowerCase();
            switch (use_med) {
                case "y" -> {
                    if (Variables.COINS >= 30) {
                        OregonTrailMain.println("-30 Coins\n" + CharacterVariables.PERSON_4.PERSON + " is now better.");
                        CharacterVariables.PERSON_4.SICK_WITH = "";
                        CharacterVariables.PERSON_4.IS_SICK = false;
                        Variables.COINS = Variables.COINS - 30;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case "n" -> {}
            }
        } else if (CharacterVariables.PERSON_4.SICK_WITH.equalsIgnoreCase("fever")) {
            OregonTrailMain.println("This takes 10 coins. Pay Y/N");
            Scanner input = new Scanner(System.in);
            String use_med = input.nextLine();
            use_med = use_med.toLowerCase();
            switch (use_med) {
                case "y" -> {
                    if (Variables.COINS >= 10) {
                        OregonTrailMain.println("-10 Coins\n" + CharacterVariables.PERSON_4.PERSON + " is now better.");
                        CharacterVariables.PERSON_4.SICK_WITH = "";
                        CharacterVariables.PERSON_4.IS_SICK = false;
                        Variables.COINS = Variables.COINS - 10;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case "n" -> {}
            }
        }
    }
}
