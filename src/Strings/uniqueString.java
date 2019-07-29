package Strings;

import java.util.Arrays;

public class uniqueString {

    static void isUnique2 (String word){

        boolean isUnique = true;

        boolean[] char_set = new boolean[256];

        for (int i = 0; i < word.length(); i++){

            int val = word.charAt(i);

            if(char_set[val]){
                isUnique = false;
            }
            char_set[val] = true;
        }


        System.out.println(Arrays.toString(char_set));

        if(isUnique){
            System.out.println("unique");
        }
        else{
            System.out.println("not unique");
        }













    }

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





//        isUnique2(unique);
//        isUnique(unique2);

        isUnique(notUnique);
//
        isUnique2(notUnique);
//        isUnique(notUnique2);



    }
}
