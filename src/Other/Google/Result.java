package Other.Google;

import java.util.*;

import static java.util.stream.Collectors.joining;


class Result {

    /*
     * Complete the 'getAutocompleteScores' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY documentTitles
     *  2. STRING_ARRAY documentBodies
     *  3. STRING_ARRAY queries
     */

    public static List<String> createBetterList(List<String> inputList){

        List<String> output = new ArrayList<>();


        for(String phrase: inputList){

            if(phrase.contains(" ")){

                String[] dummyList = phrase.split(" ");

                for(String word : dummyList){
                    output.add(word.toLowerCase());
                }

            }
            else{
                output.add(phrase.toLowerCase());
            }

        }


        return output;



    }

    public static boolean isSubstring(String a, String b){

        int indexOfNum;

        String betterA = a.toLowerCase();
        String betterB = b.toLowerCase();

        indexOfNum = betterB.indexOf(betterA);

        if(indexOfNum != -1){
            return true;
        }
        else return false;

    }


    public static List<Integer> getAutocompleteScores(List<String> documentTitles, List<String> documentBodies, List<String> queries) {

        List<Integer> scores = new ArrayList<>();

        Map<String,Integer> hm = new HashMap<>();

        List<String> betterDocumentTitles = new ArrayList<>();
        List<String> betterDocumentBodies = new ArrayList<>();


        betterDocumentTitles = createBetterList(documentTitles);
        betterDocumentBodies = createBetterList(documentBodies);

        for(String word : betterDocumentTitles){

            if(!hm.containsKey(word)){
                hm.put(word, 10);

            }else {
                int score = hm.get(word);
                hm.put(word, score + 10);
            }

        }

        for(String word : betterDocumentBodies){

            if(!hm.containsKey(word)){
                hm.put(word, 1);

            }else {
                int score = hm.get(word);
                hm.put(word, score + 1);
            }

        }

        if (queries.isEmpty()){
            scores.add(0);
            return scores;
        }




        for(String q : queries){

            int largestScore = 0;

            for (Map.Entry<String,Integer> entry : hm.entrySet()){

                if(isSubstring(q, entry.getKey())){

                    if(entry.getValue() > largestScore){
                        largestScore = entry.getValue();
                    }

                }

            }

            scores.add(largestScore);

        }


        return scores;

    }



    public static void main (String[] args){

        List<String> documentTitles = new ArrayList<>();

        documentTitles.add("Animals");
        documentTitles.add("Dog Facts");

        List<String> documentBodies = new ArrayList<>();

        documentBodies.add("Ant antelope camel cat dog");
        documentBodies.add("Furry Furry Loyal");

        List<String> queries = new ArrayList<>();

        queries.add("An");
        queries.add("Do");
        queries.add("Fur");
        queries.add("Eleph");


        List<Integer> myOutput = getAutocompleteScores(documentTitles, documentBodies, queries);

        for(int x: myOutput){
            System.out.println(x);
        }

    }

}
