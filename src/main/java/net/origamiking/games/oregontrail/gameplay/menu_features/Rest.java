package net.origamiking.games.oregontrail.gameplay.menu_features;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.CharacterVariables;

public class Rest {
    public static void rest() {
        OregonTrailMain.println("Your party rests. When everyone wakes up they feel ready to keep traveling.");
        CharacterVariables.PERSON_1.STATS.STAMINA = CharacterVariables.PERSON_1.STATS.MAX_STAMINA;
        CharacterVariables.PERSON_2.STATS.STAMINA = CharacterVariables.PERSON_2.STATS.MAX_STAMINA;
        CharacterVariables.PERSON_3.STATS.STAMINA = CharacterVariables.PERSON_3.STATS.MAX_STAMINA;
        CharacterVariables.PERSON_4.STATS.STAMINA = CharacterVariables.PERSON_4.STATS.MAX_STAMINA;
    }
}
