package net.origamiking.games.oregontrail.utils;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.stuff.ChangeRations;
import net.origamiking.games.oregontrail.gameplay.stuff.Rest;
import net.origamiking.games.oregontrail.gameplay.stuff.SeeInventory;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Scanner;

public class MainGameMenu {
    public static void mainGameMenu(String dayStuff) {
        OregonTrailMain.println("1. Continue Traveling");
        OregonTrailMain.println("2. Change Rations");
        OregonTrailMain.println("3. See Inventory");
        OregonTrailMain.println("4. Rest");
        OregonTrailMain.println("");
        OregonTrailMain.println(dayStuff);
        Scanner input = new Scanner(System.in);
        String day = input.nextLine();
        switch (day) {
            case "1" -> {
                Variables.DAY_NUMBER++;
                FindDay.findDay();
            }
            case "2" -> ChangeRations.changeRations();
            case "3" -> SeeInventory.seeInventory();
            case "4" -> Rest.rest();
        }
        mainGameMenu(dayStuff);
    }
}
