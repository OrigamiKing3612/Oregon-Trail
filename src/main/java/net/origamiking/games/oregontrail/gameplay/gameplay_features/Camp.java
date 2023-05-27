package net.origamiking.games.oregontrail.gameplay.gameplay_features;

import net.origamiking.games.oregontrail.variables.Variables;

public class Camp {
    public static void camp() {
        switch (Variables.CAMP_MESSAGE) {
            case 4, 9 -> Variables.DAY_STUFF = "Everyone gets in the wagon and gets confortable. Everyone doses off very quickly.";
        }
    }
}
