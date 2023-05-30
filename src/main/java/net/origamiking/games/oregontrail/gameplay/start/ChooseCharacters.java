package net.origamiking.games.oregontrail.gameplay.start;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.CharacterVariables;

import java.util.Objects;
import java.util.Scanner;

public class ChooseCharacters {
    public static void choose_characters() {
        Scanner input = new Scanner(System.in);
        OregonTrailMain.println("Choose carefully you can not change their names after this point!");
        OregonTrailMain.println("Name Person 1:");
        CharacterVariables.PERSON_1.PERSON = input.nextLine();

        OregonTrailMain.println("Name Person 2:");
        CharacterVariables.PERSON_2.PERSON = input.nextLine();

        OregonTrailMain.println("Name Person 3:");
        CharacterVariables.PERSON_3.PERSON = input.nextLine();

        OregonTrailMain.println("Name Person 4:");
        CharacterVariables.PERSON_4.PERSON = input.nextLine();

        OregonTrailMain.print("Your Characters are: ");
        if (Objects.equals(CharacterVariables.PERSON_1.PERSON, "")) CharacterVariables.PERSON_1.PERSON = "Person-1";
        if (Objects.equals(CharacterVariables.PERSON_2.PERSON, "")) CharacterVariables.PERSON_2.PERSON = "Person-2";
        if (Objects.equals(CharacterVariables.PERSON_3.PERSON, "")) CharacterVariables.PERSON_3.PERSON = "Person-3";
        if (Objects.equals(CharacterVariables.PERSON_4.PERSON, "")) CharacterVariables.PERSON_4.PERSON = "Person-4";
        OregonTrailMain.println(CharacterVariables.PERSON_1.PERSON + ", " + CharacterVariables.PERSON_2.PERSON + ", " + CharacterVariables.PERSON_3.PERSON + ", and " + CharacterVariables.PERSON_4.PERSON + ".");
    }
}
