public class Main {

    int PI = 3;

    public static void main(String[] args) {

        int score = 50;

        if (score >= 85)
            System.out.println("You got 5 points.");
        else if (score >= 70)
            System.out.println("You got 4 points.");
        else if (score >= 55)
            System.out.println("You got 3 points.");
        else
            System.out.println("You failed!");

        if (score >= 50) {
            int finalScore = score + 5;
            System.out.println(finalScore);
        }

    }
}
