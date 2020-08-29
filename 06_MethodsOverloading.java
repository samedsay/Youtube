package com.samedify.methodsOverloading;

public class Main {
    public static void main(String[] args) {

        int newScore = calculateScore("Samed", 100);
        System.out.println(newScore);

        newScore = calculateScore("Jane");
        System.out.println(newScore);

        newScore = calculateScore(200);
        System.out.println(newScore);

        newScore = calculateScore();
        System.out.println(newScore);

        double newScore2 = calculateScore("Samed", 1000, 300);
        System.out.println(newScore2);


    }

    public static int calculateScore(String name, int score) {
        System.out.println("Player Name: " + name + "\nPlayer Score: " + score);
        return score * 10;
    }

    public static int calculateScore(String name) {
        int score = 0;
        System.out.println("Player Name: " + name + "\nPlayer Score: Unknown");
        return score * 10;
    }

    public static int calculateScore(int score) {
        System.out.println("Player Name: Unknown" + "\nPlayer Score: " + score);
        return score * 10;
    }

    public static int calculateScore() {
        System.out.println("Player Name: Unknown" + "\nPlayer Score: Unknown");
        return 0;
    }

    public static double calculateScore(String a, int b, int c) {
        System.out.println("Player Name: " + a + "\nPlayer Score: " + (b + c));
        return b + c;
    }


}
