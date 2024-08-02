public class DemoFour {

    public static void main(String[] args) {


        calculateScore(true,3,3,200);


        calculateScore(true,4,4,300);




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
