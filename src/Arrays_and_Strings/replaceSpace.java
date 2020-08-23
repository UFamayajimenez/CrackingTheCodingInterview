package Arrays_and_Strings;

public class replaceSpace {



    //Problem: Write a method to replace all spaces in a string with ‘%20’




    public static String replaceSpace(String input){

        if(input == null){
            return "";
        }


        int spaceCount = 0;


        for (int i = 0; i < input.length(); i++){

            if(input.charAt(i) == ' '){
                spaceCount++;
            }
        }


        int newCount = input.length() + 2*spaceCount;


        char[] newString = new char[newCount];

        int originalStringCount = 0;

        for(int i = 0; i < newCount; i++){

            if(input.charAt(originalStringCount) == ' '){

                newString[i] = '%';

                i++;

                newString[i] = 2;

                i++;

                newString[i] = 0;

                originalStringCount++;

            }else{
                newString[i] = input.charAt(originalStringCount);
                originalStringCount++;
            }
        }


        String output = String.valueOf(newString);


        return output;

    }


    public static void main(String[] args) {

        System.out.println(replaceSpace("amaya is cool"));

        System.out.println(replaceSpace(" amaya is cool"));

        System.out.println(replaceSpace("amaya is cool "));

        System.out.println(replaceSpace("amayaiscool"));

        System.out.println(replaceSpace(" "));

    }
}
