package net.origamiking.games.oregontrail.gameplay.events;

import javafx.scene.control.Button;
import net.origamiking.games.oregontrail.OregonTrailApplication;
import net.origamiking.games.oregontrail.utils.Deaths;
import net.origamiking.games.oregontrail.variables.CharacterVariables;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;

public class BrokenWagon {
    final static Random rand = new Random();
    public static class Axel {
        public static void axel() {
            if (Variables.AXELS >= 1) {
                OregonTrailApplication.println("Suddenly your wagon's axel breaks. What will you do?");
                Button[] buttons = new Button[2];
                buttons[0] = new Button("Wait and see if someone comes.");
                buttons[1] = new Button("Repair");

                for (Button button : buttons) {
                    button.setOnAction(e -> {
                        switch (button.getText()) {
                            case "Wait and see if someone comes." -> waitForPeople();
                            case "Repair" -> repair();
                            default -> {
                            }
                        }

                    });
                }
            } else {
                OregonTrailApplication.println("You don't have an axel so you wait for people to come.");
                waitForPeople();
            }
        }
        private static void waitForPeople() {
            int hasAxel = rand.nextInt(5);
            if (personCome()) {
                if (hasAxel == 2 || hasAxel == 4 || hasAxel == 0) {
                    OregonTrailApplication.println("Some people pass by and ask if you need help. " + CharacterVariables.PERSON_4.PERSON + " responds and says that their axel broke and they need a new one. \n" + CharacterVariables.PERSON_4.PERSON + " asks if they have an extra one.");
                    boolean haveAxel = rand.nextBoolean();
                    int coins = rand.nextInt(50);
                    if (coins == 0) coins = 10;
                    if (haveAxel) {
                        OregonTrailApplication.println("They have one and offer to sell it to you for " + coins);
                        if (Variables.COINS >= coins) {
                            OregonTrailApplication.println("You give them the money and fix your wagon.");
                            Variables.COINS = Variables.COINS - coins;
                        } else {
                            OregonTrailApplication.println("You don't have enough money to buy the axel. You try to haggle but there price firm.");
                            Deaths.stuck();
                        }
                    } else {
                        OregonTrailApplication.println("They don't have an extra axel. They leave");
                        Deaths.stuck();
                    }
                } else {
                    OregonTrailApplication.println("No one passes by... you wait many days.");
                    Deaths.stuck();
                }
            }
        }
        private static boolean personCome() {
            int t = 0;
            int f = 0;
            for (int i = 0; i < 7; i++) {
                boolean a = rand.nextBoolean();
                if (a) {
                    t++;
                } else {
                    f++;
                }
            }
            return t > f;
        }
        private static void repair() {
            if (Variables.AXELS >= 1) {
                OregonTrailApplication.println("You use your axel and fix your wagon.");
                Variables.AXELS--;
            } else {
                OregonTrailApplication.println("You don't have an extra axel.");
                Deaths.stuck();
            }
        }
    }
    public static class Wheel {
        public static void wheel() {
            if (Variables.WHEELS >= 1) {
                OregonTrailApplication.println("Suddenly one of your wagon's wheel breaks. What will you do?");
                Button[] buttons = new Button[2];
                buttons[0] = new Button("Wait and see if someone comes.");
                buttons[1] = new Button("Repair");

                for (Button button : buttons) {
                    button.setOnAction(e -> {
                        switch (button.getText()) {
                            case "Wait and see if someone comes." -> waitForPeople();
                            case "Repair" -> repair();
                            default -> {
                            }
                        }

                    });
                }
            } else {
                OregonTrailApplication.println("You don't have an wheel so you wait for people to come.");
                waitForPeople();
            }
        }
        private static void waitForPeople() {
            int hasAxel = rand.nextInt(5);
            if (personCome()) {
                if (hasAxel == 2 || hasAxel == 4 || hasAxel == 0) {
                    OregonTrailApplication.println("Some people pass by and ask if you need help. " + CharacterVariables.PERSON_4.PERSON + " responds and says that one of their wheels broke and they need a new one. \n" + CharacterVariables.PERSON_4.PERSON + " asks if they have an extra one.");
                    boolean haveWheel = rand.nextBoolean();
                    int coins = rand.nextInt(30);
                    if (coins == 0) coins = 10;
                    if (haveWheel) {
                        OregonTrailApplication.println("They have one and offer to sell it to you for " + coins);
                        if (Variables.COINS >= coins) {
                            OregonTrailApplication.println("You give them the money and fix your wagon.");
                            Variables.COINS = Variables.COINS - coins;
                        } else {
                            OregonTrailApplication.println("You don't have enough money to buy the wheel. You try to haggle but there price firm.");
                            Deaths.stuck();
                        }
                    } else {
                        OregonTrailApplication.println("They don't have an extra wheel. They leave");
                        Deaths.stuck();
                    }
                } else {
                    OregonTrailApplication.println("No one passes by... you wait many days.");
                    Deaths.stuck();
                }
            }
        }
        private static boolean personCome() {
            int t = 0;
            int f = 0;
            for (int i = 0; i < 7; i++) {
                boolean a = rand.nextBoolean();
                if (a) {
                    t++;
                } else {
                    f++;
                }
            }
            return t > f;
        }
        private static void repair() {
            if (Variables.WHEELS >= 1) {
                OregonTrailApplication.println("You use your wheel and fix your wagon.");
                Variables.WHEELS--;
            } else {
                OregonTrailApplication.println("You don't have an extra wheel.");
                Deaths.stuck();
            }
        }
    }
    public static class Tongue {
        public static void tongue() {
            if (Variables.TONGUES >= 1) {
                OregonTrailApplication.println("Suddenly your wagon's tongue breaks. What will you do?");
                Button[] buttons = new Button[2];
                buttons[0] = new Button("Wait and see if someone comes.");
                buttons[1] = new Button("Repair");

                for (Button button : buttons) {
                    button.setOnAction(e -> {
                        switch (button.getText()) {
                            case "Wait and see if someone comes." -> waitForPeople();
                            case "Repair" -> repair();
                            default -> {
                            }
                        }

                    });
                }
            } else {
                OregonTrailApplication.println("You don't have an tongue so you wait for people to come.");
                waitForPeople();
            }
        }
        private static void waitForPeople() {
            int hasTongue = rand.nextInt(5);
            if (personCome()) {
                if (hasTongue == 2 || hasTongue == 4 || hasTongue == 0) {
                    OregonTrailApplication.println("Some people pass by and ask if you need help. " + CharacterVariables.PERSON_4.PERSON + " responds and says that their tongue broke and they need a new one. \n" + CharacterVariables.PERSON_4.PERSON + " asks if they have an extra one.");
                    boolean haveTongue = rand.nextBoolean();
                    int coins = rand.nextInt(50);
                    if (coins == 0) coins = 10;
                    if (haveTongue) {
                        OregonTrailApplication.println("They have one and offer to sell it to you for " + coins);
                        if (Variables.COINS >= coins) {
                            OregonTrailApplication.println("You give them the money and fix your wagon.");
                            Variables.COINS = Variables.COINS - coins;
                        } else {
                            OregonTrailApplication.println("You don't have enough money to buy the tongue. You try to haggle but there price firm.");
                            Deaths.stuck();
                        }
                    } else {
                        OregonTrailApplication.println("They don't have an extra axel. They leave");
                        Deaths.stuck();
                    }
                } else {
                    OregonTrailApplication.println("No one passes by... you wait many days.");
                    Deaths.stuck();
                }
            }
        }
        private static boolean personCome() {
            int t = 0;
            int f = 0;
            for (int i = 0; i < 7; i++) {
                boolean a = rand.nextBoolean();
                if (a) {
                    t++;
                } else {
                    f++;
                }
            }
            return t > f;
        }
        private static void repair() {
            if (Variables.TONGUES >= 1) {
                OregonTrailApplication.println("You use your tongue and fix your wagon.");
                Variables.TONGUES--;
            } else {
                OregonTrailApplication.println("You don't have an extra tongue.");
                Deaths.stuck();
            }
        }
    }
    public static void brokenWagon() {
        int w = rand.nextInt(3);
        Variables.DAY_STUFF = "";
        switch (w) {
            case 0 -> { OregonTrailApplication.println("Suddenly your wagon's axel breaks. What will you do?"); Axel.axel(); }
            case 1 -> { OregonTrailApplication.println("Suddenly one of your wagon's wheel breaks. What will you do?"); Wheel.wheel(); }
            case 2 -> { OregonTrailApplication.println("Suddenly one of your wagon's tongue breaks. What will you do?"); Tongue.tongue(); }
        }
    }
}
