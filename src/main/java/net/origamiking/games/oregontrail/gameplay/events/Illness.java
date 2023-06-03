package net.origamiking.games.oregontrail.gameplay.events;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.utils.Utils;
import net.origamiking.games.oregontrail.variables.CharacterVariables;

import java.util.Random;

public class Illness {
    final static Random rand = new Random();
    private static final int switcher1 = rand.nextInt(4);
    private static int switcher2 = rand.nextInt(2);
    public static void illness() {
        pickIllness();
    }
    private static int pickPerson() {
        switch (switcher1) {
            case 0 -> {
                CharacterVariables.PERSON_1.IS_SICK = true;
                return 1;
            }
            case 1 -> {
                CharacterVariables.PERSON_2.IS_SICK = true;
                return 2;
            }
            case 2 -> {
                CharacterVariables.PERSON_3.IS_SICK = true;
                return 3;
            }
            case 3 -> {
                CharacterVariables.PERSON_4.IS_SICK = true;
                return 4;
            }
            default -> throw new IllegalStateException("Unexpected value: " + switcher1);
        }
    }
    private static void pickIllness() {
        int person = pickPerson();
        if (person == 1 && CharacterVariables.PERSON_1.IS_GONE) {
            person = pickPerson();
        } else if (person == 2 && CharacterVariables.PERSON_2.IS_GONE) {
            person = pickPerson();
        } else if (person == 3 && CharacterVariables.PERSON_3.IS_GONE) {
            person = pickPerson();
        } else if (person == 4 && CharacterVariables.PERSON_4.IS_GONE) {
            person = pickPerson();
        }
        switch (person) {
            case 1 -> {
                if (CharacterVariables.PERSON_1.STATS.HYGIENE <= 5) switcher2 = 0;
                switch (switcher2) {
                    case 0 -> {
                        CharacterVariables.PERSON_1.SICK_WITH = "Dysentery";
                        Utils.subStamina(1, 3);
                        Utils.setMAX_HEALTH(1, 5);
                        CharacterVariables.PERSON_1.SICK_COUNTER = 5;
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
                        CharacterVariables.PERSON_1.SICK_COUNTER = 3;
                    }
                }
                OregonTrailMain.println(CharacterVariables.PERSON_1.PERSON + " is sick with " + CharacterVariables.PERSON_1.SICK_WITH + ".");
            }
            case 2 -> {
                if (CharacterVariables.PERSON_2.STATS.HYGIENE <= 5) switcher2 = 0;
                switch (switcher2) {
                    case 0 -> {
                        CharacterVariables.PERSON_2.SICK_WITH = "Dysentery";
                        Utils.subStamina(2, 3);
                        Utils.setMAX_HEALTH(2, 5);
                        CharacterVariables.PERSON_1.SICK_COUNTER = 5;
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
                        CharacterVariables.PERSON_1.SICK_COUNTER = 3;
                    }
                }
                OregonTrailMain.println(CharacterVariables.PERSON_2.PERSON + " is sick with " + CharacterVariables.PERSON_2.SICK_WITH + ".");

            }
            case 3 -> {
                if (CharacterVariables.PERSON_3.STATS.HYGIENE <= 5) switcher2 = 0;
                switch (switcher2) {
                    case 0 -> {
                        CharacterVariables.PERSON_3.SICK_WITH = "Dysentery";
                        Utils.subStamina(3, 3);
                        Utils.setMAX_HEALTH(3, 5);
                        CharacterVariables.PERSON_1.SICK_COUNTER = 5;
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
                        CharacterVariables.PERSON_1.SICK_COUNTER = 3;
                    }
                }
                OregonTrailMain.println(CharacterVariables.PERSON_3.PERSON + " is sick with " + CharacterVariables.PERSON_3.SICK_WITH + ".");
            }
            case 4 -> {
                if (CharacterVariables.PERSON_4.STATS.HYGIENE <= 5) switcher2 = 0;
                switch (switcher2) {
                    case 0 -> {
                        CharacterVariables.PERSON_4.SICK_WITH = "Dysentery";
                        Utils.subStamina(4, 3);
                        Utils.setMAX_HEALTH(4, 5);
                        CharacterVariables.PERSON_1.SICK_COUNTER = 5;
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
                        CharacterVariables.PERSON_1.SICK_COUNTER = 3;
                    }
                }
                OregonTrailMain.println(CharacterVariables.PERSON_4.PERSON + " is sick with " + CharacterVariables.PERSON_4.SICK_WITH + ".");
            }
            default -> throw new IllegalStateException("Unexpected value: " + pickPerson());
        }
    }
}
