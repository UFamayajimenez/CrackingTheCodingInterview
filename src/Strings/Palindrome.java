package Strings;




public class Palindrome {

    //The Problem: write a function that determines whether ot not a given string is a palindrome or not

    static void isPalindrome(String word){

        if(word.contains(" ")){
            word = word.replace(" ", "");
        }

        word = word.toLowerCase();



        String forwards = word;
        String backwards = "";


        // R A C E C A R
        // 0 1 2 3 4 5 6

        //Length of the string is 7



        for (int i = word.length()-1; i >= 0; i--){

            backwards = backwards.concat(String.valueOf(word.charAt(i)));
        }

        System.out.println("The original word: " + word);
        System.out.println("The backwards word: " + backwards);

        if(backwards.equals(forwards)){
            System.out.println("That's a palindrome if I've ever seen one");
            System.out.print("\n");
        }
        else{
            System.out.println("that's not a palindrome my man");
            System.out.print("\n");

        }

    }




    public static void main (String args[]){



        String yesPalindrome = "racecar";
        String yesPalindrome2 = "madam";
        String yesPalindrome3 = "nurses run";

        String noPalindrome = "dog";
        String noPalindrome2 = "Cheetah";



        isPalindrome(yesPalindrome);
        isPalindrome(yesPalindrome2);
        isPalindrome(yesPalindrome3);
        isPalindrome(noPalindrome);
        isPalindrome(noPalindrome2);



    }








}
