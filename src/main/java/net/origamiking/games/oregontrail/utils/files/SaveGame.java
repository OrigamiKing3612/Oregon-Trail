package net.origamiking.games.oregontrail.utils.files;

import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.FileVariables;
import net.origamiking.games.oregontrail.variables.Variables;
import net.origamiking.games.oregontrail.variables.WeatherVariables;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveGame {
//    public static void set_save_name() {
//        OregonTrailMain.println("Please name it the same thing it is at the very top.");
//        FileVariables.SAVE_NAME = JOptionPane.showInputDialog("Please name it the same thing it is at the very top. Please name your game:");
//        if (FileVariables.SAVE_NAME.equals("")) {
//            FileVariables.SAVE_NAME = "Oregon-Trail-Save";
//        }
////        FileVariables.SAVE_NAME = (save_name != null) ? save_name : "";
//        OregonTrailMain.println("Your save is named: " + FileVariables.SAVE_NAME);
//    }

    public static void saveGame() {
//        set_save_name();
        try {
            File directory = new File(FileVariables.SAVES_DIRECTORY);
            if (!directory.exists()) {
                directory.mkdirs();
            }
            FileWriter writer = new FileWriter(FileVariables.FILE_NAME);
            //normal vars
            writer.write(Variables.DAYS + "\n");
            writer.write(Variables.MAX_DAYS + "\n");
            writer.write(Variables.COINS + "\n");
            writer.write(Variables.DAY_NUMBER + "\n");
            writer.write(Variables.WAGON_TYPE + "\n");
            writer.write(Variables.POUNDS_OF_FOOD + "\n");
            writer.write(Variables.HAS_GUN + "\n");
            writer.write(Variables.BULLETS + "\n");
            writer.write(Variables.MEDICINE + "\n");
            writer.write(Variables.DAY_STUFF + "\n");
            writer.write(Variables.RATIONS_PER_PERSON + "\n");
            writer.write(Variables.OUT_OF_FOOD_COUNTER + "\n");
            writer.write(Variables.PERSON_COUNTER + "\n");
            writer.write(Variables.AXELS + "\n");
            writer.write(Variables.WHEELS + "\n");
            writer.write(Variables.TONGUES + "\n");
            writer.write(Variables.HARMONICA + "\n");
            writer.write(Variables.CLOTHES + "\n");
            writer.write(Variables.KNIFE + "\n");
            writer.write(Variables.COFFEE + "\n");
            // character vars
            // p1
            writer.write(CharacterVariables.PERSON_1.PERSON + "\n");
            writer.write(CharacterVariables.PERSON_1.IS_SICK + "\n");
            writer.write(CharacterVariables.PERSON_1.SICK_WITH + "\n");
            writer.write(CharacterVariables.PERSON_1.IS_FORLORN + "\n");
            writer.write(CharacterVariables.PERSON_1.MESSAGE + "\n");
            writer.write(CharacterVariables.PERSON_1.IS_GONE + "\n");
            writer.write(CharacterVariables.PERSON_1.STATS.MAX_HEALTH + "\n");
            writer.write(CharacterVariables.PERSON_1.STATS.MAX_HAPPINESS + "\n");
            writer.write(CharacterVariables.PERSON_1.STATS.MAX_STAMINA + "\n");
            writer.write(CharacterVariables.PERSON_1.STATS.MAX_HYGIENE + "\n");
            writer.write(CharacterVariables.PERSON_1.STATS.HEALTH + "\n");
            writer.write(CharacterVariables.PERSON_1.STATS.HAPPINESS + "\n");
            writer.write(CharacterVariables.PERSON_1.STATS.STAMINA + "\n");
            writer.write(CharacterVariables.PERSON_1.STATS.HYGIENE + "\n");
            // p2
            writer.write(CharacterVariables.PERSON_2.PERSON + "\n");
            writer.write(CharacterVariables.PERSON_2.IS_SICK + "\n");
            writer.write(CharacterVariables.PERSON_2.SICK_WITH + "\n");
            writer.write(CharacterVariables.PERSON_2.IS_FORLORN + "\n");
            writer.write(CharacterVariables.PERSON_2.MESSAGE + "\n");
            writer.write(CharacterVariables.PERSON_2.IS_GONE + "\n");
            writer.write(CharacterVariables.PERSON_2.STATS.MAX_HEALTH + "\n");
            writer.write(CharacterVariables.PERSON_2.STATS.MAX_HAPPINESS + "\n");
            writer.write(CharacterVariables.PERSON_2.STATS.MAX_STAMINA + "\n");
            writer.write(CharacterVariables.PERSON_2.STATS.MAX_HYGIENE + "\n");
            writer.write(CharacterVariables.PERSON_2.STATS.HEALTH + "\n");
            writer.write(CharacterVariables.PERSON_2.STATS.HAPPINESS + "\n");
            writer.write(CharacterVariables.PERSON_2.STATS.STAMINA + "\n");
            writer.write(CharacterVariables.PERSON_2.STATS.HYGIENE + "\n");
            // p3
            writer.write(CharacterVariables.PERSON_3.PERSON + "\n");
            writer.write(CharacterVariables.PERSON_3.IS_SICK + "\n");
            writer.write(CharacterVariables.PERSON_3.SICK_WITH + "\n");
            writer.write(CharacterVariables.PERSON_3.IS_FORLORN + "\n");
            writer.write(CharacterVariables.PERSON_3.MESSAGE + "\n");
            writer.write(CharacterVariables.PERSON_3.IS_GONE + "\n");
            writer.write(CharacterVariables.PERSON_3.STATS.MAX_HEALTH + "\n");
            writer.write(CharacterVariables.PERSON_3.STATS.MAX_HAPPINESS + "\n");
            writer.write(CharacterVariables.PERSON_3.STATS.MAX_STAMINA + "\n");
            writer.write(CharacterVariables.PERSON_3.STATS.MAX_HYGIENE + "\n");
            writer.write(CharacterVariables.PERSON_3.STATS.HEALTH + "\n");
            writer.write(CharacterVariables.PERSON_3.STATS.HAPPINESS + "\n");
            writer.write(CharacterVariables.PERSON_3.STATS.STAMINA + "\n");
            writer.write(CharacterVariables.PERSON_3.STATS.HYGIENE + "\n");
            // p4
            writer.write(CharacterVariables.PERSON_4.PERSON + "\n");
            writer.write(CharacterVariables.PERSON_4.IS_SICK + "\n");
            writer.write(CharacterVariables.PERSON_4.SICK_WITH + "\n");
            writer.write(CharacterVariables.PERSON_4.IS_FORLORN + "\n");
            writer.write(CharacterVariables.PERSON_4.MESSAGE + "\n");
            writer.write(CharacterVariables.PERSON_4.IS_GONE + "\n");
            writer.write(CharacterVariables.PERSON_4.STATS.MAX_HEALTH + "\n");
            writer.write(CharacterVariables.PERSON_4.STATS.MAX_HAPPINESS + "\n");
            writer.write(CharacterVariables.PERSON_4.STATS.MAX_STAMINA + "\n");
            writer.write(CharacterVariables.PERSON_4.STATS.MAX_HYGIENE + "\n");
            writer.write(CharacterVariables.PERSON_4.STATS.HEALTH + "\n");
            writer.write(CharacterVariables.PERSON_4.STATS.HAPPINESS + "\n");
            writer.write(CharacterVariables.PERSON_4.STATS.STAMINA + "\n");
            writer.write(CharacterVariables.PERSON_4.STATS.HYGIENE + "\n");
            //weather vars
            writer.write(WeatherVariables.RAINING + "\n");
            writer.write(WeatherVariables.SNOWING + "\n");
            writer.write(WeatherVariables.SEVERE + "\n");
            writer.write(WeatherVariables.THUNDERSTORM + "\n");
            writer.write(WeatherVariables.IS_GROUND_WET + "\n");
            writer.write(CharacterVariables.PERSON_1.SICK_COUNTER);
            writer.write(CharacterVariables.PERSON_2.SICK_COUNTER);
            writer.write(CharacterVariables.PERSON_3.SICK_COUNTER);
            writer.write(CharacterVariables.PERSON_4.SICK_COUNTER);


            writer.close();
            System.out.println("Game Saved!");
            System.out.println("Saved at: " + FileVariables.FILE_NAME);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the game.");
            e.printStackTrace();
        }
    }
}
