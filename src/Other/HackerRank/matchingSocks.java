package HackerRank;

import java.util.*;

public class matchingSocks {



    static int numOfPairs(int[] socks){

        Set<Integer> colors = new HashSet<>();
        int pairs = 0;

        for (int i = 0; i < socks.length; i++) {
            if (!colors.contains(socks[i])) {
                colors.add(socks[i]);
            } else {
                pairs++;
                colors.remove(socks[i]);
            }
        }

        return pairs;
    }






    public static void main (String args[]){

        int numOfSocks;

        int[] socks = {10, 20, 20, 10, 10 , 30, 50, 10, 20};

        // 10 , 20 , 20 , 10 , 10 , 30 , 50 , 10 , 20
        // 1,    2    2    1    3              3


        System.out.println(numOfPairs(socks));
    }
}
