public class Demo {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 300);
        System.out.println(newScore);

        calculateScore(33);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println(playerName + " score " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println(" score " + score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player");
        return 0;
    }



}
