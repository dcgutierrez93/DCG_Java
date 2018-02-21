package Methods;

public class Main {

    public static void main(String[] args) {

//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        // Now expecting parameters.
        calculateScore(true, 800, 5, 100);

//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was: " + finalScore);
//        }

    }

    // Method to calculate score
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // We can pass these values as a parameter.
        /*
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        */

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is: " + finalScore);
        }
    }


}
