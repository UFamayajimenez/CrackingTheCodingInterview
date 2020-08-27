package Arrays_and_Strings;

public class minimumSwaps {


    public static int minimumSwaps(int[] arr){


        int minSwaps = 0;



        for(int i = 0; i < arr.length; i++){

            while (arr[i] != i+1 ){

                int num = arr[i];
                int imposter = arr[num-1];

                arr[i] = imposter;
                arr[num-1] = num;

                minSwaps++;
            }

        }

        return minSwaps;
    }


    public static void main(String[] args)
    {
        int[] arr = {1, 3, 5, 2, 4, 6, 7};

        System.out.println(minimumSwaps(arr)); //should return 3


        int[] arr1 = {4, 3, 1, 2};

        System.out.println(minimumSwaps(arr1)); //should return 3


        int[] arr2 = {2, 3, 4, 1, 5};

        System.out.println(minimumSwaps(arr2)); //should return 3
    }









}
