package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	int newScore = calculateScore("Jonn", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + "scored " + score + "poits.");
        return score * 1000;
    }

    public static void calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points.");
        //  return score * 1000;
    }

    public static void calculateScore(){
        System.out.println("No player name, no player score.");
        //  return 0;
    }


}
