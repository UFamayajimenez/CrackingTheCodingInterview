package HackerRank;

public class Leaderboard {

    //Problem: Given two lists, the cores of a leaderboard and the scores of a player alice, return Alice's ranking


    static int getRanking(int score, int[] ranking) {

        int num = ranking.length;

        for (int i = 0; i < ranking.length; i++) {

            if(ranking[i] < score) {
                num--;
            }
            else if(ranking[i] == score){
                num--;
                i++;
            }

        }

        return num;
    }



    static int[] climbingLeaderboard(int[] scores, int[] alice){

        int[] output = new int[alice.length];

        for(int i = 0; i < alice.length; i++) {

            output[i]= getRanking(alice[i], scores);

        }

        return output;


    }

    public static void main(String[] args) {

        int[] scores = {100, 90, 90, 80, 75, 60};

        int[] aliceScores = {55, 65, 77, 90, 102};

        int[] output;


        output = climbingLeaderboard(scores, aliceScores);


        for (int num : output)
        {
            System.out.println(num);
        }
    }
}









