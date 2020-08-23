package Other.Google;

import java.util.Scanner;
import java.util.stream.Stream;

class Loads {

    static int solution(Integer[] loads) {

        int sum = 0;
        int midpoint = 0;

        for(Integer x: loads){
            sum+=x;
        }
        midpoint = sum/2;


        for(int i = 0; i < loads.length; i++){



        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] loads = getIntegerArray(in.next());

        System.out.print(solution(loads));
    }

    private static Integer[] getIntegerArray(String str) {
        return Stream.of(str.split("\\,"))
                .map(Integer::valueOf)
                .toArray(Integer[]::new);
    }
}