public class Demo {
    public static void main(String[] args) {

        calculateScore();

    }

    public static void calculateScore() {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int finalScore = score;
        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);

            System.out.println("your final score was " + finalScore);
        }


    }


}


