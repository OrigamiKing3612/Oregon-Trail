package net.origamiking.games.oregontrail.gameplay.day;

import net.origamiking.games.oregontrail.gameplay.events.*;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;

public class ChooseGame {
    static Random rand = new Random();
    public static void choose_day(int switcher) {
        switcher = 0;
        switch (switcher) {
            case 0, 1 -> Variables.DAY_STUFF = "You have an uneventful day.";
            case 2 -> Variables.DAY_STUFF = "You come to a forest, should someone in your party go hunt?";
            case 3 -> {
                boolean t = rand.nextBoolean();
                if (t) {
                    Bandit.ONE.bandit();
                } else {
                    Bandit.PACK.bandits();
                }
            } // Bandits
            case 4 -> BrokenWagon.brokenWagon();
            case 5 -> Camp.camp();
            case 6 -> CrossRiver.crossRiver();
            case 7 -> MeetPerson.meetPerson();
            case 8 -> Weather.weather();
            case 9 -> Illness.illness();
            case 10 -> Injuries.injuries();
            case 11 -> Forlorn.forlorn();
            case 12 -> Fishing.fish();
            case 13 -> WagonOnSideOfTrail.wagonOnSideOfTrail();
            case 14 -> AnimalAttack.attack();
            case 15 -> Indians.indians();
        }
    }
}
