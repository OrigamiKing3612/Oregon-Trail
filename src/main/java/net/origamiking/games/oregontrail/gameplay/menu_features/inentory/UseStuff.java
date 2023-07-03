//package net.origamiking.games.oregontrail.gameplay.menu_features.inentory;
//
//import net.origamiking.games.oregontrail.OregonTrailApplication;
//import net.origamiking.games.oregontrail.utils.Utils;
//import net.origamiking.games.oregontrail.variables.CharacterVariables;
//import net.origamiking.games.oregontrail.variables.Variables;
//
//import javax.swing.*;
//import java.util.Objects;
// TODO Use stuff
//
//public class UseStuff {
//    static String person;
//    public static void useMedicine() {
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
//    private static void personStuff(int choice) {
//        switch (choice) {
//            case 4 -> {
//                if (CharacterVariables.PERSON_1.IS_SICK) {
//                    p1_m();
//                } else {
//                    OregonTrailApplication.println("This person is not sick");
//                }
//            }
//            case 3 -> {
//                if (CharacterVariables.PERSON_2.IS_SICK) {
//                    p2_m();
//                } else {
//                    OregonTrailApplication.println("This person is not sick");
//                }
//            }
//            case 2 -> {
//                if (CharacterVariables.PERSON_3.IS_SICK) {
//                    p3_m();
//                } else {
//                    OregonTrailApplication.println("This person is not sick");
//                }
//            }
//            case 1 -> {
//                if (CharacterVariables.PERSON_4.IS_SICK) {
//                    p4_m();
//                } else {
//                    OregonTrailApplication.println("This person is not sick");
//                }
//            }
//        }
//    }
//    private static void p1_m() {
//        if (CharacterVariables.PERSON_1.SICK_WITH.equalsIgnoreCase("dysentery")) {
//            OregonTrailApplication.println("This takes 2 Medicine. Use Medicine Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Medicine?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.MEDICINE >= 2) {
//                        OregonTrailApplication.println("-2 Medicine\n" + CharacterVariables.PERSON_1.PERSON + " is now better.");
//                        CharacterVariables.PERSON_1.SICK_WITH = "";
//                        CharacterVariables.PERSON_1.IS_SICK = false;
//                        Variables.MEDICINE = Variables.MEDICINE - 2;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough medicine.");
//                    }
//                }
//                case 0 -> {}
//            }
//        } else if (CharacterVariables.PERSON_1.SICK_WITH.equalsIgnoreCase("fever")) {
//            OregonTrailApplication.println("This takes 1 Medicine. Use Medicine Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Medicine?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.MEDICINE >= 1) {
//                        OregonTrailApplication.println("-1 Medicine\n" + CharacterVariables.PERSON_1.PERSON + " is now better.");
//                        CharacterVariables.PERSON_1.SICK_WITH = "";
//                        CharacterVariables.PERSON_1.IS_SICK = false;
//                        Variables.MEDICINE--;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough medicine.");
//                    }
//                }
//                case 0 -> {}
//            }
//        }
//    }
//    private static void p2_m() {
//        if (CharacterVariables.PERSON_2.SICK_WITH.equalsIgnoreCase("dysentery")) {
//            OregonTrailApplication.println("This takes 2 Medicine. Use Medicine Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Medicine?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.MEDICINE >= 2) {
//                        OregonTrailApplication.println("-2 Medicine\n" + CharacterVariables.PERSON_2.PERSON + " is now better.");
//                        CharacterVariables.PERSON_2.SICK_WITH = "";
//                        CharacterVariables.PERSON_2.IS_SICK = false;
//                        Variables.MEDICINE = Variables.MEDICINE - 2;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough medicine.");
//                    }
//                }
//                case 0 -> {}
//            }
//        } else if (CharacterVariables.PERSON_2.SICK_WITH.equalsIgnoreCase("fever")) {
//            OregonTrailApplication.println("This takes 1 Medicine. Use Medicine Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Medicine?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.MEDICINE >= 1) {
//                        OregonTrailApplication.println("-1 Medicine\n" + CharacterVariables.PERSON_2.PERSON + " is now better.");
//                        CharacterVariables.PERSON_2.SICK_WITH = "";
//                        CharacterVariables.PERSON_2.IS_SICK = false;
//                        Variables.MEDICINE--;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough medicine.");
//                    }
//                }
//                case 0 -> {}
//            }
//        }
//    }
//    private static void p3_m() {
//        if (CharacterVariables.PERSON_3.SICK_WITH.equalsIgnoreCase("dysentery")) {
//            OregonTrailApplication.println("This takes 2 Medicine. Use Medicine Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Medicine?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.MEDICINE >= 2) {
//                        OregonTrailApplication.println("-2 Medicine\n" + CharacterVariables.PERSON_3.PERSON + " is now better.");
//                        CharacterVariables.PERSON_3.SICK_WITH = "";
//                        CharacterVariables.PERSON_3.IS_SICK = false;
//                        Variables.MEDICINE = Variables.MEDICINE - 2;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough medicine.");
//                    }
//                }
//                case 0 -> {}
//            }
//        } else if (CharacterVariables.PERSON_3.SICK_WITH.equalsIgnoreCase("fever")) {
//            OregonTrailApplication.println("This takes 1 Medicine. Use Medicine Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Medicine?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.MEDICINE >= 1) {
//                        OregonTrailApplication.println("-1 Medicine\n" + CharacterVariables.PERSON_3.PERSON + " is now better.");
//                        CharacterVariables.PERSON_3.SICK_WITH = "";
//                        CharacterVariables.PERSON_3.IS_SICK = false;
//                        Variables.MEDICINE--;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough medicine.");
//                    }
//                }
//                case 0 -> {}
//            }
//        }
//    }
//    private static void p4_m() {
//        if (CharacterVariables.PERSON_4.SICK_WITH.equalsIgnoreCase("dysentery")) {
//            OregonTrailApplication.println("This takes 2 Medicine. Use Medicine Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Medicine?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.MEDICINE >= 2) {
//                        OregonTrailApplication.println("-2 Medicine\n" + CharacterVariables.PERSON_4.PERSON + " is now better.");
//                        CharacterVariables.PERSON_4.SICK_WITH = "";
//                        CharacterVariables.PERSON_4.IS_SICK = false;
//                        Variables.MEDICINE = Variables.MEDICINE - 2;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough medicine.");
//                    }
//                }
//                case 0 -> {}
//            }
//        } else if (CharacterVariables.PERSON_4.SICK_WITH.equalsIgnoreCase("fever")) {
//            OregonTrailApplication.println("This takes 1 Medicine. Use Medicine Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Medicine?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.MEDICINE >= 1) {
//                        OregonTrailApplication.println("-1 Medicine\n" + CharacterVariables.PERSON_4.PERSON + " is now better.");
//                        CharacterVariables.PERSON_4.SICK_WITH = "";
//                        CharacterVariables.PERSON_4.IS_SICK = false;
//                        Variables.MEDICINE--;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough medicine.");
//                    }
//                }
//                case 0 -> {}
//            }
//        }
//    }
//    public static void useCoffee() {
//        OregonTrailApplication.println("1. " + CharacterVariables.PERSON_1.PERSON +" has " + CharacterVariables.PERSON_1.STATS.STAMINA + " stamina out of " + CharacterVariables.PERSON_1.STATS.MAX_STAMINA);
//        OregonTrailApplication.println("2. " + CharacterVariables.PERSON_2.PERSON +" has " + CharacterVariables.PERSON_2.STATS.STAMINA + " stamina out of " + CharacterVariables.PERSON_2.STATS.MAX_STAMINA);
//        OregonTrailApplication.println("3. " + CharacterVariables.PERSON_3.PERSON +" has " + CharacterVariables.PERSON_3.STATS.STAMINA + " stamina out of " + CharacterVariables.PERSON_3.STATS.MAX_STAMINA);
//        OregonTrailApplication.println("4. " + CharacterVariables.PERSON_4.PERSON +" has " + CharacterVariables.PERSON_4.STATS.STAMINA + " stamina out of " + CharacterVariables.PERSON_4.STATS.MAX_STAMINA);
//        String[] options = {"Leave", CharacterVariables.PERSON_1.PERSON, CharacterVariables.PERSON_2.PERSON, CharacterVariables.PERSON_3.PERSON,CharacterVariables.PERSON_4.PERSON};
//
//        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Clothes?", JOptionPane.DEFAULT_OPTION,
//                JOptionPane.PLAIN_MESSAGE, null, options, null);
//        switch (choice) {
//            case 0 -> {}
//            case 4 -> {
//                if (CharacterVariables.PERSON_1.STATS.STAMINA <= CharacterVariables.PERSON_1.STATS.MAX_STAMINA) {
//                    p1_c();
//                } else {
//                    OregonTrailApplication.println("This person is already energized.");
//                }
//            }
//            case 3 -> {
//                if (CharacterVariables.PERSON_2.STATS.STAMINA <= CharacterVariables.PERSON_2.STATS.MAX_STAMINA) {
//                    p2_c();
//                } else {
//                    OregonTrailApplication.println("This person is already energized.");
//                }
//            }
//            case 2 -> {
//                if (CharacterVariables.PERSON_3.STATS.STAMINA <= CharacterVariables.PERSON_3.STATS.MAX_STAMINA) {
//                    p3_c();
//                } else {
//                    OregonTrailApplication.println("This person is already energized.");
//                }
//            }
//            case 1 -> {
//                if (CharacterVariables.PERSON_4.STATS.STAMINA <= CharacterVariables.PERSON_4.STATS.MAX_STAMINA) {
//                    p4_c();
//                } else {
//                    OregonTrailApplication.println("This person is already energized.");
//                }
//            }
//        }
//    }
//    private static void p1_c() {
//        if (Variables.COFFEE >= 1) {
//            OregonTrailApplication.println("It takes 1 Coffee to add 2 stamina points. Use Coffee Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Coffee?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.COFFEE >= 1) {
//                        OregonTrailApplication.println("-1 Coffee\n" + CharacterVariables.PERSON_1.PERSON + " is now more energized.");
//                        CharacterVariables.PERSON_1.STATS.STAMINA = CharacterVariables.PERSON_1.STATS.STAMINA + 2;
//                        Variables.COFFEE--;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough coffee.");
//                    }
//                }
//                case 0 -> {}
//            }
//        } else {
//            OregonTrailApplication.println("You dont have enough coffee.");
//        }
//    }
//    private static void p2_c() {
//        if (Variables.COFFEE >= 1) {
//            OregonTrailApplication.println("It takes 1 Coffee to add 2 stamina points. Use Coffee Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Coffee?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.COFFEE >= 1) {
//                        OregonTrailApplication.println("-1 Coffee\n" + CharacterVariables.PERSON_2.PERSON + " is now more energized.");
//                        CharacterVariables.PERSON_2.STATS.STAMINA = CharacterVariables.PERSON_2.STATS.STAMINA + 2;
//                        Variables.COFFEE--;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough coffee.");
//                    }
//                }
//                case 0 -> {}
//            }
//        } else {
//            OregonTrailApplication.println("You dont have enough coffee.");
//        }
//    }
//    private static void p3_c() {
//        if (Variables.COFFEE >= 1) {
//            OregonTrailApplication.println("It takes 1 Coffee to add 2 stamina points. Use Coffee Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Coffee?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.COFFEE >= 1) {
//                        OregonTrailApplication.println("-1 Coffee\n" + CharacterVariables.PERSON_3.PERSON + " is now more energized.");
//                        CharacterVariables.PERSON_3.STATS.STAMINA = CharacterVariables.PERSON_3.STATS.STAMINA + 2;
//                        Variables.COFFEE--;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough coffee.");
//                    }
//                }
//                case 0 -> {}
//            }
//        } else {
//            OregonTrailApplication.println("You dont have enough coffee.");
//        }
//    }
//    private static void p4_c() {
//        if (Variables.COFFEE >= 1) {
//            OregonTrailApplication.println("It takes 1 Coffee to add 2 stamina points. Use Coffee Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Coffee?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.COFFEE >= 1) {
//                        OregonTrailApplication.println("-1 Coffee\n" + CharacterVariables.PERSON_4.PERSON + " is now more energized.");
//                        CharacterVariables.PERSON_4.STATS.STAMINA = CharacterVariables.PERSON_4.STATS.STAMINA + 2;
//                        Variables.COFFEE--;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough coffee.");
//                    }
//                }
//                case 0 -> {}
//            }
//        } else {
//            OregonTrailApplication.println("You dont have enough coffee.");
//        }
//    }
//    public static void useClothes() {
//        OregonTrailApplication.println("1. " + CharacterVariables.PERSON_1.PERSON + " has " + CharacterVariables.PERSON_1.STATS.HYGIENE + " hygiene out of " + CharacterVariables.PERSON_1.STATS.MAX_HYGIENE);
//        OregonTrailApplication.println("2. " + CharacterVariables.PERSON_2.PERSON + " has " + CharacterVariables.PERSON_2.STATS.HYGIENE + " hygiene out of " + CharacterVariables.PERSON_2.STATS.MAX_HYGIENE);
//        OregonTrailApplication.println("3. " + CharacterVariables.PERSON_3.PERSON + " has " + CharacterVariables.PERSON_3.STATS.HYGIENE + " hygiene out of " + CharacterVariables.PERSON_3.STATS.MAX_HYGIENE);
//        OregonTrailApplication.println("4. " + CharacterVariables.PERSON_4.PERSON + " has " + CharacterVariables.PERSON_4.STATS.HYGIENE + " hygiene out of " + CharacterVariables.PERSON_4.STATS.MAX_HYGIENE);
//        String[] options = {"Leave", CharacterVariables.PERSON_1.PERSON, CharacterVariables.PERSON_2.PERSON, CharacterVariables.PERSON_3.PERSON,CharacterVariables.PERSON_4.PERSON};
//
//        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Clothes?", JOptionPane.DEFAULT_OPTION,
//                JOptionPane.PLAIN_MESSAGE, null, options, null);
//        switch (choice) {
//            case 0 -> {}
//            case 4 -> {
//                if (CharacterVariables.PERSON_1.STATS.HYGIENE <= CharacterVariables.PERSON_1.STATS.MAX_HYGIENE) {
//                    p1_cl();
//                } else {
//                    OregonTrailApplication.println("This person already has good hygiene.");
//                }
//            }
//            case 3 -> {
//                if (CharacterVariables.PERSON_2.STATS.HYGIENE <= CharacterVariables.PERSON_2.STATS.MAX_HYGIENE) {
//                    p2_cl();
//                } else {
//                    OregonTrailApplication.println("This person already has good hygiene.");
//                }
//            }
//            case 2 -> {
//                if (CharacterVariables.PERSON_3.STATS.HYGIENE <= CharacterVariables.PERSON_3.STATS.MAX_HYGIENE) {
//                    p3_cl();
//                } else {
//                    OregonTrailApplication.println("This person already has good hygiene.");
//                }
//            }
//            case 1 -> {
//                if (CharacterVariables.PERSON_4.STATS.HYGIENE <= CharacterVariables.PERSON_4.STATS.MAX_HYGIENE) {
//                    p4_cl();
//                } else {
//                    OregonTrailApplication.println("This person already has good hygiene.");
//                }
//            }
//        }
//    }
//    private static void p1_cl() {
//        if (Variables.CLOTHES >= 1) {
//            OregonTrailApplication.println("It takes 1 clothes to add 2 hygiene points. Use clothes Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Clothes?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.CLOTHES >= 1) {
//                        OregonTrailApplication.println("-1 clothes\n" + CharacterVariables.PERSON_1.PERSON + " has better hygiene.");
//                        CharacterVariables.PERSON_1.STATS.STAMINA = CharacterVariables.PERSON_1.STATS.STAMINA + 2;
//                        Variables.CLOTHES--;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough clothes.");
//                    }
//                }
//                case 0 -> {}
//            }
//        } else {
//            OregonTrailApplication.println("You dont have enough clothes.");
//        }
//    }
//    private static void p2_cl() {
//        if (Variables.CLOTHES >= 1) {
//            OregonTrailApplication.println("It takes 1 clothes to add 2 hygiene points. Use clothes Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Clothes?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.CLOTHES >= 1) {
//                        OregonTrailApplication.println("-1 clothes\n" + CharacterVariables.PERSON_2.PERSON + " has better hygiene.");
//                        CharacterVariables.PERSON_2.STATS.STAMINA = CharacterVariables.PERSON_2.STATS.STAMINA + 2;
//                        Variables.CLOTHES--;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough clothes.");
//                    }
//                }
//                case 0 -> {}
//            }
//        } else {
//            OregonTrailApplication.println("You dont have enough clothes.");
//        }
//    }
//    private static void p3_cl() {
//        if (Variables.CLOTHES >= 1) {
//            OregonTrailApplication.println("It takes 1 clothes to add 2 hygiene points. Use clothes Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Clothes?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.CLOTHES >= 1) {
//                        OregonTrailApplication.println("-1 clothes\n" + CharacterVariables.PERSON_3.PERSON + " has better hygiene.");
//                        CharacterVariables.PERSON_3.STATS.STAMINA = CharacterVariables.PERSON_3.STATS.STAMINA + 2;
//                        Variables.CLOTHES--;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough clothes.");
//                    }
//                }
//                case 0 -> {}
//            }
//        } else {
//            OregonTrailApplication.println("You dont have enough clothes.");
//        }
//    }
//    private static void p4_cl() {
//        if (Variables.CLOTHES >= 1) {
//            OregonTrailApplication.println("It takes 1 clothes to add 2 hygiene points. Use clothes Y/N");
//            String[] options = {"No", "Yes"};
//
//            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Clothes?", JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.PLAIN_MESSAGE, null, options, null);
//            switch (choice) {
//                case 1 -> {
//                    if (Variables.CLOTHES >= 1) {
//                        OregonTrailApplication.println("-1 clothes\n" + CharacterVariables.PERSON_4.PERSON + " has better hygiene.");
//                        CharacterVariables.PERSON_4.STATS.STAMINA = CharacterVariables.PERSON_4.STATS.STAMINA + 2;
//                        Variables.CLOTHES--;
//                    } else {
//                        OregonTrailApplication.println("You dont have enough clothes.");
//                    }
//                }
//                case 0 -> {}
//            }
//        } else {
//            OregonTrailApplication.println("You dont have enough clothes.");
//        }
//    }
//}
