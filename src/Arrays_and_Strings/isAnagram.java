package Arrays_and_Strings;

import java.util.HashMap;

public class isAnagram {



    //Problem: Write a method to decide if two strings are anagrams or not



    public static boolean isAnagram(String word1, String word2){


        if(word1 == null || word2 == null){
            return false;
        }

        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();


        for(int i = 0; i < array1.length; i++){

            char thisCharacter = array1[i];

            if(!map.containsKey(thisCharacter)) {

                map.put(thisCharacter, 1);
            } else {

                map.put(thisCharacter, (map.get(thisCharacter) + 1));
            }
        }

        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();


        for(int i =0; i < array2.length; i++){

            char thisCharacter = array2[i];


            if(!map.containsKey(thisCharacter)){
                return false;
            }else{

                if(!map2.containsKey(thisCharacter)) {

                    map2.put(thisCharacter, 1);
                } else {

                    map2.put(thisCharacter, (map2.get(thisCharacter) + 1));
                }
            }
        }


        if(map.equals(map2)){
            return true;
        }


        return false;

    }


    public static void main(String[] args)
    {
        System.out.println(isAnagram("LISTEN", "SILENT"));

        System.out.println(isAnagram("BANANA", "AMAYA"));

        System.out.println(isAnagram("FRIED", "FIRED"));


        //...or you could just sort it

    }











}
