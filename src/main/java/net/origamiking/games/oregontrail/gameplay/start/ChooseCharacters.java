package net.origamiking.games.oregontrail.gameplay.start;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.CharacterVariables;

import java.util.Scanner;

public class ChooseCharacters {
    public static void choose_characters() {
        Scanner input = new Scanner(System.in);
        OregonTrailMain.println("Choose carefully you can not change their names after this point!");
        OregonTrailMain.println("Name Person 1:");
        CharacterVariables.PERSON_1 = input.nextLine();

        OregonTrailMain.println("Name Person 2:");
        CharacterVariables.PERSON_2 = input.nextLine();

        OregonTrailMain.println("Name Person 3:");
        CharacterVariables.PERSON_3 = input.nextLine();

        OregonTrailMain.println("Name Person 4:");
        CharacterVariables.PERSON_4 = input.nextLine();

        OregonTrailMain.print("Your Characters are: ");
        OregonTrailMain.println(CharacterVariables.PERSON_1 + ", " + CharacterVariables.PERSON_2 + ", " + CharacterVariables.PERSON_3 + ", and " + CharacterVariables.PERSON_4 + ".");

    }
}
