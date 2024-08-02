public class DemoTwo {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        calculateScore(gameOver,score,levelCompleted,bonus);

        score=2000;
        levelCompleted=8;
        bonus=200;

        calculateScore(gameOver,score,levelCompleted,bonus);




    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        int finalScore = score;
        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1222;

            System.out.println("your final score was " + finalScore);
        }


    }


}


