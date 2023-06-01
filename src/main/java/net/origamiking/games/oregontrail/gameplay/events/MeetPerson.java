package net.origamiking.games.oregontrail.gameplay.events;

import net.origamiking.games.oregontrail.OregonTrailMain;
import net.origamiking.games.oregontrail.variables.Variables;

import javax.swing.*;
import java.util.Random;

public class MeetPerson {
    final static Random rand = new Random();
    public static void meetPerson() {
        Variables.DAY_STUFF = "";
        int meetPerson = rand.nextInt(9);
//        meetPerson = 3;
        switch (meetPerson) {
            case 0 -> john();
            case 1 -> mary();
            case 2 -> elizabeth();
            case 3 -> james();
            case 4 -> sarah();
            case 5 -> margaret();
            case 6 -> charles();
            case 7 -> emily();
            case 8 -> robert();
        }
    }
    private static void john() {
        int p = rand.nextInt(10, 25);
        OregonTrailMain.println("You come across a person. He greets you and says that is name is John.\nYou tell him where you are going. He asks if you have any spare food. He asks for " + p + " pounds of food.\nDo you give it to him? Y/N");
        String[] options = {"No", "Yes"};

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Do you give food to John?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);

        switch (choice) {
            case 1 -> {
                if (Variables.POUNDS_OF_FOOD >= p) {
                    OregonTrailMain.println("You give him " + p + " pounds of food. He thanks you and leaves.");
                    Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - p;
                } else {
                    OregonTrailMain.println("You don't have the amount of food he wants.");
                }
            }
            case 0 -> OregonTrailMain.println("You say no and move on.");
        }
    }
    private static void mary() {
        OregonTrailMain.println("You come across a person. She tells you her name is Mary and she has a riddle for you.\nShe says that if you answer it correctly she will give you some coins.");
        OregonTrailMain.println("She says \"What comes once in a minute, twice in a moment, but never in a thousand years?\"");
        String riddle = JOptionPane.showInputDialog("\"What comes once in a minute, twice in a moment, but never in a thousand years?\"");
        OregonTrailMain.println("You answer with: " + riddle);
        riddle = riddle.toLowerCase();
        if (riddle.contains("m")) {
            OregonTrailMain.println("She says that the letter\"M\" it the correct answer and she gives you some coins. +15 Coins");
            Variables.COINS = Variables.COINS + 15;
        } else {
            OregonTrailMain.println("She says that that is the wrong answer then walks away.");
        }
    }
    private static void elizabeth() {
        OregonTrailMain.println("You come across a person. She tells you her name is Elizabeth and she has a riddle for you.\nShe says that if you answer it correctly she will give you some coins.");
        OregonTrailMain.println("She says \"I am always hungry, I must always be fed. The finger I touch will soon turn red. What am I?\"");
        String riddle = JOptionPane.showInputDialog("\"I am always hungry, I must always be fed. The finger I touch will soon turn red. What am I?\"");
        OregonTrailMain.println("You answer with: " + riddle);
        riddle = riddle.toLowerCase();
        if (riddle.contains("fire")) {
            OregonTrailMain.println("She says that Fire it the correct answer and she gives you some coins. +10 Coins");
            Variables.COINS = Variables.COINS + 10;
        } else {
            OregonTrailMain.println("She says that that is the wrong answer then walks away.");
        }
    }
    private static void james() {
        OregonTrailMain.println("You come across a person. He tells you his name is James and he has a riddle for you.\nHe says that if you answer it correctly he will give you some coins.");
        OregonTrailMain.println("He says \"The more you take, the more you leave behind. What am I?\"");
        String riddle = JOptionPane.showInputDialog("\"The more you take, the more you leave behind. What am I?\"");
        OregonTrailMain.println("You answer with: " + riddle);
        riddle = riddle.toLowerCase();
        if (riddle.contains("footsteps")) {
            OregonTrailMain.println("He says that footsteps it the correct answer and he gives you some coins. +10 Coins");
            Variables.COINS = Variables.COINS + 10;
        } else {
            OregonTrailMain.println("He says that that is the wrong answer then walks away.");
        }
    }
    private static void sarah() {
        OregonTrailMain.println("You come across a person. She tells you her name is Sarah and she has a riddle for you.\nShe says that if you answer it correctly she will give you some coins.");
        OregonTrailMain.println("She says \"What has keys but can't open locks, space but no room, and you can enter but can't go inside?\"");
        String riddle = JOptionPane.showInputDialog("\"What has keys but can't open locks, space but no room, and you can enter but can't go inside?\"");
        OregonTrailMain.println("You answer with: " + riddle);
        riddle = riddle.toLowerCase();
        if (riddle.contains("keyboard")) {
            OregonTrailMain.println("She says that Keyboard it the correct answer and she gives you some coins. +15 Coins");
            Variables.COINS = Variables.COINS + 15;
        } else {
            OregonTrailMain.println("She says that that is the wrong answer then walks away.");
        }
    }
    private static void margaret() {
        OregonTrailMain.println("You come across a person. She tells you her name is Margaret and she has a riddle for you.\nShe says that if you answer it correctly she will give you some coins.");
        OregonTrailMain.println("She says \"The person who makes it, sells it. The person who buys it, never uses it. The person who uses it, never knows they're using it. What is it?\"");
        String riddle = JOptionPane.showInputDialog("\"The person who makes it, sells it. The person who buys it, never uses it. The person who uses it, never knows they're using it. What is it?\"");
        OregonTrailMain.println("You answer with: " + riddle);
        riddle = riddle.toLowerCase();
        if (riddle.contains("coffin")) {
            OregonTrailMain.println("She says that a Coffin it the correct answer and she gives you some coins. +30 Coins");
            Variables.COINS = Variables.COINS + 30;
        } else {
            OregonTrailMain.println("She says that that is the wrong answer then walks away.");
        }
    }
    private static void charles() {
        OregonTrailMain.println("You come across a person named Charles. He says he thinks your wagon is going to break soon.\nHe says he can fix it for 20 Coins. Do you let him fix it?");
        String[] options = {"No", "Yes"};
        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Do you let Charles fix your wagon?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);
        switch (choice) {
            case 0 -> OregonTrailMain.println("You say no and start moving on. He warns you then leaves.");
            case 1 -> {
                int f = rand.nextInt(10, 15);
                int b = rand.nextInt(10, 20);
                OregonTrailMain.println("-20 Coins");
                Variables.COINS = Variables.COINS - 20;
                OregonTrailMain.println("You let him look at your wagon. You hear him doing something.\nThen he comes back and says he fixed it. You thank him and leave.");
                OregonTrailMain.println("Later you find that some of your stuff is missing.");
                Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - f;
                Variables.BULLETS = Variables.BULLETS - b;
                OregonTrailMain.println("-" + b + " bullets\n-" + f + " pounds of food");
            }
        }
    }
    private static void emily() {
        OregonTrailMain.println("You come across a person. She tells you her name is Emily and she has a riddle for you.\nShe says that if you answer it correctly she will give you some coins.");
        OregonTrailMain.println("She says \"I have cities but no houses, forests but no trees, and rivers but no water. What am I?\"");
        String riddle = JOptionPane.showInputDialog("\"I have cities but no houses, forests but no trees, and rivers but no water. What am I?\"");
        OregonTrailMain.println("You answer with: " + riddle);
        riddle = riddle.toLowerCase();
        if (riddle.contains("map")) {
            OregonTrailMain.println("She says that a Map it the correct answer and she gives you some coins. +15 Coins");
            Variables.COINS = Variables.COINS + 15;
        } else {
            OregonTrailMain.println("She says that that is the wrong answer then walks away.");
        }
    }
    private static void robert() {
        int p = rand.nextInt(25, 35);
        OregonTrailMain.println("You come across a person. He greets you and says that is name is Robert.\nYou tell him where you are going. He asks if you have any spare food. He asks for " + p + " pounds of food.\nDo you give it to him? Y/N");
        String[] options = {"No", "Yes"};

        int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Do you give food to Robert?", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);

        switch (choice) {
            case 1 -> {
                if (Variables.POUNDS_OF_FOOD >= p) {
                    OregonTrailMain.println("You give him " + p + " pounds of food. He thanks you and leaves.");
                    Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD - p;
                } else {
                    OregonTrailMain.println("You don't have the amount of food he wants.");
                }
            }
            case 0 -> OregonTrailMain.println("You say no and move on.");
        }
    }
}
