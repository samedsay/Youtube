//package com.samedify.methodsOverloading;

public class Main {
    public static void main(String[] args) {

        calculatePoints("Samed", 100);
        calculatePoints(200);
        calculatePoints();
    }

    public static int calculatePoints(String playerName, int points) {
        System.out.println("Player Name: " + playerName + "\nPlayer Points: " + points);
        return points * 10;
    }

    public static int calculatePoints(int points) {
        System.out.println("Player Name: Unknown" + "\nPlayer Points: " + points);
        return points * 10;
    }

    public static int calculatePoints() {
        int points = 0;
        System.out.println("Player Name: Unknown " + "\nPlayer Points: " + points);
        return points;
    }
}
