package net.origamiking.games.oregontrail.gameplay.events;

import net.origamiking.games.oregontrail.OregonTrailApplication;
import net.origamiking.games.oregontrail.utils.Utils;
import net.origamiking.games.oregontrail.variables.Variables;

import java.util.Random;

public class AnimalAttack {
    final static Random rand = new Random();
    public static void attack() {
        int switcher = rand.nextInt(3);
        switch (switcher) {
            case 0,1 -> bear();
            case 2 -> wolves();
            default -> throw new IllegalStateException("Unexpected value: " + switcher);
        }
    }
    private static void bear() {
        int person = Utils.returnPerson();
        String personName = Utils.returnPersonName(person);
        int food = Utils.returnNumber(10, 25);
        if (Variables.BULLETS >= 3) {
            OregonTrailApplication.println("Suddenly a bear jumps out and attacks " + personName + ". They shoot the bear but get hurt in the process. \n+" + food + " pounds of food\n-3 bullets");
            Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD + food;
            Variables.BULLETS = Variables.BULLETS - 3;
            Utils.subStamina(person, 2);
            Utils.subStamina(1, 1);
            Utils.subStamina(2, 1);
            Utils.subStamina(3, 1);
            Utils.subStamina(4, 1);
            Utils.subHealth(person, 2);
            Utils.subHealth(1, 1);
            Utils.subHealth(2, 1);
            Utils.subHealth(3, 1);
            Utils.subHealth(4, 1);
            Utils.subHappiness(person, 2);
            Utils.subHappiness(1, 1);
            Utils.subHappiness(2, 1);
            Utils.subHappiness(3, 1);
            Utils.subHappiness(4, 1);
            Utils.subHygiene(1, 1);
            Utils.subHygiene(2, 1);
            Utils.subHygiene(3, 1);
            Utils.subHygiene(4, 1);
            Utils.checkIfPersonDead();
        } else {
            int person_dead = Utils.returnPerson();
            String dead = Utils.returnPersonName(person_dead);
            OregonTrailApplication.println("Suddenly a bear jumps out and attacks " + dead + ". You dont have any bullets so everyone tries to punch the bear. In the process, " + dead + " dies.");
            Utils.subStamina(1, 2);
            Utils.subStamina(2, 2);
            Utils.subStamina(3, 2);
            Utils.subStamina(4, 2);
            Utils.subHealth(1, 2);
            Utils.subHealth(2, 2);
            Utils.subHealth(3, 2);
            Utils.subHealth(4, 2);
            Utils.subHappiness(1, 2);
            Utils.subHappiness(2, 2);
            Utils.subHappiness(3, 2);
            Utils.subHappiness(4, 2);
            Utils.subHygiene(1, 2);
            Utils.subHygiene(2, 2);
            Utils.subHygiene(3, 2);
            Utils.subHygiene(4, 2);
            OregonTrailApplication.println(dead + " has died.");
            Utils.die(person_dead);
            Utils.checkIfPersonDead();
        }
    }
    private static void wolves() {
        int food = Utils.returnNumber(15, 35);
        if (Variables.BULLETS >= 10) {
            OregonTrailApplication.println("Suddenly a pack of wolves jump out and attack. Everyone shoots as many wolves as they can but they get hurt in the process. \n+" + food + " pounds of food\n-10 bullets");
            Variables.POUNDS_OF_FOOD = Variables.POUNDS_OF_FOOD + food;
            Variables.BULLETS = Variables.BULLETS - 10;
            Utils.subAllStats(2);
            Utils.checkIfPersonDead();
        } else {
            int person_dead1 = Utils.returnPerson();
            String dead1 = Utils.returnPersonName(person_dead1);
            int person_dead2 = Utils.returnPerson();
            String dead2 = Utils.returnPersonName(person_dead2);
            OregonTrailApplication.println("Suddenly a pack of wolves jump out and attack. You dont have any bullets so everyone tries to punch any wolves they can. In the process, " + dead2 + " and " + dead1 +" die.");
            Utils.subAllStats(4);
            OregonTrailApplication.println(dead2 + " has died.");
            Utils.die(person_dead2);
            OregonTrailApplication.println(dead1 + " has died.");
            Utils.die(person_dead1);
            Utils.checkIfPersonDead();
        }
    }
}
