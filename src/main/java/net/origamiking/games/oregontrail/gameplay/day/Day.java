package net.origamiking.games.oregontrail.gameplay.day;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.gameplay.events.Oregon;
import net.origamiking.games.oregontrail.gameplay.events.fort.Fort;
import net.origamiking.games.oregontrail.gameplay.events.Hunting;
import net.origamiking.games.oregontrail.utils.MainGameMenu;
import net.origamiking.games.oregontrail.utils.SubtractVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import javax.swing.*;
import java.util.Random;

public class Day {
    static Random rand = new Random();
    public static void day() {
        OregonTrailMain.println("Day " + Variables.DAY_NUMBER);
        if (Variables.DAY_NUMBER == 130 || Variables.DAY_NUMBER == 140 || Variables.DAY_NUMBER == 150) {
            Fort.fort();
        } else if (Variables.DAY_NUMBER >= Variables.MAX_DAYS) {
            Oregon.win();
        } else {
            final int switcher = rand.nextInt(16); //# of Options
            SubtractVariables.feed_people();
            ChooseGame.choose_day(switcher);
            if (switcher == 2) {
                OregonTrailMain.println(Variables.DAY_STUFF);
                String[] options = {"No", "Yes"};

                int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "You come to a forest, should someone in your party go hunt?", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE, null, options, null);
                switch (choice) {
                    case 1 -> {
                        if (Variables.BULLETS >= 2) {
                            Hunting.hunt();
                        } else {
                            Variables.DAY_STUFF = "You dont have enough bullets to hunt.";
                        }
                    }
                    case 0 -> Variables.DAY_STUFF = "You come to a forest; you pass it.";
                }
            }
            MainGameMenu.mainGameMenu(Variables.DAY_STUFF);
            Variables.DAY_NUMBER++;
        }
    }
}
