//package net.origamiking.games.oregontrail.gameplay.events.fort;
//
//import net.origamiking.games.oregontrail.OregonTrailApplication;
//import net.origamiking.games.oregontrail.utils.Utils;
//import net.origamiking.games.oregontrail.variables.CharacterVariables;
//import net.origamiking.games.oregontrail.variables.Variables;
//
//import javax.swing.*;
//import java.util.Objects;
//TODO SeeDoctor
//
//public class SeeDoctor {
//    static String person;
//
//    public static void seeDoctor() {
//        OregonTrailApplication.println("You go see the doctor. He asks who you want to heal.");
//        useMedicine();
//    }
//    private static void useMedicine() {
//        Variables.DAY_STUFF = "";
//        int fileCount = 0;
//        if (!CharacterVariables.PERSON_1.IS_GONE) fileCount++;
//        if (!CharacterVariables.PERSON_2.IS_GONE) fileCount++;
//        if (!CharacterVariables.PERSON_3.IS_GONE) fileCount++;
//        if (!CharacterVariables.PERSON_4.IS_GONE) fileCount++;
//        String[] options = new String[fileCount + 1];
//        int index = 0;
//        if (!CharacterVariables.PERSON_1.IS_GONE) {
//            options[index] = CharacterVariables.PERSON_1.PERSON;
//            index++;
//        }
//        if (!CharacterVariables.PERSON_2.IS_GONE) {
//            options[index] = CharacterVariables.PERSON_2.PERSON;
//            index++;
//        }
//        if (!CharacterVariables.PERSON_3.IS_GONE) {
//            options[index] = CharacterVariables.PERSON_3.PERSON;
//            index++;
//        }
//        if (!CharacterVariables.PERSON_4.IS_GONE) {
//            options[index] = CharacterVariables.PERSON_4.PERSON;
//        }
//
//        options[fileCount] = "Leave";
//        Utils.reverseArray(options);
//        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Who you want to heal?", JOptionPane.DEFAULT_OPTION,
//                JOptionPane.PLAIN_MESSAGE, null, options, null);
//
//        switch (choice) {
//            case 0 -> OregonTrailApplication.println("You decide not to heal anyone.");
//            case 3 -> {
//                if (Objects.equals(options[1], CharacterVariables.PERSON_1.PERSON)) person = CharacterVariables.PERSON_1.PERSON;
//                if (Objects.equals(options[1], CharacterVariables.PERSON_2.PERSON)) person = CharacterVariables.PERSON_2.PERSON;
//                if (Objects.equals(options[1], CharacterVariables.PERSON_3.PERSON)) person = CharacterVariables.PERSON_3.PERSON;
//                if (Objects.equals(options[1], CharacterVariables.PERSON_4.PERSON)) person = CharacterVariables.PERSON_4.PERSON;
//                personStuff(Utils.returnPersonNumber(person));
//            }
//            case 2 -> {
//                if (Objects.equals(options[2], CharacterVariables.PERSON_1.PERSON)) person = CharacterVariables.PERSON_1.PERSON;
//                if (Objects.equals(options[2], CharacterVariables.PERSON_2.PERSON)) person = CharacterVariables.PERSON_2.PERSON;
//                if (Objects.equals(options[2], CharacterVariables.PERSON_3.PERSON)) person = CharacterVariables.PERSON_3.PERSON;
//                if (Objects.equals(options[2], CharacterVariables.PERSON_4.PERSON)) person = CharacterVariables.PERSON_4.PERSON;
//                personStuff(Utils.returnPersonNumber(person));
//            }
//            case 1 -> {
//                if (Objects.equals(options[3], CharacterVariables.PERSON_1.PERSON)) person = CharacterVariables.PERSON_1.PERSON;
//                if (Objects.equals(options[3], CharacterVariables.PERSON_2.PERSON)) person = CharacterVariables.PERSON_2.PERSON;
//                if (Objects.equals(options[3], CharacterVariables.PERSON_3.PERSON)) person = CharacterVariables.PERSON_3.PERSON;
//                if (Objects.equals(options[3], CharacterVariables.PERSON_4.PERSON)) person = CharacterVariables.PERSON_4.PERSON;
//                personStuff(Utils.returnPersonNumber(person));
//            }
//            case 4 -> {
//                if (Objects.equals(options[4], CharacterVariables.PERSON_1.PERSON)) person = CharacterVariables.PERSON_1.PERSON;
//                if (Objects.equals(options[4], CharacterVariables.PERSON_2.PERSON)) person = CharacterVariables.PERSON_2.PERSON;
//                if (Objects.equals(options[4], CharacterVariables.PERSON_3.PERSON)) person = CharacterVariables.PERSON_3.PERSON;
//                if (Objects.equals(options[4], CharacterVariables.PERSON_4.PERSON)) person = CharacterVariables.PERSON_4.PERSON;
//                personStuff(Utils.returnPersonNumber(person));
//            }
//            default -> throw new IllegalStateException("Unexpected value: " + choice);
//        }
//    }
//    public static void personStuff(int choice) {
//        switch (choice) {
//            case 4 -> {
//                if (CharacterVariables.PERSON_1.IS_SICK) {
//                    p1();
//                } else {
//                    OregonTrailApplication.println("This person is not sick");
//                }
//            }
//            case 3 -> {
//                if (CharacterVariables.PERSON_2.IS_SICK) {
//                    p2();
//                } else {
//                    OregonTrailApplication.println("This person is not sick");
//                }
//            }
//            case 2 -> {
//                if (CharacterVariables.PERSON_3.IS_SICK) {
//                    p3();
//                } else {
//                    OregonTrailApplication.println("This person is not sick");
//                }
//            }
//            case 1 -> {
//                if (CharacterVariables.PERSON_4.IS_SICK) {
//                    p4();
//                } else {
//                    OregonTrailApplication.println("This person is not sick");
//                }
//            }
//        }
//    }
//    private static void p1() {
//        if (CharacterVariables.PERSON_1.SICK_WITH.equalsIgnoreCase("dysentery")) {
//            OregonTrailApplication.println("He says it will take 30 Coins. Pay Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Pay?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.COINS >= 30) {
//                        OregonTrailApplication.println("-30 Coins\n" + CharacterVariables.PERSON_1.PERSON + " is now better.");
//                        CharacterVariables.PERSON_1.SICK_WITH = "";
//                        CharacterVariables.PERSON_1.IS_SICK = false;
//                        Variables.COINS = Variables.COINS - 30;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough medicine.");
//                    }
//                }
//                case 0 -> {}
//            }
//        } else if (CharacterVariables.PERSON_1.SICK_WITH.equalsIgnoreCase("fever")) {
//            OregonTrailApplication.println("This takes 10 coins. Pay Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Pay?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.COINS >= 10) {
//                        OregonTrailApplication.println("-10 Coins\n" + CharacterVariables.PERSON_1.PERSON + " is now better.");
//                        CharacterVariables.PERSON_1.SICK_WITH = "";
//                        CharacterVariables.PERSON_1.IS_SICK = false;
//                        Variables.COINS = Variables.COINS - 10;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough medicine.");
//                    }
//                }
//                case 0 -> {}
//            }
//        }
//    }
//    private static void p2() {
//        if (CharacterVariables.PERSON_2.SICK_WITH.equalsIgnoreCase("dysentery")) {
//            OregonTrailApplication.println("He says it will take 30 Coins. Pay Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Pay?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.COINS >= 30) {
//                        OregonTrailApplication.println("-30 Coins\n" + CharacterVariables.PERSON_2.PERSON + " is now better.");
//                        CharacterVariables.PERSON_2.SICK_WITH = "";
//                        CharacterVariables.PERSON_2.IS_SICK = false;
//                        Variables.COINS = Variables.COINS - 30;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough medicine.");
//                    }
//                }
//                case 0 -> {}
//            }
//        } else if (CharacterVariables.PERSON_2.SICK_WITH.equalsIgnoreCase("fever")) {
//            OregonTrailApplication.println("This takes 10 coins. Pay Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Pay?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.COINS >= 10) {
//                        OregonTrailApplication.println("-10 Coins\n" + CharacterVariables.PERSON_2.PERSON + " is now better.");
//                        CharacterVariables.PERSON_2.SICK_WITH = "";
//                        CharacterVariables.PERSON_2.IS_SICK = false;
//                        Variables.COINS = Variables.COINS - 10;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough medicine.");
//                    }
//                }
//                case 0 -> {}
//            }
//        }
//    }
//    private static void p3() {
//        if (CharacterVariables.PERSON_3.SICK_WITH.equalsIgnoreCase("dysentery")) {
//            OregonTrailApplication.println("He says it will take 30 Coins. Pay Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Pay?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.COINS >= 30) {
//                        OregonTrailApplication.println("-30 Coins\n" + CharacterVariables.PERSON_3.PERSON + " is now better.");
//                        CharacterVariables.PERSON_3.SICK_WITH = "";
//                        CharacterVariables.PERSON_3.IS_SICK = false;
//                        Variables.COINS = Variables.COINS - 30;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough medicine.");
//                    }
//                }
//                case 0 -> {}
//            }
//        } else if (CharacterVariables.PERSON_3.SICK_WITH.equalsIgnoreCase("fever")) {
//            OregonTrailApplication.println("This takes 10 coins. Pay Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Pay?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.COINS >= 10) {
//                        OregonTrailApplication.println("-10 Coins\n" + CharacterVariables.PERSON_3.PERSON + " is now better.");
//                        CharacterVariables.PERSON_3.SICK_WITH = "";
//                        CharacterVariables.PERSON_3.IS_SICK = false;
//                        Variables.COINS = Variables.COINS - 10;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough medicine.");
//                    }
//                }
//                case 0 -> {}
//            }
//        }
//    }
//    private static void p4() {
//        if (CharacterVariables.PERSON_4.SICK_WITH.equalsIgnoreCase("dysentery")) {
//            OregonTrailApplication.println("He says it will take 30 Coins. Pay Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Pay?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.COINS >= 30) {
//                        OregonTrailApplication.println("-30 Coins\n" + CharacterVariables.PERSON_4.PERSON + " is now better.");
//                        CharacterVariables.PERSON_4.SICK_WITH = "";
//                        CharacterVariables.PERSON_4.IS_SICK = false;
//                        Variables.COINS = Variables.COINS - 30;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough medicine.");
//                    }
//                }
//                case 0 -> {}
//            }
//        } else if (CharacterVariables.PERSON_4.SICK_WITH.equalsIgnoreCase("fever")) {
//            OregonTrailApplication.println("This takes 10 coins. Pay Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Pay?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.COINS >= 10) {
//                        OregonTrailApplication.println("-10 Coins\n" + CharacterVariables.PERSON_4.PERSON + " is now better.");
//                        CharacterVariables.PERSON_4.SICK_WITH = "";
//                        CharacterVariables.PERSON_4.IS_SICK = false;
//                        Variables.COINS = Variables.COINS - 10;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough medicine.");
//                    }
//                }
//                case 0 -> {}
//            }
//        }
//    }
//}
