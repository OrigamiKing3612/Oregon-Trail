package net.origamiking.games.oregontrail.gameplay.events;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.CharacterVariables;

import java.util.Random;

public class Illness {
    static Random rand = new Random();
    private static final int switcher1 = rand.nextInt(4);
    private static int switcher2 = rand.nextInt(2);
    private static String person = "";
    public static void illness() {
        pickIllness();
    }
    private static int pickPerson() {
        switch (switcher1) {
            case 0 -> {
                person = CharacterVariables.PERSON_1.PERSON;
                CharacterVariables.PERSON_1.IS_SICK = true;
                return 1;
            }
            case 1 -> {
                person = CharacterVariables.PERSON_2.PERSON;
                CharacterVariables.PERSON_2.IS_SICK = true;
                return 2;
            }
            case 2 -> {
                person = CharacterVariables.PERSON_3.PERSON;
                CharacterVariables.PERSON_3.IS_SICK = true;
                return 3;
            }
            case 3 -> {
                person = CharacterVariables.PERSON_4.PERSON;
                CharacterVariables.PERSON_4.IS_SICK = true;
                return 4;
            }
            default -> throw new IllegalStateException("Unexpected value: " + switcher1);
        }
    }
    private static void pickIllness() {
        switch (pickPerson()) {
            case 1 -> {
                if (CharacterVariables.PERSON_1.STATS.HYGIENE <= 5) switcher2 = 0;
                switch (switcher2) {
                    case 0 -> {
                        CharacterVariables.PERSON_1.SICK_WITH = "Dysentery";
                        CharacterVariables.PERSON_1.STATS.MAX_STAMINA = 7;
                        CharacterVariables.PERSON_1.STATS.MAX_HEALTH = 5;
                        CharacterVariables.PERSON_1.STATS.STAMINA = CharacterVariables.PERSON_1.STATS.MAX_STAMINA;
                        CharacterVariables.PERSON_1.STATS.HEALTH = CharacterVariables.PERSON_1.STATS.MAX_HEALTH;
                        if (CharacterVariables.PERSON_1.STATS.HAPPINESS <= 4) {
                            CharacterVariables.PERSON_1.STATS.HAPPINESS--;
                        } else {
                            CharacterVariables.PERSON_1.STATS.HAPPINESS = 4;
                        }
                    }
                    case 1 -> {
                        CharacterVariables.PERSON_1.SICK_WITH = "Fever";
                        CharacterVariables.PERSON_1.STATS.STAMINA = CharacterVariables.PERSON_1.STATS.STAMINA - 2;
                        CharacterVariables.PERSON_1.STATS.HAPPINESS--;
                    }
                }
                OregonTrailMain.println(CharacterVariables.PERSON_1.PERSON + " is sick with " + CharacterVariables.PERSON_1.SICK_WITH + ".");
            }
            case 2 -> {
                if (CharacterVariables.PERSON_2.STATS.HYGIENE <= 5) switcher2 = 0;
                switch (switcher2) {
                    case 0 -> {
                        CharacterVariables.PERSON_2.SICK_WITH = "Dysentery";
                        CharacterVariables.PERSON_2.STATS.MAX_STAMINA = 7;
                        CharacterVariables.PERSON_2.STATS.MAX_HEALTH = 5;
                        CharacterVariables.PERSON_2.STATS.STAMINA = CharacterVariables.PERSON_2.STATS.MAX_STAMINA;
                        CharacterVariables.PERSON_2.STATS.HEALTH = CharacterVariables.PERSON_2.STATS.MAX_HEALTH;
                        if (CharacterVariables.PERSON_2.STATS.HAPPINESS <= 4) {
                            CharacterVariables.PERSON_2.STATS.HAPPINESS--;
                        } else {
                            CharacterVariables.PERSON_2.STATS.HAPPINESS = 4;
                        }
                    }
                    case 1 -> {
                        CharacterVariables.PERSON_2.SICK_WITH = "Fever";
                        CharacterVariables.PERSON_2.STATS.STAMINA = CharacterVariables.PERSON_2.STATS.STAMINA - 2;
                        CharacterVariables.PERSON_2.STATS.HAPPINESS--;
                    }
                }
                OregonTrailMain.println(CharacterVariables.PERSON_2.PERSON + " is sick with " + CharacterVariables.PERSON_2.SICK_WITH + ".");

            }
            case 3 -> {
                if (CharacterVariables.PERSON_3.STATS.HYGIENE <= 5) switcher2 = 0;
                switch (switcher2) {
                    case 0 -> {
                        CharacterVariables.PERSON_3.SICK_WITH = "Dysentery";
                        CharacterVariables.PERSON_3.STATS.MAX_STAMINA = 7;
                        CharacterVariables.PERSON_3.STATS.MAX_HEALTH = 5;
                        CharacterVariables.PERSON_3.STATS.STAMINA = CharacterVariables.PERSON_3.STATS.MAX_STAMINA;
                        CharacterVariables.PERSON_3.STATS.HEALTH = CharacterVariables.PERSON_3.STATS.MAX_HEALTH;
                        if (CharacterVariables.PERSON_3.STATS.HAPPINESS <= 4) {
                            CharacterVariables.PERSON_3.STATS.HAPPINESS--;
                        } else {
                            CharacterVariables.PERSON_3.STATS.HAPPINESS = 4;
                        }
                    }
                    case 1 -> {
                        CharacterVariables.PERSON_3.SICK_WITH = "Fever";
                        CharacterVariables.PERSON_3.STATS.STAMINA = CharacterVariables.PERSON_3.STATS.STAMINA - 2;
                        CharacterVariables.PERSON_3.STATS.HAPPINESS--;
                    }
                }
                OregonTrailMain.println(CharacterVariables.PERSON_3.PERSON + " is sick with " + CharacterVariables.PERSON_3.SICK_WITH + ".");
            }
            case 4 -> {
                if (CharacterVariables.PERSON_4.STATS.HYGIENE <= 5) switcher2 = 0;
                switch (switcher2) {
                    case 0 -> {
                        CharacterVariables.PERSON_4.SICK_WITH = "Dysentery";
                        CharacterVariables.PERSON_4.STATS.MAX_STAMINA = 7;
                        CharacterVariables.PERSON_4.STATS.MAX_HEALTH = 5;
                        CharacterVariables.PERSON_4.STATS.STAMINA = CharacterVariables.PERSON_4.STATS.MAX_STAMINA;
                        CharacterVariables.PERSON_4.STATS.HEALTH = CharacterVariables.PERSON_4.STATS.MAX_HEALTH;
                        if (CharacterVariables.PERSON_4.STATS.HAPPINESS <= 4) {
                            CharacterVariables.PERSON_4.STATS.HAPPINESS--;
                        } else {
                            CharacterVariables.PERSON_4.STATS.HAPPINESS = 4;
                        }
                    }
                    case 1 -> {
                        CharacterVariables.PERSON_4.SICK_WITH = "Fever";
                        CharacterVariables.PERSON_4.STATS.STAMINA = CharacterVariables.PERSON_4.STATS.STAMINA - 2;
                        CharacterVariables.PERSON_4.STATS.HAPPINESS--;
                    }
                }
                OregonTrailMain.println(CharacterVariables.PERSON_4.PERSON + " is sick with " + CharacterVariables.PERSON_4.SICK_WITH + ".");
            }
            default -> throw new IllegalStateException("Unexpected value: " + pickPerson());
        }
    }
}
