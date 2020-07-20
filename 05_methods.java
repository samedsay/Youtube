public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 600;
        int level = 6;
        int bonus = 150;
        System.out.println("Your final score is " + calculateScore(gameOver, score, level, bonus));
        score = 900;
        level = 8;
        bonus = 200;
        System.out.println("Your final score is " + calculateScore(gameOver, score, level, bonus));

        int points = 1400;
        int ranking = calculateRanking(points);
        printRanking("Julia", ranking, points);

        points = 900;
        ranking = calculateRanking(points);
        printRanking("Frank", ranking, points);

        points = 350;
        ranking = calculateRanking(points);
        printRanking("Ann", ranking, points);

        points = 30;
        ranking = calculateRanking(points);
        printRanking("David", ranking, points);

    }
    public static void printRanking(String name, int ranking, int points){
        System.out.println("In " + ranking + ". position player name is " + name + " with " + points + " points.");
    }

    public static int calculateRanking(int score){
//        if(score >= 1000){
//            return 1;
//        }
//        else if(score >= 500 && score < 1000){
//            return 2;
//        }
//        else if(score >= 100 && score < 500){
//            return 3;
//        }
//        return 4;

        int position = 4;
        if(score >= 1000)
            position = 1;
        else if(score >= 500)
            position = 2;
        else if (score >= 100)
            position = 3;

        return position;

    }
    public static int calculateScore(boolean gameOver, int score, int level, int bonus){
        if(gameOver){
            int finalScore = score + (level * bonus);
            finalScore += 1000;
            return finalScore;
        }else
            return -1;
    }
}
