public class LogicalOperators {
    public static void main(String[] args) {

        boolean answer = true;

        if(answer == false) {
            System.out.println("The answer is false!");
            System.out.println("You got 0 point!");
            System.out.println("You are a lazy boy!");
        }
        int topScore = 100;
        if (topScore == 100)
            System.out.println("You got the highest point!");

        boolean single = true;
        if(single)
            System.out.println("You are not a single!");

        int secondTopScore = 60;
        if((topScore > secondTopScore) || (topScore < 100))
            System.out.println("topScore is bigger than secondTopScore and topScore is less than 100");

        // ternary operator

        int myAge = 24;
        boolean hasRight = myAge > 18 ? myAge < 25 ? true : false : false;
        if(hasRight)
            System.out.println("You can apply for a driving licence.");

    }
}
