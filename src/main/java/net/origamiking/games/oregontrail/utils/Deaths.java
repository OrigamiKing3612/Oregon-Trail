package net.origamiking.games.oregontrail.utils;

import net.origamiking.games.oregontrail.OregonTrailMain;

public class Deaths {
    public static void drowning_in_river() {
        OregonTrailMain.println("You found a leak in your wagon. The wagon sinks....");
        End.end();
    }
    public static void hunger() {
        OregonTrailMain.println("Everyone collapses after not having any food.");
        End.end();
    }
    public static void stuck() {
        OregonTrailMain.println("You wait many days... no one comes.");
        End.end();
    }
    public static void everyoneDied() {
        OregonTrailMain.println("Everyone in your party died.");
        End.end();
    }
}
