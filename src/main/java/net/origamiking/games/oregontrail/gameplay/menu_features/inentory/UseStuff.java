package net.origamiking.games.oregontrail.gameplay.menu_features.inentory;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import javax.swing.*;


public class UseStuff {
    public static void useMedicine() {
        OregonTrailMain.println("You can heal:");
        if (CharacterVariables.PERSON_1.IS_SICK) {
            OregonTrailMain.println(CharacterVariables.PERSON_1.PERSON);
        } else if (CharacterVariables.PERSON_2.IS_SICK) {
            OregonTrailMain.println(CharacterVariables.PERSON_2.PERSON);
        } else if (CharacterVariables.PERSON_3.IS_SICK) {
            OregonTrailMain.println(CharacterVariables.PERSON_3.PERSON);
        } else if (CharacterVariables.PERSON_4.IS_SICK) {
            OregonTrailMain.println(CharacterVariables.PERSON_4.PERSON);
        } else {
            OregonTrailMain.println("No one is sick.");
        }
        String[] options = {"Leave", "Heal " + CharacterVariables.PERSON_4.PERSON, "Heal " + CharacterVariables.PERSON_3.PERSON, "Heal " + CharacterVariables.PERSON_2.PERSON, "Heal " + CharacterVariables.PERSON_1.PERSON};

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "What would you like to do?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);
        switch (choice) {
            case 0 -> {}
            case 4 -> {
                if (CharacterVariables.PERSON_1.IS_SICK) {
                    p1_m();
                } else {
                    OregonTrailMain.println("This Person is not sick");
                }
            }
            case 3 -> {
                if (CharacterVariables.PERSON_2.IS_SICK) {
                    p2_m();
                } else {
                    OregonTrailMain.println("This Person is not sick");
                }
            }
            case 2 -> {
                if (CharacterVariables.PERSON_3.IS_SICK) {
                    p3_m();
                } else {
                    OregonTrailMain.println("This Person is not sick");
                }
            }
            case 1 -> {
                if (CharacterVariables.PERSON_4.IS_SICK) {
                    p4_m();
                } else {
                    OregonTrailMain.println("This Person is not sick");
                }
            }
        }
    }
    private static void p1_m() {
        if (CharacterVariables.PERSON_1.SICK_WITH.equalsIgnoreCase("dysentery")) {
            OregonTrailMain.println("This takes 2 Medicine. Use Medicine Y/N");
            String[] options = {"No", "Yes"};

            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Medicine?", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, options, null);
            switch (choice) {
                case 1 -> {
                    if (Variables.MEDICINE >= 2) {
                        OregonTrailMain.println("-2 Medicine\n" + CharacterVariables.PERSON_1.PERSON + " is now better.");
                        CharacterVariables.PERSON_1.SICK_WITH = "";
                        CharacterVariables.PERSON_1.IS_SICK = false;
                        Variables.MEDICINE = Variables.MEDICINE - 2;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case 0 -> {}
            }
        } else if (CharacterVariables.PERSON_1.SICK_WITH.equalsIgnoreCase("fever")) {
            OregonTrailMain.println("This takes 1 Medicine. Use Medicine Y/N");
            String[] options = {"No", "Yes"};

            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Medicine?", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, options, null);
            switch (choice) {
                case 1 -> {
                    if (Variables.MEDICINE >= 1) {
                        OregonTrailMain.println("-1 Medicine\n" + CharacterVariables.PERSON_1.PERSON + " is now better.");
                        CharacterVariables.PERSON_1.SICK_WITH = "";
                        CharacterVariables.PERSON_1.IS_SICK = false;
                        Variables.MEDICINE--;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case 0 -> {}
            }
        }
    }
    private static void p2_m() {
        if (CharacterVariables.PERSON_2.SICK_WITH.equalsIgnoreCase("dysentery")) {
            OregonTrailMain.println("This takes 2 Medicine. Use Medicine Y/N");
            String[] options = {"No", "Yes"};

            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Medicine?", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, options, null);
            switch (choice) {
                case 1 -> {
                    if (Variables.MEDICINE >= 2) {
                        OregonTrailMain.println("-2 Medicine\n" + CharacterVariables.PERSON_2.PERSON + " is now better.");
                        CharacterVariables.PERSON_2.SICK_WITH = "";
                        CharacterVariables.PERSON_2.IS_SICK = false;
                        Variables.MEDICINE = Variables.MEDICINE - 2;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case 0 -> {}
            }
        } else if (CharacterVariables.PERSON_2.SICK_WITH.equalsIgnoreCase("fever")) {
            OregonTrailMain.println("This takes 1 Medicine. Use Medicine Y/N");
            String[] options = {"No", "Yes"};

            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Medicine?", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, options, null);
            switch (choice) {
                case 1 -> {
                    if (Variables.MEDICINE >= 1) {
                        OregonTrailMain.println("-1 Medicine\n" + CharacterVariables.PERSON_2.PERSON + " is now better.");
                        CharacterVariables.PERSON_2.SICK_WITH = "";
                        CharacterVariables.PERSON_2.IS_SICK = false;
                        Variables.MEDICINE--;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case 0 -> {}
            }
        }
    }
    private static void p3_m() {
        if (CharacterVariables.PERSON_3.SICK_WITH.equalsIgnoreCase("dysentery")) {
            OregonTrailMain.println("This takes 2 Medicine. Use Medicine Y/N");
            String[] options = {"No", "Yes"};

            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Medicine?", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, options, null);
            switch (choice) {
                case 1 -> {
                    if (Variables.MEDICINE >= 2) {
                        OregonTrailMain.println("-2 Medicine\n" + CharacterVariables.PERSON_3.PERSON + " is now better.");
                        CharacterVariables.PERSON_3.SICK_WITH = "";
                        CharacterVariables.PERSON_3.IS_SICK = false;
                        Variables.MEDICINE = Variables.MEDICINE - 2;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case 0 -> {}
            }
        } else if (CharacterVariables.PERSON_3.SICK_WITH.equalsIgnoreCase("fever")) {
            OregonTrailMain.println("This takes 1 Medicine. Use Medicine Y/N");
            String[] options = {"No", "Yes"};

            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Medicine?", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, options, null);
            switch (choice) {
                case 1 -> {
                    if (Variables.MEDICINE >= 1) {
                        OregonTrailMain.println("-1 Medicine\n" + CharacterVariables.PERSON_3.PERSON + " is now better.");
                        CharacterVariables.PERSON_3.SICK_WITH = "";
                        CharacterVariables.PERSON_3.IS_SICK = false;
                        Variables.MEDICINE--;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case 0 -> {}
            }
        }
    }
    private static void p4_m() {
        if (CharacterVariables.PERSON_4.SICK_WITH.equalsIgnoreCase("dysentery")) {
            OregonTrailMain.println("This takes 2 Medicine. Use Medicine Y/N");
            String[] options = {"No", "Yes"};

            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Medicine?", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, options, null);
            switch (choice) {
                case 1 -> {
                    if (Variables.MEDICINE >= 2) {
                        OregonTrailMain.println("-2 Medicine\n" + CharacterVariables.PERSON_4.PERSON + " is now better.");
                        CharacterVariables.PERSON_4.SICK_WITH = "";
                        CharacterVariables.PERSON_4.IS_SICK = false;
                        Variables.MEDICINE = Variables.MEDICINE - 2;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case 0 -> {}
            }
        } else if (CharacterVariables.PERSON_4.SICK_WITH.equalsIgnoreCase("fever")) {
            OregonTrailMain.println("This takes 1 Medicine. Use Medicine Y/N");
            String[] options = {"No", "Yes"};

            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Medicine?", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, options, null);
            switch (choice) {
                case 1 -> {
                    if (Variables.MEDICINE >= 1) {
                        OregonTrailMain.println("-1 Medicine\n" + CharacterVariables.PERSON_4.PERSON + " is now better.");
                        CharacterVariables.PERSON_4.SICK_WITH = "";
                        CharacterVariables.PERSON_4.IS_SICK = false;
                        Variables.MEDICINE--;
                    } else {
                        OregonTrailMain.println("You dont have enough medicine.");
                    }
                }
                case 0 -> {}
            }
        }
    }
    public static void useCoffee() {
        OregonTrailMain.println("1. " + CharacterVariables.PERSON_1.PERSON +" has " + CharacterVariables.PERSON_1.STATS.STAMINA + " stamina out of " + CharacterVariables.PERSON_1.STATS.MAX_STAMINA);
        OregonTrailMain.println("2. " + CharacterVariables.PERSON_2.PERSON +" has " + CharacterVariables.PERSON_2.STATS.STAMINA + " stamina out of " + CharacterVariables.PERSON_2.STATS.MAX_STAMINA);
        OregonTrailMain.println("3. " + CharacterVariables.PERSON_3.PERSON +" has " + CharacterVariables.PERSON_3.STATS.STAMINA + " stamina out of " + CharacterVariables.PERSON_3.STATS.MAX_STAMINA);
        OregonTrailMain.println("4. " + CharacterVariables.PERSON_4.PERSON +" has " + CharacterVariables.PERSON_4.STATS.STAMINA + " stamina out of " + CharacterVariables.PERSON_4.STATS.MAX_STAMINA);
        String[] options = {"Leave", CharacterVariables.PERSON_1.PERSON, CharacterVariables.PERSON_2.PERSON, CharacterVariables.PERSON_3.PERSON,CharacterVariables.PERSON_4.PERSON};

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Clothes?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);
        switch (choice) {
            case 0 -> {}
            case 4 -> {
                if (CharacterVariables.PERSON_1.STATS.STAMINA <= CharacterVariables.PERSON_1.STATS.MAX_STAMINA) {
                    p1_c();
                } else {
                    OregonTrailMain.println("This person is already energized.");
                }
            }
            case 3 -> {
                if (CharacterVariables.PERSON_2.STATS.STAMINA <= CharacterVariables.PERSON_2.STATS.MAX_STAMINA) {
                    p2_c();
                } else {
                    OregonTrailMain.println("This person is already energized.");
                }
            }
            case 2 -> {
                if (CharacterVariables.PERSON_3.STATS.STAMINA <= CharacterVariables.PERSON_3.STATS.MAX_STAMINA) {
                    p3_c();
                } else {
                    OregonTrailMain.println("This person is already energized.");
                }
            }
            case 1 -> {
                if (CharacterVariables.PERSON_4.STATS.STAMINA <= CharacterVariables.PERSON_4.STATS.MAX_STAMINA) {
                    p4_c();
                } else {
                    OregonTrailMain.println("This person is already energized.");
                }
            }
        }
    }
    private static void p1_c() {
        if (Variables.COFFEE >= 1) {
            OregonTrailMain.println("It takes 1 Coffee to add 2 stamina points. Use Coffee Y/N");
            String[] options = {"No", "Yes"};

            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Coffee?", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, options, null);
            switch (choice) {
                case 1 -> {
                    if (Variables.COFFEE >= 1) {
                        OregonTrailMain.println("-1 Coffee\n" + CharacterVariables.PERSON_1.PERSON + " is now more energized.");
                        CharacterVariables.PERSON_1.STATS.STAMINA = CharacterVariables.PERSON_1.STATS.STAMINA + 2;
                        Variables.COFFEE--;
                    } else {
                        OregonTrailMain.println("You dont have enough coffee.");
                    }
                }
                case 0 -> {}
            }
        } else {
            OregonTrailMain.println("You dont have enough coffee.");
        }
    }
    private static void p2_c() {
        if (Variables.COFFEE >= 1) {
            OregonTrailMain.println("It takes 1 Coffee to add 2 stamina points. Use Coffee Y/N");
            String[] options = {"No", "Yes"};

            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Coffee?", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, options, null);
            switch (choice) {
                case 1 -> {
                    if (Variables.COFFEE >= 1) {
                        OregonTrailMain.println("-1 Coffee\n" + CharacterVariables.PERSON_2.PERSON + " is now more energized.");
                        CharacterVariables.PERSON_2.STATS.STAMINA = CharacterVariables.PERSON_2.STATS.STAMINA + 2;
                        Variables.COFFEE--;
                    } else {
                        OregonTrailMain.println("You dont have enough coffee.");
                    }
                }
                case 0 -> {}
            }
        } else {
            OregonTrailMain.println("You dont have enough coffee.");
        }
    }
    private static void p3_c() {
        if (Variables.COFFEE >= 1) {
            OregonTrailMain.println("It takes 1 Coffee to add 2 stamina points. Use Coffee Y/N");
            String[] options = {"No", "Yes"};

            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Coffee?", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, options, null);
            switch (choice) {
                case 1 -> {
                    if (Variables.COFFEE >= 1) {
                        OregonTrailMain.println("-1 Coffee\n" + CharacterVariables.PERSON_3.PERSON + " is now more energized.");
                        CharacterVariables.PERSON_3.STATS.STAMINA = CharacterVariables.PERSON_3.STATS.STAMINA + 2;
                        Variables.COFFEE--;
                    } else {
                        OregonTrailMain.println("You dont have enough coffee.");
                    }
                }
                case 0 -> {}
            }
        } else {
            OregonTrailMain.println("You dont have enough coffee.");
        }
    }
    private static void p4_c() {
        if (Variables.COFFEE >= 1) {
            OregonTrailMain.println("It takes 1 Coffee to add 2 stamina points. Use Coffee Y/N");
            String[] options = {"No", "Yes"};

            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Coffee?", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, options, null);
            switch (choice) {
                case 1 -> {
                    if (Variables.COFFEE >= 1) {
                        OregonTrailMain.println("-1 Coffee\n" + CharacterVariables.PERSON_4.PERSON + " is now more energized.");
                        CharacterVariables.PERSON_4.STATS.STAMINA = CharacterVariables.PERSON_4.STATS.STAMINA + 2;
                        Variables.COFFEE--;
                    } else {
                        OregonTrailMain.println("You dont have enough coffee.");
                    }
                }
                case 0 -> {}
            }
        } else {
            OregonTrailMain.println("You dont have enough coffee.");
        }
    }
    public static void useClothes() {
        OregonTrailMain.println("1. " + CharacterVariables.PERSON_1.PERSON + " has " + CharacterVariables.PERSON_1.STATS.HYGIENE + " hygiene out of " + CharacterVariables.PERSON_1.STATS.MAX_HYGIENE);
        OregonTrailMain.println("2. " + CharacterVariables.PERSON_2.PERSON + " has " + CharacterVariables.PERSON_2.STATS.HYGIENE + " hygiene out of " + CharacterVariables.PERSON_2.STATS.MAX_HYGIENE);
        OregonTrailMain.println("3. " + CharacterVariables.PERSON_3.PERSON + " has " + CharacterVariables.PERSON_3.STATS.HYGIENE + " hygiene out of " + CharacterVariables.PERSON_3.STATS.MAX_HYGIENE);
        OregonTrailMain.println("4. " + CharacterVariables.PERSON_4.PERSON + " has " + CharacterVariables.PERSON_4.STATS.HYGIENE + " hygiene out of " + CharacterVariables.PERSON_4.STATS.MAX_HYGIENE);
        String[] options = {"Leave", CharacterVariables.PERSON_1.PERSON, CharacterVariables.PERSON_2.PERSON, CharacterVariables.PERSON_3.PERSON,CharacterVariables.PERSON_4.PERSON};

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Clothes?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);
        switch (choice) {
            case 0 -> {}
            case 4 -> {
                if (CharacterVariables.PERSON_1.STATS.HYGIENE <= CharacterVariables.PERSON_1.STATS.MAX_HYGIENE) {
                    p1_cl();
                } else {
                    OregonTrailMain.println("This person already has good hygiene.");
                }
            }
            case 3 -> {
                if (CharacterVariables.PERSON_2.STATS.HYGIENE <= CharacterVariables.PERSON_2.STATS.MAX_HYGIENE) {
                    p2_cl();
                } else {
                    OregonTrailMain.println("This person already has good hygiene.");
                }
            }
            case 2 -> {
                if (CharacterVariables.PERSON_3.STATS.HYGIENE <= CharacterVariables.PERSON_3.STATS.MAX_HYGIENE) {
                    p3_cl();
                } else {
                    OregonTrailMain.println("This person already has good hygiene.");
                }
            }
            case 1 -> {
                if (CharacterVariables.PERSON_4.STATS.HYGIENE <= CharacterVariables.PERSON_4.STATS.MAX_HYGIENE) {
                    p4_cl();
                } else {
                    OregonTrailMain.println("This person already has good hygiene.");
                }
            }
        }
    }
    private static void p1_cl() {
        if (Variables.CLOTHES >= 1) {
            OregonTrailMain.println("It takes 1 clothes to add 2 hygiene points. Use clothes Y/N");
            String[] options = {"No", "Yes"};

            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Clothes?", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, options, null);
            switch (choice) {
                case 1 -> {
                    if (Variables.CLOTHES >= 1) {
                        OregonTrailMain.println("-1 clothes\n" + CharacterVariables.PERSON_1.PERSON + " has better hygiene.");
                        CharacterVariables.PERSON_1.STATS.STAMINA = CharacterVariables.PERSON_1.STATS.STAMINA + 2;
                        Variables.CLOTHES--;
                    } else {
                        OregonTrailMain.println("You dont have enough clothes.");
                    }
                }
                case 0 -> {}
            }
        } else {
            OregonTrailMain.println("You dont have enough clothes.");
        }
    }
    private static void p2_cl() {
        if (Variables.CLOTHES >= 1) {
            OregonTrailMain.println("It takes 1 clothes to add 2 hygiene points. Use clothes Y/N");
            String[] options = {"No", "Yes"};

            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Clothes?", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, options, null);
            switch (choice) {
                case 1 -> {
                    if (Variables.CLOTHES >= 1) {
                        OregonTrailMain.println("-1 clothes\n" + CharacterVariables.PERSON_2.PERSON + " has better hygiene.");
                        CharacterVariables.PERSON_2.STATS.STAMINA = CharacterVariables.PERSON_2.STATS.STAMINA + 2;
                        Variables.CLOTHES--;
                    } else {
                        OregonTrailMain.println("You dont have enough clothes.");
                    }
                }
                case 0 -> {}
            }
        } else {
            OregonTrailMain.println("You dont have enough clothes.");
        }
    }
    private static void p3_cl() {
        if (Variables.CLOTHES >= 1) {
            OregonTrailMain.println("It takes 1 clothes to add 2 hygiene points. Use clothes Y/N");
            String[] options = {"No", "Yes"};

            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Clothes?", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, options, null);
            switch (choice) {
                case 1 -> {
                    if (Variables.CLOTHES >= 1) {
                        OregonTrailMain.println("-1 clothes\n" + CharacterVariables.PERSON_3.PERSON + " has better hygiene.");
                        CharacterVariables.PERSON_3.STATS.STAMINA = CharacterVariables.PERSON_3.STATS.STAMINA + 2;
                        Variables.CLOTHES--;
                    } else {
                        OregonTrailMain.println("You dont have enough clothes.");
                    }
                }
                case 0 -> {}
            }
        } else {
            OregonTrailMain.println("You dont have enough clothes.");
        }
    }
    private static void p4_cl() {
        if (Variables.CLOTHES >= 1) {
            OregonTrailMain.println("It takes 1 clothes to add 2 hygiene points. Use clothes Y/N");
            String[] options = {"No", "Yes"};

            int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Use Clothes?", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, options, null);
            switch (choice) {
                case 1 -> {
                    if (Variables.CLOTHES >= 1) {
                        OregonTrailMain.println("-1 clothes\n" + CharacterVariables.PERSON_4.PERSON + " has better hygiene.");
                        CharacterVariables.PERSON_4.STATS.STAMINA = CharacterVariables.PERSON_4.STATS.STAMINA + 2;
                        Variables.CLOTHES--;
                    } else {
                        OregonTrailMain.println("You dont have enough clothes.");
                    }
                }
                case 0 -> {}
            }
        } else {
            OregonTrailMain.println("You dont have enough clothes.");
        }
    }
}
