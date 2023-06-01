package net.origamiking.games.oregontrail.gameplay.day;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.events.Oregon;
import net.origamiking.games.oregontrail.gameplay.events.fort.Fort;
import net.origamiking.games.oregontrail.utils.MainGameMenu;
import net.origamiking.games.oregontrail.utils.SubtractVariables;
import net.origamiking.games.oregontrail.utils.Utils;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;

public class Day {
    final static Random rand = new Random();
    public static void day() {
        OregonTrailMain.println("Day " + Variables.DAY_NUMBER);
        if (Variables.DAY_NUMBER == 130 || Variables.DAY_NUMBER == 140 || Variables.DAY_NUMBER == 150) {
            Fort.fort();
        } else if (Variables.DAY_NUMBER >= Variables.MAX_DAYS) {
            Oregon.win();
        } else {
            final int switcher = rand.nextInt(15); //# of Options
            SubtractVariables.subtractVariables();
            Utils.checkIfForlorn();
            Utils.checkIfPersonDead();
            ChooseGame.choose_day(switcher);
            MainGameMenu.mainGameMenu(Variables.DAY_STUFF);
            Variables.DAY_NUMBER++;
        }
    }
}
