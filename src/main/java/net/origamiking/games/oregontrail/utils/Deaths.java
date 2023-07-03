package net.origamiking.games.oregontrail.utils;

import net.origamiking.games.oregontrail.OregonTrailApplication;

public class Deaths {
    public static void drowning_in_river() {
        OregonTrailApplication.println("You found a leak in your wagon. The wagon sinks....");
        End.end();
    }
    public static void hunger() {
        OregonTrailApplication.println("Everyone collapses after not having any food.");
        End.end();
    }
    public static void stuck() {
        OregonTrailApplication.println("You wait many days... no one comes.");
        End.end();
    }
    public static void everyoneDied() {
        OregonTrailApplication.println("Everyone in your party died.");
        End.end();
    }
}
