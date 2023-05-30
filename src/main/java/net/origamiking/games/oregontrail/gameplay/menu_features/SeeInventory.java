package net.origamiking.games.oregontrail.gameplay.menu_features;

import net.origamiking.games.oregontrail.gameplay.menu_features.inentory.UseStuff;

import javax.swing.*;

public class SeeInventory {
    public static void useStuff() {
        String[] options = {"Leave", "Use Clothes", "Use Coffee", "Use Medicine"};

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "What do you want to do?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);
        switch (choice) {
            case 3 -> UseStuff.useMedicine();
            case 2 -> UseStuff.useCoffee();
            case 1 -> UseStuff.useClothes();
            case 0 -> leave();
        }
    }
    public static void leave() {}
}
