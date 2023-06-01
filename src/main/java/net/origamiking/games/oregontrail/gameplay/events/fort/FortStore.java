package net.origamiking.games.oregontrail.gameplay.events.fort;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.Variables;

import javax.swing.*;

public class FortStore {
    public static void fortStore() {
        OregonTrailMain.println("You have " + Variables.COINS + " coins, what will you buy?");
        String[] options = {"Leave Shop", "Misc", "Pharmacy", "Ammunition shop" , "Food", "Wagon Supplies"};

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "You have " + Variables.COINS + " coins, what will you buy?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);
        switch (choice) {
            case 5 -> wagons();
            case 4 -> food();
            case 3 -> ammunition_shop();
            case 2 -> pharmacy();
            case 1 -> misc();
            case 0 -> leave_shop();
        }
    }
    private static void misc() {
        String[] options = {"Back ","Coffee, 5 Coins", "Clothes, 7 Coins", "Harmonica, 5 Coins", "Knife, 20 Coins"};

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Misc", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);

        switch (choice) {
            case 4 -> {
                if (Variables.COINS >= 20) {
                    Variables.COINS = Variables.COINS - 20;
                    Variables.KNIFE++;
                    OregonTrailMain.println("You bought a knife.");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case 3 -> {
                if (Variables.COINS >= 5) {
                    Variables.COINS = Variables.COINS - 5;
                    Variables.HARMONICA++;
                    OregonTrailMain.println("You bought a harmonica.");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case 2 -> {
                if (Variables.COINS >= 7) {
                    Variables.COINS = Variables.COINS - 7;
                    Variables.CLOTHES++;
                    OregonTrailMain.println("You bought clothes.");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case 1 -> {
                if (Variables.COINS >= 5) {
                    Variables.COINS = Variables.COINS - 5;
                    Variables.COFFEE++;
                    OregonTrailMain.println("You bought a coffee.");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case 0 -> {}
        }
        fortStore();
    }
    private static void wagons() {
        String[] options = {"Back", "Wagon Tongue, 8 Coins", "Wagon Wheel, 7 Coins", "Wagon Axel, 10 Coins"};

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "You have " + Variables.COINS + " coins, what will you buy?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);
        switch (choice) {
            case 3 -> {
                if (Variables.COINS >= 10) {
                    Variables.COINS = Variables.COINS - 10;
                    Variables.AXELS++;
                    OregonTrailMain.println("You bought an axel.");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case 2 -> {
                if (Variables.COINS >= 7) {
                    Variables.COINS = Variables.COINS - 7;
                    Variables.WHEELS++;
                    OregonTrailMain.println("You bought a wheel.");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case 1 -> {
                if (Variables.COINS >= 8) {
                    Variables.COINS = Variables.COINS - 8;
                    Variables.TONGUES++;
                    OregonTrailMain.println("You bought a tongue.");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case 0 -> {}
        }
        fortStore();
    }
    private static void food() {
        String[] options = {"Back", "160 Pounds of Flour, 40 Coins", "5 Bacon, 20 Coins", "40 Pounds of Meat, 10 Coins", "4 Packs of Berries, 1 Coins"};

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Food", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);
        switch (choice) {
            case 4 -> {
                if (Variables.COINS >= 1) {
                    Variables.COINS = Variables.COINS - 1;
                    Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD + 4f;
                    OregonTrailMain.println("You bought 4 Packs of Berries");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case 3 -> {
                if (Variables.COINS >= 10) {
                    Variables.COINS = Variables.COINS - 10;
                    Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD + 40f;
                    OregonTrailMain.println("You bought 40 Pounds of Meat");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case 2 -> {
                if (Variables.COINS >= 20) {
                    Variables.COINS = Variables.COINS - 20;
                    Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD + 5f;
                    OregonTrailMain.println("You bought 5 Bacon");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case 1 -> {
                if (Variables.COINS >= 40) {
                    Variables.COINS = Variables.COINS - 40;
                    Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD + 160f;
                    OregonTrailMain.println("You bought 160 Pounds of Flour");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case 0 -> {}
        }
        fortStore();
    }
    private static void ammunition_shop() {
        String[] options = {"Back", "50 Bullets, 75 Coins", "20 Bullets, 30 Coins", "10 Bullets, 15 Coins"};

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Ammunition Shop", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);
        switch (choice) {
            case 3 -> {
                if (Variables.COINS >= 15) {
                    Variables.COINS = Variables.COINS - 15;
                    Variables.BULLETS = Variables.BULLETS + 10;
                    OregonTrailMain.println("You bought 10 Bullets");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case 2 -> {
                if (Variables.COINS >= 30) {
                    Variables.COINS = Variables.COINS - 30;
                    Variables.BULLETS = Variables.BULLETS + 20;
                    OregonTrailMain.println("You bought 20 Bullets");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case 1 -> {
                if (Variables.COINS >= 75) {
                    Variables.COINS = Variables.COINS - 75;
                    Variables.BULLETS = Variables.BULLETS + 50;
                    OregonTrailMain.println("You bought 50 Bullets");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case 0 -> {}
        }
        fortStore();
    }
    private static void pharmacy() {
        String[] options = {"Back","2 Medicine, 60 Coins", "1 Medicine, 30 Coins"};

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Pharmacy", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);
        switch (choice) {
            case 2 -> {
                if (Variables.COINS >= 30) {
                    Variables.COINS = Variables.COINS - 30;
                    Variables.MEDICINE = Variables.MEDICINE + 1;
                    OregonTrailMain.println("You bought 1 Medicine");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case 1 -> {
                if (Variables.COINS >= 60) {
                    Variables.COINS = Variables.COINS - 60;
                    Variables.MEDICINE = Variables.MEDICINE + 2;
                    OregonTrailMain.println("You bought 2 Medicine");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case 0 -> {}
        }
        fortStore();
    }
    private static void leave_shop() {}
}
