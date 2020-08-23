package Arrays_and_Strings;

import java.util.Arrays;

public class uniqueString {

    //The Problem: write a function that determines whether ot not a given string has all unique characters or not


    static void isUnique(String word){

        char[] arr = word.toCharArray();

        Arrays.sort(arr);

        boolean unique = true;

        for(int i = 0; i < arr.length; i++){

            if(i != (arr.length - 1)){

                if(arr[i] == arr[i + 1]){
                    unique = false;
                    break;
                }


            }

        }

        System.out.println(Arrays.toString(arr));

        if(unique){
            System.out.println("unique");
        }
        else{
            System.out.println("not unique");
        }

    }


    public static void main (String args[]){

        String unique = "uncopyrightable";

        String unique2 = "ajfbeiwpls";

        String notUnique = "childhood";

        String notUnique2 = "637743gksleeeoosjnfeoskfneiroklanfeilandierofwknmewkf";


        isUnique(unique);
        isUnique(unique2);

        isUnique(notUnique);
        isUnique(notUnique2);

    }
}
