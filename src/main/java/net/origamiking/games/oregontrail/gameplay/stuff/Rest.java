package net.origamiking.games.oregontrail.gameplay.stuff;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.Variables;

public class Rest {
    public static void rest() {
        OregonTrailMain.println("Your party rests. When everyone wakes up they feel ready to keep traveling.");
        Variables.REST_COUNTER = Variables.REST_MAX;
    }
}
