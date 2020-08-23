package Other.Google;

import java.util.ArrayList;
import java.util.List;

public class biggerArray {

    static List<Integer[]> createSubArrays(Integer[] N, int K){

        List<Integer[]> subArrays = new ArrayList<>();
        for(int i = 0; i < N.length; i++){
            if((i+(K-1) <= N.length-1)) {
                Integer[] subArray = new Integer[K];
                for(int j = i;j < K; j++){
                    subArray[j]= N[j];
                }
                subArrays.add(subArray);
            }

        }

        return subArrays;

    }

    static Integer[] solution(Integer[] N, int K) {
        createSubArrays(N,K);

        return new Integer[0];
    }

    public static void main(String[] args)
    {
        Integer[] inputArray = {1, 4, 3, 2, 5};
        int num = 4;

        Integer[] output = solution(inputArray, num);

        for (Integer x : output)
        {
            System.out.println(x);
        }
    }






}
