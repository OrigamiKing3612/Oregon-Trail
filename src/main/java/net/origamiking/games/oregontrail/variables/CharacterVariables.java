package net.origamiking.games.oregontrail.variables;

public class CharacterVariables {
    public static class PERSON_1 {
        public static String PERSON = "Person 1";
        public static boolean IS_SICK = false;
        public static String SICK_WITH = "";
        public static boolean IS_FORLORN = false;
        public static String MESSAGE = "";
        public static boolean IS_GONE = false;
        public static int SICK_COUNTER = 0;

        public static class STATS {
            public static int MAX_HEALTH = 10;
            public static int MAX_HAPPINESS = 10;
            public static int MAX_STAMINA = 10;
            public static int MAX_HYGIENE = 10;
            public static int HEALTH = 10;
            public static int HAPPINESS = 10;
            public static int STAMINA = 10;
            public static int HYGIENE = 10;
            public static void load() {}
        }
    }

    public static class PERSON_2 {
        public static String PERSON = "Person 2";
        public static boolean IS_SICK = false;
        public static String SICK_WITH = "";
        public static boolean IS_FORLORN = false;
        public static String MESSAGE = "";
        public static boolean IS_GONE = false;
        public static int SICK_COUNTER = 0;

        public static class STATS {
            public static int MAX_HEALTH = 10;
            public static int MAX_HAPPINESS = 10;
            public static int MAX_STAMINA = 10;
            public static int MAX_HYGIENE = 10;
            public static int HEALTH = 10;
            public static int HAPPINESS = 10;
            public static int STAMINA = 10;
            public static int HYGIENE = 10;
            public static void load() {
            }
        }
    }

    public static class PERSON_3 {
        public static String PERSON = "Person 3";
        public static boolean IS_SICK = false;
        public static String SICK_WITH = "";
        public static boolean IS_FORLORN = false;
        public static String MESSAGE = "";
        public static boolean IS_GONE = false;
        public static int SICK_COUNTER = 0;

        public static class STATS {
            public static int MAX_HEALTH = 10;
            public static int MAX_HAPPINESS = 10;
            public static int MAX_STAMINA = 10;
            public static int MAX_HYGIENE = 10;
            public static int HEALTH = 10;
            public static int HAPPINESS = 10;
            public static int STAMINA = 10;
            public static int HYGIENE = 10;
            public static void load() {
            }
        }
    }

    public static class PERSON_4 {
        public static String PERSON = "Person 4";
        public static boolean IS_SICK = false;
        public static String SICK_WITH = "";
        public static boolean IS_FORLORN = false;
        public static String MESSAGE = "";
        public static boolean IS_GONE = false;
        public static int SICK_COUNTER = 0;
        public static class STATS {
            public static int MAX_HEALTH = 10;
            public static int MAX_HAPPINESS = 10;
            public static int MAX_STAMINA = 10;
            public static int MAX_HYGIENE = 10;
            public static int HEALTH = 10;
            public static int HAPPINESS = 10;
            public static int STAMINA = 10;
            public static int HYGIENE = 10;
            public static void load() {
            }
        }
    }

    public static void load() {
        PERSON_4.STATS.load();
        PERSON_3.STATS.load();
        PERSON_2.STATS.load();
        PERSON_1.STATS.load();
    }
}
