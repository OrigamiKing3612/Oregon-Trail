package net.origamiking.games.oregontrail.gameplay.start;

import javafx.scene.control.Button;
import net.origamiking.games.oregontrail.OregonTrailApplication;
import net.origamiking.games.oregontrail.variables.Variables;

public class FirstStore {
    public static void firstStore() {
//        Inventory.printToWindow();
        OregonTrailApplication.println("You have " + Variables.COINS + " coins, what will you buy?");

        Button[] buttons = new Button[6];
        buttons[0] = new Button("Wagons and Wagon Supplies");
        buttons[1] = new Button("Food");
        buttons[2] = new Button("Quit");
        buttons[3] = new Button("Pharmacy");
        buttons[4] = new Button("Misc");
        buttons[5] = new Button("Leave Shop");

        for (Button button : buttons) {
            button.setOnAction(e -> {
                switch (button.getText()) {
                    case "Wagons and Wagon Supplies" -> wagons();
                    case "Food" -> food();
                    case "Ammunition shop" -> ammunition_shop();
                    case "Pharmacy" -> pharmacy();
                    case "Misc" -> misc();
                    case "Leave Shop" -> leave_shop();
                    default -> {
                    }
                }
            });
        }
    }

    private static void misc() {
        Button[] buttons = new Button[5];
        buttons[0] = new Button("Knife, 20 Coins");
        buttons[1] = new Button("Harmonica, 5 Coins");
        buttons[2] = new Button("Clothes, 7 Coins");
        buttons[3] = new Button("Coffee, 5 Coins");
        buttons[4] = new Button("Back");

        for (Button button : buttons) {
            button.setOnAction(e -> {
                switch (button.getText()) {
                    case "Knife, 20 Coins" -> {
                        if (Variables.COINS >= 20) {
                            Variables.COINS = Variables.COINS - 20;
                            Variables.KNIFE++;
                            OregonTrailApplication.println("You bought a knife.");
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }
                    }
                    case "Harmonica, 5 Coins" -> {
                        if (Variables.COINS >= 5) {
                            Variables.COINS = Variables.COINS - 5;
                            Variables.HARMONICA++;
                            OregonTrailApplication.println("You bought a harmonica.");
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }
                    }
                    case "Clothes, 7 Coins" -> {
                        if (Variables.COINS >= 7) {
                            Variables.COINS = Variables.COINS - 7;
                            Variables.CLOTHES++;
                            OregonTrailApplication.println("You bought clothes.");
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }
                    }
                    case "Coffee, 5 Coins" -> {
                        if (Variables.COINS >= 5) {
                            Variables.COINS = Variables.COINS - 5;
                            Variables.COFFEE++;
                            OregonTrailApplication.println("You bought a coffee.");
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }
                    }
                    case "Back" -> {
                    }
                    default -> {
                    }
                }
            });
        }
        firstStore();
    }

    private static void wagons() {
        Button[] buttons = new Button[8];
        buttons[0] = new Button("Small Wagon, 50 Coins");
        buttons[1] = new Button("Medium Wagon, 75 Coins");
        buttons[2] = new Button("Big Wagon, 100 Coins");
        buttons[3] = new Button("Master's Wagon, 150 Coins");
        buttons[4] = new Button("Wagon Axel, 10 Coins");
        buttons[5] = new Button("Wagon Wheel, 7 Coins");
        buttons[6] = new Button("Wagon Tongue, 8 Coins");
        buttons[7] = new Button("Back");
        for (Button button : buttons) {
            button.setOnAction(e -> {
                switch (button.getText()) {
                    case "Small Wagon, 50 Coins" -> {
                        if (Variables.COINS >= 50) {
                            Variables.COINS = Variables.COINS - 50;
                            Variables.WAGON_TYPE = "Small Wagon";
                            OregonTrailApplication.println("You bought the " + Variables.WAGON_TYPE);
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }

                    }
                    case "Medium Wagon, 75 Coins" -> {
                        if (Variables.COINS >= 75) {
                            Variables.COINS = Variables.COINS - 75;
                            Variables.WAGON_TYPE = "Medium Wagon";
                            OregonTrailApplication.println("You bought the " + Variables.WAGON_TYPE);
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }
                    }
                    case "Big Wagon, 100 Coins" -> {
                        if (Variables.COINS >= 100) {
                            Variables.COINS = Variables.COINS - 100;
                            Variables.WAGON_TYPE = "Big Wagon";
                            OregonTrailApplication.println("You bought the " + Variables.WAGON_TYPE);
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }
                    }
                    case "Master's Wagon, 150 Coins" -> {
                        if (Variables.COINS >= 150) {
                            Variables.COINS = Variables.COINS - 150;
                            Variables.WAGON_TYPE = "Master's Wagon";
                            OregonTrailApplication.println("You bought the " + Variables.WAGON_TYPE);
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }
                    }
                    case "Wagon Axel, 10 Coins" -> {
                        if (Variables.COINS >= 10) {
                            Variables.COINS = Variables.COINS - 10;
                            Variables.AXELS++;
                            OregonTrailApplication.println("You bought an axel.");
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }
                    }
                    case "Wagon Wheel, 7 Coins" -> {
                        if (Variables.COINS >= 7) {
                            Variables.COINS = Variables.COINS - 7;
                            Variables.WHEELS++;
                            OregonTrailApplication.println("You bought a wheel.");
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }
                    }
                    case "Wagon Tongue, 8 Coins" -> {
                        if (Variables.COINS >= 8) {
                            Variables.COINS = Variables.COINS - 8;
                            Variables.TONGUES++;
                            OregonTrailApplication.println("You bought a tongue.");
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }
                    }
                    case "Back" -> {
                    }
                }
            });
            firstStore();
        }
    }

    private static void food() {
        Button[] buttons = new Button[5];
        buttons[0] = new Button("4 Packs of Berries, 1 Coins");
        buttons[1] = new Button("40 Pounds of Meat, 10 Coins");
        buttons[2] = new Button("5 Bacon, 20 Coins");
        buttons[3] = new Button("160 Pounds of Flour, 40 Coins");
        buttons[4] = new Button("Back");

        for (Button button : buttons) {
            button.setOnAction(e -> {
                switch (button.getText()) {
                    case "4 Packs of Berries, 1 Coins" -> {
                        if (Variables.COINS >= 1) {
                            Variables.COINS = Variables.COINS - 1;
                            Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD + 4f;
                            OregonTrailApplication.println("You bought 4 Packs of Berries");
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }
                    }
                    case "40 Pounds of Meat, 10 Coins" -> {
                        if (Variables.COINS >= 10) {
                            Variables.COINS = Variables.COINS - 10;
                            Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD + 40f;
                            OregonTrailApplication.println("You bought 40 Pounds of Meat");
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }
                    }
                    case "5 Bacon, 20 Coins" -> {
                        if (Variables.COINS >= 20) {
                            Variables.COINS = Variables.COINS - 20;
                            Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD + 5f;
                            OregonTrailApplication.println("You bought 5 Bacon");
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }
                    }
                    case "160 Pounds of Flour, 40 Coins" -> {
                        if (Variables.COINS >= 40) {
                            Variables.COINS = Variables.COINS - 40;
                            Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD + 160f;
                            OregonTrailApplication.println("You bought 160 Pounds of Flour");
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }
                    }
                    case "Back" -> {
                    }
                    default -> {
                    }
                }
            });
        }
        firstStore();
    }

    private static void ammunition_shop() {
        Button[] buttons = new Button[4];
        buttons[0] = new Button("10 Bullets, 15 Coins\"");
        buttons[1] = new Button("Clothes, 7 Coins");
        buttons[2] = new Button("50 Bullets, 75 Coins");
        buttons[3] = new Button("Back");

        for (Button button : buttons) {
            button.setOnAction(e -> {
                switch (button.getText()) {
                    case "10 Bullets, 15 Coins" -> {
                        if (Variables.COINS >= 15) {
                            Variables.COINS = Variables.COINS - 15;
                            Variables.BULLETS = Variables.BULLETS + 10;
                            OregonTrailApplication.println("You bought 10 Bullets");
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }
                    }
                    case "20 Bullets, 30 Coins" -> {
                        if (Variables.COINS >= 30) {
                            Variables.COINS = Variables.COINS - 30;
                            Variables.BULLETS = Variables.BULLETS + 20;
                            OregonTrailApplication.println("You bought 20 Bullets");
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }
                    }
                    case "50 Bullets, 75 Coins" -> {
                        if (Variables.COINS >= 75) {
                            Variables.COINS = Variables.COINS - 75;
                            Variables.BULLETS = Variables.BULLETS + 50;
                            OregonTrailApplication.println("You bought 50 Bullets");
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }
                    }
                    case "Back" -> {
                    }
                    default -> {
                    }
                }
            });
            firstStore();
        }
    }

    private static void pharmacy() {
        Button[] buttons = new Button[3];
        buttons[0] = new Button("1 Medicine, 30 Coins");
        buttons[1] = new Button("2 Medicine, 60 Coins");
        buttons[2] = new Button("Back");

        for (Button button : buttons) {
            button.setOnAction(e -> {
                switch (button.getText()) {
                    case "1 Medicine, 30 Coins" -> {
                        if (Variables.COINS >= 30) {
                            Variables.COINS = Variables.COINS - 30;
                            Variables.MEDICINE = Variables.MEDICINE + 1;
                            OregonTrailApplication.println("You bought 1 Medicine");
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }
                    }
                    case "2 Medicine, 60 Coins" -> {
                        if (Variables.COINS >= 60) {
                            Variables.COINS = Variables.COINS - 60;
                            Variables.MEDICINE = Variables.MEDICINE + 2;
                            OregonTrailApplication.println("You bought 2 Medicine");
                        } else {
                            OregonTrailApplication.println("You dont have enough coins.");
                        }
                    }
                    case "Back" -> {
                    }
                    default -> {
                    }
                }
            });
        }
        firstStore();
    }

    private static void leave_shop() {
        if (Variables.WAGON_TYPE.isEmpty()) {
            OregonTrailApplication.println("You need a Wagon!");
            firstStore();
        }
    }
}