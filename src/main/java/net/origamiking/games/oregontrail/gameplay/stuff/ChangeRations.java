package net.origamiking.games.oregontrail.gameplay.stuff;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Scanner;

public class ChangeRations {
    public static void changeRations() {
        OregonTrailMain.println("1. 2 Rations Per Person.");
        OregonTrailMain.println("2. 4 Rations Per Person.");
        OregonTrailMain.println("3. 6 Rations Per Person.");
        Scanner input = new Scanner(System.in);
        String changeRations = input.nextLine();
        switch (changeRations) {
            case "1" -> Variables.RATIONS_PER_PERSON = 2;
            case "2" -> Variables.RATIONS_PER_PERSON = 4;
            case "3" -> Variables.RATIONS_PER_PERSON = 6;
        }
    }
}
