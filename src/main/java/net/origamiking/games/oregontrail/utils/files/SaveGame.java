package net.origamiking.games.oregontrail.utils.files;

import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.FileVariables;
import net.origamiking.games.oregontrail.variables.Variables;
import net.origamiking.games.oregontrail.variables.WeatherVariables;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveGame {
    public static FileWriter writer;
    public static void saveGame() {
        try {
            File directory = new File(FileVariables.SAVES_DIRECTORY);
            if (!directory.exists()) {
                directory.mkdirs();
            }
            writer = new FileWriter(FileVariables.FILE_NAME);
            //normal vars
            write(Variables.DAYS);
            write(Variables.MAX_DAYS);
            write(Variables.COINS);
            write(Variables.DAY_NUMBER);
            write(Variables.WAGON_TYPE);
            write(Variables.POUNDS_OF_FOOD);
            write(Variables.HAS_GUN);
            write(Variables.BULLETS);
            write(Variables.MEDICINE);
            write(Variables.DAY_STUFF);
            write(Variables.RATIONS_PER_PERSON);
            write(Variables.OUT_OF_FOOD_COUNTER);
            write(Variables.PERSON_COUNTER);
            write(Variables.AXELS);
            write(Variables.WHEELS);
            write(Variables.TONGUES);
            write(Variables.HARMONICA);
            write(Variables.CLOTHES);
            write(Variables.KNIFE);
            write(Variables.COFFEE);
            // character vars
            // p1
            write(CharacterVariables.PERSON_1.PERSON);
            write(CharacterVariables.PERSON_1.IS_SICK);
            write(CharacterVariables.PERSON_1.SICK_WITH);
            write(CharacterVariables.PERSON_1.IS_FORLORN);
            write(CharacterVariables.PERSON_1.MESSAGE);
            write(CharacterVariables.PERSON_1.IS_GONE);
            write(CharacterVariables.PERSON_1.STATS.MAX_HEALTH);
            write(CharacterVariables.PERSON_1.STATS.MAX_HAPPINESS);
            write(CharacterVariables.PERSON_1.STATS.MAX_STAMINA);
            write(CharacterVariables.PERSON_1.STATS.MAX_HYGIENE);
            write(CharacterVariables.PERSON_1.STATS.HEALTH);
            write(CharacterVariables.PERSON_1.STATS.HAPPINESS);
            write(CharacterVariables.PERSON_1.STATS.STAMINA);
            write(CharacterVariables.PERSON_1.STATS.HYGIENE);
            // p2
            write(CharacterVariables.PERSON_2.PERSON);
            write(CharacterVariables.PERSON_2.IS_SICK);
            write(CharacterVariables.PERSON_2.SICK_WITH);
            write(CharacterVariables.PERSON_2.IS_FORLORN);
            write(CharacterVariables.PERSON_2.MESSAGE);
            write(CharacterVariables.PERSON_2.IS_GONE);
            write(CharacterVariables.PERSON_2.STATS.MAX_HEALTH);
            write(CharacterVariables.PERSON_2.STATS.MAX_HAPPINESS);
            write(CharacterVariables.PERSON_2.STATS.MAX_STAMINA);
            write(CharacterVariables.PERSON_2.STATS.MAX_HYGIENE);
            write(CharacterVariables.PERSON_2.STATS.HEALTH);
            write(CharacterVariables.PERSON_2.STATS.HAPPINESS);
            write(CharacterVariables.PERSON_2.STATS.STAMINA);
            write(CharacterVariables.PERSON_2.STATS.HYGIENE);
            // p3
            write(CharacterVariables.PERSON_3.PERSON);
            write(CharacterVariables.PERSON_3.IS_SICK);
            write(CharacterVariables.PERSON_3.SICK_WITH);
            write(CharacterVariables.PERSON_3.IS_FORLORN);
            write(CharacterVariables.PERSON_3.MESSAGE);
            write(CharacterVariables.PERSON_3.IS_GONE);
            write(CharacterVariables.PERSON_3.STATS.MAX_HEALTH);
            write(CharacterVariables.PERSON_3.STATS.MAX_HAPPINESS);
            write(CharacterVariables.PERSON_3.STATS.MAX_STAMINA);
            write(CharacterVariables.PERSON_3.STATS.MAX_HYGIENE);
            write(CharacterVariables.PERSON_3.STATS.HEALTH);
            write(CharacterVariables.PERSON_3.STATS.HAPPINESS);
            write(CharacterVariables.PERSON_3.STATS.STAMINA);
            write(CharacterVariables.PERSON_3.STATS.HYGIENE);
            // p4
            write(CharacterVariables.PERSON_4.PERSON);
            write(CharacterVariables.PERSON_4.IS_SICK);
            write(CharacterVariables.PERSON_4.SICK_WITH);
            write(CharacterVariables.PERSON_4.IS_FORLORN);
            write(CharacterVariables.PERSON_4.MESSAGE);
            write(CharacterVariables.PERSON_4.IS_GONE);
            write(CharacterVariables.PERSON_4.STATS.MAX_HEALTH);
            write(CharacterVariables.PERSON_4.STATS.MAX_HAPPINESS);
            write(CharacterVariables.PERSON_4.STATS.MAX_STAMINA);
            write(CharacterVariables.PERSON_4.STATS.MAX_HYGIENE);
            write(CharacterVariables.PERSON_4.STATS.HEALTH);
            write(CharacterVariables.PERSON_4.STATS.HAPPINESS);
            write(CharacterVariables.PERSON_4.STATS.STAMINA);
            write(CharacterVariables.PERSON_4.STATS.HYGIENE);
            //weather vars
            write(WeatherVariables.RAINING);
            write(WeatherVariables.SNOWING);
            write(WeatherVariables.SEVERE);
            write(WeatherVariables.THUNDERSTORM);
            write(WeatherVariables.IS_GROUND_WET);
            write(CharacterVariables.PERSON_1.SICK_COUNTER);
            write(CharacterVariables.PERSON_2.SICK_COUNTER);
            write(CharacterVariables.PERSON_3.SICK_COUNTER);
            write(CharacterVariables.PERSON_4.SICK_COUNTER);

            writer.close();
            System.out.println("Saved at: " + FileVariables.FILE_NAME);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the game.");
            throw new RuntimeException(e);
        }
    }
    public static void write(Object object) {
        try {
            writer.write(object + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
