public class DemoThree
{
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore=calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println(highScore);

        score=2000;
        levelCompleted=8;
        bonus=200;
        System.out.println("next high score is " +
        calculateScore(gameOver,score,levelCompleted,bonus));


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        int finalScore = score;
        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1222;

        }

return finalScore;
    }



}


