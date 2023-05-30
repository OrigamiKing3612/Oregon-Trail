package net.origamiking.games.oregontrail.utils.files;

import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.FileVariables;
import net.origamiking.games.oregontrail.variables.Variables;
import net.origamiking.games.oregontrail.variables.WeatherVariables;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoadGame {
    public static void loadGame() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FileVariables.FILE_NAME))) {
            String line;
            if ((line = reader.readLine()) != null) Variables.DAYS = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) Variables.MAX_DAYS = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) Variables.COINS = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) Variables.DAY_NUMBER = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) Variables.WAGON_TYPE = line;
            if ((line = reader.readLine()) != null) Variables.POUNDS_OF_FOOD = Float.parseFloat(line);
            if ((line = reader.readLine()) != null) Variables.HAS_GUN = Boolean.valueOf(line);
            if ((line = reader.readLine()) != null) Variables.BULLETS = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) Variables.MEDICINE = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) Variables.DAY_STUFF = line;
            if ((line = reader.readLine()) != null) Variables.RATIONS_PER_PERSON = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) Variables.OUT_OF_FOOD_COUNTER = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) Variables.PERSON_COUNTER = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) Variables.AXELS = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) Variables.WHEELS = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) Variables.TONGUES = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) Variables.HARMONICA = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) Variables.CLOTHES = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) Variables.KNIFE = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) Variables.COFFEE = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_1.PERSON = line;
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_1.IS_SICK = Boolean.parseBoolean(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_1.SICK_WITH = line;
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_1.IS_FORLORN = Boolean.parseBoolean(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_1.MESSAGE = line;
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_1.IS_GONE = Boolean.parseBoolean(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_1.STATS.MAX_HEALTH = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_1.STATS.MAX_HAPPINESS = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_1.STATS.MAX_STAMINA = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_1.STATS.MAX_HYGIENE = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_1.STATS.HEALTH = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_1.STATS.HAPPINESS = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_1.STATS.STAMINA = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_1.STATS.HYGIENE = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_2.PERSON = line;
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_2.IS_SICK = Boolean.parseBoolean(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_2.SICK_WITH = line;
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_2.IS_FORLORN = Boolean.parseBoolean(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_2.MESSAGE = line;
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_2.IS_GONE = Boolean.parseBoolean(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_2.STATS.MAX_HEALTH = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_2.STATS.MAX_HAPPINESS = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_2.STATS.MAX_STAMINA = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_2.STATS.MAX_HYGIENE = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_2.STATS.HEALTH = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_2.STATS.HAPPINESS = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_2.STATS.STAMINA = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_2.STATS.HYGIENE = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_3.PERSON = line;
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_3.IS_SICK = Boolean.parseBoolean(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_3.SICK_WITH = line;
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_3.IS_FORLORN = Boolean.parseBoolean(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_3.MESSAGE = line;
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_3.IS_GONE = Boolean.parseBoolean(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_3.STATS.MAX_HEALTH = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_3.STATS.MAX_HAPPINESS = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_3.STATS.MAX_STAMINA = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_3.STATS.MAX_HYGIENE = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_3.STATS.HEALTH = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_3.STATS.HAPPINESS = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_3.STATS.STAMINA = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_3.STATS.HYGIENE = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_4.PERSON = line;
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_4.IS_SICK = Boolean.parseBoolean(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_4.SICK_WITH = line;
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_4.IS_FORLORN = Boolean.parseBoolean(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_4.MESSAGE = line;
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_4.IS_GONE = Boolean.parseBoolean(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_4.STATS.MAX_HEALTH = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_4.STATS.MAX_HAPPINESS = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_4.STATS.MAX_STAMINA = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_4.STATS.MAX_HYGIENE = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_4.STATS.HEALTH = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_4.STATS.HAPPINESS = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_4.STATS.STAMINA = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) CharacterVariables.PERSON_4.STATS.HYGIENE = Integer.parseInt(line);
            if ((line = reader.readLine()) != null) WeatherVariables.RAINING = Boolean.parseBoolean(line);
            if ((line = reader.readLine()) != null) WeatherVariables.SNOWING = Boolean.parseBoolean(line);
            if ((line = reader.readLine()) != null) WeatherVariables.SEVERE = Boolean.parseBoolean(line);
            if ((line = reader.readLine()) != null) WeatherVariables.THUNDERSTORM = Boolean.parseBoolean(line);
            if ((line = reader.readLine()) != null) WeatherVariables.IS_GROUND_WET = Boolean.parseBoolean(line);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
