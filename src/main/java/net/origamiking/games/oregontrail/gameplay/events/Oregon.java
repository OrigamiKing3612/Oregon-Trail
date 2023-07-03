package net.origamiking.games.oregontrail.gameplay.events;

import net.origamiking.games.oregontrail.OregonTrailApplication;

public class Oregon {
    public static void win() {
        OregonTrailApplication.println("You keep traveling. You see something up ahead. When you get there you are welcomed to Oregon City. ");
        OregonTrailApplication.println("You Win you made it to Oregon in time for winter! Good Job!");
        System.exit(0);
    }
}
