package net.origamiking.games.oregontrail.gameplay.events.fort;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.menu_features.Rest;
import net.origamiking.games.oregontrail.gameplay.menu_features.SeeInventory;

import java.util.Scanner;

public class Fort {
    public static void fort() {
        boolean move_on = false;
        OregonTrailMain.println("You came to a Fort.");
        OregonTrailMain.println("What would you like to do.");
        OregonTrailMain.println("1. See the doctor");
        OregonTrailMain.println("2. Shop");
        OregonTrailMain.println("3. Rest");
        OregonTrailMain.println("4. See Inventory");
        OregonTrailMain.println("0. Depart");
        Scanner input = new Scanner(System.in);
        String todo = input.nextLine();
        switch (todo) {
            case "1" -> SeeDoctor.seeDoctor();
            case "2" -> FortStore.fortStore();
            case "3" -> Rest.rest();
            case "4" -> SeeInventory.seeInventory();
            case "0" -> move_on = true;
        }
        if (!move_on) fort();
    }
}
