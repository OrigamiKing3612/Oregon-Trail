package net.origamiking.games.oregontrail.gameplay.events;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;

public class Indians {
    static Random rand = new Random();
    public static void indians() {
        int indian = rand.nextInt(4);
        switch (indian) {
            case 0 -> cherokee();
            case 1 -> chickasaw();
            case 2 -> choctaw();
            case 3 -> creek();
        }
    }
    public static void cherokee() {
        int p = rand.nextInt(10, 50);
        int b = rand.nextInt(5, 40);
        OregonTrailMain.println("A group of Cherokee Indians sabotage you and take some stuff.");
        OregonTrailMain.println("-" + p + " Pounds of food");
        if (Variables.POUNDS_OF_FOOD <= p) {
            Variables.POUNDS_OF_FOOD = 0;
        } else {
            Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - p;
        }
        OregonTrailMain.println("-" + b + " Bullets");
        if (Variables.BULLETS <= b) {
            Variables.BULLETS = 0;
        } else {
            Variables.BULLETS = Variables.BULLETS - b;
        }
        OregonTrailMain.println("They also attack. Your People are hurt.");
        CharacterVariables.PERSON_1.STATS.HEALTH = CharacterVariables.PERSON_1.STATS.HEALTH - 2;
        CharacterVariables.PERSON_2.STATS.HEALTH = CharacterVariables.PERSON_2.STATS.HEALTH - 2;
        CharacterVariables.PERSON_3.STATS.HEALTH = CharacterVariables.PERSON_3.STATS.HEALTH - 2;
        CharacterVariables.PERSON_4.STATS.HEALTH = CharacterVariables.PERSON_4.STATS.HEALTH - 2;
    }
    public static void chickasaw() {
        //nice
        //TODO CHICKASAW
    }
    public static void choctaw() {
        //TODO CHOCTAW
    }
    public static void creek() {
        //TODO CREEK
    }
}
