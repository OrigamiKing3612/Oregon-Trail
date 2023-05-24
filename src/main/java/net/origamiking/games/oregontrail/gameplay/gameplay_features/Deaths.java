package net.origamiking.games.oregontrail.gameplay.gameplay_features;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.utils.End;

public class Deaths {
    public static void drowning_in_river() {
        OregonTrailMain.println("You found a leak in your wagon. The wagon sinks....");
        End.end();
    }
}
