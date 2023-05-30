package net.origamiking.games.oregontrail.gameplay.start;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.CharacterVariables;

import javax.swing.*;

public class ChooseCharacters {
    public static void choose_characters() {
        OregonTrailMain.println("Choose carefully. You cannot change their names after this point!");

        String person1 = JOptionPane.showInputDialog("Name Person 1:");
        CharacterVariables.PERSON_1.PERSON = (person1 != null) ? person1 : "";

        String person2 = JOptionPane.showInputDialog("Name Person 2:");
        CharacterVariables.PERSON_2.PERSON = (person2 != null) ? person2 : "";

        String person3 = JOptionPane.showInputDialog("Name Person 3:");
        CharacterVariables.PERSON_3.PERSON = (person3 != null) ? person3 : "";

        String person4 = JOptionPane.showInputDialog("Name Person 4:");
        CharacterVariables.PERSON_4.PERSON = (person4 != null) ? person4 : "";

        OregonTrailMain.print("Your Characters are: ");
        if (CharacterVariables.PERSON_1.PERSON.isEmpty()) CharacterVariables.PERSON_1.PERSON = "Person-1";
        if (CharacterVariables.PERSON_2.PERSON.isEmpty()) CharacterVariables.PERSON_2.PERSON = "Person-2";
        if (CharacterVariables.PERSON_3.PERSON.isEmpty()) CharacterVariables.PERSON_3.PERSON = "Person-3";
        if (CharacterVariables.PERSON_4.PERSON.isEmpty()) CharacterVariables.PERSON_4.PERSON = "Person-4";
        OregonTrailMain.println(CharacterVariables.PERSON_1.PERSON + ", " + CharacterVariables.PERSON_2.PERSON + ", " + CharacterVariables.PERSON_3.PERSON + ", and "+ CharacterVariables.PERSON_4.PERSON + ".");
    }
}
