package net.origamiking.games.oregontrail.gameplay.start;

import javafx.scene.control.TextInputDialog;
import net.origamiking.games.oregontrail.OregonTrailApplication;
import net.origamiking.games.oregontrail.variables.CharacterVariables;

import java.util.Optional;

public class ChooseCharacters {
    public static void choose_characters() {
        OregonTrailApplication.println("Choose carefully. You cannot change their names after this point!");

        String person1 = "";
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Name Person 1:");
        dialog.setHeaderText(null);
        dialog.setContentText("Name Person 1:");
        Optional<String> result1 = dialog.showAndWait();
        if (result1.isPresent()) {
            person1 = result1.get();
        }
        CharacterVariables.PERSON_1.PERSON = (person1 != null) ? person1 : "";

        String person2 = "";
        TextInputDialog dialog2 = new TextInputDialog();
        dialog2.setTitle("Name Person 2:");
        dialog2.setHeaderText(null);
        dialog2.setContentText("Name Person 2:");
        Optional<String> result2 = dialog2.showAndWait();
        if (result2.isPresent()) {
            person2 = result2.get();
        }
        CharacterVariables.PERSON_2.PERSON = (person2 != null) ? person2 : "";

        String person3 = "";
        TextInputDialog dialog3 = new TextInputDialog();
        dialog3.setTitle("Name Person 3:");
        dialog3.setHeaderText(null);
        dialog3.setContentText("Name Person 3:");
        Optional<String> result3 = dialog3.showAndWait();
        if (result3.isPresent()) {
            person3 = result3.get();
        }
        CharacterVariables.PERSON_3.PERSON = (person3 != null) ? person3 : "";

        String person4 = "";
        TextInputDialog dialog4 = new TextInputDialog();
        dialog4.setTitle("Name Person 4:");
        dialog4.setHeaderText(null);
        dialog4.setContentText("Name Person 4:");
        Optional<String> result4 = dialog4.showAndWait();
        if (result4.isPresent()) {
            person4 = result4.get();
        }
        CharacterVariables.PERSON_4.PERSON = (person4 != null) ? person4 : "";

        OregonTrailApplication.print("Your Characters are: ");
        if (CharacterVariables.PERSON_1.PERSON.isEmpty()) CharacterVariables.PERSON_1.PERSON = "Person-1";
        if (CharacterVariables.PERSON_2.PERSON.isEmpty()) CharacterVariables.PERSON_2.PERSON = "Person-2";
        if (CharacterVariables.PERSON_3.PERSON.isEmpty()) CharacterVariables.PERSON_3.PERSON = "Person-3";
        if (CharacterVariables.PERSON_4.PERSON.isEmpty()) CharacterVariables.PERSON_4.PERSON = "Person-4";
        OregonTrailApplication.println(CharacterVariables.PERSON_1.PERSON + ", " + CharacterVariables.PERSON_2.PERSON + ", " + CharacterVariables.PERSON_3.PERSON + ", and " + CharacterVariables.PERSON_4.PERSON + ".");
    }
}
