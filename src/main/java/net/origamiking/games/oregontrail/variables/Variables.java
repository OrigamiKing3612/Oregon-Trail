package net.origamiking.games.oregontrail.variables;

//import java.util.ArrayList;

import java.util.Random;

public class Variables {
    static Random rand = new Random();
    public static int DAYS = rand.nextInt(124, 186);
    public static int CAMP_MESSAGE = 0;
    public static int COINS = 300;
    public static int DAY_NUMBER = 1;

    public static String DAY = "Day " + DAY_NUMBER;
    public static String WAGON_TYPE = "";
//    public static ArrayList<String> FOOD = new ArrayList<String>();
    public static float POUNDS_OF_FOOD = 0;
    public static Boolean HAS_GUN = true;
    public static int BULLETS = 0;
    public static int MEDICINE = 0;
    public static String DAY_STUFF = "";
    public static final int FOOD_MAX = 6;
    public static int FOOD_COUNTER = 6;
    public static int RATIONS_PER_PERSON = 2; // 2, 4, 6
    public static int PERSON_COUNTER = 4;
    public static int AXELS = 0;
    public static int WHEELS = 0;
    public static int TONGUES = 0;
    public static int HARMONICA = 0;
    public static int CLOTHES = 0;
    public static int KNIFE = 0;
    public static int COFFEE = 0;

}
