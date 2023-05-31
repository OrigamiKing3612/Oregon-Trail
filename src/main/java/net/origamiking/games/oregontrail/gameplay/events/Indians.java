package net.origamiking.games.oregontrail.gameplay.events;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;

public class Indians {
    final static Random rand = new Random();
    public static void indians() {
        int indian = rand.nextInt(4);
        switch (indian) {
            case 0, 1 -> cherokee();
            case 2, 3 -> choctaw();
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
        if (CharacterVariables.PERSON_1.STATS.HEALTH <= 0) OregonTrailMain.println(CharacterVariables.PERSON_1.PERSON + " has died by Indians."); Deaths.indians();
        CharacterVariables.PERSON_2.STATS.HEALTH = CharacterVariables.PERSON_2.STATS.HEALTH - 2;
        if (CharacterVariables.PERSON_2.STATS.HEALTH <= 0) OregonTrailMain.println(CharacterVariables.PERSON_2.PERSON + " has died by Indians."); Deaths.indians();
        CharacterVariables.PERSON_3.STATS.HEALTH = CharacterVariables.PERSON_3.STATS.HEALTH - 2;
        if (CharacterVariables.PERSON_3.STATS.HEALTH <= 0) OregonTrailMain.println(CharacterVariables.PERSON_3.PERSON + " has died by Indians."); Deaths.indians();
        CharacterVariables.PERSON_4.STATS.HEALTH = CharacterVariables.PERSON_4.STATS.HEALTH - 2;
        if (CharacterVariables.PERSON_4.STATS.HEALTH <= 0) OregonTrailMain.println(CharacterVariables.PERSON_4.PERSON + " has died by Indians."); Deaths.indians();
    }
    public static void chickasaw() {
        //nice
    }
    public static void choctaw() {
        int p = rand.nextInt(10, 50);
        int m = rand.nextInt(1, 2);
        OregonTrailMain.println("A group of Choctaw Indians sabotage you and take some stuff.");
        OregonTrailMain.println("-" + p + " Pounds of food");
        if (Variables.POUNDS_OF_FOOD <= p) {
            Variables.POUNDS_OF_FOOD = 0;
        } else {
            Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - p;
        }
        OregonTrailMain.println("-" + m + " Medicine");
        if (Variables.MEDICINE <= m) {
            Variables.MEDICINE = 0;
        } else {
            Variables.MEDICINE = Variables.MEDICINE - m;
        }
        OregonTrailMain.println("They also attack. Your People are hurt. " + CharacterVariables.PERSON_1.PERSON + " tries to fight back.");
        CharacterVariables.PERSON_1.STATS.HEALTH = CharacterVariables.PERSON_1.STATS.HEALTH - 3;
        CharacterVariables.PERSON_1.STATS.STAMINA = CharacterVariables.PERSON_1.STATS.STAMINA - 3;
        if (CharacterVariables.PERSON_1.STATS.HEALTH <= 0) OregonTrailMain.println(CharacterVariables.PERSON_1.PERSON + " has died by Indians."); Deaths.indians();
        CharacterVariables.PERSON_2.STATS.HEALTH = CharacterVariables.PERSON_2.STATS.HEALTH - 3;
        if (CharacterVariables.PERSON_2.STATS.HEALTH <= 0) OregonTrailMain.println(CharacterVariables.PERSON_2.PERSON + " has died by Indians."); Deaths.indians();
        CharacterVariables.PERSON_3.STATS.HEALTH = CharacterVariables.PERSON_3.STATS.HEALTH - 3;
        if (CharacterVariables.PERSON_3.STATS.HEALTH <= 0) OregonTrailMain.println(CharacterVariables.PERSON_3.PERSON + " has died by Indians."); Deaths.indians();
        CharacterVariables.PERSON_4.STATS.HEALTH = CharacterVariables.PERSON_4.STATS.HEALTH - 3;
        if (CharacterVariables.PERSON_4.STATS.HEALTH <= 0) OregonTrailMain.println(CharacterVariables.PERSON_4.PERSON + " has died by Indians."); Deaths.indians();
    }
    public static void creek() {}
}
