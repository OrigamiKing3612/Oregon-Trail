package net.origamiking.games.oregontrail.gameplay.events;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.utils.End;

public class Deaths {
    public static void drowning_in_river() {
        OregonTrailMain.println("You found a leak in your wagon. The wagon sinks....");
        End.end();
    }
    public static void hunger() {
        OregonTrailMain.println("Everyone collapses after not having any food.");
        End.end();
    }
    public static void sleep_deprived() {
        OregonTrailMain.println("Everyone is tired after not sleeping. They sit down to rest but never get back up. Everyone died of no sleep.");
        End.end();
    }
    public static void hunger_and_sleep_deprived() {
        OregonTrailMain.println("Everyone is so tired and hungry. They look for food in the wagon but find none so they lay down to get some sleep. They eventually die of hunger and sleep.");
        End.end();
    }
    public static void stuck() {
        OregonTrailMain.println("You wait many days... no one comes.");
        End.end();
    }
    public static void inians() {
        End.end();
    }
}
