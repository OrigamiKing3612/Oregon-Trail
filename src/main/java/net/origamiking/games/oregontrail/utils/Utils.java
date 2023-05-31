package net.origamiking.games.oregontrail.utils;

import net.origamiking.games.oregontrail.gameplay.events.Deaths;
import net.origamiking.games.oregontrail.variables.CharacterVariables;

import java.util.Objects;
import java.util.Random;

public class Utils {
    static Random rand = new Random();

    public static String returnPersonName(int personNumber) {
        switch (personNumber) {
            case 1 -> {
                return CharacterVariables.PERSON_1.PERSON;
            }
            case 2 -> {
                return CharacterVariables.PERSON_2.PERSON;
            }
            case 3 -> {
                return CharacterVariables.PERSON_3.PERSON;
            }
            case 4 -> {
                return CharacterVariables.PERSON_4.PERSON;
            }
            default -> throw new IllegalStateException("Unexpected value: 1-4 not " + personNumber);
        }
    }
    public static int returnPerson() {
        int r = rand.nextInt(4);
        switch (r) {
            case 0 -> {
                return 1;
            }
            case 1 -> {
                return 2;
            }
            case 2 -> {
                return 3;
            }
            case 3 -> {
                return 4;
            }
            default -> throw new IllegalStateException("Unexpected value: " + r);
        }
    }
    public static int returnPersonNumber(String personName) {
        if (Objects.equals(personName, CharacterVariables.PERSON_1.PERSON)) {
            return 1;
        } else if (Objects.equals(personName, CharacterVariables.PERSON_2.PERSON)) {
            return 2;
        } else if (Objects.equals(personName, CharacterVariables.PERSON_3.PERSON)) {
            return 3;
        } else if (Objects.equals(personName, CharacterVariables.PERSON_4.PERSON)) {
            return 4;
        } else {
           throw new IllegalStateException("Unexpected value: " + personName);
        }
    }
    public static int returnNumber(int min, int max) {
        return rand.nextInt(min, max);
    }
    public static void subStamina(int person, int number) {
        switch (person) {
            case 1 -> CharacterVariables.PERSON_1.STATS.STAMINA = CharacterVariables.PERSON_1.STATS.STAMINA - number;
            case 2 -> CharacterVariables.PERSON_2.STATS.STAMINA = CharacterVariables.PERSON_2.STATS.STAMINA - number;
            case 3 -> CharacterVariables.PERSON_3.STATS.STAMINA = CharacterVariables.PERSON_3.STATS.STAMINA - number;
            case 4 -> CharacterVariables.PERSON_4.STATS.STAMINA = CharacterVariables.PERSON_4.STATS.STAMINA - number;
            default -> throw new IllegalStateException("Unexpected value: 1-4 not " + person);
        }
    }
    public static void subHealth(int person, int number) {
        switch (person) {
            case 1 -> CharacterVariables.PERSON_1.STATS.HEALTH = CharacterVariables.PERSON_1.STATS.HEALTH - number;
            case 2 -> CharacterVariables.PERSON_2.STATS.HEALTH = CharacterVariables.PERSON_2.STATS.HEALTH - number;
            case 3 -> CharacterVariables.PERSON_3.STATS.HEALTH = CharacterVariables.PERSON_3.STATS.HEALTH - number;
            case 4 -> CharacterVariables.PERSON_4.STATS.HEALTH = CharacterVariables.PERSON_4.STATS.HEALTH - number;
            default -> throw new IllegalStateException("Unexpected value: 1-4 not " + person);
        }
    }
    public static void subHappiness(int person, int number) {
        switch (person) {
            case 1 -> CharacterVariables.PERSON_1.STATS.HAPPINESS = CharacterVariables.PERSON_1.STATS.HAPPINESS - number;
            case 2 -> CharacterVariables.PERSON_2.STATS.HAPPINESS = CharacterVariables.PERSON_2.STATS.HAPPINESS - number;
            case 3 -> CharacterVariables.PERSON_3.STATS.HAPPINESS = CharacterVariables.PERSON_3.STATS.HAPPINESS - number;
            case 4 -> CharacterVariables.PERSON_4.STATS.HAPPINESS = CharacterVariables.PERSON_4.STATS.HAPPINESS - number;
            default -> throw new IllegalStateException("Unexpected value: 1-4 not " + person);
        }
    }
    public static void subHygiene(int person, int number) {
        switch (person) {
            case 1 -> CharacterVariables.PERSON_1.STATS.HYGIENE = CharacterVariables.PERSON_1.STATS.HYGIENE - number;
            case 2 -> CharacterVariables.PERSON_2.STATS.HYGIENE = CharacterVariables.PERSON_2.STATS.HYGIENE - number;
            case 3 -> CharacterVariables.PERSON_3.STATS.HYGIENE = CharacterVariables.PERSON_3.STATS.HYGIENE - number;
            case 4 -> CharacterVariables.PERSON_4.STATS.HYGIENE = CharacterVariables.PERSON_4.STATS.HYGIENE - number;
            default -> throw new IllegalStateException("Unexpected value: 1-4 not " + person);
        }
    }
    public static void checkIfForlorn() {
        if (CharacterVariables.PERSON_1.STATS.HAPPINESS <= 4) {
            CharacterVariables.PERSON_1.IS_FORLORN = true;
        } else {
            CharacterVariables.PERSON_1.IS_FORLORN = false;
        }
        if (CharacterVariables.PERSON_2.STATS.HAPPINESS <= 4) {
            CharacterVariables.PERSON_2.IS_FORLORN = true;
        } else {
            CharacterVariables.PERSON_2.IS_FORLORN = false;
        }
        if (CharacterVariables.PERSON_3.STATS.HAPPINESS <= 4) {
            CharacterVariables.PERSON_3.IS_FORLORN = true;
        } else {
            CharacterVariables.PERSON_3.IS_FORLORN = false;
        }
        if (CharacterVariables.PERSON_4.STATS.HAPPINESS <= 4) {
            CharacterVariables.PERSON_4.IS_FORLORN = true;
        } else {
            CharacterVariables.PERSON_4.IS_FORLORN = false;
        }
    }
    public static void checkIfPersonDead() {
        if (CharacterVariables.PERSON_1.STATS.HEALTH <= 0) {
            CharacterVariables.PERSON_1.IS_GONE = true;
        }
        if (CharacterVariables.PERSON_2.STATS.HEALTH <= 0) {
            CharacterVariables.PERSON_2.IS_GONE = true;
        }
        if (CharacterVariables.PERSON_3.STATS.HEALTH <= 0) {
            CharacterVariables.PERSON_3.IS_GONE = true;
        }
        if (CharacterVariables.PERSON_4.STATS.HEALTH <= 0) {
            CharacterVariables.PERSON_4.IS_GONE = true;
        }
        if (CharacterVariables.PERSON_1.IS_GONE && CharacterVariables.PERSON_2.IS_GONE && CharacterVariables.PERSON_3.IS_GONE && CharacterVariables.PERSON_4.IS_GONE) {
            Deaths.everyoneDied();
        }
    }
    public static void die(int personNumber) {
        switch (personNumber) {
            case 1 -> CharacterVariables.PERSON_1.IS_GONE = true;
            case 2 -> CharacterVariables.PERSON_2.IS_GONE = true;
            case 3 -> CharacterVariables.PERSON_3.IS_GONE = true;
            case 4 -> CharacterVariables.PERSON_4.IS_GONE = true;
            default -> throw new IllegalStateException("Unexpected value: 1-4 not " + personNumber);
        }
    }
    public static void subAllStats(int number) {
        Utils.subStamina(1, number);
        Utils.subStamina(2, number);
        Utils.subStamina(3, number);
        Utils.subStamina(4, number);
        Utils.subHealth(1, number);
        Utils.subHealth(2, number);
        Utils.subHealth(3, number);
        Utils.subHealth(4, number);
        Utils.subHappiness(1, number);
        Utils.subHappiness(2, number);
        Utils.subHappiness(3, number);
        Utils.subHappiness(4, number);
        Utils.subHygiene(1, number);
        Utils.subHygiene(2, number);
        Utils.subHygiene(3, number);
        Utils.subHygiene(4, number);
    }
    public static void setSICK_WITH(int personNumber, String sick_with) {
        switch (personNumber) {
            case 1 -> CharacterVariables.PERSON_1.SICK_WITH = sick_with;
            case 2 -> CharacterVariables.PERSON_2.SICK_WITH = sick_with;
            case 3 -> CharacterVariables.PERSON_3.SICK_WITH = sick_with;
            case 4 -> CharacterVariables.PERSON_4.SICK_WITH = sick_with;
            default -> throw new IllegalStateException("Unexpected value: " + personNumber);
        }
    }
    public static void setMAX_HEALTH(int personNumber, int max_health) {
        switch (personNumber) {
            case 1 -> CharacterVariables.PERSON_1.STATS.MAX_HEALTH = max_health;
            case 2 -> CharacterVariables.PERSON_2.STATS.MAX_HEALTH = max_health;
            case 3 -> CharacterVariables.PERSON_3.STATS.MAX_HEALTH = max_health;
            case 4 -> CharacterVariables.PERSON_4.STATS.MAX_HEALTH = max_health;
            default -> throw new IllegalStateException("Unexpected value: " + personNumber);
        }
    }
    public static void setSICK_COUNTER(int personNumber, int sick_counter) {
        switch (personNumber) {
            case 1 -> CharacterVariables.PERSON_1.SICK_COUNTER = sick_counter;
            case 2 -> CharacterVariables.PERSON_2.SICK_COUNTER = sick_counter;
            case 3 -> CharacterVariables.PERSON_3.SICK_COUNTER = sick_counter;
            case 4 -> CharacterVariables.PERSON_4.SICK_COUNTER = sick_counter;
            default -> throw new IllegalStateException("Unexpected value: " + personNumber);
        }
    }
    public static void setStatsToMaxStats() {
        if (!(CharacterVariables.PERSON_1.STATS.HEALTH < CharacterVariables.PERSON_1.STATS.MAX_HEALTH)) {
            CharacterVariables.PERSON_1.STATS.HEALTH = CharacterVariables.PERSON_1.STATS.MAX_HEALTH;
        }
        if (!(CharacterVariables.PERSON_1.STATS.HAPPINESS < CharacterVariables.PERSON_1.STATS.MAX_HAPPINESS)) {
            CharacterVariables.PERSON_1.STATS.HAPPINESS = CharacterVariables.PERSON_1.STATS.MAX_HAPPINESS;
        }
        if (!(CharacterVariables.PERSON_1.STATS.HYGIENE < CharacterVariables.PERSON_1.STATS.MAX_HYGIENE)) {
            CharacterVariables.PERSON_1.STATS.HYGIENE = CharacterVariables.PERSON_1.STATS.MAX_HYGIENE;
        }
        if (!(CharacterVariables.PERSON_1.STATS.STAMINA < CharacterVariables.PERSON_1.STATS.MAX_STAMINA)) {
            CharacterVariables.PERSON_1.STATS.STAMINA = CharacterVariables.PERSON_1.STATS.MAX_STAMINA;
        }

        if (!(CharacterVariables.PERSON_2.STATS.HEALTH < CharacterVariables.PERSON_2.STATS.MAX_HEALTH)) {
            CharacterVariables.PERSON_2.STATS.HEALTH = CharacterVariables.PERSON_2.STATS.MAX_HEALTH;
        }
        if (!(CharacterVariables.PERSON_2.STATS.HAPPINESS < CharacterVariables.PERSON_2.STATS.MAX_HAPPINESS)) {
            CharacterVariables.PERSON_2.STATS.HAPPINESS = CharacterVariables.PERSON_2.STATS.MAX_HAPPINESS;
        }
        if (!(CharacterVariables.PERSON_2.STATS.HYGIENE < CharacterVariables.PERSON_2.STATS.MAX_HYGIENE)) {
            CharacterVariables.PERSON_2.STATS.HYGIENE = CharacterVariables.PERSON_2.STATS.MAX_HYGIENE;
        }
        if (!(CharacterVariables.PERSON_2.STATS.STAMINA < CharacterVariables.PERSON_2.STATS.MAX_STAMINA)) {
            CharacterVariables.PERSON_2.STATS.STAMINA = CharacterVariables.PERSON_2.STATS.MAX_STAMINA;
        }
        if (!(CharacterVariables.PERSON_3.STATS.HEALTH < CharacterVariables.PERSON_3.STATS.MAX_HEALTH)) {
            CharacterVariables.PERSON_3.STATS.HEALTH = CharacterVariables.PERSON_3.STATS.MAX_HEALTH;
        }
        if (!(CharacterVariables.PERSON_3.STATS.HAPPINESS < CharacterVariables.PERSON_3.STATS.MAX_HAPPINESS)) {
            CharacterVariables.PERSON_3.STATS.HAPPINESS = CharacterVariables.PERSON_3.STATS.MAX_HAPPINESS;
        }
        if (!(CharacterVariables.PERSON_3.STATS.HYGIENE < CharacterVariables.PERSON_3.STATS.MAX_HYGIENE)) {
            CharacterVariables.PERSON_3.STATS.HYGIENE = CharacterVariables.PERSON_3.STATS.MAX_HYGIENE;
        }
        if (!(CharacterVariables.PERSON_3.STATS.STAMINA < CharacterVariables.PERSON_3.STATS.MAX_STAMINA)) {
            CharacterVariables.PERSON_3.STATS.STAMINA = CharacterVariables.PERSON_3.STATS.MAX_STAMINA;
        }

        if (!(CharacterVariables.PERSON_4.STATS.HEALTH < CharacterVariables.PERSON_4.STATS.MAX_HEALTH)) {
            CharacterVariables.PERSON_4.STATS.HEALTH = CharacterVariables.PERSON_4.STATS.MAX_HEALTH;
        }
        if (!(CharacterVariables.PERSON_4.STATS.HAPPINESS < CharacterVariables.PERSON_4.STATS.MAX_HAPPINESS)) {
            CharacterVariables.PERSON_4.STATS.HAPPINESS = CharacterVariables.PERSON_4.STATS.MAX_HAPPINESS;
        }
        if (!(CharacterVariables.PERSON_4.STATS.HYGIENE < CharacterVariables.PERSON_4.STATS.MAX_HYGIENE)) {
            CharacterVariables.PERSON_4.STATS.HYGIENE = CharacterVariables.PERSON_4.STATS.MAX_HYGIENE;
        }
        if (!(CharacterVariables.PERSON_4.STATS.STAMINA < CharacterVariables.PERSON_4.STATS.MAX_STAMINA)) {
            CharacterVariables.PERSON_4.STATS.STAMINA = CharacterVariables.PERSON_4.STATS.MAX_STAMINA;
        }

    }
}
