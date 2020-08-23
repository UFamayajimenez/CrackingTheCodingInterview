package Other.Google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class smallerString {

    static class word{

        private int smallestCharCount;
        private char[] letters;

        public int getSmallestCharCount()
        {
            return smallestCharCount;
        }

        public void setSmallestCharCount(int smallestCharCount)
        {
            this.smallestCharCount = smallestCharCount;
        }

        public char[] getLetters()
        {
            return letters;
        }

        public void setLetters(char[] letters)
        {
            this.letters = letters;
        }


    }
    static int[] solution(String A, String B) {

        String[] aArray = A.split(",");
        String[] bArray = B.split(",");

        List<word> aCharArrays = new ArrayList<>();
        List<word> bCharArrays = new ArrayList<>();



        for(int i =0; i < aArray.length; i++){
            word newWord = new word();
            char[] aTempArray = aArray[i].toCharArray();
            Arrays.sort(aTempArray);

            newWord.letters = aTempArray;

            aCharArrays.add(newWord);


        }

        for(int i =0; i < bArray.length; i++){
            word newWord = new word();
            char[] bTempArray = bArray[i].toCharArray();
            Arrays.sort(bTempArray);
            newWord.setLetters(bTempArray);

            bCharArrays.add(newWord);

        }

        for(word theWord : aCharArrays){
            char smallestLetter = theWord.getLetters()[0];
            int charCount = theWord.getSmallestCharCount();
            for(int i = 0; i < theWord.getLetters().length; i++){
                if(theWord.getLetters()[i] == smallestLetter){
                    charCount++;
                }
                else{
                    break;
                }
            }
            theWord.setSmallestCharCount(charCount);
        }

        for(word theWord : bCharArrays){
            char smallestLetter = theWord.getLetters()[0];
            int charCount = theWord.getSmallestCharCount();
            for(int i = 0; i < theWord.getLetters().length; i++){
                if(theWord.getLetters()[i] == smallestLetter){
                    charCount++;
                }
                else{
                    break;
                }
            }
            theWord.setSmallestCharCount(charCount);
        }


        int[] output = new int[bCharArrays.size()];

        int smallerCount = 0;

        for(int i = 0; i < bCharArrays.size(); i++){
            smallerCount = 0;

            for(int j = 0; j < aCharArrays.size(); j++) {
                char bSmallestLetter = bCharArrays.get(i).getLetters()[0];
                char aSmallestLetter = aCharArrays.get(j).getLetters()[0];

                if (bSmallestLetter == aSmallestLetter)
                {
                    if (bCharArrays.get(i).getSmallestCharCount() > aCharArrays.get(j).getSmallestCharCount())
                    {
                        smallerCount++;
                    }
                }
                else{
                    smallerCount++;
                }
            }
            output[i] = smallerCount;


        }

        return output;
    }

    public static void main(String[] args) {
        // Read from stdin, solve the problem, write answer to stdout.
        String A = "aaaabc,abc,bc,c,aabc";
        String B = "c";
        System.out.print(printIntArray(solution(A, B)));
    }

    private static String printIntArray(int[] input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            sb.append(input[i]);
            if (i < input.length - 1) {
                sb.append(',');
            }
        }
        return sb.toString();
    }





}
