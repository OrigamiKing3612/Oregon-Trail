package net.origamiking.games.oregontrail;
import java.util.Scanner;

public class OregonTrailMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OregonTrailMain.print("Welcome to Oregon Trail by OrigamiKing3612.");
        OregonTrailMain.print("This is a text based game.");
        OregonTrailMain.print("Your goal is to get to Oregon in time for winter.");
        OregonTrailMain.print("Are you ready to get started?");
        OregonTrailMain.wait(10);

        String var1 = input.nextLine();
    }
    public static void print(String string) {
        System.out.println(string);
    }
    public static void wait(int time) {
        for (int i = 0; i < time; i++) {}
    }
}