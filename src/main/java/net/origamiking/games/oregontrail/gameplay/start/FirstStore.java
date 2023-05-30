package net.origamiking.games.oregontrail.gameplay.start;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Objects;
import java.util.Scanner;

public class FirstStore {
    public static void firstStore() {
        OregonTrailMain.println("You have " + Variables.COINS + " coins, what will you buy?");
        OregonTrailMain.println("1. Wagons and Wagon Supplies");
        OregonTrailMain.println("2. Food");
        OregonTrailMain.println("3. Ammunition shop");
        OregonTrailMain.println("4. Pharmacy");
        OregonTrailMain.println("5. Misc");
        OregonTrailMain.println("0. Leave Shop");
        OregonTrailMain.println("Put the number.");
        Scanner input = new Scanner(System.in);
        String shopChooser = input.nextLine();
        switch (shopChooser) {
            case "1" -> wagons();
            case "2" -> food();
            case "3" -> ammunition_shop();
            case "4" -> pharmacy();
            case "5" -> misc();
            case "0" -> leave_shop();
        }
    }
    private static void misc() {
        OregonTrailMain.println("1. Knife, 20 Coins");
        OregonTrailMain.println("2. Harmonica, 5 Coins");
        OregonTrailMain.println("3. Clothes, 7 Coins");
        OregonTrailMain.println("4. Coffee, 5 Coins");
        Scanner input = new Scanner(System.in);
        String misc = input.nextLine();
        switch (misc) {
            case "1" -> {
                if (Variables.COINS >= 20) {
                    Variables.COINS = Variables.COINS - 20;
                    Variables.KNIFE++;
                    OregonTrailMain.println("You bought a knife.");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case "2" -> {
                if (Variables.COINS >= 5) {
                    Variables.COINS = Variables.COINS - 5;
                    Variables.HARMONICA++;
                    OregonTrailMain.println("You bought a harmonica.");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case "3" -> {
                if (Variables.COINS >= 7) {
                    Variables.COINS = Variables.COINS - 7;
                    Variables.CLOTHES++;
                    OregonTrailMain.println("You bought clothes.");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case "4" -> {
                if (Variables.COINS >= 5) {
                    Variables.COINS = Variables.COINS - 5;
                    Variables.COFFEE++;
                    OregonTrailMain.println("You bought a coffee.");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
        }
        firstStore();
    }
    private static void wagons() {
        OregonTrailMain.println("1. Small Wagon, 50 Coins");
        OregonTrailMain.println("2. Medium Wagon, 75 Coins");
        OregonTrailMain.println("3. Big Wagon, 100 Coins");
        OregonTrailMain.println("4. Master's Wagon, 150 Coins");
        OregonTrailMain.println("5. Wagon Axel, 10 Coins");
        OregonTrailMain.println("6. Wagon Wheel, 7 Coins");
        OregonTrailMain.println("7. Wagon Tongue, 8 Coins");
        Scanner input = new Scanner(System.in);
        String wagonStore = input.nextLine();
        switch (wagonStore) {
            case "1" -> {
                if (Variables.COINS >= 50) {
                    Variables.COINS = Variables.COINS - 50;
                    Variables.WAGON_TYPE = "Small Wagon";
                    OregonTrailMain.println("You bought the " + Variables.WAGON_TYPE);
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }

            }
            case "2" -> {
                if (Variables.COINS >= 75) {
                    Variables.COINS = Variables.COINS - 75;
                    Variables.WAGON_TYPE = "Medium Wagon";
                    OregonTrailMain.println("You bought the " + Variables.WAGON_TYPE);
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case "3" -> {
                if (Variables.COINS >= 100) {
                    Variables.COINS = Variables.COINS - 100;
                    Variables.WAGON_TYPE = "Big Wagon";
                    OregonTrailMain.println("You bought the " + Variables.WAGON_TYPE);
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case "4" -> {
                if (Variables.COINS >= 150) {
                    Variables.COINS = Variables.COINS - 150;
                    Variables.WAGON_TYPE = "Master's Wagon";
                    OregonTrailMain.println("You bought the " + Variables.WAGON_TYPE);
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case "5" -> {
                if (Variables.COINS >= 10) {
                    Variables.COINS = Variables.COINS - 10;
                    Variables.AXELS++;
                    OregonTrailMain.println("You bought an axel.");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case "6" -> {
                if (Variables.COINS >= 7) {
                    Variables.COINS = Variables.COINS - 7;
                    Variables.WHEELS++;
                    OregonTrailMain.println("You bought a wheel.");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case "7" -> {
                if (Variables.COINS >= 8) {
                    Variables.COINS = Variables.COINS - 8;
                    Variables.TONGUES++;
                    OregonTrailMain.println("You bought a tongue.");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
        }
        firstStore();
    }
    private static void food() {
        OregonTrailMain.println("1. 4 Packs of Berries, 1 Coins");
        OregonTrailMain.println("2. 40 Pounds of Meat, 10 Coins");
        OregonTrailMain.println("3. 5 Bacon, 20 Coins");
        OregonTrailMain.println("4. 160 Pounds of Flour, 40 Coins");
        Scanner input = new Scanner(System.in);
        String food = input.nextLine();
        switch (food) {
            case "1" -> {
                if (Variables.COINS >= 1) {
                    Variables.COINS = Variables.COINS - 1;
                    Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD + 4f;
                    OregonTrailMain.println("You bought 4 Packs of Berries");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case "2" -> {
                if (Variables.COINS >= 10) {
                    Variables.COINS = Variables.COINS - 10;
                    Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD + 40f;
                    OregonTrailMain.println("You bought 40 Pounds of Meat");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case "3" -> {
                if (Variables.COINS >= 20) {
                    Variables.COINS = Variables.COINS - 20;
                    Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD + 5f;
                    OregonTrailMain.println("You bought 5 Bacon");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case "4" -> {
                if (Variables.COINS >= 40) {
                    Variables.COINS = Variables.COINS - 40;
                    Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD + 160f;
                    OregonTrailMain.println("You bought 160 Pounds of Flour");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
        }
        firstStore();
    }
    private static void ammunition_shop() {
        OregonTrailMain.println("1. 10 Bullets, 15 Coins");
        OregonTrailMain.println("2. 20 Bullets, 30 Coins");
        OregonTrailMain.println("3. 50 Bullets, 75 Coins");
        Scanner input = new Scanner(System.in);
        String gun_shop = input.nextLine();
        switch (gun_shop) {
            case "1" -> {
                if (Variables.COINS >= 15) {
                    Variables.COINS = Variables.COINS - 15;
                    Variables.BULLETS = Variables.BULLETS + 10;
                    OregonTrailMain.println("You bought 10 Bullets");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case "2" -> {
                if (Variables.COINS >= 30) {
                    Variables.COINS = Variables.COINS - 30;
                    Variables.BULLETS = Variables.BULLETS + 20;
                    OregonTrailMain.println("You bought 20 Bullets");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case "3" -> {
                if (Variables.COINS >= 75) {
                    Variables.COINS = Variables.COINS - 75;
                    Variables.BULLETS = Variables.BULLETS + 50;
                    OregonTrailMain.println("You bought 50 Bullets");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
        }
        firstStore();
    }
    private static void pharmacy() {
        OregonTrailMain.println("1. 1 Medicine, 30 Coins");
        OregonTrailMain.println("2. 2 Medicine, 60 Coins");
        Scanner input = new Scanner(System.in);
        String pharmacy = input.nextLine();
        switch (pharmacy) {
            case "1" -> {
                if (Variables.COINS >= 30) {
                    Variables.COINS = Variables.COINS - 30;
                    Variables.MEDICINE = Variables.MEDICINE + 1;
                    OregonTrailMain.println("You bought 1 Medicine");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
            case "2" -> {
                if (Variables.COINS >= 60) {
                    Variables.COINS = Variables.COINS - 60;
                    Variables.MEDICINE = Variables.MEDICINE + 2;
                    OregonTrailMain.println("You bought 2 Medicine");
                } else {
                    OregonTrailMain.println("You dont have enough coins.");
                }
            }
        }
        firstStore();
    }
    private static void leave_shop() {
        if (Objects.equals(Variables.WAGON_TYPE, "")) {
            OregonTrailMain.println("You need a Wagon!");
            firstStore();
        }
    }
}
