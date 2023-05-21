package net.origamiking.games.oregontrail.utils;

import net.origamiking.games.oregontrail.gameplay.days.day_1.Day1;
import net.origamiking.games.oregontrail.gameplay.days.day_2.Day2;
import net.origamiking.games.oregontrail.gameplay.days.day_3.Day3;
import net.origamiking.games.oregontrail.gameplay.days.day_4.Day4;
import net.origamiking.games.oregontrail.gameplay.days.day_5.Day5;
import net.origamiking.games.oregontrail.gameplay.days.day_6.Day6;
import net.origamiking.games.oregontrail.variables.Variables;

public class FindDay {
    public static void findDay() {
        switch (Variables.DAY_NUMBER) {
            case 1 -> Day1.day();
            case 2 -> Day2.day();
            case 3 -> Day3.day();
            case 4 -> Day4.day();
            case 5 -> Day5.day();
            case 6 -> Day6.day();
        }
    }
}
