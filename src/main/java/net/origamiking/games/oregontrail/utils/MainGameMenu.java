package net.origamiking.games.oregontrail.utils;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.menu_features.ChangeRations;
import net.origamiking.games.oregontrail.gameplay.menu_features.Rest;
import net.origamiking.games.oregontrail.gameplay.menu_features.SeeInventory;

import java.util.Objects;
import java.util.Scanner;

public class MainGameMenu {
    public static void mainGameMenu(String dayStuff) {
        boolean move_on = false;
        OregonTrailMain.println("1. Continue Traveling");
        OregonTrailMain.println("2. Change Rations");
        OregonTrailMain.println("3. See Inventory");
        OregonTrailMain.println("4. Rest");
        OregonTrailMain.println("");
        if (!(Objects.equals(dayStuff, ""))) OregonTrailMain.println(dayStuff);
        Scanner input = new Scanner(System.in);
        String day = input.nextLine();
        switch (day) {
            case "1" -> move_on = true;
            case "2" -> ChangeRations.changeRations();
            case "3" -> SeeInventory.seeInventory();
            case "4" -> Rest.rest();
        }
        if (!move_on) {
            mainGameMenu(dayStuff);
        }
    }
}
