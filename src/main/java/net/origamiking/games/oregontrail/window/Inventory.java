package net.origamiking.games.oregontrail.window;

import javafx.scene.control.Button;
import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.Variables;

public class Inventory {
    public static void printToWindow() {
        Button[] inventoryButtons = new Button[3];
        inventoryButtons[0] = new Button("Use Clothes");
        inventoryButtons[1] = new Button("Use Coffee");
        inventoryButtons[2] = new Button("Use Medicine");


        for (Button inventoryButton : inventoryButtons) {
            inventoryButton.setOnAction(e -> {
                switch (inventoryButton.getText()) {
//TODO                case "Use Medicine" -> UseStuff.useMedicine();
//                    case "Use Coffee" -> UseStuff.useCoffee();
//                    case "Use Clothes" -> UseStuff.useClothes();
                    default -> {
                    }
                }
            });
        }
        InventoryArea.addInventoryButtons(inventoryButtons);
        InventoryArea.clearWindow();
        InventoryArea.println("You have:");
        InventoryArea.println("Coins: " + Variables.COINS);
        InventoryArea.println("Wagon Type: " + Variables.WAGON_TYPE);
        InventoryArea.println("Pounds of Food: " + Variables.POUNDS_OF_FOOD);
        InventoryArea.println("Medicine: " + Variables.MEDICINE);
        if (Variables.HAS_GUN) {
            InventoryArea.println("Gun: 1");
        } else {
            InventoryArea.println("Gun: None");
        }
        InventoryArea.println("Knife: " + Variables.KNIFE);
        InventoryArea.println("Bullets: " + Variables.BULLETS);
        InventoryArea.println("Axels: " + Variables.AXELS);
        InventoryArea.println("Wheels: " + Variables.WHEELS);
        InventoryArea.println("Harmonica: " + Variables.HARMONICA);
        InventoryArea.println("Clothes: " + Variables.CLOTHES);
        InventoryArea.println("Coffee: " + Variables.COFFEE);
        InventoryArea.println("People Left: " + Variables.PERSON_COUNTER);
        characters();
    }

    private static void characters() {
        if (!CharacterVariables.PERSON_1.IS_GONE) {
            show_person(CharacterVariables.PERSON_1.PERSON, CharacterVariables.PERSON_1.IS_FORLORN, CharacterVariables.PERSON_1.IS_SICK, CharacterVariables.PERSON_1.SICK_WITH);
            InventoryArea.println("   Health: " + CharacterVariables.PERSON_1.STATS.HEALTH + " out of " + CharacterVariables.PERSON_1.STATS.MAX_HEALTH);
            InventoryArea.println("   Stamina: " + CharacterVariables.PERSON_1.STATS.STAMINA + " out of " + CharacterVariables.PERSON_1.STATS.MAX_STAMINA);
            InventoryArea.println("   Happiness: " + CharacterVariables.PERSON_1.STATS.HAPPINESS + " out of " + CharacterVariables.PERSON_1.STATS.MAX_HAPPINESS);
            InventoryArea.println("   Hygiene: " + CharacterVariables.PERSON_1.STATS.HYGIENE + " out of " + CharacterVariables.PERSON_1.STATS.MAX_HYGIENE);
        } else {
            InventoryArea.println(CharacterVariables.PERSON_1.PERSON + " is dead.");
        }
        if (!CharacterVariables.PERSON_2.IS_GONE) {
            show_person(CharacterVariables.PERSON_2.PERSON, CharacterVariables.PERSON_2.IS_FORLORN, CharacterVariables.PERSON_2.IS_SICK, CharacterVariables.PERSON_2.SICK_WITH);
            InventoryArea.println("   Health: " + CharacterVariables.PERSON_2.STATS.HEALTH + " out of " + CharacterVariables.PERSON_2.STATS.MAX_HEALTH);
            InventoryArea.println("   Stamina: " + CharacterVariables.PERSON_2.STATS.STAMINA + " out of " + CharacterVariables.PERSON_2.STATS.MAX_STAMINA);
            InventoryArea.println("   Happiness: " + CharacterVariables.PERSON_2.STATS.HAPPINESS + " out of " + CharacterVariables.PERSON_2.STATS.MAX_HAPPINESS);
            InventoryArea.println("   Hygiene: " + CharacterVariables.PERSON_2.STATS.HYGIENE + " out of " + CharacterVariables.PERSON_2.STATS.MAX_HYGIENE);
        } else {
            InventoryArea.println(CharacterVariables.PERSON_2.PERSON + " is dead.");
        }
        if (!CharacterVariables.PERSON_3.IS_GONE) {
            show_person(CharacterVariables.PERSON_3.PERSON, CharacterVariables.PERSON_3.IS_FORLORN, CharacterVariables.PERSON_3.IS_SICK, CharacterVariables.PERSON_3.SICK_WITH);
            InventoryArea.println("   Health: " + CharacterVariables.PERSON_3.STATS.HEALTH + " out of " + CharacterVariables.PERSON_3.STATS.MAX_HEALTH);
            InventoryArea.println("   Stamina: " + CharacterVariables.PERSON_3.STATS.STAMINA + " out of " + CharacterVariables.PERSON_3.STATS.MAX_STAMINA);
            InventoryArea.println("   Happiness: " + CharacterVariables.PERSON_3.STATS.HAPPINESS + " out of " + CharacterVariables.PERSON_3.STATS.MAX_HAPPINESS);
            InventoryArea.println("   Hygiene: " + CharacterVariables.PERSON_3.STATS.HYGIENE + " out of " + CharacterVariables.PERSON_3.STATS.MAX_HYGIENE);
        } else {
            InventoryArea.println(CharacterVariables.PERSON_3.PERSON + " is dead.");
        }
        if (!CharacterVariables.PERSON_4.IS_GONE) {
            show_person(CharacterVariables.PERSON_4.PERSON, CharacterVariables.PERSON_4.IS_FORLORN, CharacterVariables.PERSON_4.IS_SICK, CharacterVariables.PERSON_4.SICK_WITH);
            InventoryArea.println("   Health: " + CharacterVariables.PERSON_4.STATS.HEALTH + " out of " + CharacterVariables.PERSON_4.STATS.MAX_HEALTH);
            InventoryArea.println("   Stamina: " + CharacterVariables.PERSON_4.STATS.STAMINA + " out of " + CharacterVariables.PERSON_4.STATS.MAX_STAMINA);
            InventoryArea.println("   Happiness: " + CharacterVariables.PERSON_4.STATS.HAPPINESS + " out of " + CharacterVariables.PERSON_4.STATS.MAX_HAPPINESS);
            InventoryArea.println("   Hygiene: " + CharacterVariables.PERSON_4.STATS.HYGIENE + " out of " + CharacterVariables.PERSON_4.STATS.MAX_HYGIENE);
        } else {
            InventoryArea.println(CharacterVariables.PERSON_4.PERSON + " is dead.");
        }
    }

    private static void displayForlorn(Boolean p_is_forlorn) {
        if (p_is_forlorn) {
            InventoryArea.println("   Is forlorn.");
        } else {
            InventoryArea.println("   Is not forlorn.");
        }
    }

    private static void displaySick(Boolean sick, String s) {
        if (sick) {
            InventoryArea.println("   Is sick with " + s + ".");
        } else {
            InventoryArea.println("   Is not sick.");
        }
    }

    private static void show_person(String p, Boolean p_is_forlorn, Boolean sick, String s) {
        InventoryArea.println(p + ":");
        displayForlorn(p_is_forlorn);
        displaySick(sick, s);
    }
}
